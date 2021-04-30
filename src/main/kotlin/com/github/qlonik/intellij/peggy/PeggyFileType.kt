package com.github.qlonik.intellij.peggy

import com.intellij.openapi.fileTypes.LanguageFileType

class PeggyFileType private constructor() :
    LanguageFileType(PeggyLanguage.INSTANCE) {
    override fun getName() = "Peggy"
    override fun getDescription() = "Peggy JS language file"
    override fun getDefaultExtension() = "pegjs"
    override fun getIcon() = PeggyIcons.FILETYPE

    companion object {
        val INSTANCE = PeggyFileType()
    }
}
