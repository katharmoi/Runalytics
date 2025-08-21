import com.android.build.gradle.LibraryExtension
import com.kkagency.convention.ExtensionType
import com.kkagency.convention.configureBuildTypes
import com.kkagency.convention.configureKotlinAndroid
import com.kkagency.convention.configureKotlinJVM
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JVMLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            configureKotlinJVM()
        }
    }
}