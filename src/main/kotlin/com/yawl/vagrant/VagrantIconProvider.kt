package com.yawl.vagrant

import com.intellij.ide.IconProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import javax.swing.Icon

class VagrantIconProvider : IconProvider() {
    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        val file = (element as? PsiFile) ?: return null
        return if (file.name == "Vagrantfile") VagrantIcons.FILE else null
    }
}