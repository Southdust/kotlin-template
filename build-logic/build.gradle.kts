plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", kmpp.versions.kotlin.get()))
    implementation(kotlin("serialization", kmpp.versions.kotlin.get()))
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:" + kmpp.plugins.dokka.get().version)
    implementation (files(kmpp.javaClass.superclass.protectionDomain.codeSource.location))
}
