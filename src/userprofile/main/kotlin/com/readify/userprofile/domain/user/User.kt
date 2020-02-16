package com.readify.userprofile.domain.user

import java.util.UUID

class User(val id: UserId, val username: Username, val email: Email, val password: Password)

data class Username(val value: String)
data class Email(val value: String)
data class Password(val value: String)
data class UserId(val value: String) {
    init {
        UUID.fromString(value)
    }
}