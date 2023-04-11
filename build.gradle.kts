import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
}

group = "me.peia"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation("com.squareup.moshi:moshi-kotlin:1.11.0")
}



tasks.test {
    useJUnitPlatform()
    testLogging{
        events("passed", "failed", "skipped")
    }

}



tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}