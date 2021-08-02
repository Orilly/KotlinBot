import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.api.JavaVersion.VERSION_11

plugins {
    application
    kotlin("jvm") version "1.5.21"
}

group = "com.brunocollingridge"
version = "1.0"

description = "An example bot for the Javacord library - but in Kotlin!"

java {
    sourceCompatibility = VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.javacord:javacord:3.3.2")
    implementation("io.github.cdimascio:dotenv-kotlin:6.2.2")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("com.brunocollingridge.kotlinbot.MainKt")
}