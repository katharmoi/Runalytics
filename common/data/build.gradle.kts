plugins {
    alias(libs.plugins.runalytics.android.library)
}

android {
    namespace = "com.kkagency.common.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.common.domain)
    implementation(projects.common.database)
}
