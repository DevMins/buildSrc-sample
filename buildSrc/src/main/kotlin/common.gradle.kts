plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

@Suppress("UnstableApiUsage")
android {
    compileSdk = Apps.compileSdk

    defaultConfig {
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
        testInstrumentationRunner = TestLibs.androidJUnitRunner
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

}

dependencies {
    common()
}