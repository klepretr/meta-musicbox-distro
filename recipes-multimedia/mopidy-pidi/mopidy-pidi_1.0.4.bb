SUMMARY = "Mopidy extension for displaying song info and album art using pidi display plugins "
DESCRIPTION = "\
    Using our pidi-display-st7789 plugin Mopidy PiDi will run the \
    display on our Pirate Audio boards, giving you album art and \
    transport info."

HOMEPAGE = "https://github.com/pimoroni/mopidy-pidi"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "mopidy-pidi"

SRC_URI[sha256sum] = "251d4d4ed9bb9286cab40cd0568fc23cdfaa35ac1810efd3482a7913717bc10a"

inherit setuptools3 pypi

RDEPENDS:${PN} += "\
    python3-mopidy-raspberry-gpio \
    python3-pidi-display-pil \
    python3-pidi-display-st7789 \
    python3-st7735 \
    python3-st7789 \
    rpi-gpio \
"