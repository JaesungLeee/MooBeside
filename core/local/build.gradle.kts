plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.moobeside.core.local"
}

dependencies {
    implementation(projects.core.common.kotlin)
    implementation(projects.core.model)

    implementation(libs.bundles.kotlinx.coroutines)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.bundles.androidx.room)
    kapt(libs.androidx.room.compiler)  // migrate to ksp

    implementation(libs.timber)
}