plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

val kmpp = the<org.gradle.accessors.dm.LibrariesForKmpp>()

tasks {
    compileKotlin {
        kotlinOptions {
            freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
            jvmTarget = "17"
        }
    }
    test {
        useJUnitPlatform()
    }
}

dependencies {
    implementation(kmpp.kotlin.logging)
    implementation(kmpp.bundles.kotlin)
    testImplementation(kmpp.bundles.kotest)
    testImplementation(kmpp.mockk)
    testImplementation(kmpp.kotest.runner.junit5)
    testImplementation(kmpp.slf4j.simple)
    testImplementation(kotlin("test-common"))
    testImplementation(kotlin("test-annotations-common"))
}

kotlin {
    explicitApi()
}
