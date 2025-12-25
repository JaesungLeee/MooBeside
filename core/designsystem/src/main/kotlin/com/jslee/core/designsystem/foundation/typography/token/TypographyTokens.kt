package com.jslee.core.designsystem.foundation.typography.token

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle

internal object TypographyTokens {
    val SmallNormal: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.SmallSize,
            fontWeight = TypographyScaleTokens.SmallNormalWeight,
            lineHeight = TypographyScaleTokens.SmallLineHeight,
        )
    val SmallStrong: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.SmallSize,
            fontWeight = TypographyScaleTokens.SmallStrongWeight,
            lineHeight = TypographyScaleTokens.SmallLineHeight,
        )
    val BaseNormal: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.BaseSize,
            fontWeight = TypographyScaleTokens.BaseNormalWeight,
            lineHeight = TypographyScaleTokens.BaseLineHeight,
        )
    val BaseStrong: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.BaseSize,
            fontWeight = TypographyScaleTokens.BaseStrongWeight,
            lineHeight = TypographyScaleTokens.BaseLineHeight,
        )
    val LargeNormal: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.LargeSize,
            fontWeight = TypographyScaleTokens.LargeNormalWeight,
            lineHeight = TypographyScaleTokens.LargeLineHeight,
        )
    val LargeStrong: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.LargeSize,
            fontWeight = TypographyScaleTokens.LargeStrongWeight,
            lineHeight = TypographyScaleTokens.LargeLineHeight,
        )
    val ExtraLargeNormal: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.ExtraLargeSize,
            fontWeight = TypographyScaleTokens.ExtraLargeNormalWeight,
            lineHeight = TypographyScaleTokens.ExtraLargeLineHeight,
        )
    val ExtraLargeStrong: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.ExtraLargeSize,
            fontWeight = TypographyScaleTokens.ExtraLargeStrongWeight,
            lineHeight = TypographyScaleTokens.ExtraLargeLineHeight,
        )
    val H1: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.H1Size,
            fontWeight = TypographyScaleTokens.H1Weight,
            lineHeight = TypographyScaleTokens.H1LineHeight,
        )
    val H2: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.H2Size,
            fontWeight = TypographyScaleTokens.H2Weight,
            lineHeight = TypographyScaleTokens.H2LineHeight,
        )
    val H3: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.H3Size,
            fontWeight = TypographyScaleTokens.H3Weight,
            lineHeight = TypographyScaleTokens.H3LineHeight,
        )
    val H4: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.H4Size,
            fontWeight = TypographyScaleTokens.H4Weight,
            lineHeight = TypographyScaleTokens.H4LineHeight,
        )
    val H5: TextStyle =
        DefaultTextStyle.copy(
            fontSize = TypographyScaleTokens.H5Size,
            fontWeight = TypographyScaleTokens.H5Weight,
            lineHeight = TypographyScaleTokens.H5LineHeight,
        )
}

private val DefaultPlatformStyle = PlatformTextStyle(includeFontPadding = false)
private val DefaultLineHeightStyle = LineHeightStyle(
    alignment = LineHeightStyle.Alignment.Center,
    trim = LineHeightStyle.Trim.None,
)

internal val DefaultTextStyle: TextStyle =
    TextStyle.Default.copy(
        platformStyle = DefaultPlatformStyle,
        lineHeightStyle = DefaultLineHeightStyle,
        fontFamily = TypographyScaleTokens.Nanum,
    )