package com.jslee.core.designsystem.component.input.checkbox

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.jslee.core.designsystem.component.input.checkbox.token.CheckBoxTokens
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.foundation.shape.token.value
import com.jslee.core.designsystem.foundation.typography.value

internal object CheckBoxDefaults {
    val shape: Shape
        @Composable
        get() = CheckBoxTokens.CheckBoxIconContainerShape.value

    val iconColor: Color
        @Composable
        get() = CheckBoxTokens.CheckBoxIconColor.value

    val iconDescriptionGap: Dp
        get() = CheckBoxTokens.CheckBoxIconDescriptionGap

    fun iconContentPadding(size: CheckBoxSize): Dp {
        return when (size) {
            CheckBoxSize.Small -> CheckBoxTokens.SmallCheckBoxIconPadding
            CheckBoxSize.Medium -> CheckBoxTokens.MediumCheckBoxIconPadding
        }
    }

    fun iconSize(size: CheckBoxSize): Dp {
        return when (size) {
            CheckBoxSize.Small -> CheckBoxTokens.SmallCheckBoxIconSize
            CheckBoxSize.Medium -> CheckBoxTokens.MediumCheckBoxIconSize
        }
    }

    fun iconContainerSize(size: CheckBoxSize): Dp {
        return when (size) {
            CheckBoxSize.Small -> CheckBoxTokens.SmallCheckBoxIconContainerSize
            CheckBoxSize.Medium -> CheckBoxTokens.MediumCheckBoxIconContainerSize
        }
    }

    @Composable
    fun borderStroke(status: CheckBoxStatus): BorderStroke {
        return when (status) {
            CheckBoxStatus.Unchecked -> BorderStroke(
                width = CheckBoxTokens.BorderWidth,
                color = CheckBoxTokens.UncheckedBorderColor.value,
            )

            CheckBoxStatus.Checked -> BorderStroke(
                width = CheckBoxTokens.BorderWidth,
                color = CheckBoxTokens.CheckedBorderColor.value
            )

            CheckBoxStatus.Indeterminate -> BorderStroke(
                width = CheckBoxTokens.BorderWidth,
                color = CheckBoxTokens.IndeterminateBorderColor.value
            )
        }
    }

    @Composable
    fun iconBackgroundColor(status: CheckBoxStatus): Color {
        return when (status) {
            CheckBoxStatus.Unchecked -> CheckBoxTokens.UncheckedBackgroundColor
            CheckBoxStatus.Checked -> CheckBoxTokens.CheckedBackgroundColor.value
            CheckBoxStatus.Indeterminate -> CheckBoxTokens.IndeterminateBackgroundColor.value
        }
    }

    @Composable
    fun descriptionTextStyle(
        size: CheckBoxSize,
        isBold: Boolean,
        enabled: Boolean,
    ): TextStyle {
        val baseStyle = when (size) {
            CheckBoxSize.Small ->
                if (isBold) CheckBoxTokens.SmallCheckBoxDescriptionTextStyleBold.value
                else CheckBoxTokens.SmallCheckBoxDescriptionTextStyle.value

            CheckBoxSize.Medium ->
                if (isBold) CheckBoxTokens.MediumCheckBoxDescriptionTextStyleBold.value
                else CheckBoxTokens.MediumCheckBoxDescriptionTextStyle.value
        }

        if (enabled) return baseStyle

        return baseStyle.copy(
            color = CheckBoxTokens.DisabledDescriptionColor.value
        )
    }
}