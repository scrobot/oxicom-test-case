package ru.oxicom.api.verification.domain

import reactor.core.publisher.Mono
import ru.oxicom.api.entities.dto.VerificationRequest
import ru.oxicom.api.entities.persist.VerificationProcess

interface VerificationService {

    fun verify(request: VerificationRequest): Mono<VerificationProcess>
    fun checkStatus(): Mono<VerificationProcess>

}