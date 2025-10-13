plugins {
    alias(libs.plugins.moobeside.android.library)
}

android {
    namespace = "com.jslee.core.logger"
}

dependencies {
    implementation(libs.timber)
}