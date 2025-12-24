plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.kapt)
}

android.namespace = "com.jslee.core.image"

dependencies {
    implementation(projects.core.designsystem)

    implementation(libs.glide)
    kapt(libs.glide.compiler)

    implementation(libs.facebook.shimmer)
}