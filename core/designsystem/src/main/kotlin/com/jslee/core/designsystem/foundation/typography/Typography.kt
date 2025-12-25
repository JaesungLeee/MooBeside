package com.jslee.core.designsystem.foundation.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import com.jslee.core.designsystem.theme.MooBesideTheme
import com.jslee.core.designsystem.foundation.typography.token.TypographyAccessKeyToken
import com.jslee.core.designsystem.foundation.typography.token.TypographyTokens

@Immutable
class Typography(
    val display1Bold: TextStyle = TypographyTokens.Display1Bold,
    val display1Medium: TextStyle = TypographyTokens.Display1Medium,
    val display1Regular: TextStyle = TypographyTokens.Display1Regular,
    val display2Bold: TextStyle = TypographyTokens.Display2Bold,
    val display2Medium: TextStyle = TypographyTokens.Display2Medium,
    val display2Regular: TextStyle = TypographyTokens.Display2Regular,
    val title1Bold: TextStyle = TypographyTokens.Title1Bold,
    val title1Medium: TextStyle = TypographyTokens.Title1Medium,
    val title1Regular: TextStyle = TypographyTokens.Title1Regular,
    val title2Bold: TextStyle = TypographyTokens.Title2Bold,
    val title2Medium: TextStyle = TypographyTokens.Title2Medium,
    val title2Regular: TextStyle = TypographyTokens.Title2Regular,
    val title3Bold: TextStyle = TypographyTokens.Title3Bold,
    val title3Medium: TextStyle = TypographyTokens.Title3Medium,
    val title3Regular: TextStyle = TypographyTokens.Title3Regular,
    val heading1Bold: TextStyle = TypographyTokens.Heading1Bold,
    val heading1Medium: TextStyle = TypographyTokens.Heading1Medium,
    val heading1Regular: TextStyle = TypographyTokens.Heading1Regular,
    val heading2Bold: TextStyle = TypographyTokens.Heading2Bold,
    val heading2Medium: TextStyle = TypographyTokens.Heading2Medium,
    val heading2Regular: TextStyle = TypographyTokens.Heading2Regular,
    val headline1Bold: TextStyle = TypographyTokens.Headline1Bold,
    val headline1Medium: TextStyle = TypographyTokens.Headline1Medium,
    val headline1Regular: TextStyle = TypographyTokens.Headline1Regular,
    val headline2Bold: TextStyle = TypographyTokens.Headline2Bold,
    val headline2Medium: TextStyle = TypographyTokens.Headline2Medium,
    val headline2Regular: TextStyle = TypographyTokens.Headline2Regular,
    val body1NormalBold: TextStyle = TypographyTokens.Body1NormalBold,
    val body1NormalMedium: TextStyle = TypographyTokens.Body1NormalMedium,
    val body1NormalRegular: TextStyle = TypographyTokens.Body1NormalRegular,
    val body1ReadingBold: TextStyle = TypographyTokens.Body1ReadingBold,
    val body1ReadingMedium: TextStyle = TypographyTokens.Body1ReadingMedium,
    val body1ReadingRegular: TextStyle = TypographyTokens.Body1ReadingRegular,
    val body2NormalBold: TextStyle = TypographyTokens.Body2NormalBold,
    val body2NormalMedium: TextStyle = TypographyTokens.Body2NormalMedium,
    val body2NormalRegular: TextStyle = TypographyTokens.Body2NormalRegular,
    val body2ReadingBold: TextStyle = TypographyTokens.Body2ReadingBold,
    val body2ReadingMedium: TextStyle = TypographyTokens.Body2ReadingMedium,
    val body2ReadingRegular: TextStyle = TypographyTokens.Body2ReadingRegular,
    val label1NormalBold: TextStyle = TypographyTokens.Label1NormalBold,
    val label1NormalMedium: TextStyle = TypographyTokens.Label1NormalMedium,
    val label1NormalRegular: TextStyle = TypographyTokens.Label1NormalRegular,
    val label1ReadingBold: TextStyle = TypographyTokens.Label1ReadingBold,
    val label1ReadingMedium: TextStyle = TypographyTokens.Label1ReadingMedium,
    val label1ReadingRegular: TextStyle = TypographyTokens.Label1ReadingRegular,
    val label2Bold: TextStyle = TypographyTokens.Label2Bold,
    val label2Medium: TextStyle = TypographyTokens.Label2Medium,
    val label2Regular: TextStyle = TypographyTokens.Label2Regular,
    val caption1Bold: TextStyle = TypographyTokens.Caption1Bold,
    val caption1Medium: TextStyle = TypographyTokens.Caption1Medium,
    val caption1Regular: TextStyle = TypographyTokens.Caption1Regular,
    val caption2Bold: TextStyle = TypographyTokens.Caption2Bold,
    val caption2Medium: TextStyle = TypographyTokens.Caption2Medium,
    val caption2Regular: TextStyle = TypographyTokens.Caption2Regular,
) {
    fun copy(
        display1Bold: TextStyle = this.display1Bold,
        display1Medium: TextStyle = this.display1Medium,
        display1Regular: TextStyle = this.display1Regular,
        display2Bold: TextStyle = this.display2Bold,
        display2Medium: TextStyle = this.display2Medium,
        display2Regular: TextStyle = this.display2Regular,
        title1Bold: TextStyle = this.title1Bold,
        title1Medium: TextStyle = this.title1Medium,
        title1Regular: TextStyle = this.title1Regular,
        title2Bold: TextStyle = this.title2Bold,
        title2Medium: TextStyle = this.title2Medium,
        title2Regular: TextStyle = this.title2Regular,
        title3Bold: TextStyle = this.title3Bold,
        title3Medium: TextStyle = this.title3Medium,
        title3Regular: TextStyle = this.title3Regular,
        heading1Bold: TextStyle = this.heading1Bold,
        heading1Medium: TextStyle = this.heading1Medium,
        heading1Regular: TextStyle = this.heading1Regular,
        heading2Bold: TextStyle = this.heading2Bold,
        heading2Medium: TextStyle = this.heading2Medium,
        heading2Regular: TextStyle = this.heading2Regular,
        headline1Bold: TextStyle = this.headline1Bold,
        headline1Medium: TextStyle = this.headline1Medium,
        headline1Regular: TextStyle = this.headline1Regular,
        headline2Bold: TextStyle = this.headline2Bold,
        headline2Medium: TextStyle = this.headline2Medium,
        headline2Regular: TextStyle = this.headline2Regular,
        body1NormalBold: TextStyle = this.body1NormalBold,
        body1NormalMedium: TextStyle = this.body1NormalMedium,
        body1NormalRegular: TextStyle = this.body1NormalRegular,
        body1ReadingBold: TextStyle = this.body1ReadingBold,
        body1ReadingMedium: TextStyle = this.body1ReadingMedium,
        body1ReadingRegular: TextStyle = this.body1ReadingRegular,
        body2NormalBold: TextStyle = this.body2NormalBold,
        body2NormalMedium: TextStyle = this.body2NormalMedium,
        body2NormalRegular: TextStyle = this.body2NormalRegular,
        body2ReadingBold: TextStyle = this.body2ReadingBold,
        body2ReadingMedium: TextStyle = this.body2ReadingMedium,
        body2ReadingRegular: TextStyle = this.body2ReadingRegular,
        label1NormalBold: TextStyle = this.label1NormalBold,
        label1NormalMedium: TextStyle = this.label1NormalMedium,
        label1NormalRegular: TextStyle = this.label1NormalRegular,
        label1ReadingBold: TextStyle = this.label1ReadingBold,
        label1ReadingMedium: TextStyle = this.label1ReadingMedium,
        label1ReadingRegular: TextStyle = this.label1ReadingRegular,
        label2Bold: TextStyle = this.label2Bold,
        label2Medium: TextStyle = this.label2Medium,
        label2Regular: TextStyle = this.label2Regular,
        caption1Bold: TextStyle = this.caption1Bold,
        caption1Medium: TextStyle = this.caption1Medium,
        caption1Regular: TextStyle = this.caption1Regular,
        caption2Bold: TextStyle = this.caption2Bold,
        caption2Medium: TextStyle = this.caption2Medium,
        caption2Regular: TextStyle = this.caption2Regular,
    ): Typography = Typography(
        display1Bold = display1Bold,
        display1Medium = display1Medium,
        display1Regular = display1Regular,
        display2Bold = display2Bold,
        display2Medium = display2Medium,
        display2Regular = display2Regular,
        title1Bold = title1Bold,
        title1Medium = title1Medium,
        title1Regular = title1Regular,
        title2Bold = title2Bold,
        title2Medium = title2Medium,
        title2Regular = title2Regular,
        title3Bold = title3Bold,
        title3Medium = title3Medium,
        title3Regular = title3Regular,
        heading1Bold = heading1Bold,
        heading1Medium = heading1Medium,
        heading1Regular = heading1Regular,
        heading2Bold = heading2Bold,
        heading2Medium = heading2Medium,
        heading2Regular = heading2Regular,
        headline1Bold = headline1Bold,
        headline1Medium = headline1Medium,
        headline1Regular = headline1Regular,
        headline2Bold = headline2Bold,
        headline2Medium = headline2Medium,
        headline2Regular = headline2Regular,
        body1NormalBold = body1NormalBold,
        body1NormalMedium = body1NormalMedium,
        body1NormalRegular = body1NormalRegular,
        body1ReadingBold = body1ReadingBold,
        body1ReadingMedium = body1ReadingMedium,
        body1ReadingRegular = body1ReadingRegular,
        body2NormalBold = body2NormalBold,
        body2NormalMedium = body2NormalMedium,
        body2NormalRegular = body2NormalRegular,
        body2ReadingBold = body2ReadingBold,
        body2ReadingMedium = body2ReadingMedium,
        body2ReadingRegular = body2ReadingRegular,
        label1NormalBold = label1NormalBold,
        label1NormalMedium = label1NormalMedium,
        label1NormalRegular = label1NormalRegular,
        label1ReadingBold = label1ReadingBold,
        label1ReadingMedium = label1ReadingMedium,
        label1ReadingRegular = label1ReadingRegular,
        label2Bold = label2Bold,
        label2Medium = label2Medium,
        label2Regular = label2Regular,
        caption1Bold = caption1Bold,
        caption1Medium = caption1Medium,
        caption1Regular = caption1Regular,
        caption2Bold = caption2Bold,
        caption2Medium = caption2Medium,
        caption2Regular = caption2Regular,
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Typography) return false

        if (display1Bold != other.display1Bold) return false
        if (display1Medium != other.display1Medium) return false
        if (display1Regular != other.display1Regular) return false
        if (display2Bold != other.display2Bold) return false
        if (display2Medium != other.display2Medium) return false
        if (display2Regular != other.display2Regular) return false
        if (title1Bold != other.title1Bold) return false
        if (title1Medium != other.title1Medium) return false
        if (title1Regular != other.title1Regular) return false
        if (title2Bold != other.title2Bold) return false
        if (title2Medium != other.title2Medium) return false
        if (title2Regular != other.title2Regular) return false
        if (title3Bold != other.title3Bold) return false
        if (title3Medium != other.title3Medium) return false
        if (title3Regular != other.title3Regular) return false
        if (heading1Bold != other.heading1Bold) return false
        if (heading1Medium != other.heading1Medium) return false
        if (heading1Regular != other.heading1Regular) return false
        if (heading2Bold != other.heading2Bold) return false
        if (heading2Medium != other.heading2Medium) return false
        if (heading2Regular != other.heading2Regular) return false
        if (headline1Bold != other.headline1Bold) return false
        if (headline1Medium != other.headline1Medium) return false
        if (headline1Regular != other.headline1Regular) return false
        if (headline2Bold != other.headline2Bold) return false
        if (headline2Medium != other.headline2Medium) return false
        if (headline2Regular != other.headline2Regular) return false
        if (body1NormalBold != other.body1NormalBold) return false
        if (body1NormalMedium != other.body1NormalMedium) return false
        if (body1NormalRegular != other.body1NormalRegular) return false
        if (body1ReadingBold != other.body1ReadingBold) return false
        if (body1ReadingMedium != other.body1ReadingMedium) return false
        if (body1ReadingRegular != other.body1ReadingRegular) return false
        if (body2NormalBold != other.body2NormalBold) return false
        if (body2NormalMedium != other.body2NormalMedium) return false
        if (body2NormalRegular != other.body2NormalRegular) return false
        if (body2ReadingBold != other.body2ReadingBold) return false
        if (body2ReadingMedium != other.body2ReadingMedium) return false
        if (body2ReadingRegular != other.body2ReadingRegular) return false
        if (label1NormalBold != other.label1NormalBold) return false
        if (label1NormalMedium != other.label1NormalMedium) return false
        if (label1NormalRegular != other.label1NormalRegular) return false
        if (label1ReadingBold != other.label1ReadingBold) return false
        if (label1ReadingMedium != other.label1ReadingMedium) return false
        if (label1ReadingRegular != other.label1ReadingRegular) return false
        if (label2Bold != other.label2Bold) return false
        if (label2Medium != other.label2Medium) return false
        if (label2Regular != other.label2Regular) return false
        if (caption1Bold != other.caption1Bold) return false
        if (caption1Medium != other.caption1Medium) return false
        if (caption1Regular != other.caption1Regular) return false
        if (caption2Bold != other.caption2Bold) return false
        if (caption2Medium != other.caption2Medium) return false
        if (caption2Regular != other.caption2Regular) return false

        return true
    }

    override fun hashCode(): Int {
        return arrayOf(
            display1Bold,
            display1Medium,
            display1Regular,
            display2Bold,
            display2Medium,
            display2Regular,
            title1Bold,
            title1Medium,
            title1Regular,
            title2Bold,
            title2Medium,
            title2Regular,
            title3Bold,
            title3Medium,
            title3Regular,
            heading1Bold,
            heading1Medium,
            heading1Regular,
            heading2Bold,
            heading2Medium,
            heading2Regular,
            headline1Bold,
            headline1Medium,
            headline1Regular,
            headline2Bold,
            headline2Medium,
            headline2Regular,
            body1NormalBold,
            body1NormalMedium,
            body1NormalRegular,
            body1ReadingBold,
            body1ReadingMedium,
            body1ReadingRegular,
            body2NormalBold,
            body2NormalMedium,
            body2NormalRegular,
            body2ReadingBold,
            body2ReadingMedium,
            body2ReadingRegular,
            label1NormalBold,
            label1NormalMedium,
            label1NormalRegular,
            label1ReadingBold,
            label1ReadingMedium,
            label1ReadingRegular,
            label2Bold,
            label2Medium,
            label2Regular,
            caption1Bold,
            caption1Medium,
            caption1Regular,
            caption2Bold,
            caption2Medium,
            caption2Regular,
        ).contentHashCode()
    }

    override fun toString(): String {
        return "Typography(" +
                "display1Bold=$display1Bold, " +
                "display1Medium=$display1Medium, " +
                "display1Regular=$display1Regular, " +
                "display2Bold=$display2Bold, " +
                "display2Medium=$display2Medium, " +
                "display2Regular=$display2Regular, " +
                "title1Bold=$title1Bold, " +
                "title1Medium=$title1Medium, " +
                "title1Regular=$title1Regular, " +
                "title2Bold=$title2Bold, " +
                "title2Medium=$title2Medium, " +
                "title2Regular=$title2Regular, " +
                "title3Bold=$title3Bold, " +
                "title3Medium=$title3Medium, " +
                "title3Regular=$title3Regular, " +
                "heading1Bold=$heading1Bold, " +
                "heading1Medium=$heading1Medium, " +
                "heading1Regular=$heading1Regular, " +
                "heading2Bold=$heading2Bold, " +
                "heading2Medium=$heading2Medium, " +
                "heading2Regular=$heading2Regular, " +
                "headline1Bold=$headline1Bold, " +
                "headline1Medium=$headline1Medium, " +
                "headline1Regular=$headline1Regular, " +
                "headline2Bold=$headline2Bold, " +
                "headline2Medium=$headline2Medium, " +
                "headline2Regular=$headline2Regular, " +
                "body1NormalBold=$body1NormalBold, " +
                "body1NormalMedium=$body1NormalMedium, " +
                "body1NormalRegular=$body1NormalRegular, " +
                "body1ReadingBold=$body1ReadingBold, " +
                "body1ReadingMedium=$body1ReadingMedium, " +
                "body1ReadingRegular=$body1ReadingRegular, " +
                "body2NormalBold=$body2NormalBold, " +
                "body2NormalMedium=$body2NormalMedium, " +
                "body2NormalRegular=$body2NormalRegular, " +
                "body2ReadingBold=$body2ReadingBold, " +
                "body2ReadingMedium=$body2ReadingMedium, " +
                "body2ReadingRegular=$body2ReadingRegular, " +
                "label1NormalBold=$label1NormalBold, " +
                "label1NormalMedium=$label1NormalMedium, " +
                "label1NormalRegular=$label1NormalRegular, " +
                "label1ReadingBold=$label1ReadingBold, " +
                "label1ReadingMedium=$label1ReadingMedium, " +
                "label1ReadingRegular=$label1ReadingRegular, " +
                "label2Bold=$label2Bold, " +
                "label2Medium=$label2Medium, " +
                "label2Regular=$label2Regular, " +
                "caption1Bold=$caption1Bold, " +
                "caption1Medium=$caption1Medium, " +
                "caption1Regular=$caption1Regular, " +
                "caption2Bold=$caption2Bold, " +
                "caption2Medium=$caption2Medium, " +
                "caption2Regular=$caption2Regular)"
    }
}

private fun Typography.fromToken(value: TypographyAccessKeyToken): TextStyle {
    return when (value) {
        TypographyAccessKeyToken.Display1Bold -> display1Bold
        TypographyAccessKeyToken.Display1Medium -> display1Medium
        TypographyAccessKeyToken.Display1Regular -> display1Regular
        TypographyAccessKeyToken.Display2Bold -> display2Bold
        TypographyAccessKeyToken.Display2Medium -> display2Medium
        TypographyAccessKeyToken.Display2Regular -> display2Regular
        TypographyAccessKeyToken.Title1Bold -> title1Bold
        TypographyAccessKeyToken.Title1Medium -> title1Medium
        TypographyAccessKeyToken.Title1Regular -> title1Regular
        TypographyAccessKeyToken.Title2Bold -> title2Bold
        TypographyAccessKeyToken.Title2Medium -> title2Medium
        TypographyAccessKeyToken.Title2Regular -> title2Regular
        TypographyAccessKeyToken.Title3Bold -> title3Bold
        TypographyAccessKeyToken.Title3Medium -> title3Medium
        TypographyAccessKeyToken.Title3Regular -> title3Regular
        TypographyAccessKeyToken.Heading1Bold -> heading1Bold
        TypographyAccessKeyToken.Heading1Medium -> heading1Medium
        TypographyAccessKeyToken.Heading1Regular -> heading1Regular
        TypographyAccessKeyToken.Heading2Bold -> heading2Bold
        TypographyAccessKeyToken.Heading2Medium -> heading2Medium
        TypographyAccessKeyToken.Heading2Regular -> heading2Regular
        TypographyAccessKeyToken.Headline1Bold -> headline1Bold
        TypographyAccessKeyToken.Headline1Medium -> headline1Medium
        TypographyAccessKeyToken.Headline1Regular -> headline1Regular
        TypographyAccessKeyToken.Headline2Bold -> headline2Bold
        TypographyAccessKeyToken.Headline2Medium -> headline2Medium
        TypographyAccessKeyToken.Headline2Regular -> headline2Regular
        TypographyAccessKeyToken.Body1NormalBold -> body1NormalBold
        TypographyAccessKeyToken.Body1NormalMedium -> body1NormalMedium
        TypographyAccessKeyToken.Body1NormalRegular -> body1NormalRegular
        TypographyAccessKeyToken.Body1ReadingBold -> body1ReadingBold
        TypographyAccessKeyToken.Body1ReadingMedium -> body1ReadingMedium
        TypographyAccessKeyToken.Body1ReadingRegular -> body1ReadingRegular
        TypographyAccessKeyToken.Body2NormalBold -> body2NormalBold
        TypographyAccessKeyToken.Body2NormalMedium -> body2NormalMedium
        TypographyAccessKeyToken.Body2NormalRegular -> body2NormalRegular
        TypographyAccessKeyToken.Body2ReadingBold -> body2ReadingBold
        TypographyAccessKeyToken.Body2ReadingMedium -> body2ReadingMedium
        TypographyAccessKeyToken.Body2ReadingRegular -> body2ReadingRegular
        TypographyAccessKeyToken.Label1NormalBold -> label1NormalBold
        TypographyAccessKeyToken.Label1NormalMedium -> label1NormalMedium
        TypographyAccessKeyToken.Label1NormalRegular -> label1NormalRegular
        TypographyAccessKeyToken.Label1ReadingBold -> label1ReadingBold
        TypographyAccessKeyToken.Label1ReadingMedium -> label1ReadingMedium
        TypographyAccessKeyToken.Label1ReadingRegular -> label1ReadingRegular
        TypographyAccessKeyToken.Label2Bold -> label2Bold
        TypographyAccessKeyToken.Label2Medium -> label2Medium
        TypographyAccessKeyToken.Label2Regular -> label2Regular
        TypographyAccessKeyToken.Caption1Bold -> caption1Bold
        TypographyAccessKeyToken.Caption1Medium -> caption1Medium
        TypographyAccessKeyToken.Caption1Regular -> caption1Regular
        TypographyAccessKeyToken.Caption2Bold -> caption2Bold
        TypographyAccessKeyToken.Caption2Medium -> caption2Medium
        TypographyAccessKeyToken.Caption2Regular -> caption2Regular
    }
}

internal val TypographyAccessKeyToken.value: TextStyle
    @Composable
    @ReadOnlyComposable
    get() = MooBesideTheme.typography.fromToken(this)

internal val LocalTypography = staticCompositionLocalOf { Typography() }