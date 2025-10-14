plugins {
    alias(libs.plugins.moobeside.android.library.compose)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.plugin)
    alias(libs.plugins.kotlin.compose)
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-parcelize")
}


android {
    namespace = "com.jslee.presentation"
}

dependencies {
    implementation(projects.core.common.android)
    implementation(projects.core.common.kotlin)
    implementation(projects.core.common.ui)
    implementation(projects.core.domain)
    implementation(projects.core.designsystem)
    implementation(projects.core.external)
    implementation(projects.core.deeplink)
    implementation(projects.core.logger)
    implementation(projects.core.model)
    implementation(projects.core.image)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.bundles.androidx.navigation)
    implementation(libs.bundles.androidx.lifecycle)
    implementation(libs.androidx.paging.runtime)
    implementation(libs.androidx.recyclerview)

    implementation(libs.bundles.kotlinx.coroutines)

    implementation(libs.material)
    implementation(libs.flexbox)
    implementation(libs.oss.license)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.facebook.shimmer)
    implementation(libs.timber)
}