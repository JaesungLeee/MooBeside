package com.jslee.core.designsystem.component.chip.action

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.jslee.core.designsystem.component.chip.internal.ActionChipColors

@Immutable
internal class InternalActionChipColors(
    val containerColor: Color,
    val labelColor: Color,
    val iconColor: Color,
    val disabledContainerColor: Color,
    val disabledLabelColor: Color,
    val disabledIconColor: Color,
    val selectedContainerColor: Color,
    val selectedLabelColor: Color,
    val selectedIconColor: Color,
    val disabledSelectedContainerColor: Color,
    val disabledSelectedLabelColor: Color,
    val disabledSelectedIconColor: Color,
) : ActionChipColors {

    fun copy(
        containerColor: Color = this.containerColor,
        labelColor: Color = this.labelColor,
        iconColor: Color = this.iconColor,
        disabledContainerColor: Color = this.disabledContainerColor,
        disabledLabelColor: Color = this.disabledLabelColor,
        disabledIconColor: Color = this.disabledIconColor,
        selectedContainerColor: Color = this.selectedContainerColor,
        selectedLabelColor: Color = this.selectedLabelColor,
        selectedIconColor: Color = this.selectedIconColor,
        disabledSelectedContainerColor: Color = this.disabledSelectedContainerColor,
        disabledSelectedLabelColor: Color = this.disabledSelectedLabelColor,
        disabledSelectedIconColor: Color = this.disabledSelectedIconColor,
    ): InternalActionChipColors = InternalActionChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        iconColor = iconColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledIconColor = disabledIconColor,
        selectedContainerColor = selectedContainerColor,
        selectedLabelColor = selectedLabelColor,
        selectedIconColor = selectedIconColor,
        disabledSelectedContainerColor = disabledSelectedContainerColor,
        disabledSelectedLabelColor = disabledSelectedLabelColor,
        disabledSelectedIconColor = disabledSelectedIconColor
    )

    override fun containerColor(
        enabled: Boolean,
        selected: Boolean
    ): Color {
        return when {
            !enabled -> if (selected) disabledSelectedContainerColor else disabledContainerColor
            !selected -> containerColor
            else -> selectedContainerColor
        }
    }

    override fun labelColor(
        enabled: Boolean,
        selected: Boolean
    ): Color {
        return when {
            !enabled -> if (selected) disabledSelectedLabelColor else disabledLabelColor
            !selected -> labelColor
            else -> selectedLabelColor
        }
    }

    override fun iconColor(
        enabled: Boolean,
        selected: Boolean
    ): Color {
        return when {
            !enabled -> if (selected) disabledSelectedIconColor else disabledIconColor
            !selected -> iconColor
            else -> selectedIconColor
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is InternalActionChipColors) return false

        if (containerColor != other.containerColor) return false
        if (labelColor != other.labelColor) return false
        if (iconColor != other.iconColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledLabelColor != other.disabledLabelColor) return false
        if (disabledIconColor != other.disabledIconColor) return false
        if (selectedContainerColor != other.selectedContainerColor) return false
        if (selectedLabelColor != other.selectedLabelColor) return false
        if (selectedIconColor != other.selectedIconColor) return false
        if (disabledSelectedContainerColor != other.disabledSelectedContainerColor) return false
        if (disabledSelectedLabelColor != other.disabledSelectedLabelColor) return false
        if (disabledSelectedIconColor != other.disabledSelectedIconColor) return false

        return true
    }

    override fun hashCode(): Int {
        return arrayOf(
            containerColor,
            labelColor,
            iconColor,
            disabledContainerColor,
            disabledLabelColor,
            disabledIconColor,
            selectedContainerColor,
            selectedLabelColor,
            selectedIconColor,
            disabledSelectedContainerColor,
            disabledSelectedLabelColor,
            disabledSelectedIconColor
        ).contentHashCode()
    }
}