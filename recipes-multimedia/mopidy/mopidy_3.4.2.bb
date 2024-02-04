SUMMARY = "Mopidy is an extensible music server written in Python "
DESCRIPTION = "\
    Mopidy plays music from local disk, Spotify, SoundCloud, Google \
    Play Music, and more. You edit the playlist from any phone, tablet, \
    or computer using a variety of MPD and web clients"

HOMEPAGE = "https://github.com/mopidy/mopidy"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "Mopidy"

SRC_URI[sha256sum] = "ada9ecbfc09eecc8c9e6742a8a4fea1632a134a1ab060527d8aa3d36df0547b6"

SRC_URI += "\
    file://mopidy.service \
    file://mopidy.conf \
"

inherit setuptools3 pypi systemd

do_install:append() {
    install -d ${D}/${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/mopidy.service ${D}/${systemd_system_unitdir}

    install -d ${D}/${sysconfdir}/mopidy
    install -m 0644 ${WORKDIR}/mopidy.conf ${D}${sysconfdir}/mopidy/mopidy.conf
}

RDEPENDS:${PN} += "\
    libpython3 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-python \
    python3-musicbrainzngs \
    python3-netifaces \
    python3-numpy \
    python3-pillow \ 
    python3-spidev \
    "

FILES:${PN} += " ${systemd_system_unitdir}/mopidy.service"

SYSTEMD_SERVICE:${PN} = "mopidy.service"