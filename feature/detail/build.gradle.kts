plugins {
    alias(libs.plugins.moobeside.android.library)
}

android {
    namespace = "com.moobeside.feature.detail"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}