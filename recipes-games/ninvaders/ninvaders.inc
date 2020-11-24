SUMMARY = "NInvaders recipe"
DESCRIPTION = "Recipe to install the NInvaders application"
LICENSE = "MIT"

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
