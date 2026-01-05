package com.jslee.core.designsystem.component.chip.action.internal

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.jslee.core.designsystem.component.chip.action.ActionChipSize
import com.jslee.core.designsystem.component.chip.action.ActionChipVariant
import com.jslee.core.designsystem.component.chip.action.internal.token.ActionChipTokens
import com.jslee.core.designsystem.component.chip.internal.ActionChipColors
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.foundation.shape.token.value
import com.jslee.core.designsystem.foundation.typography.value

internal object ActionChipDefaults {
    val shape: Shape
        @Composable
        get() = ActionChipTokens.ContainerShape.value

    fun minHeight(size: ActionChipSize): Dp {
        return when (size) {
            ActionChipSize.XSmall -> ActionChipTokens.XSmallContainerHeight
            ActionChipSize.Small -> ActionChipTokens.SmallContainerHeight
            ActionChipSize.Medium -> ActionChipTokens.MediumContainerHeight
            ActionChipSize.Large -> ActionChipTokens.LargeContainerHeight
        }
    }

    fun contentPadding(size: ActionChipSize): PaddingValues {
        return when (size) {
            ActionChipSize.XSmall -> PaddingValues(
                horizontal = ActionChipTokens.XSmallContainerHorizontalPadding,
                vertical = ActionChipTokens.XSmallContainerVerticalPadding
            )

            ActionChipSize.Small -> PaddingValues(
                horizontal = ActionChipTokens.SmallContainerHorizontalPadding,
                vertical = ActionChipTokens.SmallContainerVerticalPadding
            )

            ActionChipSize.Medium -> PaddingValues(
                horizontal = ActionChipTokens.MediumContainerHorizontalPadding,
                vertical = ActionChipTokens.MediumContainerVerticalPadding
            )

            ActionChipSize.Large -> PaddingValues(
                horizontal = ActionChipTokens.LargeContainerHorizontalPadding,
                vertical = ActionChipTokens.LargeContainerVerticalPadding
            )
        }
    }

    fun iconSpacing(size: ActionChipSize): Dp {
        return when (size) {
            ActionChipSize.XSmall -> ActionChipTokens.XSmallIconSpacing
            ActionChipSize.Small -> ActionChipTokens.SmallIconSpacing
            ActionChipSize.Medium -> ActionChipTokens.MediumIconSpacing
            ActionChipSize.Large -> ActionChipTokens.LargeIconSpacing
        }
    }

    fun iconSize(size: ActionChipSize): Dp {
        return when (size) {
            ActionChipSize.XSmall -> ActionChipTokens.XSmallIconSize
            ActionChipSize.Small -> ActionChipTokens.SmallIconSize
            ActionChipSize.Medium -> ActionChipTokens.MediumIconSize
            ActionChipSize.Large -> ActionChipTokens.LargeIconSize
        }
    }

    @Composable
    fun borderStroke(
        variant: ActionChipVariant,
        enabled: Boolean,
        selected: Boolean,
    ): BorderStroke? {
        return when (variant) {
            ActionChipVariant.Outlined -> BorderStroke(
                width = ActionChipTokens.BorderWidth,
                color = when {
                    !enabled -> ActionChipTokens.OutlinedDisabledBorderColor.value
                    selected -> ActionChipTokens.OutlinedNormalSelectedBorderColor.value.copy(
                        alpha = ActionChipTokens.OutlinedNormalSelectedBorderOpacity,
                    )

                    else -> ActionChipTokens.OutlinedNormalBorderColor.value
                }
            )

            else -> null
        }
    }

    @Composable
    fun colors(variant: ActionChipVariant): ActionChipColors {
        return when (variant) {
            ActionChipVariant.Solid -> {
                InternalActionChipColors(
                    containerColor = ActionChipTokens.SolidNormalContainerColor.value,
                    labelColor = ActionChipTokens.SolidNormalLabelColor.value,
                    iconColor = ActionChipTokens.SolidNormalIconColor.value,
                    disabledContainerColor = ActionChipTokens.SolidDisabledContainerColor.value,
                    disabledLabelColor = ActionChipTokens.SolidDisabledLabelColor.value,
                    disabledIconColor = ActionChipTokens.SolidDisabledIconColor.value,
                    selectedContainerColor = ActionChipTokens.SolidNormalSelectedContainerColor.value,
                    selectedLabelColor = ActionChipTokens.SolidNormalSelectedLabelColor.value,
                    selectedIconColor = ActionChipTokens.SolidNormalSelectedIconColor.value,
                    disabledSelectedContainerColor = Color.Unspecified,  // TODO
                    disabledSelectedLabelColor = Color.Unspecified,  // TODO
                    disabledSelectedIconColor = Color.Unspecified,  // TODO
                )
            }

            ActionChipVariant.Outlined -> {
                InternalActionChipColors(
                    containerColor = ActionChipTokens.OutlinedNormalContainerColor,
                    labelColor = ActionChipTokens.OutlinedNormalLabelColor.value,
                    iconColor = ActionChipTokens.OutlinedNormalIconColor.value,
                    disabledContainerColor = ActionChipTokens.OutlinedDisabledContainerColor,
                    disabledLabelColor = ActionChipTokens.OutlinedDisabledLabelColor.value,
                    disabledIconColor = ActionChipTokens.OutlinedDisabledIconColor.value,
                    selectedContainerColor = ActionChipTokens.OutlinedNormalSelectedContainerColor.value.copy(
                        alpha = ActionChipTokens.OutlinedNormalSelectedContainerOpacity,
                    ),
                    selectedLabelColor = ActionChipTokens.OutlinedNormalSelectedLabelColor.value,
                    selectedIconColor = ActionChipTokens.OutlinedNormalSelectedIconColor.value,
                    disabledSelectedContainerColor = Color.Unspecified,  // TODO
                    disabledSelectedLabelColor = Color.Unspecified,  // TODO
                    disabledSelectedIconColor = Color.Unspecified,  // TODO
                )
            }
        }
    }

    @Composable
    fun labelTextStyle(size: ActionChipSize): TextStyle {
        return when (size) {
            ActionChipSize.XSmall -> ActionChipTokens.XSmallLabelTextStyle.value
            ActionChipSize.Small -> ActionChipTokens.SmallLabelTextStyle.value
            ActionChipSize.Medium -> ActionChipTokens.MediumLabelTextStyle.value
            ActionChipSize.Large -> ActionChipTokens.LargeLabelTextStyle.value
        }
    }
}