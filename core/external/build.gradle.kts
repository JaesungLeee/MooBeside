plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.ksp)
    alias(libs.plugins.hilt.plugin)
}

android.namespace = "com.jslee.core.external"

dependencies {
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
}