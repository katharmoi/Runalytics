plugins {
    alias(libs.plugins.runalytics.android.library)
}

android {
    namespace = "com.kkagency.auth.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.auth.domain)
    implementation(projects.common.domain)
}