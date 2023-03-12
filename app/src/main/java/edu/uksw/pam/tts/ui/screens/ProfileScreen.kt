package edu.uksw.pam.tts.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.pam.tts.R


@Composable
fun ProfileScreen(){
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "My Profile",
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 18.sp
        )
        Image(
            painter = painterResource(id = R.drawable.kuroko) ,
            contentDescription = "Photo Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(top = 50.dp)
                .size(140.dp)
                .clip(CircleShape)
                .shadow(elevation = 15.dp)
        )
        Text(
            text = "Toni Subianto",
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(top = 15.dp)
        )
        Text(
            text = "Wibu",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.LightGray,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(top = 2.dp)
        )

    }

Column(
    modifier = Modifier
        .padding(top = 315.dp)
        .height(800.dp)
        .fillMaxWidth()
        .clip(
            RoundedCornerShape(
                topStart = 15.dp,
                topEnd = 15.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            )
        )
        .background(Color(11, 175, 198).copy(alpha = 0.88f))
    ) {
        Row(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 15.dp),
        ) {
            Text(
                text = "Overviews",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
            Text(
                text = "Anime List",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
                modifier = Modifier.padding(start = 50.dp)
            )
            Text(
                text = "Following",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
                modifier = Modifier.padding(start = 56.dp)
            )
        }
    Divider(color=Color(11, 175, 198).copy(alpha = 0.2f))

    LazyColumn{
            items(1){
                Row(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.kuroko) ,
                        contentDescription = "Overviews",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(70.dp)
                    )
                    Text(
                        text = "Kuroko no Basuketo: Season 3",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )

                }
            }

            items(1){
                Row(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.haikyu) ,
                        contentDescription = "Overviews",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(70.dp)
                    )
                    Text(
                        text = "Haikyuu: Season 1",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )

                }
            }

            items(1){
                Row(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.kimetsu) ,
                        contentDescription = "Overviews",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(70.dp)
                    )
                    Text(
                        text = "Kimetsu no Yaiba: Season 1",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )

                }
            }

            items(1){
                Row(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.bofuri) ,
                        contentDescription = "Overviews",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(70.dp)
                    )
                    Text(
                        text = "Bofuri Season 1",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )

                }
            }

            items(1){
                Row(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.kuroko) ,
                        contentDescription = "Overviews",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(70.dp)
                    )
                    Text(
                        text = "Kuroko no Basuketo: Season 2",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )

                }
            }

            items(1){
                Row(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.kuroko) ,
                        contentDescription = "Overviews",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(70.dp)
                    )
                    Text(
                        text = "Kuroko no Basuketo: Season 1",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )
                }
            }
            items(1){
                Row(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.bull) ,
                        contentDescription = "Overviews",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(70.dp)
                    )
                    Text(
                        text = "Bull: Season 1",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun ProfileScreenPreview() {
    ProfileScreen()
}