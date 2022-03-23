plugins {
    id ("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = Apps.compileSdk

    defaultConfig {
        applicationId = Apps.applicationId
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true

        testInstrumentationRunner = TestLibs.androidJUnitRunner
    }


    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = true
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {
    common()
}