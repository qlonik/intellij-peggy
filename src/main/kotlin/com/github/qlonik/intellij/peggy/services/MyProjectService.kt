package com.github.qlonik.intellij.peggy.services

import com.github.qlonik.intellij.peggy.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("project.service", project.name))
    }
}
