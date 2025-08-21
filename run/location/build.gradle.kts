plugins {
    alias(libs.plugins.runalytics.android.library)
}

android {
    namespace = "com.kkagency.run.location"
}

dependencies {

    implementation(libs.androidx.core.ktx)

    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.material3)
    debugImplementation(libs.androidx.compose.ui.tooling)

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.playservices.location)

    implementation(projects.common.domain)
    implementation(projects.run.domain)
}