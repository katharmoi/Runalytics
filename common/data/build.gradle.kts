plugins {
    alias(libs.plugins.runalytics.android.library)
    alias(libs.plugins.runalytics.jvm.ktor)
}

android {
    namespace = "com.kkagency.common.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.common.domain)
    implementation(projects.common.database)
}
