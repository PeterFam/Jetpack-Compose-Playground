package com.peterfam.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.peterfam.demo.ui.components.ColorBox
import com.peterfam.demo.ui.components.CustomText
import com.peterfam.demo.ui.components.ImageCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val color = remember {
                mutableStateOf(Color.Yellow)
            }
            Column(Modifier.fillMaxSize()) {
                ColorBox(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    color.value = it
                }
                Box(modifier = Modifier
                    .background(color = color.value)
                    .weight(1f)
                    .fillMaxSize())
            }
        }
    }
}


@Preview
@Composable
fun PreviewImageCard() {
    ImageCard(
        painter = painterResource(id = R.drawable.test_ims),
        contendDescription = "",
        title = "This is a test text to test text vision"
    )
}


