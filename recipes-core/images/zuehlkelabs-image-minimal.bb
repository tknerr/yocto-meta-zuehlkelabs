require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Zuehlke Labs Custom Image"
IMAGE_INSTALL += "ninvaders"
IMAGE_FSTYPES = "tar.bz2 cpio squashfs"
LICENSE = "MIT"