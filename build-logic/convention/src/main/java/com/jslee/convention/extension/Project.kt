package com.jslee.convention.extension

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal fun Project.findVersion(name: String): String {
    val version = libs.findVersion(name).get()
    return checkNotNull(version.toString()) {
        "Version '$name' does not exist in the libs.versions.toml file."
    }
}