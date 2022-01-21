package com.github.yymm120.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.yymm120.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
