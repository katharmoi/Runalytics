plugins {
    alias(libs.plugins.runalytics.android.library)
    alias(libs.plugins.runalytics.android.room)
}

android {
    namespace = "com.kkagency.common.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.common.domain)
}