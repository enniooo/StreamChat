version = "0.1.0"

plugins {
    id("java-library")
}

repositories {
    mavenLocal()
}

dependencies {
    labyProcessor()
    labyApi("api")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.compileJava {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
    targetCompatibility = JavaVersion.VERSION_1_8.toString()
}