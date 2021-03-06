package com.fasttrack.attachment.helper.upload

/**
 * Stas Parshin
 * 05 November 2015
 */
abstract class DefaultCallback : EasyImage.Callbacks {

    override fun onImagePickerError(error: Throwable, source: MediaSource) {}

    override fun onCanceled(source: MediaSource) {}
}
