plugins {
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.maven.publish)
    alias(libs.plugins.roborazzi)
}

group = "eu.acolombo.flagkit"
version = "1.1.3"

kotlin {
    android {
        namespace = "flagkit"
        compileSdk = libs.versions.android.targetSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()
        withHostTest {
            isIncludeAndroidResources = true
        }
    }

    jvmToolchain(libs.versions.java.jdk.get().toInt())

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.foundation)
            implementation(libs.compose.runtime)
            implementation(libs.compose.ui)
            implementation(libs.compose.components.resources)
            implementation(libs.compose.components.ui.tooling.preview)
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }

        val androidHostTest by getting {
            dependencies {
                implementation(libs.roborazzi)
                implementation(libs.roborazzi.compose)
                implementation(libs.robolectric)
                implementation(libs.compose.ui.test.junit4)
            }
        }
    }
}

roborazzi {
    outputDir.set(project.file("src/androidHostTest/screenshots"))
}

// https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-publish-libraries.html
mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates(group.toString(), "flagkit", version.toString())

    pom {
        name = "FlaKit Compose"
        description = "Beautiful flag icons for Compose Multiplatform."
        inceptionYear = "2025"
        url = "https://github.com/acolombo11/flagkit-compose/"
        licenses {
            license {
                name = "MIT License"
                url = "http://www.opensource.org/licenses/mit-license.php"
            }
        }
        developers {
            developer {
                id = "acolombo11"
                name = "Andrea Colombo"
                url = "https://github.com/acolombo11/"
            }
        }
        scm {
            url = "https://github.com/acolombo11/flagkit-compose/"
            connection = "scm:git:git://github.com/acolombo11/flagkit-compose.git"
            developerConnection = "scm:git:ssh://git@github.com/acolombo11/flagkit-compose.git"
        }
    }
}
