plugins {
    kotlin("jvm") version "1.9.0"
    id("org.graalvm.buildtools.native") version "0.9.27"
    application
}

group = "com.niangaoa.lwjgl_plus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("lwjgl_plus"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("com.niangaoa.lwjgl_plus.MainKt")
}