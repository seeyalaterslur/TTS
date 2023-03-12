package edu.uksw.pam.tts.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.pam.tts.R


@Composable
fun SearchScreen(){
    var search by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            label = {
                Text(
                    text = "Search",
                    color = Color.LightGray
                ) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                ) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .padding(start = 20.dp, top = 20.dp, end = 20.dp)
        )


        Text(
            text = "Most Viewed",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(start = 20.dp, top = 15.dp)

        )
        LazyRow{
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.haikyu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Haikyu : Season 1",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.haikyu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Haikyu : Season 2",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.haikyu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Haikyu : Season 3",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.haikyu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Haikyu : Season 4",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
        }
        Text(
            text = "Recomendation",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 20.dp, top = 25.dp)
        )

        LazyRow{
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kuroko),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kuroko no Basuke",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kuroko),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kuroko no Basuke",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kuroko),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kuroko no Basuke",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kuroko),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kuroko no Basuke",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
        }

        Text(
            text = "Genres: Action",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 20.dp, top = 25.dp)
        )
        LazyRow{
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kimetsu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kimetsu no Yaiba",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kimetsu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kimetsu no Yaiba",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kimetsu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kimetsu no Yaiba",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            items(1){
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp)
                        .height(150.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kimetsu),
                        contentDescription = "Ongoing",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                    Text(
                        text = "Kimetsu no Yaiba ",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun SearchScreenPreview() {
    SearchScreen()
}