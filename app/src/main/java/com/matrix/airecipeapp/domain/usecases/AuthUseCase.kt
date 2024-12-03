package com.matrix.airecipeapp.domain.usecases

import com.matrix.airecipeapp.domain.models.AuthResponse
import com.matrix.airecipeapp.domain.repositories.AuthRepository

class RegisterUserUseCase(private val repository: AuthRepository) {

    suspend operator fun invoke(username: String, email: String, password: String):AuthResponse {

        return repository.registerUser(username,email,password)
    }
}

class LoginUserUseCase(private  val repository: AuthRepository){

    suspend operator fun invoke(identifier:String, password: String):AuthResponse{

       return repository.loginUser(identifier,password)
    }
}
