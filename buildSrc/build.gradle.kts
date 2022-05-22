plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", "1.6.21"))
    implementation("com.huanshankeji:common-gradle-dependencies:0.1.0-20220520")
    implementation("com.huanshankeji:kotlin-common-gradle-plugins:0.1.1")
}
