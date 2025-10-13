plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.kapt)
}

android {
    namespace = "com.moobeside.core.common.ui"
}

dependencies {
    implementation(projects.core.designsystem)
    implementation(projects.core.common.kotlin)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.paging.runtime)
    implementation(libs.material)
    implementation(libs.bundles.kotlinx.coroutines)
}