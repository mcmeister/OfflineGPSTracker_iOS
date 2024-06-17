buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.4.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
        // Add any necessary classpaths for iOS support
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
