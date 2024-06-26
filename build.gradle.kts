plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testImplementation("org.assertj:assertj-core:3.11.1")
    implementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    implementation("org.assertj:assertj-core:3.11.1")
}

tasks.test {
    useJUnitPlatform()
}