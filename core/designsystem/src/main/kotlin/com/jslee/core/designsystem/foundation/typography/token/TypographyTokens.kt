package com.jslee.core.designsystem.foundation.typography.token

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle

internal object TypographyTokens {
    private val Display1: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Display1Size,
        lineHeight = TypographyScaleTokens.Display1LineHeight,
        letterSpacing = TypographyScaleTokens.Display1LetterSpacing,
    )
    
    private val Display2: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Display2Size,
        lineHeight = TypographyScaleTokens.Display2LineHeight,
        letterSpacing = TypographyScaleTokens.Display2LetterSpacing,
    )
    
    private val Title1: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Title1Size,
        lineHeight = TypographyScaleTokens.Title1LineHeight,
        letterSpacing = TypographyScaleTokens.Title1LetterSpacing,
    )
    
    private val Title2: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Title2Size,
        lineHeight = TypographyScaleTokens.Title2LineHeight,
        letterSpacing = TypographyScaleTokens.Title2LetterSpacing,
    )
    
    private val Title3: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Title3Size,
        lineHeight = TypographyScaleTokens.Title3LineHeight,
        letterSpacing = TypographyScaleTokens.Title3LetterSpacing,
    )
    
    private val Heading1: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Heading1Size,
        lineHeight = TypographyScaleTokens.Heading1LineHeight,
        letterSpacing = TypographyScaleTokens.Heading1LetterSpacing,
    )
    
    private val Heading2: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Heading2Size,
        lineHeight = TypographyScaleTokens.Heading2LineHeight,
        letterSpacing = TypographyScaleTokens.Heading2LetterSpacing,
    )
    
    private val Headline1: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Headline1Size,
        lineHeight = TypographyScaleTokens.Headline1LineHeight,
        letterSpacing = TypographyScaleTokens.Headline1LetterSpacing,
    )
    
    private val Headline2: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Headline2Size,
        lineHeight = TypographyScaleTokens.Headline2LineHeight,
        letterSpacing = TypographyScaleTokens.Headline2LetterSpacing,
    )
    
    private val Body1Normal: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Body1Size,
        lineHeight = TypographyScaleTokens.Body1NormalLineHeight,
        letterSpacing = TypographyScaleTokens.Body1LetterSpacing,
    )
    
    private val Body1Reading: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Body1Size,
        lineHeight = TypographyScaleTokens.Body1ReadingLineHeight,
        letterSpacing = TypographyScaleTokens.Body1LetterSpacing,
    )
    
    private val Body2Normal: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Body2Size,
        lineHeight = TypographyScaleTokens.Body2NormalLineHeight,
        letterSpacing = TypographyScaleTokens.Body2LetterSpacing,
    )
    
    private val Body2Reading: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Body2Size,
        lineHeight = TypographyScaleTokens.Body2ReadingLineHeight,
        letterSpacing = TypographyScaleTokens.Body2LetterSpacing,
    )
    
    private val Label1Normal: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Label1Size,
        lineHeight = TypographyScaleTokens.Label1NormalLineHeight,
        letterSpacing = TypographyScaleTokens.Label1LetterSpacing,
    )
    
    private val Label1Reading: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Label1Size,
        lineHeight = TypographyScaleTokens.Label1ReadingLineHeight,
        letterSpacing = TypographyScaleTokens.Label1LetterSpacing,
    )
    
    private val Label2: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Label2Size,
        lineHeight = TypographyScaleTokens.Label2LineHeight,
        letterSpacing = TypographyScaleTokens.Label2LetterSpacing,
    )
    
    private val Caption1: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Caption1Size,
        lineHeight = TypographyScaleTokens.Caption1LineHeight,
        letterSpacing = TypographyScaleTokens.Caption1LetterSpacing,
    )
    
    private val Caption2: TextStyle = DefaultTextStyle.copy(
        fontSize = TypographyScaleTokens.Caption2Size,
        lineHeight = TypographyScaleTokens.Caption2LineHeight,
        letterSpacing = TypographyScaleTokens.Caption2LetterSpacing,
    )

    val Display1Bold: TextStyle = Display1.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Display1Medium: TextStyle = Display1.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Display1Regular: TextStyle = Display1.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Display2Bold: TextStyle = Display2.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Display2Medium: TextStyle = Display2.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Display2Regular: TextStyle = Display2.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Title1Bold: TextStyle = Title1.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Title1Medium: TextStyle = Title1.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Title1Regular: TextStyle = Title1.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Title2Bold: TextStyle = Title2.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Title2Medium: TextStyle = Title2.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Title2Regular: TextStyle = Title2.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Title3Bold: TextStyle = Title3.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Title3Medium: TextStyle = Title3.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Title3Regular: TextStyle = Title3.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Heading1Bold: TextStyle = Heading1.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Heading1Medium: TextStyle = Heading1.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Heading1Regular: TextStyle = Heading1.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Heading2Bold: TextStyle = Heading2.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Heading2Medium: TextStyle = Heading2.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Heading2Regular: TextStyle = Heading2.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Headline1Bold: TextStyle = Headline1.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Headline1Medium: TextStyle = Headline1.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Headline1Regular: TextStyle = Headline1.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Headline2Bold: TextStyle = Headline2.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Headline2Medium: TextStyle = Headline2.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Headline2Regular: TextStyle = Headline2.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Body1NormalBold: TextStyle = Body1Normal.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Body1NormalMedium: TextStyle = Body1Normal.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Body1NormalRegular: TextStyle = Body1Normal.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Body1ReadingBold: TextStyle = Body1Reading.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Body1ReadingMedium: TextStyle = Body1Reading.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Body1ReadingRegular: TextStyle = Body1Reading.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Body2NormalBold: TextStyle = Body2Normal.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Body2NormalMedium: TextStyle = Body2Normal.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Body2NormalRegular: TextStyle = Body2Normal.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Body2ReadingBold: TextStyle = Body2Reading.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Body2ReadingMedium: TextStyle = Body2Reading.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Body2ReadingRegular: TextStyle = Body2Reading.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Label1NormalBold: TextStyle = Label1Normal.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Label1NormalMedium: TextStyle = Label1Normal.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Label1NormalRegular: TextStyle = Label1Normal.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Label1ReadingBold: TextStyle = Label1Reading.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Label1ReadingMedium: TextStyle = Label1Reading.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Label1ReadingRegular: TextStyle = Label1Reading.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Label2Bold: TextStyle = Label2.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Label2Medium: TextStyle = Label2.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Label2Regular: TextStyle = Label2.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Caption1Bold: TextStyle = Caption1.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Caption1Medium: TextStyle = Caption1.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Caption1Regular: TextStyle = Caption1.copy(fontWeight = TypographyScaleTokens.WeightRegular)
    val Caption2Bold: TextStyle = Caption2.copy(fontWeight = TypographyScaleTokens.WeightBold)
    val Caption2Medium: TextStyle = Caption2.copy(fontWeight = TypographyScaleTokens.WeightMedium)
    val Caption2Regular: TextStyle = Caption2.copy(fontWeight = TypographyScaleTokens.WeightRegular)
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
        fontFamily = TypographyScaleTokens.PretendardJP,
    )