package ru.oxicom.approver

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import org.apache.kafka.clients.admin.AdminClientConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.core.KafkaAdmin
import reactor.core.publisher.Flux
import java.util.*
import javax.annotation.PostConstruct
import kotlin.random.Random
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds
import kotlin.time.toJavaDuration


fun main(args: Array<String>) {
    runApplication<ApproverApplication>(*args)
}

@SpringBootApplication
open class ApproverApplication {

    @Bean
    open fun admin(): KafkaAdmin? {
        val configs: MutableMap<String, Any> =
            HashMap()
        configs[AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG] = "localhost:9092"
        return KafkaAdmin(configs)
    }

    @Bean
    open fun json(): Json = Json(JsonConfiguration.Stable)

}