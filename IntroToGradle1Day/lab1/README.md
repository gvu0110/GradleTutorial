# IntroToGradle1Day

## Lab 1
### Part 1
1. Run `gradle init`
- Select project type - `2: application`
- When asked to select a build script DSL - `2: Kotlin` (or `1: Groovy` if you prefer)
- For the other questions, press enter to use the default values
2. Explore the build
- Run `./gradlew test` and find the test report in `app/build/reports/tests/test/index.html`
- Find the task to run the application using `./gradlew tasks`
- Run the application `./gradlew run`, it should run the task `:app:run` and print `Hello World!`
- Run the tests of the application
- Create a build scan with `./gradlew build --scan` and explore the timeline. Which tasks have been executed?
3. Modify the project
- Add the `checkstyle` plugin to `app/build.gradle.kts` file (in addition to the `application` plugin)
- Run `./gradlew test` and `./gradlew run` again

### Part 2 
1. Set a `version = "1.0"` for the project in `app/build.gradle.kts`.
2. Execute `./gradlew tasks` to see which tasks are available.
3. Build the application's jar with `./gradlew build`
- Find it in `app/build/distributions/`. The file name should include the version number
4. Configure the `jar` task to add an entry named `Implementation-Version` to the far manifest. Set the entry's value to the project version.
5. Configure the `test` task to run tests in parallel (use the `maxParallelForks` setting).


### Part 3:
1. Execute `./gradlew :app:dependencies --configuration compileClasspath`
2. In `app/build.gradle.kts`: Add an `implementation` dependency to `com.google.inject:guice:4.2.3` 
3. Execute `./gradlew :app:dependencies --configuration compileClasspath` again. Can you see the Guava conflict?
4. Change the Guava version in your build to `26.0-jre`. The version `27.1-jre` will be selected
5. Change the Guice dependency to `runtimeOnly`. Compare the `compileClasspath` and the `runtimeClasspath`. Check the selected Guava versions.
6. Run `./gradlew :app:dependencies --scan` and explore the results in the "Dependencies" tab of the build scan.
7. Enforce the selection of Guava `26.0-jre` (use a strict version). The `26.0-jre` selected in both `compileClasspath` and the `runtimeClasspath`