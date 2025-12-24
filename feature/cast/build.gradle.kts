plugins {
    alias(libs.plugins.moobeside.android.library.compose)
    alias(libs.plugins.moobeside.android.hilt)
}

android.namespace = "com.moobeside.feature.cast"

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}