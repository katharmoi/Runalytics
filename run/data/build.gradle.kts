plugins {
    alias(libs.plugins.runalytics.android.library)
}

android {
    namespace = "com.kkagency.run.data"
}

dependencies {

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.playservices.location)
    implementation(libs.androidx.work)
    implementation(libs.koin.android.workmanager)
    implementation(libs.kotlinx.serialization.json)

    implementation(projects.common.domain)
    implementation(projects.common.database)
    implementation(projects.run.domain)


}