require wpewebkit.inc
require conf/include/devupstream.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI = "\
    https://wpewebkit.org/releases/${BPN}-${PV}.tar.xz \
    file://216455_builds_with_ENABLE_SERVICE_WORKER_OFF.patch \
    file://274943-GStreamer-Use-imxvideoconvert_g2d-element-inside-the.patch \
"

SRC_URI[sha256sum] = "893a3098226f116bbb38a665a3053c7d30e3c5dca786b954f9aa38f8c8581468"

DEPENDS += " libwpe"
RCONFLICTS_${PN} = "libwpe (< 1.4) wpebackend-fdo (< 1.6)"

