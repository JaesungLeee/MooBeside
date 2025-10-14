import com.android.build.gradle.LibraryExtension
import com.jslee.convention.configureComposePreview
import com.jslee.convention.configureCoreCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.run {
                apply("com.jslee.moobeside.android.library")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<LibraryExtension> {
                configureCoreCompose(this)
                configureComposePreview(this)
            }
        }
    }
}