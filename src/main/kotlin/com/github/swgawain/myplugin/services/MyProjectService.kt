package com.github.swgawain.myplugin.services

import com.intellij.openapi.project.Project
import com.github.swgawain.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
