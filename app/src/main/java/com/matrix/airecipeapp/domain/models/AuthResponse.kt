package com.matrix.airecipeapp.domain.models

data class User(
    val id: Int,
    val username:String,
    val email:String
)


data class AuthResponse(
    val jwt:String,
    val user: User
)
