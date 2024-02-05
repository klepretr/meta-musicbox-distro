SUMMARY = "gpiodevice is a simple middleware library "
DESCRIPTION = "\
    gpiodevice is a simple middleware library intended to make \
    some user-facing aspects of interfacing with Linux's GPIO \
    character device ABI (via gpiod) simpler and friendlier"

HOMEPAGE = "https://github.com/pimoroni/gpiodevice-python"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "gpiodevice"

SRC_URI[sha256sum] = "b5bf91c5d4d5dd3dad3dacceb3176defe98672c958e1518616becdbb17ad51db"

SRC_URI:append = "\
    file://setup.py \
"

do_configure:prepend:class-target () {
    cp ${WORKDIR}/setup.py ${S}/setup.py
}

inherit pypi setuptools3

