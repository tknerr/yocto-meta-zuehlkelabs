require recipes-core/images/zuehlkelabs-image-minimal.bb

DESCRIPTION = "Zuehlke Labs Custom Image (Debug)"

# keep debug symbols wihtin image
IMAGE_FEATURES += "dbg-pkgs"

# install additional debugging tools
IMAGE_INSTALL += "gdb strace"