package edu.uksw.pam.tts

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Search : BottomBarScreen(
        route = "Search",
        title = "Search",
        icon = Icons.Default.Search
    )

    //object Add : BottomBarScreen(
    //route = "Add",
    //title = "Add",
    //icon = Icons.Default.Add
    // )

    object Trend : BottomBarScreen(
        route = "Trend",
        title = "Trend",
        icon = Icons.Default.Star
    )

    object Profile : BottomBarScreen(
        route = "Profile",
        title = "Profile",
        icon = Icons.Default.AccountBox
        )
}