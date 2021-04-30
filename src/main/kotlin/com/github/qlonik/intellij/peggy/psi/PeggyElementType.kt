package com.github.qlonik.intellij.peggy.psi

import com.github.qlonik.intellij.peggy.PeggyLanguage
import com.intellij.psi.tree.IElementType

class PeggyElementType(debugName: String) :
    IElementType(debugName, PeggyLanguage.INSTANCE)
