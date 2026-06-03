package com.example.onboarding.dashboard

import androidx.compose.foundation.layout.Column
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
        Box (modifier = Modifier.fillMaxWidth().padding(10.dp, 10.dp)){
            Column(
                horizontalAlignment = Alignment.Start,
            ){
                Box(
                    modifier = Modifier.background(color = Color.Gray,)
                        .fillMaxWidth()
                        .height(200.dp)
                )
                repeat(10){
                    Spacer(
                        modifier = Modifier.size(20.dp)
                    )
                    Thumbnail()
                }

            }

        }
    }
}


@Composable
fun Thumbnail() {
    Box(
        modifier = Modifier.background(color = Color.Gray).height(60.dp).width(60.dp)
    )
}

@Preview(showBackground=true)
@Composable
fun HomeScreenPreview () {
    HomeScreen();
}
