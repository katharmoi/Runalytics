plugins {
    alias(libs.plugins.runalytics.android.library.compose)
}

android {
    namespace = "com.kkagency.common.ui.shared"
}

dependencies {

    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)


    implementation(projects.common.domain)
    implementation(projects.common.ui.designsystem)
}