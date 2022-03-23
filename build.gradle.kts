buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {
        classpath(Apps.androidGradlePlugin)
        classpath(Apps.kotlinGradlePlugin)
        classpath(Dagger.hiltAndroidGradlePlugin)
//        classpath(Google.googleService)
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven(url = "https://jitpack.io")
        maven(url = "https://devrepo.kakao.com/nexus/content/groups/public/")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}