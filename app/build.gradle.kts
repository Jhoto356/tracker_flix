plugins {
    /** KSP COMPILER **/
    alias(libs.plugins.ksp.compiler)

    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.jhoto_dev.tracker_flix"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jhoto_dev.tracker_flix"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // KSP COMPILER
    ksp(libs.room.compiler)
    // Implementation: Android And Compose
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    // ROOM
    implementation(libs.room.ktx)
    implementation(libs.room.paging)
    implementation(libs.room.testing)
    // Koin Implementation
    implementation(libs.koin.compose)
    // Retrofit Implementation
    implementation(libs.retrofit.retrofit)
    implementation(libs.retrofit.converter.gson)

    implementation(libs.google.accompanist.system.ui.controller)
    // Test Implementation
    testImplementation(libs.junit)
    // Android Test Implementation
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    // Debug Implementation
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    // Testing Implementation
    testImplementation(libs.junit)



}