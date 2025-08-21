import com.android.build.api.dsl.ApplicationExtension
import com.kkagency.convention.configureCompose

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class ApplicationComposePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("org.jetbrains.kotlin.plugin.compose")
                apply("runalytics.android.application")
            }

            val extension = extensions.getByType<ApplicationExtension>()
            configureCompose(extension)
        }
    }
}