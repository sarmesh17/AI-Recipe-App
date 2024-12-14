package com.matrix.airecipeapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.matrix.airecipeapp.presentation.viewmodels.AuthViewModel

@Composable
fun AiRecipeNavigationSystem(){

    val navController= rememberNavController()

    NavHost(startDestination = Routes.CreateAccountScreen , navController = navController ) {

        composable<Routes.CreateAccountScreen> {

            val authViewModel:AuthViewModel= hiltViewModel()

        }

    }

}