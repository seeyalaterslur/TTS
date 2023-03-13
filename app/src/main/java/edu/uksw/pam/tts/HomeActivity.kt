package edu.uksw.pam.tts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.pam.tts.ui.theme.TTSTheme

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TTSTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SignUpScreen()
                }
            }
        }
    }
}

@Composable
fun LandingPage(
) {

    TopAppBar(
        title = {
            Text(
                modifier = Modifier.padding(start = 90.dp, end = 40.dp),
                text = ("Anime"),
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
        },
        backgroundColor = Color.White,
        contentColor = Color.Black,
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Toggle drawer",
                modifier = Modifier.padding(20.dp)
            )
        },
        actions = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Person",
                modifier = Modifier.padding(end = 20.dp)
            )
        }
    )
    Column(
        modifier = Modifier
            .padding(0.dp, 50.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp),
        ) {
            androidx.compose.material.Card(
                elevation = 10.dp,
                shape = RoundedCornerShape(10.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bofuri),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Bofuri: I Don't Want to Get Hurt",
                    fontWeight = FontWeight.W500,
                    color = Color.Black,
                    fontFamily = FontFamily.SansSerif,
                )
                Image(
                    painter = painterResource(id = R.drawable.bookmark),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(width = 30.dp, height = 30.dp)
                )
            }
            Text(
                text = "Fantasy / Action / Comedy",
                fontWeight = FontWeight.W500,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif,
            )
        }

        Column(
            modifier = Modifier
                .padding(top = 10.dp)
        ) {
            LazyVerticalGrid(columns = GridCells.Adaptive(100.dp),
                content = {
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 30.dp, height = 50.dp)
                                .padding(start = 10.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.square), "title",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(30.dp)

                            )
                            Text(
                                text = "Category", modifier = Modifier
                                    .padding(top = 30.dp)
                                    .padding(start = 35.dp), fontSize = 12.sp, color = Color.Gray
                            )
                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 30.dp, height = 50.dp)
                                .padding(start = 5.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.time), "title",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(30.dp)
                            )
                            Text(
                                text = "Release", modifier = Modifier
                                    .padding(top = 30.dp)
                                    .padding(start = 40.dp), fontSize = 12.sp, color = Color.Gray
                            )
                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 30.dp, height = 50.dp)
                                .padding(start = 5.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.medal), "title",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(30.dp)
                            )
                            Text(
                                text = "Top Hits", modifier = Modifier
                                    .padding(top = 30.dp)
                                    .padding(start = 42.dp), fontSize = 12.sp, color = Color.Gray
                            )
                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 30.dp, height = 50.dp)
                                .padding(start = 10.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.diamonds), "title",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(30.dp)
                            )
                            Text(
                                text = "Premium", modifier = Modifier
                                    .padding(top = 30.dp)
                                    .padding(start = 38.dp), fontSize = 12.sp, color = Color.Gray
                            )
                        }
                    }
                })
        }

        Column() {
            Text(
                text = "People Also Search",
                Modifier.padding(20.dp, top = 20.dp),
                fontWeight = FontWeight.W500,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
            )
            LazyVerticalGrid(
                columns = GridCells.Adaptive(120.dp),
                content = {
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 150.dp)
                                .padding(start = 20.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.bofuri), "title",
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(75.dp)
                            )

                            Text(
                                text = "BOFURI : I Don't...", modifier = Modifier
                                    .padding(top = 70.dp)
                                    .padding(2.dp), fontSize = 14.sp
                            )
                            Text(
                                text = "Ep: 20", modifier = Modifier
                                    .padding(top = 95.dp)
                                    .padding(start = 1.dp), fontSize = 12.sp, color = Color.Gray
                            )
                        }

                    }

                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 150.dp)
                                .padding(start = 10.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.bofuri), "title",
                                modifier = Modifier
                                    .height(75.dp)
                                    .width(100.dp)
                            )

                            Text(
                                text = "BOFURI : I Don't..", modifier = Modifier
                                    .padding(top = 70.dp)
                                    .padding(2.dp), fontSize = 14.sp
                            )
                            Text(
                                text = "Ep: 20", modifier = Modifier
                                    .padding(top = 95.dp)
                                    .padding(start = 2.dp), fontSize = 12.sp, color = Color.Gray
                            )

                        }

                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 150.dp)
                                .padding(start = 10.dp, end = 20.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.bofuri), "title",
                                modifier = Modifier
                                    .height(75.dp)
                                    .width(100.dp)
                            )

                            Text(
                                text = "BOFURI : I Don't..", modifier = Modifier
                                    .padding(top = 70.dp)
                                    .padding(start = 1.dp), fontSize = 14.sp
                            )
                            Text(
                                text = "Ep. 20", modifier = Modifier
                                    .padding(top = 100.dp)
                                    .padding(start = 1.dp), fontSize = 12.sp, color = Color.Gray
                            )

                        }

                    }
                })
        }

        Column() {
            Text(
                text = "For You",
                Modifier.padding(10.dp),
                fontWeight = FontWeight.W500,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
            )
            LazyVerticalGrid(columns = GridCells.Adaptive(120.dp),
                content = {
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 250.dp)
                                .padding(start = 10.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.kimetsu), "title",
                                modifier = Modifier
                                    .fillMaxWidth()
                            )

//                            Text(text = "BOFURI : I Don't...", modifier = Modifier
//                                .padding(top = 70.dp)
//                                .padding(6.dp), fontSize = 14.sp)
//                            Text(text = "Last Watched: Ep 10", modifier = Modifier
//                                .padding(top = 95.dp)
//                                .padding(start = 6.dp), fontSize = 12.sp, color = Color.Gray)
//                            Text(text = "96 %", modifier = Modifier
//                                .padding(top = 110.dp)
//                                .padding(start = 10.dp), fontSize = 14.sp, color = Color.Gray)
                        }

                    }

                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 250.dp)
                                .padding(start = 10.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.haikyu), "title",
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
//
//                            Text(text = "BOFURI : I Don't...", modifier = Modifier
//                                .padding(top = 70.dp)
//                                .padding(6.dp), fontSize = 14.sp)
//                            Text(text = "Last Watched: Ep 10", modifier = Modifier
//                                .padding(top = 95.dp)
//                                .padding(start = 6.dp), fontSize = 12.sp, color = Color.Gray)
//                            Text(text = "96 %", modifier = Modifier
//                                .padding(top = 110.dp)
//                                .padding(start = 10.dp), fontSize = 14.sp, color = Color.Gray)
                        }

                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 150.dp)
                                .padding(start = 10.dp)
                        )
                        {
                            Image(
                                painterResource(id = R.drawable.kuroko), "title",
                                modifier = Modifier
                                    .fillMaxWidth()
                            )

//                            Text(text = "BOFURI : I Don't...", modifier = Modifier
//                                .padding(top = 70.dp)
//                                .padding(6.dp), fontSize = 14.sp)
//                            Text(text = "Last Watched: Ep 10", modifier = Modifier
//                                .padding(top = 95.dp)
//                                .padding(start = 6.dp), fontSize = 12.sp, color = Color.Gray)
//                            Text(text = "96 %", modifier = Modifier
//                                .padding(top = 110.dp)
//                                .padding(start = 10.dp), fontSize = 14.sp, color = Color.Gray)

                        }

                    }
                })
        }

    }

}


@Composable
fun Card(
) {
    Column(
        modifier = Modifier
            .padding(0.dp, 50.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp),
        ) {
            androidx.compose.material.Card(
                elevation = 10.dp,
                shape = RoundedCornerShape(10.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ice),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "The Iceblade Sorcerer Shall Rule the World",
                fontWeight = FontWeight.W500,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
            )
        }
    }
}


@Composable
@Preview
fun HomeScreenPreview() {
    LandingPage()

}