package com.shadow.navbug

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.shadow.navbug.screen.NavScreens

@Composable
fun ScreenA(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
    ) {
        Text("Screen A")
        Button(onClick = { navController.navigateUp() }) {
            Text("Go back")
        }
        Button(onClick = { navController.navigate(NavScreens.ScreenB) }) {
            Text("Go to Screen B")
        }

    }
}