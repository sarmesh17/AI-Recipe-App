package com.matrix.airecipeapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.matrix.airecipeapp.WindowType
import com.matrix.airecipeapp.presentation.createaccountscreen.CompactCreateAccountScreen
import com.matrix.airecipeapp.presentation.createaccountscreen.MediumToExpandedCreateAccountScreen
import com.matrix.airecipeapp.presentation.viewmodels.AuthViewModel
import com.matrix.airecipeapp.rememberWindowSize

@Composable
fun AiRecipeNavigationSystem(){

    val navController= rememberNavController()
     val windowSize = rememberWindowSize()
    NavHost(startDestination = Routes.CreateAccountScreen , navController = navController ) {

        composable<Routes.CreateAccountScreen> {

            val authViewModel:AuthViewModel= hiltViewModel()

            when(windowSize.width){

                WindowType.Compact -> {

                    CompactCreateAccountScreen(authViewModel)
                }

                else -> {
                    MediumToExpandedCreateAccountScreen(authViewModel)

                }
            }



        }

    }

}