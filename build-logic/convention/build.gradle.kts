plugins {
    `kotlin-dsl`
}

group="com.kkagency.runalytics.buildlogic"

dependencies{
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id= "runalytics.android.application"
            implementationClass = "ApplicationPlugin"
        }
        register("androidApplicationCompose") {
            id= "runalytics.android.application.compose"
            implementationClass = "ApplicationComposePlugin"
        }
        register("androidLibrary") {
            id= "runalytics.android.library"
            implementationClass = "AndroidLibraryPlugin"
        }
        register("androidLibraryCompose") {
            id= "runalytics.android.library.compose"
            implementationClass = "AndroidLibraryComposePlugin"
        }
        register("androidUI") {
            id= "runalytics.android.feature.ui"
            implementationClass = "AndroidUIPlugin"
        }
        register("androidRoom") {
            id= "runalytics.android.room"
            implementationClass = "RoomPlugin"
        }

        register("jvmLibrary") {
            id= "runalytics.jvm.library"
            implementationClass = "JVMLibraryPlugin"
        }

        register("jvmKtor") {
            id= "runalytics.jvm.ktor"
            implementationClass = "JVMKtorPlugin"
        }
    }
}
