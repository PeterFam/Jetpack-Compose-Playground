package com.peterfam.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val constraints = ConstraintSet {
                val blackBox = createRefFor("blackBox")
                val redBox = createRefFor("redBox")
                val blueBox = createRefFor("blueBox")
                val franceText = createRefFor("franceText")
                constrain(blackBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.value(100.dp)
                }
                constrain(blueBox) {
                    top.linkTo(blackBox.bottom)
                    start.linkTo(parent.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(150.dp)
                }
                constrain(redBox) {
                    top.linkTo(blueBox.top)
                    start.linkTo(blueBox.end)
                    end.linkTo(parent.end)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(150.dp)
                }
                constrain(franceText) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(blackBox.bottom)
                }
                createHorizontalChain(blueBox, redBox, chainStyle = ChainStyle.SpreadInside)
            }
            ConstraintLayout(constraints, Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .background(Color.Black)
                        .layoutId("blackBox")
                )
                Box(
                    modifier = Modifier
                        .background(Color.Blue)
                        .layoutId("blueBox")
                )
                Box(modifier = Modifier
                    .background(Color.Red)
                    .layoutId("redBox"))
                Text(
                    modifier = Modifier
                        .layoutId("franceText"),
                    textAlign = TextAlign.Center,
                    text = "France",
                    fontSize = 30.sp,
                    color = Color.White
                )
            }
        }
    }
}





