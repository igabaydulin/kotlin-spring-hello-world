plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.50")
    id("org.jetbrains.kotlin.plugin.spring").version("1.3.50")
    id("org.springframework.boot").version("2.1.7.RELEASE")
    id("io.spring.dependency-management").version("1.0.8.RELEASE")
    id("com.bmuschko.docker-spring-boot-application").version("5.0.0")
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation("org.junit.jupiter:junit-jupiter:5.5.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs =
            listOf("-Xjsr305=strict") // handles @Nonnull annotation (see: https://kotlinlang.org/docs/reference/java-interop.html#jsr-305-support)
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

project.version = "0.1"