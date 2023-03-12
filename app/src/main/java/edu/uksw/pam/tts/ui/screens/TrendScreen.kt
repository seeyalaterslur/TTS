package edu.uksw.pam.tts.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import edu.uksw.pam.tts.Data.AnimeDetail
import edu.uksw.pam.tts.Data.AnimeListItem
import edu.uksw.pam.tts.Data.ListAnime



@Composable
fun TrendScreen(navigateToProfile: (AnimeDetail) -> Unit)
{
    val animes = remember {ListAnime.animeList}
    TopAppBar(
        title = {
            Text(
                modifier = Modifier.padding(start = 100.dp, end = 30.dp),
                text = "Trend"
            )
        },
        backgroundColor = Color.LightGray,
        contentColor = Color.Black,
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Toggle drawer"
            )
        },
        actions = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Person")
        }
    )
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 60.dp)) {
        LazyColumn(modifier = Modifier.fillMaxWidth(),contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp))
        {
            items(
                items = animes,
                itemContent = {
                    AnimeListItem(anime = it, navigateToProfile)

                }
            )
        }

    }


}

@Composable
fun TrendScreenPreview(navigateToProfile: (AnimeDetail) -> Unit)
{
//    Scaffold(
//        content = {
//            TrendScreen(navigateToProfile = navigateToProfile)
//            )

}