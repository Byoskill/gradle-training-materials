plugins {
    java
    application
}

application {
    mainClassName = "Main"
}


repositories {
    mavenCentral()
}

dependencies {
    implementation("log4j:log4j:1.2.17")

}