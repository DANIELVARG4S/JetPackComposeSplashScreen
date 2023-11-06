package com.orion.jetpackcomposesplashscreen.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.orion.jetpackcomposesplashscreen.MainScreen
import com.orion.jetpackcomposesplashscreen.SplashScreen

@Composable
fun  AppNavigation() {
    //Permite realizar flujos de navegacion
    val navController = rememberNavController()//Creando navcontroler por defecto
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route,
    ){
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(AppScreens.MainScreen.route) {
            MainScreen()
        }
    }
}