package com.jslee.convention

import com.android.build.api.dsl.CommonExtension
import com.jslee.convention.extension.findVersion
import org.gradle.api.JavaVersion
import org.gradle.api.Project

internal fun Project.configureKotlinAndroid(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        compileSdk = findVersion("compileSdk").toInt()

        defaultConfig {
            minSdk = findVersion("minSdk").toInt()
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }

        buildFeatures {
            buildConfig = true
        }
    }

    configureKotlin()
}