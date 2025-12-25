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

internal object ColorDarkTokens {
    val foreground: Foreground = Foreground(
        neutral = ForegroundNeutral(
            primary = PrimitiveColorToken.White,
            secondary = PrimitiveColorToken.Neutral300,
            tertiary = PrimitiveColorToken.Neutral400,
            inverse = PrimitiveColorToken.Black,
            static = PrimitiveColorToken.White,
        ),
        tint = ForegroundTint(
            red = PrimitiveColorToken.Red500,
            orange = PrimitiveColorToken.Amber500,
            green = PrimitiveColorToken.Green500,
            blue = PrimitiveColorToken.Blue500,
        ),
    )

    val border: Border = Border(
        neutral = BorderNeutral(
            primary = PrimitiveColorToken.Neutral50,
            secondary = PrimitiveColorToken.Neutral500,
            tertiary = PrimitiveColorToken.Neutral600,
            transparent = PrimitiveColorToken.Transparent,
        ),
        tint = BorderTint(
            red = PrimitiveColorToken.Red500,
            orange = PrimitiveColorToken.Amber500,
            green = PrimitiveColorToken.Green500,
            blue = PrimitiveColorToken.Blue500,
        ),
    )

    val background: Background = Background(
        bg = Bg(
            primary = PrimitiveColorToken.Neutral950,
            secondary = PrimitiveColorToken.Neutral900,
            tertiary = PrimitiveColorToken.Neutral800,
            dim = PrimitiveColorToken.AlphaBlack600,
        ),
        neutral = BackgroundNeutral(
            primary = PrimitiveColorToken.Neutral800,
            secondary = PrimitiveColorToken.Neutral700,
            tertiary = PrimitiveColorToken.Neutral600,
            inverse = PrimitiveColorToken.Neutral50,
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