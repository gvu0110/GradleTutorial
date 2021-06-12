/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.0/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.4.31"

    // Apply the application plugin to add support for building a CLI application in Java.
    id("application")
    
    // Add checkstyle plugin
    id("checkstyle")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

version = "1.0"

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    // Use strict version
    implementation("com.google.guava:guava:26.0-jre!!")

    runtimeOnly("com.google.inject:guice:4.2.3")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application.
    mainClass.set("lab.AppKt")
}

// Kotlin DSL:
tasks.jar {
    manifest {
        attributes("Implementation-Version" to project.version)
    }
}

// Run tests in parallel
tasks.test {
    maxParallelForks = 8
}

// Groovy DSL:
// tasks.named("jar") {
//   manifest {
//     attributes("Implementation-Version": project.version)
//   }
// }
//
// tasks.named("test") {
//    maxParallelForks = 8
// }