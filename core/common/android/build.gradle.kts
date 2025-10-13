plugins {
    alias(libs.plugins.moobeside.android.library)
}

android {
    namespace = "com.moobeside.core.common.android"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}