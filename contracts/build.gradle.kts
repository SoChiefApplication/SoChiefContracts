import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("maven-publish")
}

group = "com.vlegall"
version = "0.1.1"

publishing {
    repositories {
        maven {
            name = "gitea"
            url = uri("https://git.lan/api/packages/leva/maven")
            credentials {
                username = System.getenv("GITEA_USER")
                password = System.getenv("GITEA_TOKEN")
            }
        }
    }
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    jvm("desktop")

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies { implementation(libs.kotlin.test) }
        }

        val androidMain by getting
        val desktopMain by getting
    }
}

android {
    namespace = "com.vlegall.sochiefcontracts"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
