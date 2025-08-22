import com.android.build.gradle.LibraryExtension
import com.kkagency.convention.ExtensionType
import com.kkagency.convention.configureBuildTypes
import com.kkagency.convention.configureCompose
import com.kkagency.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class AndroidLibraryComposePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {

            pluginManager.run {
                apply("runalytics.android.library")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            val extension = extensions.getByType<LibraryExtension>()
            configureCompose(extension)

        }
    }
}