import com.huanshankeji.CommonDependencies

plugins {
    id("multiplatform-conventions")
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(CommonDependencies.Ktor.Client.core())
            }
        }
    }
}
