package com.github.qlonik.intellijpeggy.services

import com.github.qlonik.intellijpeggy.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
