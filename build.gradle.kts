@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(kmpp.plugins.kotlin.multiplatform) apply false
    alias(kmpp.plugins.kotlin.serialization) apply false
    alias(kmpp.plugins.kotlin.jvm) apply false
    alias(kmpp.plugins.dokka) apply false
}

allprojects {
    repositories {
        maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/") {
            name = "Sonatype"
        }
        mavenCentral()
    }
}
