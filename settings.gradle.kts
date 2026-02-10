pluginManagement {
    includeBuild("build-logic")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    dependencyResolutionManagement {
        repositories {
            google()
            mavenCentral()
            gradlePluginPortal()
            maven(url = "https://devrepo.kakao.com/nexus/content/groups/public/")
        }
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "MooBeside"
include(":app")
include(":core:common:android")
include(":core:common:kotlin")
include(":core:common:ui")
include(":core:data")
include(":core:domain")
include(":core:deeplink")
include(":core:designsystem")
include(":core:exception")
include(":core:external")
include(":core:image")
include(":core:local")
include(":core:logger")
include(":core:model")
include(":core:navigation")
include(":core:remote")
include(":feature:home")
include(":feature:boxoffice")
include(":feature:bookmark")
include(":feature:detail")
include(":feature:settings")
include(":feature:cast")
include(":feature:search")
include(":presentation")
include(":catalog")
