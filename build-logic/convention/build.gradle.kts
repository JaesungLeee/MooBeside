import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { `kotlin-dsl` }

group = "com.jslee.moobeside.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
    compileOnly(libs.firebase.crashlytics.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "com.jslee.moobeside.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidLibrary") {
            id = "com.jslee.moobeside.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
    }
}
