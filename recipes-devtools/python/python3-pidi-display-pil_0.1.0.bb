SUMMARY = "PiDi Display Plugin for PIL-based image output"
DESCRIPTION = "\
    This plugin renders album art and transport information to a \
    PIL image for display"

HOMEPAGE = "https://github.com/pimoroni/pidi-plugins"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "pidi-display-pil"

SRC_URI[sha256sum] = "feef8012ed1e55823e6ff702473364c1474669ffe224f9370655b656881b798b"

inherit setuptools3 pypi

RDEPENDS:${PN} += "\
    python3-font-roboto \
    python3-fonts \
    "
