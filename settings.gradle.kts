pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "OfflineGPSTracker"
include(":app")
include(":offlinegpstracker_ios") // Include the iOS module
