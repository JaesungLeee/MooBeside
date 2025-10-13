package com.jslee.convention

import com.android.build.api.dsl.ApplicationExtension
import com.jslee.convention.extension.findVersion
import org.gradle.api.Project

internal fun ApplicationExtension.configureDefaultConfig(project: Project) {
    defaultConfig {
        applicationId = project.findVersion("applicationId")
        targetSdk = project.findVersion("targetSdk").toInt()
        versionCode = project.findVersion("versionCode").toInt()
        versionName = project.findVersion("versionName")
    }
}