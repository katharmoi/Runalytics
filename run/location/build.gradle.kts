plugins {
    alias(libs.plugins.runalytics.android.library)
}

android {
    namespace = "com.kkagency.run.location"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.playservices.location)

    implementation(projects.common.domain)
    implementation(projects.run.domain)
}