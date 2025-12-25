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

internal object ColorDarkTokens {
    val semantic: SemanticColorSpec =
        SemanticColorSpec(
            static = StaticColorSpec(
                white = AtomicColorToken.Common100,
                black = AtomicColorToken.Common0,
            ),
            primary = PrimaryColorSpec(
                normal = AtomicColorToken.Blue60,
                strong = AtomicColorToken.Blue55,
                heavy = AtomicColorToken.Blue50,
            ),
            label = LabelColorSpec(
                normal = AtomicColorToken.CoolNeutral99,
                strong = AtomicColorToken.Common100,
                neutral = AtomicColorToken.CoolNeutral90.copy(alpha = AtomicColorToken.Opacity88),
                alternative = AtomicColorToken.CoolNeutral80.copy(alpha = AtomicColorToken.Opacity61),
                assistive = AtomicColorToken.CoolNeutral80.copy(alpha = AtomicColorToken.Opacity28),
                disable = AtomicColorToken.CoolNeutral70.copy(alpha = AtomicColorToken.Opacity16)
            ),
            background = BackgroundColorSpec(
                normal = BackgroundColorSpec.Normal(
                    normal = AtomicColorToken.CoolNeutral15,
                    alternative = AtomicColorToken.CoolNeutral5
                ),
                elevated = BackgroundColorSpec.Elevated(
                    normal = AtomicColorToken.CoolNeutral17,
                    alternative = AtomicColorToken.CoolNeutral7
                )
            ),
            interaction = InteractionColorSpec(
                inactive = AtomicColorToken.CoolNeutral40,
                disable = AtomicColorToken.CoolNeutral22
            ),
            line = LineColorSpec(
                normal = LineColorSpec.Normal(
                    normal = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity35),
                    neutral = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity28),
                    alternative = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity22)
                ),
                solid = LineColorSpec.Solid(
                    normal = AtomicColorToken.CoolNeutral25,
                    neutral = AtomicColorToken.CoolNeutral23,
                    alternative = AtomicColorToken.CoolNeutral22
                )
            ),
            status = StatusColorSpec(
                positive = AtomicColorToken.Green60,
                cautionary = AtomicColorToken.Orange60,
                negative = AtomicColorToken.Red60
            ),
            accent = AccentColorSpec(
                background = AccentColorSpec.Background(
                    redOrange = AtomicColorToken.RedOrange60,
                    lime = AtomicColorToken.Lime60,
                    cyan = AtomicColorToken.Cyan60,
                    lightBlue = AtomicColorToken.LightBlue60,
                    violet = AtomicColorToken.Violet60,
                    purple = AtomicColorToken.Purple60,
                    pink = AtomicColorToken.Pink60
                ),
                foreground = AccentColorSpec.Foreground(
                    red = AtomicColorToken.Red60,
                    redOrange = AtomicColorToken.RedOrange60,
                    orange = AtomicColorToken.Orange50,
                    lime = AtomicColorToken.Lime50,
                    green = AtomicColorToken.Green60,
                    cyan = AtomicColorToken.Cyan50,
                    lightBlue = AtomicColorToken.LightBlue50,
                    blue = AtomicColorToken.Blue65,
                    violet = AtomicColorToken.Violet70,
                    purple = AtomicColorToken.Purple60,
                    pink = AtomicColorToken.Pink60
                )
            ),
            inverse = InverseColorSpec(
                primary = AtomicColorToken.Blue50,
                background = AtomicColorToken.Common100,
                label = AtomicColorToken.CoolNeutral10
            )
        )

    val component: ComponentColorSpec =
        ComponentColorSpec(
            fill = FillColorSpec(
                normal = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity22),
                strong = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity28),
                alternative = AtomicColorToken.CoolNeutral50.copy(alpha = AtomicColorToken.Opacity12)
            ),
            material = MaterialColorSpec(
                dimmer = AtomicColorToken.CoolNeutral10.copy(alpha = AtomicColorToken.Opacity74)
            )
        )
}