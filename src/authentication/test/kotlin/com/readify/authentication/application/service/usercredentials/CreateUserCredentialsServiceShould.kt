package com.readify.authentication.application.service.usercredentials

import com.readify.authentication.domain.usercredentials.Email
import com.readify.authentication.domain.usercredentials.EncodedPassword
import com.readify.authentication.domain.usercredentials.PasswordEncoderService
import com.readify.authentication.domain.usercredentials.UserCredentials
import com.readify.authentication.domain.usercredentials.UserCredentialsRepository
import com.readify.authentication.domain.usercredentials.UserId
import com.readify.authentication.domain.usercredentials.Username
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class CreateUserCredentialsServiceShould {

    private val encryptPasswordService: PasswordEncoderService = mockk()
    private val userCredentialsRepository: UserCredentialsRepository = mockk(relaxed = true)
    private val service =
        CreateUserCredentialsService(
            encryptPasswordService,
            userCredentialsRepository
        )

    @Test
    fun `save new credentials after encrypting password`() {
        val request =
            CreateUserCredentialsRequest(
                "any-id",
                "manu",
                "manuelpancorbo@gmail.com",
                "12345"
            )
        every { encryptPasswordService.encode("12345") } returns EncodedPassword("encryptedpassword")

        service.execute(request)

        verify {
            userCredentialsRepository.save(
                UserCredentials(
                    UserId("any-id"),
                    Username("manu"),
                    Email("manuelpancorbo@gmail.com"),
                    EncodedPassword("encryptedpassword")
                )
            )
        }

    }
}