import de.undercouch.gradle.tasks.download.Download
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "2.5.5" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
    kotlin("jvm") version "1.5.31" apply false
    kotlin("plugin.spring") version "1.5.31" apply false

    id("de.undercouch.download") version "4.1.2"
    java
}

group = "es.unizar"
version = "0.0.1-SNAPSHOT"

val jaxbVersion by extra { "2.1.7" }

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    repositories {
        mavenCentral()
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }
    tasks.withType<Test> {
        useJUnitPlatform()
    }
    dependencies {
        "implementation"("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }
    tasks.withType<BootJar> {
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}

project(":server") {

    val generatedJavaDirs = "$buildDir/generated-sources/xjc"
    val generatedClassesDirs = "$buildDir/classes/xjc"
    val schema = "$projectDir/src/main/resources/ws/translator.xsd"
    val jaxb by configurations.creating

    dependencies {
        "implementation"("org.springframework.boot:spring-boot-starter-web")
        "implementation"("org.springframework.boot:spring-boot-starter-web-services")
        "testImplementation" ("junit:junit:4.12")
        "implementation"("wsdl4j:wsdl4j")
        "implementation"("com.graphql-java:graphql-java:11.0")
        "implementation"("com.graphql-java:graphql-java-spring-boot-starter-webmvc:1.0")
        "implementation" ("com.google.guava:guava:26.0-jre")
        "runtimeOnly"("org.glassfish.jaxb:jaxb-runtime")
        testImplementation("org.springframework.boot:spring-boot-starter-test")

    }


    java {
        sourceSets {
            getByName("main").java.srcDirs(generatedJavaDirs)
        }
    }
}

