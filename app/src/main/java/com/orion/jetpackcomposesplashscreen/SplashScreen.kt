package com.orion.jetpackcomposesplashscreen

import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.orion.jetpackcomposesplashscreen.Navigation.AppScreens
import kotlinx.coroutines.delay

@Composable

fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(key1 = true ) {
        delay(5000)
        navController.popBackStack() //Limpia el satck de navegacion evita volvel al splash
        navController.navigate(AppScreens.MainScreen.route)
    }
    Splash()
}
//VISTA
@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(150.dp, 150.dp),
            painter = painterResource(id = R.drawable.ball),
            contentDescription = "BASQUETBALL" 
        )
        Text(
            text = "Bienvenidos",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable

fun  SplashScreenView() {
    Splash()
}