import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    alias(libs.plugins.moobeside.android.library)
    alias(libs.plugins.kotlin.ksp)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.moobeside.core.remote"

    defaultConfig {
        buildConfigField("String", "KOBIS_API_KEY", getApiKey("KOBIS_API_KEY"))
        buildConfigField("String", "TMDB_API_KEY", getApiKey("TMDB_API_KEY"))
        buildConfigField("String", "YOUTUBE_API_KEY", getApiKey("YOUTUBE_API_KEY"))
    }

}

fun getApiKey(propertyKey: String): String {
    return gradleLocalProperties(rootDir, providers).getProperty(propertyKey)
}

dependencies {
    implementation(projects.core.common.kotlin)
    implementation(projects.core.exception)
    implementation(projects.core.model)

    implementation(libs.retrofit)
    implementation(libs.retrofit.kotlinx.serialization.conveter)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    implementation(libs.androidx.paging.runtime)

    implementation(libs.bundles.kotlinx.coroutines)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    implementation(libs.timber)
}