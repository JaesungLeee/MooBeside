plugins {
    alias(libs.plugins.moobeside.android.application.compose)
    alias(libs.plugins.moobeside.android.hilt)
    alias(libs.plugins.google.services)
    alias(libs.plugins.firebase.crashlytics.plugin)
}

android {
    namespace = "com.jslee.moobeside"

//    buildFeatures {
//        dataBinding = true
//        buildConfig = true
//    }
}

dependencies {
    implementation(projects.core.common.android)
    implementation(projects.core.common.kotlin)
    implementation(projects.core.common.ui)
    implementation(projects.core.data)
    implementation(projects.core.deeplink)
    implementation(projects.core.designsystem)
    implementation(projects.core.domain)
    implementation(projects.core.exception)
    implementation(projects.core.external)
    implementation(projects.core.image)
    implementation(projects.core.local)
    implementation(projects.core.logger)
    implementation(projects.core.model)
    implementation(projects.core.remote)
    implementation(projects.feature.bookmark)
    implementation(projects.feature.boxoffice)
    implementation(projects.feature.cast)
    implementation(projects.feature.detail)
    implementation(projects.feature.home)
    implementation(projects.feature.search)
    implementation(projects.feature.settings)
    implementation(projects.presentation)

    implementation(libs.timber)
    implementation(libs.kakao.share)
    implementation(libs.firebase.crashlytics)
}