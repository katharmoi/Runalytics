pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "Runalytics"
include(":app")
include(":common:data")
include(":common:domain")
include(":run:ui")
include(":run:data")
include(":run:domain")
include(":run:location")
include(":run:network")
include(":common:database")
include(":common:ui:designsystem")
include(":common:ui:shared")
include(":auth:ui")
include(":auth:data")
include(":auth:domain")
