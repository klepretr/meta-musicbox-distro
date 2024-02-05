SUMMARY = "Python ST7735"
DESCRIPTION = "\
    Python library to control an ST7735 TFT LCD display. \
    Allows simple drawing on the display without installing \
    a kernel module."

HOMEPAGE = "https://github.com/pimoroni/st7735-python"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "st7735"

SRC_URI[sha256sum] = "401dee9c1e1bcdf18df9a205876788d726bb170491e6cd6f8bc8a6ab16801e18"

SRC_URI:append = "\
    file://setup.py \
"

do_configure:prepend:class-target () {
    cp ${WORKDIR}/setup.py ${S}/setup.py
}

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    libgpiod \
    libgpiod-tools \
    python3-gpiod \
    python3-gpiodevice \
    "
