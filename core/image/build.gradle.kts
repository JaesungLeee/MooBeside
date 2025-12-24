plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.ksp)
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.jslee.core.image"

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(projects.core.designsystem)

    implementation(libs.glide)
    ksp(libs.glide.ksp)

    implementation(libs.facebook.shimmer)
}