package com.github.masterfan2.template.services

import com.intellij.openapi.project.Project
import com.github.masterfan2.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
