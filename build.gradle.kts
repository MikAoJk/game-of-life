import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val javaVersion = JvmTarget.JVM_21

group = "io.github.mikaojk"
version = "1.0.0"

plugins {
    id("application")
    kotlin("jvm") version "2.2.0"
}

application {
    mainClass.set("io.github.mikaojk.MainKt")
}

repositories {
    mavenCentral()
}

kotlin {
    compilerOptions {
        jvmTarget.set(javaVersion)
    }
}
