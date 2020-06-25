package ru.oxicom.api.entities.persist

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class VerificationProcess(
    val id: String,
    val status: Status
) {
    enum class Status {
        UNKNOWN, IN_PROCESS, DECLINED, GRANTED
    }
}