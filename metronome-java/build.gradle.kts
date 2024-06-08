plugins {
    id("metronome.kotlin")
    id("metronome.publish")
}

dependencies {
    api(project(":metronome-java-client-okhttp"))
}
