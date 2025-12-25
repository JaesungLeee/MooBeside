package com.jslee.core.designsystem.foundation.color

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.jslee.core.designsystem.theme.MooBesideTheme
import com.jslee.core.designsystem.foundation.color.token.ColorAccessKeyToken
import com.jslee.core.designsystem.foundation.color.token.ColorDarkTokens
import com.jslee.core.designsystem.foundation.color.token.ColorLightTokens

@Immutable
class ColorScheme(
    val primary: Color,
    val onPrimary: Color,
    val primaryContainer: Color,
    val onPrimaryContainer: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryContainer: Color,
    val onSecondaryContainer: Color,
    val tertiary: Color,
    val onTertiary: Color,
    val tertiaryContainer: Color,
    val onTertiaryContainer: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val surfaceTint: Color,
    val inverseSurface: Color,
    val inverseOnSurface: Color,
    val error: Color,
    val onError: Color,
    val errorContainer: Color,
    val onErrorContainer: Color,
    val outline: Color,
    val outlineVariant: Color,
    val scrim: Color,
    val surfaceContainer: Color,
    val surfaceDim: Color,
) {

    fun copy(
        primary: Color = this.primary,
        onPrimary: Color = this.onPrimary,
        primaryContainer: Color = this.primaryContainer,
        onPrimaryContainer: Color = this.onPrimaryContainer,
        secondary: Color = this.secondary,
        onSecondary: Color = this.onSecondary,
        secondaryContainer: Color = this.secondaryContainer,
        onSecondaryContainer: Color = this.onSecondaryContainer,
        tertiary: Color = this.tertiary,
        onTertiary: Color = this.onTertiary,
        tertiaryContainer: Color = this.tertiaryContainer,
        onTertiaryContainer: Color = this.onTertiaryContainer,
        background: Color = this.background,
        onBackground: Color = this.onBackground,
        surface: Color = this.surface,
        onSurface: Color = this.onSurface,
        surfaceVariant: Color = this.surfaceVariant,
        onSurfaceVariant: Color = this.onSurfaceVariant,
        surfaceTint: Color = this.surfaceTint,
        inverseSurface: Color = this.inverseSurface,
        inverseOnSurface: Color = this.inverseOnSurface,
        error: Color = this.error,
        onError: Color = this.onError,
        errorContainer: Color = this.errorContainer,
        onErrorContainer: Color = this.onErrorContainer,
        outline: Color = this.outline,
        outlineVariant: Color = this.outlineVariant,
        scrim: Color = this.scrim,
        surfaceDim: Color = this.surfaceDim,
        surfaceContainer: Color = this.surfaceContainer,
    ): ColorScheme = ColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        inverseSurface = inverseSurface,
        inverseOnSurface = inverseOnSurface,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surfaceDim = surfaceDim,
        surfaceContainer = surfaceContainer,
    )

    override fun toString(): String {
        return "ColorScheme(" +
                "primary=$primary" +
                "onPrimary=$onPrimary" +
                "primaryContainer=$primaryContainer" +
                "onPrimaryContainer=$onPrimaryContainer" +
                "secondary=$secondary" +
                "onSecondary=$onSecondary" +
                "secondaryContainer=$secondaryContainer" +
                "onSecondaryContainer=$onSecondaryContainer" +
                "tertiary=$tertiary" +
                "onTertiary=$onTertiary" +
                "tertiaryContainer=$tertiaryContainer" +
                "onTertiaryContainer=$onTertiaryContainer" +
                "background=$background" +
                "onBackground=$onBackground" +
                "surface=$surface" +
                "onSurface=$onSurface" +
                "surfaceVariant=$surfaceVariant" +
                "onSurfaceVariant=$onSurfaceVariant" +
                "surfaceTint=$surfaceTint" +
                "inverseSurface=$inverseSurface" +
                "inverseOnSurface=$inverseOnSurface" +
                "error=$error" +
                "onError=$onError" +
                "errorContainer=$errorContainer" +
                "onErrorContainer=$onErrorContainer" +
                "outline=$outline" +
                "outlineVariant=$outlineVariant" +
                "scrim=$scrim" +
                "surfaceDim=$surfaceDim" +
                "surfaceContainer=$surfaceContainer" +
                ")"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorScheme) return false

        if (primary != other.primary) return false
        if (onPrimary != other.onPrimary) return false
        if (primaryContainer != other.primaryContainer) return false
        if (onPrimaryContainer != other.onPrimaryContainer) return false
        if (secondary != other.secondary) return false
        if (onSecondary != other.onSecondary) return false
        if (secondaryContainer != other.secondaryContainer) return false
        if (onSecondaryContainer != other.onSecondaryContainer) return false
        if (tertiary != other.tertiary) return false
        if (onTertiary != other.onTertiary) return false
        if (tertiaryContainer != other.tertiaryContainer) return false
        if (onTertiaryContainer != other.onTertiaryContainer) return false
        if (background != other.background) return false
        if (onBackground != other.onBackground) return false
        if (surface != other.surface) return false
        if (onSurface != other.onSurface) return false
        if (surfaceVariant != other.surfaceVariant) return false
        if (onSurfaceVariant != other.onSurfaceVariant) return false
        if (surfaceTint != other.surfaceTint) return false
        if (inverseSurface != other.inverseSurface) return false
        if (inverseOnSurface != other.inverseOnSurface) return false
        if (error != other.error) return false
        if (onError != other.onError) return false
        if (errorContainer != other.errorContainer) return false
        if (onErrorContainer != other.onErrorContainer) return false
        if (outline != other.outline) return false
        if (outlineVariant != other.outlineVariant) return false
        if (scrim != other.scrim) return false
        if (surfaceContainer != other.surfaceContainer) return false
        if (surfaceDim != other.surfaceDim) return false

        return true
    }


    override fun hashCode(): Int {
        return arrayOf(
            primary,
            onPrimary,
            primaryContainer,
            onPrimaryContainer,
            secondary,
            onSecondary,
            secondaryContainer,
            onSecondaryContainer,
            tertiary,
            onTertiary,
            tertiaryContainer,
            onTertiaryContainer,
            background,
            onBackground,
            surface,
            onSurface,
            surfaceVariant,
            onSurfaceVariant,
            surfaceTint,
            inverseSurface,
            inverseOnSurface,
            error,
            onError,
            errorContainer,
            onErrorContainer,
            outline,
            outlineVariant,
            scrim,
            surfaceContainer,
            surfaceDim,
        ).contentHashCode()
    }
}

fun lightColorScheme(
    primary: Color = ColorLightTokens.background.tint.blueBold,
    onPrimary: Color = ColorLightTokens.foreground.neutral.static,
    primaryContainer: Color = ColorLightTokens.background.tint.blueSubtle,
    onPrimaryContainer: Color = ColorLightTokens.foreground.tint.blue,
    secondary: Color = ColorLightTokens.background.tint.greenBold,
    onSecondary: Color = ColorLightTokens.foreground.neutral.static,
    secondaryContainer: Color = ColorLightTokens.background.tint.greenSubtle,
    onSecondaryContainer: Color = ColorLightTokens.foreground.tint.green,
    tertiary: Color = ColorLightTokens.background.tint.orangeBold,
    onTertiary: Color = ColorLightTokens.foreground.neutral.static,
    tertiaryContainer: Color = ColorLightTokens.background.tint.orangeSubtle,
    onTertiaryContainer: Color = ColorLightTokens.foreground.tint.orange,
    background: Color = ColorLightTokens.background.bg.primary,
    onBackground: Color = ColorLightTokens.foreground.neutral.primary,
    surface: Color = ColorLightTokens.background.bg.primary,
    onSurface: Color = ColorLightTokens.foreground.neutral.primary,
    surfaceVariant: Color = ColorLightTokens.background.bg.secondary,
    onSurfaceVariant: Color = ColorLightTokens.foreground.neutral.secondary,
    surfaceTint: Color = primary,
    inverseSurface: Color = ColorLightTokens.background.neutral.inverse,
    inverseOnSurface: Color = ColorLightTokens.foreground.neutral.inverse,
    error: Color = ColorLightTokens.background.tint.redBold,
    onError: Color = ColorLightTokens.foreground.neutral.static,
    errorContainer: Color = ColorLightTokens.background.tint.redSubtle,
    onErrorContainer: Color = ColorLightTokens.foreground.tint.red,
    outline: Color = ColorLightTokens.border.neutral.secondary,
    outlineVariant: Color = ColorLightTokens.border.neutral.tertiary,
    scrim: Color = ColorLightTokens.background.bg.dim,
    surfaceContainer: Color = ColorLightTokens.background.bg.secondary,
    surfaceDim: Color = ColorLightTokens.background.bg.tertiary,
): ColorScheme = ColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    primaryContainer = primaryContainer,
    onPrimaryContainer = onPrimaryContainer,
    secondary = secondary,
    onSecondary = onSecondary,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary,
    onTertiary = onTertiary,
    tertiaryContainer = tertiaryContainer,
    onTertiaryContainer = onTertiaryContainer,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface,
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    surfaceTint = surfaceTint,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim,
    surfaceContainer = surfaceContainer,
    surfaceDim = surfaceDim,
)

fun darkColorScheme(
    primary: Color = ColorDarkTokens.foreground.tint.blue,
    onPrimary: Color = ColorDarkTokens.foreground.neutral.inverse,
    primaryContainer: Color = ColorDarkTokens.background.tint.blueBold,
    onPrimaryContainer: Color = ColorDarkTokens.background.tint.blueSubtle,
    secondary: Color = ColorDarkTokens.foreground.tint.green,
    onSecondary: Color = ColorDarkTokens.foreground.neutral.inverse,
    secondaryContainer: Color = ColorDarkTokens.background.tint.greenBold,
    onSecondaryContainer: Color = ColorDarkTokens.background.tint.greenSubtle,
    tertiary: Color = ColorDarkTokens.foreground.tint.orange,
    onTertiary: Color = ColorDarkTokens.foreground.neutral.inverse,
    tertiaryContainer: Color = ColorDarkTokens.background.tint.orangeBold,
    onTertiaryContainer: Color = ColorDarkTokens.background.tint.orangeSubtle,
    background: Color = ColorDarkTokens.background.bg.primary,
    onBackground: Color = ColorDarkTokens.foreground.neutral.primary,
    surface: Color = ColorDarkTokens.background.bg.primary,
    onSurface: Color = ColorDarkTokens.foreground.neutral.primary,
    surfaceVariant: Color = ColorDarkTokens.background.bg.secondary,
    onSurfaceVariant: Color = ColorDarkTokens.foreground.neutral.secondary,
    surfaceTint: Color = ColorDarkTokens.foreground.tint.blue,
    inverseSurface: Color = ColorDarkTokens.background.neutral.inverse,
    inverseOnSurface: Color = ColorDarkTokens.foreground.neutral.inverse,
    error: Color = ColorDarkTokens.foreground.tint.red,
    onError: Color = ColorDarkTokens.foreground.neutral.inverse,
    errorContainer: Color = ColorDarkTokens.background.tint.redBold,
    onErrorContainer: Color = ColorDarkTokens.background.tint.redSubtle,
    outline: Color = ColorDarkTokens.border.neutral.secondary,
    outlineVariant: Color = ColorDarkTokens.border.neutral.tertiary,
    scrim: Color = ColorDarkTokens.background.bg.dim,
    surfaceContainer: Color = ColorDarkTokens.background.bg.secondary,
    surfaceDim: Color = ColorDarkTokens.background.bg.tertiary,
): ColorScheme = ColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    primaryContainer = primaryContainer,
    onPrimaryContainer = onPrimaryContainer,
    secondary = secondary,
    onSecondary = onSecondary,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary,
    onTertiary = onTertiary,
    tertiaryContainer = tertiaryContainer,
    onTertiaryContainer = onTertiaryContainer,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface,
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    surfaceTint = surfaceTint,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim,
    surfaceContainer = surfaceContainer,
    surfaceDim = surfaceDim,
)

internal fun ColorScheme.fromToken(value: ColorAccessKeyToken): Color {
    return when (value) {
        ColorAccessKeyToken.Primary -> primary
        ColorAccessKeyToken.OnPrimary -> onPrimary
        ColorAccessKeyToken.PrimaryContainer -> primaryContainer
        ColorAccessKeyToken.OnPrimaryContainer -> onPrimaryContainer
        ColorAccessKeyToken.Secondary -> secondary
        ColorAccessKeyToken.OnSecondary -> onSecondary
        ColorAccessKeyToken.SecondaryContainer -> secondaryContainer
        ColorAccessKeyToken.OnSecondaryContainer -> onSecondaryContainer
        ColorAccessKeyToken.Tertiary -> tertiary
        ColorAccessKeyToken.OnTertiary -> onTertiary
        ColorAccessKeyToken.TertiaryContainer -> tertiaryContainer
        ColorAccessKeyToken.OnTertiaryContainer -> onTertiaryContainer
        ColorAccessKeyToken.Background -> background
        ColorAccessKeyToken.OnBackground -> onBackground
        ColorAccessKeyToken.Surface -> surface
        ColorAccessKeyToken.OnSurface -> onSurface
        ColorAccessKeyToken.SurfaceVariant -> surfaceVariant
        ColorAccessKeyToken.OnSurfaceVariant -> onSurfaceVariant
        ColorAccessKeyToken.SurfaceTint -> surfaceTint
        ColorAccessKeyToken.InverseSurface -> inverseSurface
        ColorAccessKeyToken.InverseOnSurface -> inverseOnSurface
        ColorAccessKeyToken.Error -> error
        ColorAccessKeyToken.OnError -> onError
        ColorAccessKeyToken.ErrorContainer -> errorContainer
        ColorAccessKeyToken.OnErrorContainer -> onErrorContainer
        ColorAccessKeyToken.Outline -> outline
        ColorAccessKeyToken.OutlineVariant -> outlineVariant
        ColorAccessKeyToken.Scrim -> scrim
        ColorAccessKeyToken.SurfaceContainer -> surfaceContainer
        ColorAccessKeyToken.SurfaceDim -> surfaceDim
    }
}

internal val ColorAccessKeyToken.value: Color
    @Composable
    @ReadOnlyComposable
    get() = MooBesideTheme.colors.fromToken(this)

internal val LocalColorScheme = staticCompositionLocalOf { lightColorScheme() }