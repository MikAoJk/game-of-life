import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val javaVersion = JvmTarget.JVM_21

group = "io.github.mikaojk"
version = "1.0.0"

plugins {
    id("application")
    kotlin("jvm") version "2.0.21"
}

application {
    mainClass.set("io.github.mikaojk.MainKt")
}

group = "io.github.mikaojk"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    compilerOptions {
        jvmTarget.set(javaVersion)
    }
}