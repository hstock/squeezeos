DESCRIPTION = "FLAC"
SECTION = "libs"
LICENSE = "Xiph"

PR = "r2"

SRC_URI="${SOURCEFORGE_MIRROR}/flac/flac-${PV}.tar.gz"

S = "${WORKDIR}/flac-${PV}"

inherit autotools

EXTRA_OECONF = "--disable-ogg --disable-xmms-plugin"

do_stage() {
	autotools_stage_all
}

PACKAGES += "libflac libflac++ liboggflac liboggflac++"
FILES_${PN} = "${bindir}/*"
FILES_libflac = "${libdir}/libFLAC.so.*"
FILES_libflac++ = "${libdir}/libFLAC++.so.*"
FILES_liboggflac = "${libdir}/libOggFLAC.so.*"
FILES_liboggflac++ = "${libdir}/libOggFLAC++.so.*"
