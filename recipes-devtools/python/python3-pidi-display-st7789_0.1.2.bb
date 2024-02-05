SUMMARY = "PiDi Display Plugin for the ST7789 240x240 LCD"
DESCRIPTION = "\
    This plugin allows PiDi and Mopidy-PiDi to display album art and transport \
    on the ST7789 LCD."

HOMEPAGE = "https://github.com/pimoroni/pidi-plugins"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "pidi-display-st7789"

SRC_URI[sha256sum] = "1251394ddb34a2be7f4917a95f1b75b1e74feefa460772a0ae3ea0f970ecc200"

inherit setuptools3 pypi
