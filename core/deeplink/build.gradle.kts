plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.ksp)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.jslee.core.deeplink"
}

dependencies {
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.dynaimc.link)
    implementation(libs.firebase.analytics)
    implementation(libs.kakao.share)
}