plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

val kmpp = the<org.gradle.accessors.dm.LibrariesForKmpp>()

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs = listOf("-opt-in=kotlin.RequiresOptIn")
                jvmTarget = "17"
                apiVersion = "1.8"
                languageVersion = "1.8"
            }
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(IR) {
        nodejs()
    }
    targets.all {
        compilations.all {
            kotlinOptions {
                verbose = true
            }
        }
    }
    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(kmpp.kotlin.logging)
                implementation(kmpp.bundles.kotlin)
            }
        }
        named("commonTest") {
            dependencies {
                implementation(kmpp.bundles.kotest)
                implementation(kmpp.mockk)
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        named("jvmTest") {
            dependencies {
                implementation(kmpp.kotest.runner.junit5)
                implementation(kmpp.slf4j.simple)
            }
        }
    }
    explicitApi()
}
