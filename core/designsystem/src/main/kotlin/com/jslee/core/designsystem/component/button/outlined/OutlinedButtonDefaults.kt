package com.jslee.core.designsystem.component.button.outlined

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.jslee.core.designsystem.component.button.internal.OutlinedButtonColors
import com.jslee.core.designsystem.component.button.outlined.token.OutlinedButtonTokens
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.foundation.shape.token.value
import com.jslee.core.designsystem.foundation.typography.value

internal object OutlinedButtonDefaults {
    val shape: Shape
        @Composable
        get() = OutlinedButtonTokens.ContainerShape.value

    val iconSpacing: Dp = OutlinedButtonTokens.IconSpacing

    val iconButtonShape: Shape
        @Composable
        get() = OutlinedButtonTokens.IconButtonContainerShape.value

    fun minHeight(size: OutlinedButtonSize): Dp {
        return when (size) {
            OutlinedButtonSize.Small -> OutlinedButtonTokens.SmallContainerHeight
            OutlinedButtonSize.Medium -> OutlinedButtonTokens.MediumContainerHeight
            OutlinedButtonSize.Large -> OutlinedButtonTokens.LargeContainerHeight
        }
    }

    fun contentPadding(size: OutlinedButtonSize): PaddingValues {
        return when (size) {
            OutlinedButtonSize.Small -> PaddingValues(
                horizontal = OutlinedButtonTokens.SmallContainerHorizontalPadding,
                vertical = OutlinedButtonTokens.SmallContainerVerticalPadding,
            )

            OutlinedButtonSize.Medium -> PaddingValues(
                horizontal = OutlinedButtonTokens.MediumContainerHorizontalPadding,
                vertical = OutlinedButtonTokens.MediumContainerVerticalPadding,
            )

            OutlinedButtonSize.Large -> PaddingValues(
                horizontal = OutlinedButtonTokens.LargeContainerHorizontalPadding,
                vertical = OutlinedButtonTokens.LargeContainerVerticalPadding,
            )
        }
    }

    fun iconButtonContentPadding(size: OutlinedButtonSize): PaddingValues {
        return when (size) {
            OutlinedButtonSize.Small -> PaddingValues(OutlinedButtonTokens.SmallIconContainerPadding)
            OutlinedButtonSize.Medium -> PaddingValues(OutlinedButtonTokens.MediumIconContainerPadding)
            OutlinedButtonSize.Large -> PaddingValues(OutlinedButtonTokens.LargeIconContainerPadding)
        }
    }

    fun iconSize(size: OutlinedButtonSize): Dp {
        return when (size) {
            OutlinedButtonSize.Large -> OutlinedButtonTokens.LargeIconSize
            OutlinedButtonSize.Medium -> OutlinedButtonTokens.MediumIconSize
            OutlinedButtonSize.Small -> OutlinedButtonTokens.SmallIconSize
        }
    }

    @Composable
    fun labelTextStyle(variant: OutlinedButtonVariant): TextStyle {
        return when (variant) {
            OutlinedButtonVariant.Primary, OutlinedButtonVariant.Secondary -> OutlinedButtonTokens.DefaultLabelTextStyle.value
            OutlinedButtonVariant.Assistive -> OutlinedButtonTokens.AssistiveLabelTextStyle.value
        }
    }

    @Composable
    fun borderStroke(
        variant: OutlinedButtonVariant,
        enabled: Boolean,
    ): BorderStroke {
        return BorderStroke(
            width = OutlinedButtonTokens.BorderWidth,
            color = colors(variant).borderColor(enabled),
        )
    }

    @Composable
    fun colors(variant: OutlinedButtonVariant): OutlinedButtonColors {
        return when (variant) {
            OutlinedButtonVariant.Primary -> {
                InternalOutlinedButtonColors(
                    containerColor = OutlinedButtonTokens.ContainerColor,
                    labelColor = OutlinedButtonTokens.PrimaryLabelColor.value,
                    iconColor = OutlinedButtonTokens.PrimaryIconColor.value,
                    borderColor = OutlinedButtonTokens.PrimaryBorderColor.value,
                    disabledContainerColor = OutlinedButtonTokens.ContainerDisabledColor,
                    disabledLabelColor = OutlinedButtonTokens.PrimaryDisabledLabelColor.value,
                    disabledIconColor = OutlinedButtonTokens.PrimaryDisabledIconColor.value,
                    disabledBorderColor = OutlinedButtonTokens.PrimaryDisabledBorderColor.value,
                )
            }

            OutlinedButtonVariant.Secondary -> {
                InternalOutlinedButtonColors(
                    containerColor = OutlinedButtonTokens.ContainerColor,
                    labelColor = OutlinedButtonTokens.SecondaryLabelColor.value,
                    iconColor = OutlinedButtonTokens.SecondaryIconColor.value,
                    borderColor = OutlinedButtonTokens.SecondaryBorderColor.value,
                    disabledContainerColor = OutlinedButtonTokens.ContainerDisabledColor,
                    disabledLabelColor = OutlinedButtonTokens.SecondaryDisabledLabelColor.value,
                    disabledIconColor = OutlinedButtonTokens.SecondaryDisabledIconColor.value,
                    disabledBorderColor = OutlinedButtonTokens.SecondaryDisabledBorderColor.value,
                )
            }

            OutlinedButtonVariant.Assistive -> {
                InternalOutlinedButtonColors(
                    containerColor = OutlinedButtonTokens.ContainerColor,
                    labelColor = OutlinedButtonTokens.AssistiveLabelColor.value,
                    iconColor = OutlinedButtonTokens.AssistiveIconColor.value,
                    borderColor = OutlinedButtonTokens.AssistiveBorderColor.value,
                    disabledContainerColor = OutlinedButtonTokens.ContainerDisabledColor,
                    disabledLabelColor = OutlinedButtonTokens.AssistiveDisabledLabelColor.value,
                    disabledIconColor = OutlinedButtonTokens.AssistiveDisabledIconColor.value,
                    disabledBorderColor = OutlinedButtonTokens.AssistiveDisabledBorderColor.value,
                )
            }
        }
    }
}