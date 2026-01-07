package com.jslee.core.designsystem.component.chip.filter

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.jslee.core.designsystem.component.chip.filter.token.FilterChipTokens
import com.jslee.core.designsystem.component.chip.internal.FilterChipColors
import com.jslee.core.designsystem.foundation.color.value
import com.jslee.core.designsystem.foundation.shape.token.value
import com.jslee.core.designsystem.foundation.typography.value

internal object FilterChipDefaults {
    val shape: Shape
        @Composable
        get() = FilterChipTokens.ContainerShape.value

    fun minHeight(size: FilterChipSize): Dp {
        return when (size) {
            FilterChipSize.XSmall -> FilterChipTokens.XSmallContainerHeight
            FilterChipSize.Small -> FilterChipTokens.SmallContainerHeight
            FilterChipSize.Medium -> FilterChipTokens.MediumContainerHeight
            FilterChipSize.Large -> FilterChipTokens.LargeContainerHeight
        }
    }

    fun contentPadding(size: FilterChipSize): PaddingValues {
        return when (size) {
            FilterChipSize.XSmall -> PaddingValues(
                start = FilterChipTokens.XSmallContainerStartPadding,
                end = FilterChipTokens.XSmallContainerEndPadding,
                top = FilterChipTokens.XSmallContainerTopPadding,
                bottom = FilterChipTokens.XSmallContainerBottomPadding
            )

            FilterChipSize.Small -> PaddingValues(
                start = FilterChipTokens.SmallContainerStartPadding,
                end = FilterChipTokens.SmallContainerEndPadding,
                top = FilterChipTokens.SmallContainerTopPadding,
                bottom = FilterChipTokens.SmallContainerBottomPadding,
            )

            FilterChipSize.Medium -> PaddingValues(
                start = FilterChipTokens.MediumContainerStartPadding,
                end = FilterChipTokens.MediumContainerEndPadding,
                top = FilterChipTokens.MediumContainerTopPadding,
                bottom = FilterChipTokens.MediumContainerBottomPadding,
            )

            FilterChipSize.Large -> PaddingValues(
                start = FilterChipTokens.LargeContainerStartPadding,
                end = FilterChipTokens.LargeContainerEndPadding,
                top = FilterChipTokens.LargeContainerTopPadding,
                bottom = FilterChipTokens.LargeContainerBottomPadding,
            )
        }
    }

    fun iconSize(size: FilterChipSize): Dp {
        return when (size) {
            FilterChipSize.XSmall -> FilterChipTokens.XSmallIconSize
            FilterChipSize.Small -> FilterChipTokens.SmallIconSize
            FilterChipSize.Medium -> FilterChipTokens.MediumIconSize
            FilterChipSize.Large -> FilterChipTokens.LargeIconSize
        }
    }

    fun iconSpacing(size: FilterChipSize): Dp {
        return when (size) {
            FilterChipSize.XSmall -> FilterChipTokens.XSmallIconSpacing
            FilterChipSize.Small -> FilterChipTokens.SmallIconSpacing
            FilterChipSize.Medium -> FilterChipTokens.MediumIconSpacing
            FilterChipSize.Large -> FilterChipTokens.LargeIconSpacing
        }
    }

    @Composable
    fun borderStroke(
        variant: FilterChipVariant,
        enabled: Boolean,
        selected: Boolean,
    ): BorderStroke? {
        return when (variant) {
            FilterChipVariant.Outlined -> BorderStroke(
                width = FilterChipTokens.BorderWidth,
                color = when {
                    !enabled -> if (selected) FilterChipTokens.OutlinedDisabledSelectedBorderColor.value else FilterChipTokens.OutlinedDisabledBorderColor.value
                    selected -> FilterChipTokens.OutlinedNormalSelectedBorderColor.value.copy(
                        alpha = FilterChipTokens.OutlinedNormalSelectedBorderOpacity,
                    )

                    else -> FilterChipTokens.OutlinedNormalBorderColor.value
                }
            )

            else -> null
        }
    }

    @Composable
    fun colors(variant: FilterChipVariant): FilterChipColors {
        return when (variant) {
            FilterChipVariant.Solid -> InternalFilterChipColors(
                containerColor = FilterChipTokens.SolidNormalContainerColor.value,
                labelColor = FilterChipTokens.SolidNormalLabelColor.value,
                iconColor = FilterChipTokens.SolidNormalIconColor.value,
                disabledContainerColor = FilterChipTokens.SolidDisabledContainerColor.value,
                disabledLabelColor = FilterChipTokens.SolidDisabledLabelColor.value,
                disabledIconColor = FilterChipTokens.SolidDisabledIconColor.value,
                selectedContainerColor = FilterChipTokens.SolidSelectedContainerColor.value,
                selectedLabelColor = FilterChipTokens.SolidSelectedLabelColor.value,
                selectedIconColor = FilterChipTokens.SolidSelectedIconColor.value,
                disabledSelectedContainerColor = FilterChipTokens.SolidDisabledSelectedContainerColor.value,
                disabledSelectedLabelColor = FilterChipTokens.SolidDisabledSelectedLabelColor.value,
                disabledSelectedIconColor = FilterChipTokens.SolidDisabledSelectedIconColor.value,
            )

            FilterChipVariant.Outlined -> InternalFilterChipColors(
                containerColor = FilterChipTokens.OutlinedNormalContainerColor,
                labelColor = FilterChipTokens.OutlinedNormalLabelColor.value,
                iconColor = FilterChipTokens.OutlinedNormalIconColor.value,
                disabledContainerColor = FilterChipTokens.OutlinedDisabledContainerColor,
                disabledLabelColor = FilterChipTokens.OutlinedDisabledLabelColor.value,
                disabledIconColor = FilterChipTokens.OutlinedDisabledIconColor.value,
                selectedContainerColor = FilterChipTokens.OutlinedNormalSelectedContainerColor.value
                    .copy(alpha = FilterChipTokens.OutlinedNormalSelectedContainerOpacity),
                selectedLabelColor = FilterChipTokens.OutlinedNormalSelectedLabelColor.value,
                selectedIconColor = FilterChipTokens.OutlinedNormalSelectedIconColor.value,
                disabledSelectedContainerColor = FilterChipTokens.OutlinedDisabledSelectedContainerColor,
                disabledSelectedLabelColor = FilterChipTokens.OutlinedDisabledSelectedLabelColor.value,
                disabledSelectedIconColor = FilterChipTokens.OutlinedDisabledSelectedIconColor.value,
            )
        }
    }

    @Composable
    fun labelTextStyle(size: FilterChipSize): TextStyle {
        return when (size) {
            FilterChipSize.XSmall -> FilterChipTokens.XSmallLabelTextStyle.value
            FilterChipSize.Small -> FilterChipTokens.SmallLabelTextStyle.value
            FilterChipSize.Medium -> FilterChipTokens.MediumLabelTextStyle.value
            FilterChipSize.Large -> FilterChipTokens.LargeLabelTextStyle.value
        }
    }
}