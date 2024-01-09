// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        val catalog = project.extensions.getByType<VersionCatalogsExtension>().named("libs")
        val navigationVersion = catalog.findVersion("navigation").get()
        val ossVersion = catalog.findVersion("google-oss-plugin").get()
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navigationVersion")
        classpath("com.google.android.gms:oss-licenses-plugin:$ossVersion")
    }
}

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.hilt.plugin) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}
true