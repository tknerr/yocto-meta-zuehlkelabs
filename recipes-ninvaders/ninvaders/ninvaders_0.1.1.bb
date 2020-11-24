SUMMARY = "NInvaders recipe"
DESCRIPTION = "Recipe to install the NInvaders application"
LICENSE = "MIT"

# source URI and checksum for ninvaders source files
SRC_URI = "${SOURCEFORGE_MIRROR}/ninvaders/${PN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "bfbc5c378704d9cf5e7fed288dac88859149bee5ed0850175759d310b61fd30b"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  The mighty NInvaders recipe!               *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build
