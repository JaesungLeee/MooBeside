plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.moobeside.android.hilt)
}

android.namespace = "com.moobeside.core.common.android"

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.kotlinx.coroutines.android)
}