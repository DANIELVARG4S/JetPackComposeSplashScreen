package com.orion.jetpackcomposesplashscreen.Navigation

//define las diferentes pantallas  en las se que pueden navegar
//Recibe parametro llamdo ruta
sealed class AppScreens (val route: String) {
    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
}