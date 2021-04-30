package com.github.qlonik.intellij.peggy.psi

import com.github.qlonik.intellij.peggy.PeggyLanguage
import com.intellij.psi.tree.IElementType

class PeggyTokenType(debugName: String) :
    IElementType(debugName, PeggyLanguage.INSTANCE) {
    override fun toString() = "PeggyTok." + super.toString()
}
