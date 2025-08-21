plugins {
    alias(libs.plugins.runalytics.android.library)
}

android {
    namespace = "com.kkagency.run.network"
}

dependencies {

    implementation(projects.common.domain)
    implementation(projects.common.data)
}