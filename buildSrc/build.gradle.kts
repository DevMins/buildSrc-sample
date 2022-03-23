plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    google()
}

dependencies {
    /** [Apps.androidGradlePluginVersion] */
    implementation("com.android.tools.build:gradle:7.1.1")

    /** [Apps.kotlinGradlePluginVersion] */
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")

    /** [Dagger.daggerHiltVersion] */
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.39.1")
}

