rootProject.name = "kmpp"

enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
    versionCatalogs {
        create("kmpp") {
            from(files("./kmpp.libs.toml"))
        }
    }
}

includeBuild("build-logic")
include(
    ":kmpp-core"
)
