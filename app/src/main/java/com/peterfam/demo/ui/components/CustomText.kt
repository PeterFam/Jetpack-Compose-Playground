package com.peterfam.demo.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.peterfam.demo.R

@Composable
fun CustomText(){
    val fontFamily = FontFamily(
        Font(R.font.dancingscript_bold, FontWeight.Bold),
        Font(R.font.dancingscript_medium, FontWeight.Medium),
        Font(R.font.dancingscript_regular, FontWeight.Normal),
        Font(R.font.dancingscript_semibold, FontWeight.SemiBold))

    Text(text = buildAnnotatedString {
    withStyle(style = SpanStyle(
        color = Color.Green,
        fontSize = 90.sp,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold
    )){
        append("P")
    }
        append("eter ")
        withStyle(style = SpanStyle(
            color = Color.Green,
            fontSize = 90.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold
        )){
            append("F")
        }
        append("am")
    },
    color = Color.White,
        fontSize = 50.sp,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center)
}