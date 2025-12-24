plugins {
    alias(libs.plugins.moobeside.android.library.compose)
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.moobeside.core.common.ui"

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(projects.core.designsystem)
    implementation(projects.core.common.kotlin)
    implementation(projects.core.common.android)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.paging.runtime)
    implementation(libs.material)
    implementation(libs.bundles.kotlinx.coroutines)
}