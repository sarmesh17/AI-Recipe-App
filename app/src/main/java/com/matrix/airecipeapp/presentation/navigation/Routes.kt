package com.matrix.airecipeapp.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    data object CreateAccountScreen:Routes()
}