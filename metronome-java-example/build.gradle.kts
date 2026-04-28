plugins {
    id("metronome.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":metronome-java-core"))
    implementation(project(":metronome-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :metronome-java-example:run` to run `Main`
    // Use `./gradlew :metronome-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.metronome.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
