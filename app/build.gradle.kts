@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.plugin)
    alias(libs.plugins.google.services)
    alias(libs.plugins.firebase.crashlytics.plugin)
}

android {
    namespace = "com.jslee.moobeside"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jslee.moobeside"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
        dataBinding = true
        buildConfig = true
    }
}

dependencies {
    implementation(project(":core:common:android"))
    implementation(project(":core:common:kotlin"))
    implementation(project(":core:common:ui"))
    implementation(project(":core:data"))
    implementation(project(":core:deeplink"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:external"))
    implementation(project(":core:image"))
    implementation(project(":core:logger"))
    implementation(project(":core:local"))
    implementation(project(":core:remote"))
    implementation(project(":feature:home"))
    implementation(project(":feature:boxoffice"))
    implementation(project(":feature:bookmark"))
    implementation(project(":feature:detail"))
    implementation(project(":feature:settings"))
    implementation(project(":feature:cast"))
    implementation(project(":feature:search"))
    implementation(project(":presentation"))

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.timber)
    implementation(libs.kakao.share)
    implementation(libs.firebase.crashlytics)
}