package edu.uksw.pam.tts.ui.screens
import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.uksw.pam.tts.AnimeProfileActivity
import edu.uksw.pam.tts.ui.ButtonNavItem
import edu.uksw.pam.tts.ui.theme.TTSTheme

@Composable
fun NavigationGraph(
    navController: NavHostController
) {
    val lContext = LocalContext.current
    NavHost(
        navController = navController,
        startDestination = ButtonNavItem.Home.screen_route
    ) {
        composable(ButtonNavItem.Home.screen_route) {
            LandingPage()
        }
        composable(ButtonNavItem.Search.screen_route) {
            SearchScreen()
        }
        composable(ButtonNavItem.Trend.screen_route) {
            TTSTheme() {
                TrendScreenPreview {
                    lContext.startActivity(AnimeProfileActivity.newIntent(lContext, it))
                }
            }
        }
        composable(ButtonNavItem.Profile.screen_route) {
            ProfileScreen()
        }
    }
}

@Composable
fun BottomNavigation(
    navController: NavController
){
    val items = listOf(
        ButtonNavItem.Home,
        ButtonNavItem.Search,
        ButtonNavItem.Trend,
        ButtonNavItem.Profile
    )
    androidx.compose.material.BottomNavigation(
        //backgroundColor = colorResource(id = R.color.teal_200),
        backgroundColor = Color.White.copy(0.8f),
        contentColor = Color(3, 15, 21)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(
                    imageVector = item.icon,
                    contentDescription = "${item.title} icon")
                },
                label = {
                    Text(text = item.title,
                        fontSize = 9.sp)
                },
                selectedContentColor = Color.Blue.copy(0.7f),
                unselectedContentColor = Color.Blue.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.screen_route,
                onClick = {
                    navController.navigate(item.screen_route) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigationMainScreenView(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation(
                navController = navController,
            )
        }
    ) {
        NavigationGraph(navController = navController)
    }
}