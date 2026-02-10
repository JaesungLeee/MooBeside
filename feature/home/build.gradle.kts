plugins {
    alias(libs.plugins.moobeside.android.library.compose)
    alias(libs.plugins.moobeside.android.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android.namespace = "com.moobeside.feature.home"

dependencies {
    implementation(projects.core.designsystem)
    implementation(projects.core.common.android)
    implementation(projects.core.common.kotlin)
    implementation(projects.core.common.ui)
    implementation(projects.core.domain)
    implementation(projects.core.model)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.androidx.compose.activity)
    implementation(libs.androidx.compose.hilt.navigation)
    implementation(libs.androidx.compose.lifecycle.runtime)
    implementation(libs.androidx.navigation3.runtime)
    implementation(libs.androidx.navigation3.ui)
    implementation(libs.androidx.lifecycle.viewmodel.navigation3)
}