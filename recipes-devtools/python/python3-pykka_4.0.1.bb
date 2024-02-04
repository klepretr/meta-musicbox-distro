SUMMARY = "Pykka makes it easier to build concurrent applications "
DESCRIPTION = "\
    Pykka is a Python implementation of the actor model. The actor model \
    introduces some simple rules to control the sharing of state and \
    cooperation between execution units, which makes it easier to build \
     concurrent applications."

HOMEPAGE = "https://github.com/jodal/pykka"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "pykka"

SRC_URI[sha256sum] = "cb499c0b099412ee2200cb3ca51740c3834beb35bcd172b7daa44ee76ac165f2"

SRC_URI:append = "\
    file://pyproject.toml \
"

inherit pypi python_poetry_core

do_configure:prepend:class-target () {
    cp ${WORKDIR}/pyproject.toml ${S}/pyproject.toml
}
