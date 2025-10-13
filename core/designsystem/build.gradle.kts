plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.jslee.core.designsystem"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    api(libs.balloon)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}