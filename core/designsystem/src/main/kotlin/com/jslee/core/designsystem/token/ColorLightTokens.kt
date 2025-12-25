package com.jslee.core.designsystem.token

import com.jslee.core.designsystem.foundation.color.Background
import com.jslee.core.designsystem.foundation.color.BackgroundNeutral
import com.jslee.core.designsystem.foundation.color.BackgroundTint
import com.jslee.core.designsystem.foundation.color.Bg
import com.jslee.core.designsystem.foundation.color.Border
import com.jslee.core.designsystem.foundation.color.BorderNeutral
import com.jslee.core.designsystem.foundation.color.BorderTint
import com.jslee.core.designsystem.foundation.color.Foreground
import com.jslee.core.designsystem.foundation.color.ForegroundNeutral
import com.jslee.core.designsystem.foundation.color.ForegroundTint

internal object ColorLightTokens {
    val foreground: Foreground = Foreground(
        neutral = ForegroundNeutral(
            primary = PrimitiveColorToken.Black,
            secondary = PrimitiveColorToken.Neutral600,
            tertiary = PrimitiveColorToken.Neutral500,
            inverse = PrimitiveColorToken.White,
            static = PrimitiveColorToken.White,
        ),
        tint = ForegroundTint(
            red = PrimitiveColorToken.Red600,
            orange = PrimitiveColorToken.Amber600,
            green = PrimitiveColorToken.Green600,
            blue = PrimitiveColorToken.Blue600,
        ),
    )

    val border: Border = Border(
        neutral = BorderNeutral(
            primary = PrimitiveColorToken.Neutral950,
            secondary = PrimitiveColorToken.Neutral500,
            tertiary = PrimitiveColorToken.Neutral300,
            transparent = PrimitiveColorToken.Transparent,
        ),
        tint = BorderTint(
            red = PrimitiveColorToken.Red600,
            orange = PrimitiveColorToken.Amber600,
            green = PrimitiveColorToken.Green600,
            blue = PrimitiveColorToken.Blue600,
        ),
    )

    val background: Background = Background(
        bg = Bg(
            primary = PrimitiveColorToken.White,
            secondary = PrimitiveColorToken.Neutral100,
            tertiary = PrimitiveColorToken.Neutral200,
            dim = PrimitiveColorToken.AlphaBlack600,
        ),
        neutral = BackgroundNeutral(
            primary = PrimitiveColorToken.White,
            secondary = PrimitiveColorToken.Neutral300,
            tertiary = PrimitiveColorToken.Neutral200,
            inverse = PrimitiveColorToken.Neutral950,
            transparent = PrimitiveColorToken.Transparent,
        ),
        tint = BackgroundTint(
            redBold = PrimitiveColorToken.Red600,
            redSubtle = PrimitiveColorToken.Red100,
            orangeBold = PrimitiveColorToken.Amber600,
            orangeSubtle = PrimitiveColorToken.Amber100,
            greenBold = PrimitiveColorToken.Green600,
            greenSubtle = PrimitiveColorToken.Green100,
            blueBold = PrimitiveColorToken.Blue600,
            blueSubtle = PrimitiveColorToken.Blue100,
        ),
    )
}
