plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 30 // You can set this as per your requirement
    
    defaultConfig {
        applicationId = "com.example.mindrisehabits"
        minSdk = 21 // Set according to your needs
        targetSdk = 30 // You can set this as per your requirement
        versionCode = 1
        versionName = "1.0"
    }
    
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0" // Check the latest version
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.0") // Check for the latest version

    // Jetpack Compose
    implementation("androidx.compose.ui:ui:1.0.0") // UI
    implementation("androidx.compose.material:material:1.0.0") // Material Design
    implementation("androidx.compose.ui:ui-tooling:1.0.0") // Tooling
    implementation("androidx.navigation:navigation-compose:2.4.0-alpha10") // Navigation Component for Compose

    // Room
    implementation("androidx.room:room-runtime:2.3.0") // Room Runtime
    kapt("androidx.room:room-compiler:2.3.0") // Room Compiler

    // Hilt
    implementation("com.google.dagger:hilt-android:2.37") // Hilt Android
    kapt("com.google.dagger:hilt-compiler:2.37") // Hilt Compiler

    // Other dependencies can be added here
}