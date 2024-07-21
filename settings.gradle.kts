rootProject.name = "harutiroSiteKMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
                maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
                maven("https://oss.sonatype.org/content/repositories/snapshots")
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":composeApp")
include(":instantSite")
