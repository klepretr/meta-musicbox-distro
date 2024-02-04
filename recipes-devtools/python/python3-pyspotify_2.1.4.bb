SUMMARY = "pyspotify is a Python wrapper around the libspotify C library"
DESCRIPTION = "\
    pyspotify is a Python wrapper around the libspotify C library, \
    and thus depends on libspotify for everything it does."

HOMEPAGE = "https://github.com/jodal/pyspotify"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "pyspotify"

SRC_URI[sha256sum] = "80574add8ff938b1cc7a847988583549e730c3d0401efdafc04430854d36b050"

inherit pypi python_setuptools_build_meta
