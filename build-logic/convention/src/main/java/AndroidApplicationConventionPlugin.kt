import com.android.build.api.dsl.ApplicationExtension
import com.jslee.convention.configureDefaultConfig
import com.jslee.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.run {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                configureDefaultConfig(this@with)
                configureKotlinAndroid(this)
            }
        }
    }
}
