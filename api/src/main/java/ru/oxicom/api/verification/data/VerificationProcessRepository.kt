package ru.oxicom.api.verification.data

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import ru.oxicom.api.entities.persist.VerificationProcess

interface VerificationProcessRepository: ReactiveMongoRepository<VerificationProcess, String> {
}