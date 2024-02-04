SUMMARY = "MusicBox image base"
DESCRIPTION = "Install all needed applicative tools for MusicBox"
HOMEPAGE = "https://github.com/klepretr/meta-musicbox-distro"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

inherit core-image

# Network
IMAGE_FEATURES += "\
    ssh-server-openssh \
"

### Bench ###
IMAGE_INSTALL += "\
    nano \
    bluez5 \
    iperf3 \
    i2c-tools \
    systemd-analyze \
    screen \
    alsa-tools \
    alsa-utils \
"

### MUSICBOX APP ###
IMAGE_INSTALL += "\
   python3-st7789 \
   spotifyd \
"
