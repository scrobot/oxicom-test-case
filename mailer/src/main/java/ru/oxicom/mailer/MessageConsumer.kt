package ru.oxicom.mailer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class MessageConsumer {

    private val logger = LoggerFactory.getLogger(MessageConsumer::class.java)

    @KafkaListener(topicPattern = "???", groupId = "???")
    fun consume(message: String?) {
        // TODO("Not yet implemented")
    }

}