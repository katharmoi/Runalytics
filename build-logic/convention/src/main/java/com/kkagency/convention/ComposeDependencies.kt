package com.kkagency.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

fun DependencyHandlerScope.addUIDependencies(project: Project){
    "implementation"(project(":common:ui:designsystem"))
    "implementation"(project(":common:ui:shared"))
    "implementation"(project.libs.findBundle("compose").get())
    "implementation"(project.libs.findBundle("koin.compose").get())
    "debugImplementation"(project.libs.findBundle("compose.debug").get())
    "androidTestImplementation"(project.libs.findLibrary("androidx.compose.ui.test.junit4").get())
}