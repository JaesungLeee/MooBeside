package com.jslee.core.designsystem.foundation.color.token

import com.jslee.core.designsystem.foundation.color.AccentColorSpec
import com.jslee.core.designsystem.foundation.color.BackgroundColorSpec
import com.jslee.core.designsystem.foundation.color.ComponentColorSpec
import com.jslee.core.designsystem.foundation.color.FillColorSpec
import com.jslee.core.designsystem.foundation.color.InteractionColorSpec
import com.jslee.core.designsystem.foundation.color.InverseColorSpec
import com.jslee.core.designsystem.foundation.color.LabelColorSpec
import com.jslee.core.designsystem.foundation.color.LineColorSpec
import com.jslee.core.designsystem.foundation.color.MaterialColorSpec
import com.jslee.core.designsystem.foundation.color.PrimaryColorSpec
import com.jslee.core.designsystem.foundation.color.SemanticColorSpec
import com.jslee.core.designsystem.foundation.color.StaticColorSpec
import com.jslee.core.designsystem.foundation.color.StatusColorSpec

internal object ColorLightTokens {
    val semantic: SemanticColorSpec =
        SemanticColorSpec(
            static = StaticColorSpec(
                white = AtomicColorToken.Common100,
                black = AtomicColorToken.Common0,
            ),
            primary = PrimaryColorSpec(
                normal = AtomicColorToken.Blue50,
                strong = AtomicColorToken.Blue45,
                heavy = AtomicColorToken.Blue40,
            ),
            label = LabelColorSpec(
                normal = AtomicColorToken.CoolNeutral10,
                strong = AtomicColorToken.Common0,
                neutral = AtomicColorToken.CoolNeutral22.copy(alpha = AtomicColorToken.Opacity88),
                alternative = AtomicColorToken.CoolNeutral25.copy(alpha = AtomicColorToken.Opacity61),
                assistive = AtomicColorToken.CoolNeutral25.copy(alpha = AtomicColorToken.Opacity28),
                disable = AtomicColorToken.CoolNeutral25.copy(alpha = AtomicColorToken.Opacity16)
            ),
            background = BackgroundColorSpec(
                normal = BackgroundColorSpec.Normal(
                    normal = AtomicColorToken.Common100,
                    alternative = AtomicColorToken.CoolNeutral99
                ),
                elevated = BackgroundColorSpec.Elevated(
                    normal = AtomicColorToken.Common100,
                    alternative = AtomicColorToken.CoolNeutral99
                )
            ),
            interaction = InteractionColorSpec(
                inactive = AtomicColorToken.CoolNeutral70,
                disable = AtomicColorToken.CoolNeutral98
            ),
            line = LineColorSpec(
                normal = LineColorSpec.Normal(
                    normal = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity22),
                    neutral = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity16),
                    alternative = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity8)
                ),
                solid = LineColorSpec.Solid(
                    normal = AtomicColorToken.CoolNeutral96,
                    neutral = AtomicColorToken.CoolNeutral97,
                    alternative = AtomicColorToken.CoolNeutral98
                )
            ),
            status = StatusColorSpec(
                positive = AtomicColorToken.Green50,
                cautionary = AtomicColorToken.Orange50,
                negative = AtomicColorToken.Red50
            ),
            accent = AccentColorSpec(
                background = AccentColorSpec.Background(
                    redOrange = AtomicColorToken.RedOrange50,
                    lime = AtomicColorToken.Lime50,
                    cyan = AtomicColorToken.Cyan50,
                    lightBlue = AtomicColorToken.LightBlue50,
                    violet = AtomicColorToken.Violet50,
                    purple = AtomicColorToken.Purple50,
                    pink = AtomicColorToken.Pink50
                ),
                foreground = AccentColorSpec.Foreground(
                    red = AtomicColorToken.Red40,
                    redOrange = AtomicColorToken.RedOrange48,
                    orange = AtomicColorToken.Orange39,
                    lime = AtomicColorToken.Lime37,
                    green = AtomicColorToken.Green40,
                    cyan = AtomicColorToken.Cyan40,
                    lightBlue = AtomicColorToken.LightBlue40,
                    blue = AtomicColorToken.Blue45,
                    violet = AtomicColorToken.Violet45,
                    purple = AtomicColorToken.Purple40,
                    pink = AtomicColorToken.Pink46
                )
            ),
            inverse = InverseColorSpec(
                primary = AtomicColorToken.Blue60,
                background = AtomicColorToken.CoolNeutral15,
                label = AtomicColorToken.CoolNeutral99
            )
        )

    val component: ComponentColorSpec =
        ComponentColorSpec(
            fill = FillColorSpec(
                normal = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity8),
                strong = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity16),
                alternative = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity5)
            ),
            material = MaterialColorSpec(
                dimmer = AtomicColorToken.CoolNeutral10.copy(alpha = AtomicColorToken.Opacity52)
            )
        )
}
