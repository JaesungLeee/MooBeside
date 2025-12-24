plugins {
    alias(libs.plugins.moobeside.android.library)
}

android.namespace = "com.moobeside.core.exception"

dependencies {
    implementation(libs.timber)
}