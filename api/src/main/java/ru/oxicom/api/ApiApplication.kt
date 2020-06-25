package ru.oxicom.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
open class ApiApplication {

    @GetMapping("/health")
    fun healthCheck() = "200 OK"

}

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}