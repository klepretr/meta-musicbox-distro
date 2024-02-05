FILESEXTRAPATHS:prepend := "${THISDIR}/wpa-supplicant:"

SRC_URI:append = " \
    file://wpa_supplicant-wlan0.conf  \
    file://25-wlan.network  \
"

do_install:append() {
    install -d ${D}${sysconfdir}/wpa_supplicant
    install -m 0644 ${WORKDIR}/wpa_supplicant-wlan0.conf  ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf
    sed -i -e "s:@WIFI_SSID@:${WIFI_SSID}:g" ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf
    sed -i -e "s:@WIFI_PASSWORD@:${WIFI_PASSWORD}:g" ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/25-wlan.network  ${D}${sysconfdir}/systemd/network/25-wlan.network
}
