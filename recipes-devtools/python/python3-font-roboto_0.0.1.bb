SUMMARY = "Fonts: Roboto"
DESCRIPTION = "\
    Roboto is a neo-grotesque sans-serif font family designed by \
    Google for the Android mobile OS."

HOMEPAGE = "https://github.com/pimoroni/fonts-python"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "font-roboto"

SRC_URI[sha256sum] = "8bc9136bf46609fbb13af4783016799b14e23dda294a61791171de7ea2ec457f"

S = "${WORKDIR}/git/font-roboto"

inherit pypi setuptools3
