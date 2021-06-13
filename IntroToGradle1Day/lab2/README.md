# IntroToGradle1Day

## Lab 2
### Part 1
1. Run `gradle init`
- Select project type - `2: application`
- Select implementation language - `3: Java`
- When asked to select a build script DSL - `2: Kotlin` (or `1: Groovy` if you prefer)
- For the other questions, press enter to use the default values
2. Explore the multi-project build
- Find the convention plugins in `buildSrc`
- Explore the `app/build.gradle.kts` file and find the project dependencies
- Execute `./gradlew :app:assemble`
- Execute `./gradlew :app:run`
- Configure a JDK of your choice for all projects in `lab.java-common-conventions.gradle.kts` (use `java.toolchain.languageVersion`)