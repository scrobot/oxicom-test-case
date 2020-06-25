package ru.oxicom.api.verification

import org.springframework.web.bind.annotation.*
import ru.oxicom.api.verification.domain.VerificationService

@RestController
@RequestMapping("api")
class VerificationController(val service: VerificationService) {

    @PostMapping("send-verification")
    fun sendVerification() {

    }

    @GetMapping("check-verification-status/{id}")
    fun checkVerificationStatus(@PathVariable id: String) {

    }

}