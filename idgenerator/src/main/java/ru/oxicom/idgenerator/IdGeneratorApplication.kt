package ru.oxicom.idgenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

fun main(args: Array<String>) {
    runApplication<DeliveryApplication>(*args)
}

@SpringBootApplication
open class DeliveryApplication {

}