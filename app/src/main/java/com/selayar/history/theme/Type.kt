package com.selayar.history.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with

val Typography = Typography(
    h1 = TextStyle(
        fontWeight = FontWeight.W300,
        fontSize = 96.sp,
        letterSpacing = (-1.5).sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.W300,
        fontSize = 60.sp,
        letterSpacing = (-0.5).sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 48.sp,
        letterSpacing = 0.sp
    ),
    h4 = TextStyle(
        fontWeight = FontWeight.W600,
        fontSize = 30.sp,
        letterSpacing = 0.sp
    ),
    h5 = TextStyle(
        fontWeight = FontWeight.W600,
        fontSize = 24.sp,
        letterSpacing = 0.sp
    ),
    // app bar title
    h6 = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 18.sp,
        letterSpacing = 0.15.sp,
        fontFamily = FontFamily.Monospace
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 0.15.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 0.15.sp,
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.W400,
        fontSize = 18.sp,
        fontFamily = FontFamily.Monospace),
    button = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        letterSpacing = 0.15.sp,
        fontFamily = FontFamily.Monospace
    ),
    caption = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
        letterSpacing = 0.4.sp
    ),
    overline = TextStyle(
        fontWeight = FontWeight.W600,
        fontSize = 12.sp,
        letterSpacing = 1.sp
    )
)