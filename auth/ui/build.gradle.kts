plugins {
    alias(libs.plugins.runalytics.android.feature.ui)

}

android {
    namespace = "com.kkagency.auth.ui"
}

dependencies {
    implementation(projects.common.domain)
    implementation(projects.common.ui.designsystem)
    implementation(projects.auth.domain)
}