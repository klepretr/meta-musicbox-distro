SUMMARY = "Python ST7789"
DESCRIPTION = "\
    Python library to control an ST7789 TFT LCD display. \
    Allows simple drawing on the display without installing \
    a kernel module."

HOMEPAGE = "https://github.com/pimoroni/st7789-python"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "ST7789"

SRC_URI[sha256sum] = "50757ab574e23889cde8a3ad50f7cdd7900389350864d445c9ea235fc479dfab"

S = "${WORKDIR}/git/library"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    libgpiod \
    libgpiod-tools \
    python3-gpiod \
    python3-gpiodevice \
    "
