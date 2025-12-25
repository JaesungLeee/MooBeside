package com.jslee.core.designsystem.foundation.color

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.jslee.core.designsystem.foundation.color.token.ColorAccessKeyToken
import com.jslee.core.designsystem.foundation.color.token.ColorDarkTokens
import com.jslee.core.designsystem.foundation.color.token.ColorLightTokens
import com.jslee.core.designsystem.theme.MooBesideTheme

@Immutable
class ColorScheme(
    val semantic: SemanticColorSpec,
    val component: ComponentColorSpec,
) {
    fun copy(
        semantic: SemanticColorSpec = this.semantic,
        component: ComponentColorSpec = this.component,
    ): ColorScheme = ColorScheme(
        semantic = semantic,
        component = component,
    )

    override fun toString(): String {
        return "ColorScheme(" +
                "semantic=$semantic, " +
                "component=$component" +
                ")"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorScheme) return false

        if (semantic != other.semantic) return false
        if (component != other.component) return false

        return true
    }

    override fun hashCode(): Int {
        var result = semantic.hashCode()
        result = 31 * result + component.hashCode()
        return result
    }
}

fun lightColorScheme(
    semantic: SemanticColorSpec = ColorLightTokens.semantic,
    component: ComponentColorSpec = ColorLightTokens.component,
): ColorScheme = ColorScheme(
    semantic = semantic,
    component = component,
)

fun darkColorScheme(
    semantic: SemanticColorSpec = ColorDarkTokens.semantic,
    component: ComponentColorSpec = ColorDarkTokens.component,
): ColorScheme = ColorScheme(
    semantic = semantic,
    component = component,
)

internal fun ColorScheme.fromToken(value: ColorAccessKeyToken): Color {
    return when (value) {
        ColorAccessKeyToken.SemanticStaticWhite -> this.semantic.static.white
        ColorAccessKeyToken.SemanticStaticBlack -> this.semantic.static.black
        ColorAccessKeyToken.SemanticPrimaryNormal -> this.semantic.primary.normal
        ColorAccessKeyToken.SemanticPrimaryStrong -> this.semantic.primary.strong
        ColorAccessKeyToken.SemanticPrimaryHeavy -> this.semantic.primary.heavy
        ColorAccessKeyToken.SemanticLabelNormal -> this.semantic.label.normal
        ColorAccessKeyToken.SemanticLabelStrong -> this.semantic.label.strong
        ColorAccessKeyToken.SemanticLabelNeutral -> this.semantic.label.neutral
        ColorAccessKeyToken.SemanticLabelAlternative -> this.semantic.label.alternative
        ColorAccessKeyToken.SemanticLabelAssistive -> this.semantic.label.assistive
        ColorAccessKeyToken.SemanticLabelDisable -> this.semantic.label.disable
        ColorAccessKeyToken.SemanticBackgroundNormalNormal -> this.semantic.background.normal.normal
        ColorAccessKeyToken.SemanticBackgroundNormalAlternative -> this.semantic.background.normal.alternative
        ColorAccessKeyToken.SemanticBackgroundElevatedNormal -> this.semantic.background.elevated.normal
        ColorAccessKeyToken.SemanticBackgroundElevatedAlternative -> this.semantic.background.elevated.alternative
        ColorAccessKeyToken.SemanticInteractionInactive -> this.semantic.interaction.inactive
        ColorAccessKeyToken.SemanticInteractionDisable -> this.semantic.interaction.disable
        ColorAccessKeyToken.SemanticLineNormalNormal -> this.semantic.line.normal.normal
        ColorAccessKeyToken.SemanticLineNormalNeutral -> this.semantic.line.normal.neutral
        ColorAccessKeyToken.SemanticLineNormalAlternative -> this.semantic.line.normal.alternative
        ColorAccessKeyToken.SemanticLineSolidNormal -> this.semantic.line.solid.normal
        ColorAccessKeyToken.SemanticLineSolidNeutral -> this.semantic.line.solid.neutral
        ColorAccessKeyToken.SemanticLineSolidAlternative -> this.semantic.line.solid.alternative
        ColorAccessKeyToken.SemanticStatusPositive -> this.semantic.status.positive
        ColorAccessKeyToken.SemanticStatusCautionary -> this.semantic.status.cautionary
        ColorAccessKeyToken.SemanticStatusNegative -> this.semantic.status.negative
        ColorAccessKeyToken.SemanticAccentBackgroundRedOrange -> this.semantic.accent.background.redOrange
        ColorAccessKeyToken.SemanticAccentBackgroundLime -> this.semantic.accent.background.lime
        ColorAccessKeyToken.SemanticAccentBackgroundCyan -> this.semantic.accent.background.cyan
        ColorAccessKeyToken.SemanticAccentBackgroundLightBlue -> this.semantic.accent.background.lightBlue
        ColorAccessKeyToken.SemanticAccentBackgroundViolet -> this.semantic.accent.background.violet
        ColorAccessKeyToken.SemanticAccentBackgroundPurple -> this.semantic.accent.background.purple
        ColorAccessKeyToken.SemanticAccentBackgroundPink -> this.semantic.accent.background.pink
        ColorAccessKeyToken.SemanticAccentForegroundRed -> this.semantic.accent.foreground.red
        ColorAccessKeyToken.SemanticAccentForegroundRedOrange -> this.semantic.accent.foreground.redOrange
        ColorAccessKeyToken.SemanticAccentForegroundOrange -> this.semantic.accent.foreground.orange
        ColorAccessKeyToken.SemanticAccentForegroundLime -> this.semantic.accent.foreground.lime
        ColorAccessKeyToken.SemanticAccentForegroundGreen -> this.semantic.accent.foreground.green
        ColorAccessKeyToken.SemanticAccentForegroundCyan -> this.semantic.accent.foreground.cyan
        ColorAccessKeyToken.SemanticAccentForegroundLightBlue -> this.semantic.accent.foreground.lightBlue
        ColorAccessKeyToken.SemanticAccentForegroundBlue -> this.semantic.accent.foreground.blue
        ColorAccessKeyToken.SemanticAccentForegroundViolet -> this.semantic.accent.foreground.violet
        ColorAccessKeyToken.SemanticAccentForegroundPurple -> this.semantic.accent.foreground.purple
        ColorAccessKeyToken.SemanticAccentForegroundPink -> this.semantic.accent.foreground.pink
        ColorAccessKeyToken.SemanticInversePrimary -> this.semantic.inverse.primary
        ColorAccessKeyToken.SemanticInverseBackground -> this.semantic.inverse.background
        ColorAccessKeyToken.SemanticInverseLabel -> this.semantic.inverse.label
        ColorAccessKeyToken.ComponentFillNormal -> this.component.fill.normal
        ColorAccessKeyToken.ComponentFillStrong -> this.component.fill.strong
        ColorAccessKeyToken.ComponentFillAlternative -> this.component.fill.alternative
        ColorAccessKeyToken.ComponentMaterialDimmer -> this.component.material.dimmer
    }
}

internal val ColorAccessKeyToken.value: Color
    @Composable
    @ReadOnlyComposable
    get() = MooBesideTheme.colors.fromToken(this)

internal val LocalColorScheme = staticCompositionLocalOf { lightColorScheme() }