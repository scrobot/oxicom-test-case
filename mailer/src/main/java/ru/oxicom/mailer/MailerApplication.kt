package ru.oxicom.mailer;

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class MailerApplication

fun main(args: Array<String>) {
    runApplication<MailerApplication>(*args)
}