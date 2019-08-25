# Kotlin-Spring "Hello, World!" [![Version](https://img.shields.io/badge/Version-0.1-color.svg)](https://github.com/igabaydulin/kotlin-spring-hello-world) ![Version](https://img.shields.io/badge/Java-OpenJDK%201.8-dd0000.svg?logo=java) ![Version](https://img.shields.io/badge/Kotlin-1.3.50-0095d5.svg?logo=kotlin) [![Version](https://img.shields.io/badge/Gradle-5.6-1ba8cb.svg)](https://docs.gradle.org/5.6/release-notes.html)

Represents basic web-service implementation in Kotlin using Spring Framework

## Table of contents
* [How to run the project](#run-project)
* [How to run tests](#run-tests)
* [API documentation](#api)
  * [How to send requests](#request)
  * [Example of a response](#response)
* [JAR](#jar)
  * [How to build .jar file](#build-jar-file)
  * [How to run .jar file](#run-jar-file)
* [Docker](#docker)
  * [How to build Docker image](#build-docker-image)
  * [How to run Docker container](#run-docker-container)

## Run project
```bash
./gradlew bootRun
```

## Run tests
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
### Build .jar file
```bash
./gradlew build
```

### Run .jar file
```bash
java -jar build/libs/kotlin-spring-hello-world-0.1.jar
```

## Docker
To be able to build and execute Docker images make sure you have Docker installed. Otherwise you can follow the [instructions](https://docs.docker.com/install/) to install it.
### Build Docker image
```bash
./gradlew buildDockerImage
```

### Run Docker container
```bash
docker run -p 8080:8080 kotlin-spring-hello-world
```
