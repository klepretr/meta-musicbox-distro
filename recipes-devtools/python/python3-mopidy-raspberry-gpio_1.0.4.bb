SUMMARY = "Mopidy extension for GPIO input on a Raspberry Pi"
DESCRIPTION = "\
    This plugin is a Mopidy extension for GPIO input on a Raspberry Pi."

HOMEPAGE = "https://github.com/pimoroni/mopidy-raspberry-gpio"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "mopidy-raspberry-gpio"

SRC_URI[sha256sum] = "313b4e2b037d5101f618615e1cc7bb3ae9a7e8aa17d906bfb015876de2d0c6fd"

inherit setuptools3 pypi
