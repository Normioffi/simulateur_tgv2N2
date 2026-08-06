plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.serialization)

}
val ktorVersion: String by project
android {
    namespace = "fr.simulaniki.tgv2n2"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "fr.simulaniki.tgv2n2"
        minSdk = 23
        //noinspection OldTargetApi
        targetSdk = 36
        versionCode = 100000015
        versionName = "1.0.0-1.5 Milgraze"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("io.ktor:ktor-client-cio:${ktorVersion}")
    implementation("io.ktor:ktor-client-android:${ktorVersion}")
    implementation("io.ktor:ktor-client-content-negotiation:${ktorVersion}")
    implementation("io.ktor:ktor-serialization-kotlinx-json:${ktorVersion}")
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}