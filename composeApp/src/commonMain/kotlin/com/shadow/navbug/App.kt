package com.shadow.navbug

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shadow.navbug.screen.NavScreens
import com.shadow.navbug.screen.ScreenB
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController  = rememberNavController()
        val navBackStackSize  = navController.currentBackStack.collectAsState().value.size
        println(navBackStackSize)
        NavHost(
            navController = navController,
            startDestination = NavScreens.ScreenA
        ){
            composable<NavScreens.ScreenA> {
                ScreenA(navController)
            }

            composable<NavScreens.ScreenB> {
                ScreenB(navController)
            }
        }
    }
}