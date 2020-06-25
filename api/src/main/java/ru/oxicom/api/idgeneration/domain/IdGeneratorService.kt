package ru.oxicom.api.idgeneration.domain

import reactor.core.publisher.Mono

interface IdGeneratorService {

    fun getUniqueId(): Mono<String>

}