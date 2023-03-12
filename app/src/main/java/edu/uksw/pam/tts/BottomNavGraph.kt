package edu.uksw.pam.tts

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.uksw.pam.tts.ui.screens.*
import edu.uksw.pam.tts.ui.theme.TTSTheme

@Composable
fun BottomNavGraph(navController: NavHostController) {
    val lContext = LocalContext.current
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            LandingPage()
        }
        composable(route = BottomBarScreen.Trend.route) {
            TTSTheme() {
                TrendScreenPreview {
                    lContext.startActivity(AnimeProfileActivity.newIntent(lContext, it))
                }
            }
        }
        //composable(route = BottomBarScreen.Profile.route) {
        // ProfileScreenPreview()
        //}
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreenPreview()
        }
        composable(route = BottomBarScreen.Search.route) {
           SearchScreen()
        }
    }
}