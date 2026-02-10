plugins {
    alias(libs.plugins.moobeside.android.library.compose)
    alias(libs.plugins.moobeside.android.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.jslee.core.navigation"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.androidx.navigation3.runtime)
    implementation(libs.androidx.navigation3.ui)
    implementation(libs.androidx.lifecycle.viewmodel.navigation3)
}