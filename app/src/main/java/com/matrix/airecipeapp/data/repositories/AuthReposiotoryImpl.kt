package com.matrix.airecipeapp.data.repositories

import android.util.Log
import com.matrix.airecipeapp.data.models.LoginRequest
import com.matrix.airecipeapp.data.models.RegisterRequest
import com.matrix.airecipeapp.domain.models.AuthResponse
import com.matrix.airecipeapp.domain.repositories.AuthRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType

class AuthRepositoryImpl(private val client: HttpClient):AuthRepository {


    override suspend fun registerUser(
        userName: String,
        email: String,
        password: String
    ): AuthResponse {
        val respons= client.post("http://10.0.2.2:1337/api/auth/local/register"){
            contentType(ContentType.Application.Json)
            setBody(RegisterRequest(userName,email,password))

        }
        Log.d("create account response ", respons.bodyAsText())

        return respons.body()
    }


    override suspend fun loginUser(identifier: String, password: String):AuthResponse {

        return client.post("http://localhost:1337/api/auth/local"){
            contentType(ContentType.Application.Json)
            setBody(LoginRequest(identifier, password))
        }.body()
    }

}