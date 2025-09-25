import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.moobeside.core.remote"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

//        buildConfigField("String", "KOBIS_API_KEY", getApiKey("KOBIS_API_KEY"))
//        buildConfigField("String", "TMDB_API_KEY", getApiKey("TMDB_API_KEY"))
//        buildConfigField("String", "YOUTUBE_API_KEY", getApiKey("YOUTUBE_API_KEY"))
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        buildConfig = true
    }
}

fun getApiKey(propertyKey: String): String {
    return gradleLocalProperties(rootDir, providers).getProperty(propertyKey)
}

dependencies {
    implementation(project(":core:common:kotlin"))
    implementation(project(":core:exception"))
    implementation(project(":core:model"))

    implementation(libs.retrofit)
    implementation(libs.retrofit.kotlinx.serialization.conveter)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    implementation(libs.androidx.paging.runtime)

    implementation(libs.bundles.kotlinx.coroutines)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.timber)
}