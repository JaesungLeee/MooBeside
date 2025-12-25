package com.jslee.core.designsystem.foundation.typography.token

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.jslee.core.designsystem.R

internal object TypographyScaleTokens {
    val Nanum: FontFamily =
        FontFamily(
            Font(R.font.nanum_400, FontWeight.W400),
            Font(R.font.nanum_500, FontWeight.W500),
            Font(R.font.nanum_700, FontWeight.W700),
        )
    
    val WeightBold: FontWeight = FontWeight.Bold
    val WeightMedium: FontWeight = FontWeight.Medium
    val WeightRegular: FontWeight = FontWeight.Normal
    
    val Display1Size = 56.sp
    val Display1LineHeight = 1.286.em
    val Display1LetterSpacing = (-0.0319).em
    val Display2Size = 40.sp
    val Display2LineHeight = 1.3.em
    val Display2LetterSpacing = (-0.0282).em
    val Title1Size = 36.sp
    val Title1LineHeight = 1.334.em
    val Title1LetterSpacing = (-0.027).em
    val Title2Size = 28.sp
    val Title2LineHeight = 1.358.em
    val Title2LetterSpacing = (-0.0236).em
    val Title3Size = 24.sp
    val Title3LineHeight = 1.334.em
    val Title3LetterSpacing = (-0.023).em
    val Heading1Size = 22.sp
    val Heading1LineHeight = 1.364.em
    val Heading1LetterSpacing = (-0.0194).em
    val Heading2Size = 20.sp
    val Heading2LineHeight = 1.4.em
    val Heading2LetterSpacing = (-0.012).em
    val Headline1Size = 18.sp
    val Headline1LineHeight = 1.445.em
    val Headline1LetterSpacing = (-0.002).em
    val Headline2Size = 17.sp
    val Headline2LineHeight = 1.412.em
    val Headline2LetterSpacing = 0.em
    val Body1Size = 16.sp
    val Body1LetterSpacing = 0.0057.em
    val Body1NormalLineHeight = 1.5.em
    val Body1ReadingLineHeight = 1.625.em
    val Body2Size = 15.sp
    val Body2LetterSpacing = 0.0096.em
    val Body2NormalLineHeight = 1.467.em
    val Body2ReadingLineHeight = 1.6.em
    val Label1Size = 14.sp
    val Label1LetterSpacing = 0.0145.em
    val Label1NormalLineHeight = 1.429.em
    val Label1ReadingLineHeight = 1.571.em
    val Label2Size = 13.sp
    val Label2LineHeight = 1.385.em
    val Label2LetterSpacing = 0.0194.em
    val Caption1Size = 12.sp
    val Caption1LineHeight = 1.334.em
    val Caption1LetterSpacing = 0.0252.em
    val Caption2Size = 11.sp
    val Caption2LineHeight = 1.273.em
    val Caption2LetterSpacing = 0.0311.em
}