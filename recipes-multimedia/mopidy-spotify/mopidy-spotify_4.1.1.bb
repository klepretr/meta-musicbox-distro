SUMMARY = "Mopidy extension for playing music from Spotify. "
DESCRIPTION = "\
    Mopidy-Spotify is dependent on pyspotify, a wrapper for Spotify’s \
    libspotify C library. libspotify was deprecated in 2015 with no replacement. \
    It is unmaintained, functionally limited, and also now unavailable from the Spotify \
    developer site. Where possible we are moving to use Spotify’s Web API instead. \
    However, native playback is still only possible using libspotify and there is no \
    official way for us to provide some Spotify features."

HOMEPAGE = "https://github.com/mopidy/mopidy-spotify"
SECTION = "devel/python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_PACKAGE = "Mopidy-Spotify"

SRC_URI[sha256sum] = "e137d0675288e48563c15d50cb2722c618f1a085673f96b620e64fafdaab97af"

inherit setuptools3 pypi

RDEPENDS:${PN} += "\
    gst-plugin-spotify \
    mopidy \
    python3-charset-normalizer \
    python3-logging \
    python3-multiprocessing \
    python3-pkg-resources \
    python3-pkgconfig \
    python3-pygobject \
    python3-pykka \
    python3-pyspotify \
    python3-requests \
    python3-setuptools \
    python3-tornado \
"
