package com.jslee.core.designsystem.token

import androidx.compose.ui.graphics.Color

internal data class Foreground(
    val neutral: ForegroundNeutral,
    val tint: ForegroundTint,
)

internal data class ForegroundNeutral(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val inverse: Color,
    val static: Color,
)

internal data class ForegroundTint(
    val red: Color,
    val orange: Color,
    val green: Color,
    val blue: Color,
)

internal data class Border(
    val neutral: BorderNeutral,
    val tint: BorderTint,
)

internal data class BorderNeutral(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val transparent: Color,
)

internal data class BorderTint(
    val red: Color,
    val orange: Color,
    val green: Color,
    val blue: Color,
)

internal data class Background(
    val bg: Bg,
    val neutral: BackgroundNeutral,
    val tint: BackgroundTint,
)

internal data class Bg(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val dim: Color,
)

internal data class BackgroundNeutral(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val inverse: Color,
    val transparent: Color,
)

internal data class BackgroundTint(
    val redBold: Color,
    val redSubtle: Color,
    val orangeBold: Color,
    val orangeSubtle: Color,
    val greenBold: Color,
    val greenSubtle: Color,
    val blueBold: Color,
    val blueSubtle: Color,
)