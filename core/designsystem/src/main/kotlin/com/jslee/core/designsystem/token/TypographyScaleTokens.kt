package com.jslee.core.designsystem.token

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
    val WeightRegular: FontWeight = FontWeight.Normal
    val SmallSize = 12.sp
    val SmallLineHeight = 1.5.em
    val SmallNormalWeight = WeightRegular
    val SmallStrongWeight = WeightBold
    val BaseSize = 14.sp
    val BaseLineHeight = 1.571.em
    val BaseNormalWeight = WeightRegular
    val BaseStrongWeight = WeightBold
    val LargeSize = 16.sp
    val LargeLineHeight = 1.5.em
    val LargeNormalWeight = WeightRegular
    val LargeStrongWeight = WeightBold
    val ExtraLargeSize = 20.sp
    val ExtraLargeLineHeight = 1.4.em
    val ExtraLargeNormalWeight = WeightRegular
    val ExtraLargeStrongWeight = WeightBold
    val H1Size = 38.sp
    val H1LineHeight = 1.211.em
    val H1Weight = WeightBold
    val H2Size = 30.sp
    val H2LineHeight = 1.267.em
    val H2Weight = WeightBold
    val H3Size = 24.sp
    val H3LineHeight = 1.333.em
    val H3Weight = WeightBold
    val H4Size = 20.sp
    val H4LineHeight = 1.4.em
    val H4Weight = WeightBold
    val H5Size = 16.sp
    val H5LineHeight = 1.5.em
    val H5Weight = WeightBold
}