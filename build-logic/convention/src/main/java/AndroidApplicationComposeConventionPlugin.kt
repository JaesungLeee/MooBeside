import com.android.build.api.dsl.ApplicationExtension
import com.jslee.convention.configureComposePreview
import com.jslee.convention.configureCoreCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.run {
                apply("com.jslee.moobeside.android.application")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<ApplicationExtension> {
                configureCoreCompose(this)
                configureComposePreview(this)
            }
        }
    }
}