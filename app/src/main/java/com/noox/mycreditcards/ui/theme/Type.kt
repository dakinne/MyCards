package com.noox.mycreditcards.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.noox.mycreditcards.R

private val poppins = FontFamily(
    Font(R.font.poppins_bold, weight = FontWeight.Bold),
    Font(R.font.poppins_black, weight = FontWeight.Black),
    Font(R.font.poppins_light, weight = FontWeight.Light),
    Font(R.font.poppins_regular, weight = FontWeight.Normal),

    Font(R.font.poppins_italic, style = FontStyle.Italic)
)

private val playfair = FontFamily(
    Font(R.font.playfair_black, weight = FontWeight.Black),

    Font(R.font.playfair_italic, style = FontStyle.Italic)
)

private val luckiestguy = FontFamily(
    Font(R.font.luckiestguy_regular, weight = FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h2 = TextStyle(
        fontFamily = luckiestguy,
        fontSize = 60.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 73.sp,
        letterSpacing = (-0.5).sp
    ),
    body1 = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    )
/*,
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)