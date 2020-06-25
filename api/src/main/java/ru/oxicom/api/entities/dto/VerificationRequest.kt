package ru.oxicom.api.entities.dto

data class VerificationRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val registrationAddress: String,
    val realAddress: String
)