SUMMARY = "GStreamer plugin to read content from Spotify"
DESCRIPTION = "\
    This is a GStreamer plugin to read content from \
    Spotify. Make sure that your application follows \
    Spotify's design guidelines to respect their legal/licensing \
    restrictions"
HOMEPAGE = "https://gitlab.freedesktop.org/gstreamer/gst-plugins-rs"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "\
    file://LICENSE-MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad \
"

DEPENDS = "\
    gstreamer1.0 \
    gstreamer1.0-plugins-good \
"

SRC_URI = "git://gitlab.freedesktop.org/gstreamer/gst-plugins-rs.git;protocol=https;nobranch=1"
SRCREV = "46b84c156497e4d453cd89ffb5e0fb03d24ec595"

S = "${WORKDIR}/git/audio/spotify"

inherit cargo pkgconfig

do_install:append() {
    install -d ${D}${libdir}/gstreamer-1.0
    mv ${D}${libdir}/rust/*.so ${D}${libdir}/gstreamer-1.0/
}

FILES:${PN} += "${libdir}/gstreamer-1.0/*"

BBCLASSEXTEND = "native"
