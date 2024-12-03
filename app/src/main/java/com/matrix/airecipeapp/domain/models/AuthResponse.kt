package com.matrix.airecipeapp.domain.models

import kotlinx.serialization.Serializable


@Serializable
data class AuthResponse(
    val jwt: String,
    val user: User
)

@Serializable
data class User(
    val id: Int,
    val documentId: String,
    val username: String,
    val email: String,
    val provider: String,
    val confirmed: Boolean,
    val blocked: Boolean,
    val createdAt: String,
    val updatedAt: String,
    val publishedAt: String
)
