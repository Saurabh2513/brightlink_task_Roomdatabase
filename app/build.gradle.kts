import org.jetbrains.kotlin.gradle.internal.kapt.incremental.UnknownSnapshot

plugins {

    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.brightlink_task"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.brightlink_task"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
        kotlinCompilerVersion = "1.5.21" // Make sure this version is same as your Kotlin version
    }
}

dependencies {


    //Lottie
    implementation(libs.lottie)
    // Room
    implementation(libs.androidx.room.runtime.v252)
    // optional - Kotlin Extensions and Coroutines support for Room
    implementation(libs.androidx.room.ktx.v252)
    implementation(libs.androidx.room.room.runtime2)
    implementation(libs.support.annotations)
    implementation(libs.example.artifact)
    kapt(libs.dagger.compiler)
    //classpath (libs.kotlin.gradle.plugin)
    // Kotlin Extensions for Room
    implementation(libs.androidx.room.room.ktx)
    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)
    // Page indicator
    implementation(libs.dotsindicator)
    // coroutine
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    implementation("org.example:example-artifact:1.0.0")
    kapt("com.google.dagger:dagger-compiler:2.38.1")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}