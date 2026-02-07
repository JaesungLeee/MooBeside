package com.jslee.core.designsystem.component.input.radio

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.component.input.radio.token.RadioButtonTokens
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.foundation.shape.token.value
import com.jslee.core.designsystem.foundation.typography.value

internal object RadioButtonDefaults {
    val shape: Shape
        @Composable
        get() = RadioButtonTokens.RadioButtonIconContainerShape.value

    val iconColor: Color
        @Composable
        get() = RadioButtonTokens.RadioButtonIconColor.value

    val iconDescriptionGap: Dp
        get() = RadioButtonTokens.RadioButtonIconContainerGap

    val radioButtonPadding: Dp = 2.dp

    fun iconSize(size: RadioButtonSize): Dp {
        return when (size) {
            RadioButtonSize.Small -> RadioButtonTokens.SmallRadioButtonIconSize
            RadioButtonSize.Medium -> RadioButtonTokens.MediumRadioButtonIconSize
        }
    }

    fun containerSize(size: RadioButtonSize): Dp {
        return when (size) {
            RadioButtonSize.Small -> RadioButtonTokens.SmallRadioButtonIconContainerSize
            RadioButtonSize.Medium -> RadioButtonTokens.MediumRadioButtonIconContainerSize
        }
    }

    @Composable
    fun borderStroke(status: RadioButtonStatus): BorderStroke {
        return when (status) {
            RadioButtonStatus.Unchecked -> BorderStroke(
                width = RadioButtonTokens.BorderWidth,
                color = RadioButtonTokens.UncheckedBorderColor.value
            )

            RadioButtonStatus.Checked -> BorderStroke(
                width = RadioButtonTokens.BorderWidth,
                color = RadioButtonTokens.CheckedBorderColor.value
            )
        }
    }

    @Composable
    fun backgroundColor(status: RadioButtonStatus): Color {
        return when (status) {
            RadioButtonStatus.Unchecked -> RadioButtonTokens.UncheckedBackgroundColor
            RadioButtonStatus.Checked -> RadioButtonTokens.CheckedBackgroundColor.value
        }
    }

    @Composable
    fun labelTextStyle(
        size: RadioButtonSize,
        enabled: Boolean,
    ): TextStyle {
        val baseTextStyle = when (size) {
            RadioButtonSize.Small -> RadioButtonTokens.SmallRadioButtonDescriptionTextStyle.value
            RadioButtonSize.Medium -> RadioButtonTokens.MediumRadioButtonDescriptionTextStyle.value
        }

        if (enabled) return baseTextStyle
        return baseTextStyle.copy(color = RadioButtonTokens.DisabledDescriptionColor.value)
    }
}