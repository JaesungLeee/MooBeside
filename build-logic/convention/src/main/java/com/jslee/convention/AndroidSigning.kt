package com.jslee.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import java.io.FileInputStream
import java.util.Properties

internal fun Project.configureSigningKeystore(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        signingConfigs {
            val properties = Properties()
                .apply { load(FileInputStream("${project.rootDir}/keystore.properties")) }

            create("dev") {
                storeFile = file("${properties["storeFileDev"]}")
                storePassword = "${properties["storePassword"]}"
                keyAlias = "${properties["keyAlias"]}"
                keyPassword = "${properties["keyPassword"]}"
            }

            create("prod") {
                storeFile = file("${properties["storeFileProd"]}")
                storePassword = "${properties["storePassword"]}"
                keyAlias = "${properties["keyAlias"]}"
                keyPassword = "${properties["keyPassword"]}"
            }
        }
    }
}