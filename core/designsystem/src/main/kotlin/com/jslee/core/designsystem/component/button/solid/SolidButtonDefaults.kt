package com.jslee.core.designsystem.component.button.solid

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.jslee.core.designsystem.component.button.internal.SolidButtonColors
import com.jslee.core.designsystem.component.button.solid.token.SolidButtonTokens
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.foundation.shape.token.value
import com.jslee.core.designsystem.theme.MooBesideTheme

internal object SolidButtonDefaults {
    val shape: Shape
        @Composable
        get() = SolidButtonTokens.ContainerShape.value

    val iconButtonShape: Shape
        @Composable
        get() = SolidButtonTokens.IconButtonContainerShape.value

    val iconSpacing: Dp = SolidButtonTokens.IconSpacing

    fun minHeight(size: SolidButtonSize): Dp {
        return when (size) {
            SolidButtonSize.Small -> SolidButtonTokens.SmallContainerHeight
            SolidButtonSize.Medium -> SolidButtonTokens.MediumContainerHeight
            SolidButtonSize.Large -> SolidButtonTokens.LargeContainerHeight
        }
    }

    fun iconSize(size: SolidButtonSize): Dp {
        return when (size) {
            SolidButtonSize.Small -> SolidButtonTokens.SmallIconSize
            SolidButtonSize.Medium -> SolidButtonTokens.MediumIconSize
            SolidButtonSize.Large -> SolidButtonTokens.LargeIconSize
        }
    }

    fun contentPadding(size: SolidButtonSize): PaddingValues {
        return when (size) {
            SolidButtonSize.Small -> PaddingValues(
                horizontal = SolidButtonTokens.SmallContainerHorizontalPadding,
                vertical = SolidButtonTokens.SmallContainerVerticalPadding,
            )

            SolidButtonSize.Medium -> PaddingValues(
                horizontal = SolidButtonTokens.MediumContainerHorizontalPadding,
                vertical = SolidButtonTokens.MediumContainerVerticalPadding,
            )

            SolidButtonSize.Large -> PaddingValues(
                horizontal = SolidButtonTokens.LargeContainerHorizontalPadding,
                vertical = SolidButtonTokens.LargeContainerVerticalPadding,
            )
        }
    }

    fun iconButtonContentPadding(size: SolidButtonSize): PaddingValues {
        return when (size) {
            SolidButtonSize.Small -> PaddingValues(SolidButtonTokens.SmallIconContainerPadding)
            SolidButtonSize.Medium -> PaddingValues(SolidButtonTokens.MediumIconContainerPadding)
            SolidButtonSize.Large -> PaddingValues(SolidButtonTokens.LargeIconContainerPadding)
        }
    }

    @Composable
    fun colors(variant: SolidButtonVariant): SolidButtonColors {
        return when (variant) {
            SolidButtonVariant.Primary -> {
                InternalSolidButtonColors(
                    containerColor = SolidButtonTokens.PrimaryContainerColor.value,
                    labelColor = SolidButtonTokens.PrimaryLabelColor.value,
                    disabledContainerColor = SolidButtonTokens.PrimaryDisabledContainerColor.value,
                    disabledLabelColor = SolidButtonTokens.PrimaryDisabledLabelColor.value,
                    iconColor = SolidButtonTokens.PrimaryIconColor.value,
                    disabledIconColor = SolidButtonTokens.PrimaryDisabledIconColor.value,
                )
            }

            SolidButtonVariant.Assistive -> {
                InternalSolidButtonColors(
                    containerColor = SolidButtonTokens.AssistiveContainerColor.value,
                    labelColor = SolidButtonTokens.AssistiveLabelColor.value,
                    disabledContainerColor = SolidButtonTokens.AssistiveDisabledContainerColor.value,
                    disabledLabelColor = SolidButtonTokens.AssistiveDisabledLabelColor.value,
                    iconColor = SolidButtonTokens.AssistiveIconColor.value,
                    disabledIconColor = SolidButtonTokens.AssistiveDisabledIconColor.value,
                )
            }
        }
    }

    @Composable
    fun labelTextStyle(variant: SolidButtonVariant): TextStyle {
        return when (variant) {
            SolidButtonVariant.Primary -> MooBesideTheme.typography.body1NormalBold
            SolidButtonVariant.Assistive -> MooBesideTheme.typography.body1NormalMedium
        }
    }
}