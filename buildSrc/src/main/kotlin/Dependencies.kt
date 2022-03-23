import org.gradle.kotlin.dsl.DependencyHandlerScope

object Apps {
    const val applicationId = "com.gyumin.buildsrc"
    const val compileSdk = 30
    const val targetSdk = 30
    const val minSdk = 21
    const val versionCode = 1
    const val versionName = "1.0.0"

    private const val androidGradlePluginVersion = "7.1.1"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${androidGradlePluginVersion}"

    private const val kotlinGradlePluginVersion = "1.6.10"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinGradlePluginVersion}"
}

object AndroidX {
    private const val coreKtxVersion = "1.6.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    private const val appCompatVersion = "1.3.1"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"

    private const val constraintLayoutVersion = "2.1.3"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

    private const val recyclerviewVersion = "1.2.1"
    const val recyclerview = "androidx.recyclerview:recyclerview:$recyclerviewVersion"

    private const val activityKtxVersion = "1.2.4"
    const val activityKtx = "androidx.activity:activity-ktx:$activityKtxVersion"

    private const val fragmentKtxVersion = "1.3.6"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragmentKtxVersion"

    private const val lifecycleVersion = "2.3.1"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"

}

object Dagger {
    private const val daggerHiltVersion = "2.39.1"

    const val hiltAndroidGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$daggerHiltVersion"

    const val hiltAndroid = "com.google.dagger:hilt-android:$daggerHiltVersion"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:$daggerHiltVersion"

}

object Google {
    private const val materialVersion = "1.4.0"
    const val material = "com.google.android.material:material:$materialVersion"

    private const val googleServiceVersion = "4.3.10"
    const val googleService = "com.google.gms:google-services:$googleServiceVersion"

    private const val firebaseBomVersion = "29.1.0"
    const val firebaseBom = "com.google.firebase:firebase-bom:$firebaseBomVersion"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"

}

object Net {
    private const val retrofit2Version = "2.9.0"
    const val retrofit2 = "com.squareup.retrofit2:retrofit:$retrofit2Version"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:$retrofit2Version"
    const val retrofitConverterScalars = "com.squareup.retrofit2:converter-scalars:$retrofit2Version"

    private const val okHttpBomVersion = "4.9.3"
    const val okHttpBom = "com.squareup.okhttp3:okhttp-bom:$okHttpBomVersion"
    const val okHttp = "com.squareup.okhttp3:okhttp"
    const val okHttpLoggingIntercepter = "com.squareup.okhttp3:logging-interceptor"
}

object Lottie {
    private const val lottieVersion = "3.4.0"
    const val lottie = "com.airbnb.android:lottie:$lottieVersion"
}

object TestLibs {
    const val androidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"

    private const val jUnitVersion = "4.13.2"
    const val jUnit = "junit:junit:$jUnitVersion"

    private const val extJUnitVersion = "1.1.3"
    const val extJUnit = "androidx.test.ext:junit:$extJUnitVersion"

    private const val espressoVersion = "3.4.0"
    const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
}


fun DependencyHandlerScope.common() {
    "implementation"(Dagger.hiltAndroid)
    "kapt"(Dagger.hiltAndroidCompiler)

    "implementation"(AndroidX.coreKtx)
    "implementation"(AndroidX.appCompat)
    "implementation"(AndroidX.activityKtx)
    "implementation"(AndroidX.fragmentKtx)
    "implementation"(AndroidX.viewModelKtx)
    "implementation"(AndroidX.livedataKtx)
    "implementation"(AndroidX.recyclerview)
    "implementation"(AndroidX.constraintLayout)

    "implementation"(Net.retrofit2)
    "implementation"(Net.retrofitConverterGson)
    "implementation"(Net.retrofitConverterScalars)

    "implementation"(platform(Net.okHttpBom))
    "implementation"(Net.okHttp)
    "implementation"(Net.okHttpLoggingIntercepter)

    "implementation"(Google.material)
//    "implementation"(platform(Google.firebaseBom))
//    "implementation"(Google.firebaseAnalytics)
//    "implementation"(Google.firebaseMessaging)

    "implementation"(Lottie.lottie)

    "testImplementation"(TestLibs.jUnit)
    "androidTestImplementation"(TestLibs.extJUnit)
    "androidTestImplementation"(TestLibs.espresso)
}