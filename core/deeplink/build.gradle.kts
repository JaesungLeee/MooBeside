plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.jslee.core.deeplink"
}

dependencies {
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.dynaimc.link)
    implementation(libs.firebase.analytics)
    implementation(libs.kakao.share)
}