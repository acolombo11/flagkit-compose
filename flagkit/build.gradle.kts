import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.maven.publish)
}

kotlin {
    jvmToolchain(libs.versions.java.jdk.get().toInt())
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(libs.versions.java.jdk.get()))
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.ui)
            implementation(compose.components.uiToolingPreview)
        }
    }
}

android {
    namespace = "flagkit"
    compileSdk = libs.versions.android.maxSdk.get().toInt()
    defaultConfig { minSdk = libs.versions.android.minSdk.get().toInt() }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

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