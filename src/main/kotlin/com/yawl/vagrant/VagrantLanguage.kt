package com.yawl.vagrant

import com.intellij.lang.Language

object VagrantLanguage : Language("Vagrant") {
    private fun readResolve(): Any = VagrantLanguage
}