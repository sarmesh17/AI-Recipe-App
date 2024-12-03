package com.matrix.airecipeapp.data.models

import kotlinx.serialization.Serializable

@Serializable
data class RegisterRequest(val username:String, val email:String,val password:String)

@Serializable
data class LoginRequest( val identifier:String, val password:String)