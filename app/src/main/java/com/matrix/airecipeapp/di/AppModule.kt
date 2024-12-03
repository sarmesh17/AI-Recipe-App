package com.matrix.airecipeapp.di

import com.matrix.airecipeapp.data.repositories.AuthRepositoryImpl
import com.matrix.airecipeapp.domain.repositories.AuthRepository
import com.matrix.airecipeapp.domain.usecases.LoginUserUseCase
import com.matrix.airecipeapp.domain.usecases.RegisterUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideHttpClient():HttpClient{

        return HttpClient(CIO){
            install(io.ktor.client.plugins.contentnegotiation.ContentNegotiation){
                json(Json { ignoreUnknownKeys =true })
            }
        }

    }

    @Singleton
    @Provides
    fun provideAuthRepository(client: HttpClient):AuthRepository{
      return  AuthRepositoryImpl(client)
    }

    @Singleton
    @Provides
    fun provideRegisterUserCase(authRepository: AuthRepository):RegisterUserUseCase{
        return RegisterUserUseCase(authRepository)

    }

    @Singleton
    @Provides
    fun provideLoginUserUseCase(authRepository: AuthRepository):LoginUserUseCase{

        return LoginUserUseCase(authRepository)
    }
}