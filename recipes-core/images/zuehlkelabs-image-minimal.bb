inherit core-image

DESCRIPTION = "Zuehlke Labs Custom Image"
IMAGE_INSTALL = "packagegroup-core-boot packagegroup-zuehlke-games ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_FSTYPES = "tar.bz2 cpio squashfs"
LICENSE = "MIT"