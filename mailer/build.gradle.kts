import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

apply {
	plugin("io.spring.dependency-management")
}

apply {
	plugin("org.springframework.boot")
}

group = "ru.oxicom.mailer"
version = "0.0.1-SNAPSHOT"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
}