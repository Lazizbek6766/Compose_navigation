package uz.megasoft.composenavigation.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.megasoft.composenavigation.ui.screens.home.HomeScreen
import uz.megasoft.composenavigation.ui.screens.settings.SettingScreen
import uz.megasoft.composenavigation.ui.screens.splash.SplashScreen

@ExperimentalMaterial3Api
@Composable
fun SetupNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }
        composable("setting") {
            SettingScreen(navController)
        }
    }
}
