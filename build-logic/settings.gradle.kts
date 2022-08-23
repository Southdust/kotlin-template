rootProject.name = "build-logic"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("kmpp") {
            from(files("../kmpp.libs.toml"))
        }
    }
}
