package com.matrix.airecipeapp.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.matrix.airecipeapp.domain.models.AuthResponse
import com.matrix.airecipeapp.domain.usecases.LoginUserUseCase
import com.matrix.airecipeapp.domain.usecases.RegisterUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val registerUserUseCase: RegisterUserUseCase,
    private val loginUserUseCase: LoginUserUseCase
):ViewModel() {

    private val _authState = MutableStateFlow<AuthResponse?>(value = null)
    val authState=_authState.asStateFlow()


    fun register(username:String,email:String, password:String){

        viewModelScope.launch {

            try {
                val response = registerUserUseCase(username, email, password)
                _authState.value=response
            }catch (e: Exception){

                e.localizedMessage?.let { Log.d("register", it) }
            }
        }
    }

    fun login (identifier:String, password:String){

        viewModelScope.launch {
            try {
                val response = loginUserUseCase(identifier,password)
                _authState.value= response
            }catch (e: Exception){

                e.localizedMessage?.let { Log.d("login", it) }
            }
        }
    }


}