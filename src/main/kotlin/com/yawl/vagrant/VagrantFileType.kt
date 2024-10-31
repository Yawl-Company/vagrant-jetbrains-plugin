package com.yawl.vagrant

import com.intellij.openapi.fileTypes.LanguageFileType
import com.yawl.vagrant.VagrantIcons.FILE
import javax.swing.Icon

object VagrantFileType : LanguageFileType(VagrantLanguage) {
    override fun getName(): String {
        return "Vagrantfile"
    }

    override fun getDescription(): String {
        return "Vagrant file"
    }

    override fun getDefaultExtension(): String {
        return ""
    }

    override fun getIcon(): Icon {
        return FILE
    }
}