plugins {
  kotlin("jvm") version "1.4.32"
}

group = "xyz.ragunath.versioning"
version = "0.1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))

  testImplementation(kotlin("test-junit5"))
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
  testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.0")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
  useJUnitPlatform()
}
