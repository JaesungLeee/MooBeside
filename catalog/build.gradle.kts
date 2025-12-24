plugins {
    alias(libs.plugins.moobeside.android.application.compose)
}

android.namespace = "com.moobeside.catalog"

dependencies {
    implementation(projects.core.designsystem)

    implementation(libs.androidx.compose.lifecycle.runtime)
    implementation(libs.androidx.compose.activity)
}