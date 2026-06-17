package com.example.onboarding.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box (modifier = Modifier.fillMaxWidth().padding(10.dp, 30.dp)){
            Column(
                horizontalAlignment = Alignment.Start,
            ){
                Box(
                    modifier = Modifier.background(color = Color.Gray,)
                        .fillMaxWidth()
                        .height(200.dp)
                )
                Articles()

            }

        }
    }
}



@Composable
fun Thumbnail() {
    Box(
        modifier = Modifier.background(color = Color.LightGray).height(60.dp).width(60.dp)
    )
}

@Composable
fun ListItem() {
    Row(){
        Thumbnail()
        Column(
            modifier = Modifier.padding(10.dp, 0.dp)
        ){
            Box(
                modifier = Modifier.background(color= Color.Gray).height(10.dp).fillMaxWidth()
            )
            Box(
                modifier = Modifier.height(10.dp)
            )
            Box(
                modifier = Modifier.background(color = Color.LightGray).height(40.dp).fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground=true)
@Composable
fun HomeScreenPreview () {
    HomeScreen();
}


@Composable
fun Articles(){
    LazyColumn(){
        items(20){
            Spacer(
                modifier = Modifier.size(20.dp)
            )
            ListItem()

            }
    }
}

