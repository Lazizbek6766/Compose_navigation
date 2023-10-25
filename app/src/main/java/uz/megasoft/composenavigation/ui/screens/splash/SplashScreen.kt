package uz.megasoft.composenavigation.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    var splashFinished by remember { mutableStateOf(false) }

    LaunchedEffect(splashFinished) {
        // Wait for 3 seconds before navigating to the "home" screen
        delay(3000)
        splashFinished = true
        navController.navigate("home"){
            popUpTo(route = "splash") { inclusive = true }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        // Your splash screen content can be added here
        Text(text = "Splash Screen", style = MaterialTheme.typography.bodySmall)
    }
}
