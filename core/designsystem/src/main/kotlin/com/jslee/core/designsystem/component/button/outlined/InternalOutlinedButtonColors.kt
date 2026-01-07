package com.jslee.core.designsystem.component.button.outlined

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.jslee.core.designsystem.component.button.internal.OutlinedButtonColors

@Immutable
internal class InternalOutlinedButtonColors(
    val containerColor: Color,
    val labelColor: Color,
    val iconColor: Color,
    val borderColor: Color,
    val disabledContainerColor: Color,
    val disabledLabelColor: Color,
    val disabledIconColor: Color,
    val disabledBorderColor: Color,
) : OutlinedButtonColors {

    fun copy(
        containerColor: Color = this.containerColor,
        labelColor: Color = this.labelColor,
        iconColor: Color = this.iconColor,
        borderColor: Color = this.borderColor,
        disabledContainerColor: Color = this.disabledContainerColor,
        disabledLabelColor: Color = this.disabledLabelColor,
        disabledIconColor: Color = this.disabledIconColor,
        disabledBorderColor: Color = this.disabledBorderColor,
    ): InternalOutlinedButtonColors = InternalOutlinedButtonColors(
        containerColor = containerColor,
        labelColor = labelColor,
        iconColor = iconColor,
        borderColor = borderColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledIconColor = disabledIconColor,
        disabledBorderColor = disabledBorderColor
    )

    override fun borderColor(enabled: Boolean): Color {
        return if (enabled) borderColor else disabledBorderColor
    }

    override fun containerColor(enabled: Boolean): Color {
        return if (enabled) containerColor else disabledContainerColor
    }

    override fun labelColor(enabled: Boolean): Color {
        return if (enabled) labelColor else disabledLabelColor
    }

    override fun iconColor(enabled: Boolean): Color {
        return if (enabled) iconColor else disabledIconColor
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is InternalOutlinedButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (labelColor != other.labelColor) return false
        if (iconColor != other.iconColor) return false
        if (borderColor != other.borderColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledLabelColor != other.disabledLabelColor) return false
        if (disabledIconColor != other.disabledIconColor) return false
        if (disabledBorderColor != other.disabledBorderColor) return false
        return true
    }

    override fun hashCode(): Int {
        return arrayOf(
            containerColor,
            labelColor,
            iconColor,
            borderColor,
            disabledContainerColor,
            disabledLabelColor,
            disabledIconColor,
            disabledBorderColor,
        ).contentHashCode()
    }
}