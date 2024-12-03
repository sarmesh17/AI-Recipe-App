package com.matrix.airecipeapp.domain.repositories

import com.matrix.airecipeapp.domain.models.AuthResponse

interface AuthRepository {

    suspend fun  registerUser(userName:String,email:String,password:String):AuthResponse
    suspend fun loginUser(identifier:String,password: String):AuthResponse
}