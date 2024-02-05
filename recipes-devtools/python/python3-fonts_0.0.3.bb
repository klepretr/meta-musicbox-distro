SUMMARY = "Python Fonts"
DESCRIPTION = "\
    A Python framework for distributing and managing fonts."

HOMEPAGE = "https://github.com/pimoroni/fonts-python"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "fonts"

SRC_URI[sha256sum] = "c626655b75a60715e118e44e270656fd22fd8f54252901ff6ebf1308ad01c405"

S = "${WORKDIR}/git/fonts"

inherit pypi setuptools3
