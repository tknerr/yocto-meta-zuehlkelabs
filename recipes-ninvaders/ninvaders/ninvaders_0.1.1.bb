SUMMARY = "NInvaders recipe"
DESCRIPTION = "Recipe to install the NInvaders application"
LICENSE = "MIT"

# source URI and checksum for ninvaders source files
SRC_URI = "${SOURCEFORGE_MIRROR}/ninvaders/${PN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "bfbc5c378704d9cf5e7fed288dac88859149bee5ed0850175759d310b61fd30b"

# license file and checksum within the extracted source tarball
LIC_FILES_CHKSUM = "file://gpl.txt;md5=393a5ca445f6965873eca0259a17f833"

# ncurses is a build- and runtime dependency
DEPENDS = "ncurses"
RDEPENDS_${PV} = "ncurses"

# fix build issue to make make find the ncurses lib
EXTRA_OEMAKE = "-e"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  The mighty NInvaders recipe!               *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 nInvaders ${D}${bindir}
}

addtask display_banner before do_build
