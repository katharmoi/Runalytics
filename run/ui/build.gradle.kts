plugins {
    alias(libs.plugins.runalytics.android.feature.ui)
}

android {
    namespace = "com.kkagency.run.ui"
}

dependencies {


    implementation(libs.coil.compose)
    implementation(libs.google.maps.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(projects.common.domain)
    implementation(projects.run.domain)
}