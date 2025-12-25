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
    val smallNormal: TextStyle = TypographyTokens.SmallNormal,
    val smallStrong: TextStyle = TypographyTokens.SmallStrong,
    val baseNormal: TextStyle = TypographyTokens.BaseNormal,
    val baseStrong: TextStyle = TypographyTokens.BaseStrong,
    val largeNormal: TextStyle = TypographyTokens.LargeNormal,
    val largeStrong: TextStyle = TypographyTokens.LargeStrong,
    val extraLargeNormal: TextStyle = TypographyTokens.ExtraLargeNormal,
    val extraLargeStrong: TextStyle = TypographyTokens.ExtraLargeStrong,
    val h1: TextStyle = TypographyTokens.H1,
    val h2: TextStyle = TypographyTokens.H2,
    val h3: TextStyle = TypographyTokens.H3,
    val h4: TextStyle = TypographyTokens.H4,
    val h5: TextStyle = TypographyTokens.H5,
) {
    fun copy(
        smallNormal: TextStyle = this.smallNormal,
        smallStrong: TextStyle = this.smallStrong,
        baseNormal: TextStyle = this.baseNormal,
        baseStrong: TextStyle = this.baseStrong,
        largeNormal: TextStyle = this.largeNormal,
        largeStrong: TextStyle = this.largeStrong,
        extraLargeNormal: TextStyle = this.extraLargeNormal,
        extraLargeStrong: TextStyle = this.extraLargeStrong,
        h1: TextStyle = this.h1,
        h2: TextStyle = this.h2,
        h3: TextStyle = this.h3,
        h4: TextStyle = this.h4,
        h5: TextStyle = this.h5,
    ): Typography = Typography(
        smallNormal = smallNormal,
        smallStrong = smallStrong,
        baseNormal = baseNormal,
        baseStrong = baseStrong,
        largeNormal = largeNormal,
        largeStrong = largeStrong,
        extraLargeNormal = extraLargeNormal,
        extraLargeStrong = extraLargeStrong,
        h1 = h1,
        h2 = h2,
        h3 = h3,
        h4 = h4,
        h5 = h5,
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Typography) return false

        if (smallNormal != other.smallNormal) return false
        if (smallStrong != other.smallStrong) return false
        if (baseNormal != other.baseNormal) return false
        if (baseStrong != other.baseStrong) return false
        if (largeNormal != other.largeNormal) return false
        if (largeStrong != other.largeStrong) return false
        if (extraLargeNormal != other.extraLargeNormal) return false
        if (extraLargeStrong != other.extraLargeStrong) return false
        if (h1 != other.h1) return false
        if (h2 != other.h2) return false
        if (h3 != other.h3) return false
        if (h4 != other.h4) return false
        if (h5 != other.h5) return false

        return true
    }

    override fun hashCode(): Int {
        return arrayOf(
            smallNormal,
            smallStrong,
            baseNormal,
            baseStrong,
            largeNormal,
            largeStrong,
            extraLargeNormal,
            extraLargeStrong,
            h1,
            h2,
            h3,
            h4,
            h5,
        ).contentHashCode()
    }

    override fun toString(): String {
        return "Typography(" +
                "smallNormal=$smallNormal, " +
                "smallStrong=$smallStrong, " +
                "baseNormal=$baseNormal, " +
                "baseStrong=$baseStrong, " +
                "largeNormal=$largeNormal, " +
                "largeStrong=$largeStrong, " +
                "extraLargeNormal=$extraLargeNormal, " +
                "extraLargeStrong=$extraLargeStrong, " +
                "h1=$h1, " +
                "h2=$h2, " +
                "h3=$h3, " +
                "h4=$h4, " +
                "h5=$h5)"
    }
}

private fun Typography.fromToken(value: TypographyAccessKeyToken): TextStyle {
    return when (value) {
        TypographyAccessKeyToken.SmallNormal -> smallNormal
        TypographyAccessKeyToken.SmallStrong -> smallStrong
        TypographyAccessKeyToken.BaseNormal -> baseNormal
        TypographyAccessKeyToken.BaseStrong -> baseStrong
        TypographyAccessKeyToken.LargeNormal -> largeNormal
        TypographyAccessKeyToken.LargeStrong -> largeStrong
        TypographyAccessKeyToken.ExtraLargeNormal -> extraLargeNormal
        TypographyAccessKeyToken.ExtraLargeStrong -> extraLargeStrong
        TypographyAccessKeyToken.H1 -> h1
        TypographyAccessKeyToken.H2 -> h2
        TypographyAccessKeyToken.H3 -> h3
        TypographyAccessKeyToken.H4 -> h4
        TypographyAccessKeyToken.H5 -> h5
    }
}

internal val TypographyAccessKeyToken.value: TextStyle
    @Composable
    @ReadOnlyComposable
    get() = MooBesideTheme.typography.fromToken(this)

internal val LocalTypography = staticCompositionLocalOf { Typography() }