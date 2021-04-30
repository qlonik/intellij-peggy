package com.github.qlonik.intellij.peggy

import com.intellij.lang.Language

class PeggyLanguage private constructor() : Language("Peggy") {
    companion object {
        val INSTANCE = PeggyLanguage()
    }
}
