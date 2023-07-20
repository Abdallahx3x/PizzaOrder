package com.example.pizzaorder


import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.pizzaorder.screens.HomeScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PizzaApp(){
    val systemUiController= rememberSystemUiController()
    systemUiController.setStatusBarColor(Color.White,darkIcons = true)
    systemUiController.setNavigationBarColor(Color.White)
    Scaffold {
        HomeScreen()
    }
}
