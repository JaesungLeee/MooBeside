pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google()
            mavenCentral()
            gradlePluginPortal()
            maven(url = "https://devrepo.kakao.com/nexus/content/groups/public/")
        }
    }
}

rootProject.name = "MooBeside"
include(":app")
include(":data")
include(":presentation")
include(":domain")
include(":core:common")
include(":core:designsystem")
include(":core:ui")
include(":core:external")
include(":core:deeplink")
include(":core:date")
