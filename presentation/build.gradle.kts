@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.plugin)
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-parcelize")
}


android {
    namespace = "com.jslee.presentation"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    composeOptions {
        val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs")
        kotlinCompilerExtensionVersion = libs.findVersion("compose-compiler").get().toString()
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
        compose = true
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":core:common:android"))
    implementation(project(":core:common:kotlin"))
    implementation(project(":core:common:ui"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:external"))
    implementation(project(":core:deeplink"))
    implementation(project(":core:logger"))
    implementation(project(":core:image"))

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

    implementation(platform(libs.compose.bom))
    androidTestImplementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose)
    debugImplementation(libs.compose.ui.tooling)
}