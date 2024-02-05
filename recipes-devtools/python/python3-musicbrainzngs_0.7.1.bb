SUMMARY = "This library implements webservice bindings for the Musicbrainz NGS site"
DESCRIPTION = "\
    This library implements webservice bindings for the Musicbrainz NGS site, \
    also known as /ws/2 and the Cover Art Archive."

HOMEPAGE = "https://github.com/alastair/python-musicbrainzngs"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "musicbrainzngs"

SRC_URI[sha256sum] = "ab1c0100fd0b305852e65f2ed4113c6de12e68afd55186987b8ed97e0f98e627"

inherit pypi python_setuptools_build_meta
