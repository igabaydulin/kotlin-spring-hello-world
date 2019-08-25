# Kotlin-Spring "Hello, World!" [![Version](https://img.shields.io/badge/Version-0.1-color.svg)](https://github.com/igabaydulin/kotlin-spring-hello-world) ![Version](https://img.shields.io/badge/Java-OpenJDK%201.8-dd0000.svg?logo=java) ![Version](https://img.shields.io/badge/Kotlin-1.3.50-0095d5.svg?logo=kotlin) [![Version](https://img.shields.io/badge/Gradle-5.6-1ba8cb.svg)](https://docs.gradle.org/5.6/release-notes.html)

Represents basic web-service implementation in Kotlin using Spring Framework

## Table of contents
* [Tools and Dependencies](#tools-and-dependencies)
* [How to Run The Project](#run-project)
* [How to Run Tests](#run-tests)
* [API documentation](#api)
  * [How to send requests](#request)
  * [Example of a response](#response)
* [JAR](#jar)
  * [How to build .jar file](#build-jar-file)
  * [How to run .jar file](#run-jar-file)
* [Docker](#docker)
  * [How to build Docker image](#build-docker-image)
  * [How to run Docker container](#run-docker-container)

## Tools and Dependencies
* Kotlin 1.3.50 ([release notes](https://blog.jetbrains.com/kotlin/2019/08/kotlin-1-3-50-released/), [about](https://kotlinlang.org/docs/reference/basic-syntax.html))
* Gradle 5.6 ([release notes](https://docs.gradle.org/5.6/release-notes.html), [about](https://docs.gradle.org/current/userguide/userguide.html))
* Junit Jupiter 5.5.1 ([release notes](https://junit.org/junit5/docs/snapshot/release-notes/index.html#release-notes-5.5.1), [about](https://junit.org/junit5/))
* Spring Boot 2.1.7.RELEASE ([release notes](https://github.com/spring-projects/spring-boot/releases/tag/v2.1.7.RELEASE), [about](https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/reference/htmlsingle/#getting-started))
* Docker 19.03.1 ([about](https://www.docker.com/resources/what-container))
* Gradle Docker plugin ([about](https://bmuschko.github.io/gradle-docker-plugin/))

## Run Project
```bash
./gradlew bootRun
```

## Run Tests
```bash
./gradlew test
```

## API
### Request
```bash
curl -s localhost:8080/hello | jq
```

### Response
```javascript
{
  "to": "World",
  "greeting": "Hello, World!"
}

```

## JAR
Make sure you use Java 1.8 at least
### Build .jar File
```bash
./gradlew build
```

### Run .jar File
```bash
java -jar build/libs/kotlin-spring-hello-world-0.1.jar
```

## Docker
To be able to build and execute Docker images make sure you have Docker installed. Otherwise you can follow the [instructions](https://docs.docker.com/install/) to install it.
### Build Docker Image
```bash
./gradlew buildDockerImage
```

### Run Docker Container
```bash
docker run -p 8080:8080 kotlin-spring-hello-world
```
