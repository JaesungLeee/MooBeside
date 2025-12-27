package com.jslee.core.designsystem.component.button.solid.internal

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import com.jslee.core.designsystem.component.button.internal.SolidButtonColors

@Immutable
internal class InternalSolidButtonColors(
    val containerColor: Color,
    val labelColor: Color,
    val iconColor: Color,
    val disabledContainerColor: Color,
    val disabledLabelColor: Color,
    val disabledIconColor: Color,
) : SolidButtonColors {
    fun copy(
        containerColor: Color = this.containerColor,
        labelColor: Color = this.labelColor,
        iconColor: Color = this.iconColor,
        disabledContainerColor: Color = this.disabledContainerColor,
        disabledLabelColor: Color = this.disabledLabelColor,
        disabledIconColor: Color = this.disabledIconColor,
    ): InternalSolidButtonColors = InternalSolidButtonColors(
        containerColor = containerColor,
        labelColor = labelColor,
        iconColor = iconColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledIconColor = disabledIconColor,
    )

    @Stable
    override fun containerColor(enabled: Boolean): Color {
        return if (enabled) containerColor else disabledContainerColor
    }

    @Stable
    override fun labelColor(enabled: Boolean): Color {
        return if (enabled) labelColor else disabledLabelColor
    }

    @Stable
    override fun iconColor(enabled: Boolean): Color {
        return if (enabled) iconColor else disabledIconColor
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is InternalSolidButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (labelColor != other.labelColor) return false
        if (iconColor != other.iconColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledLabelColor != other.disabledLabelColor) return false
        if (disabledIconColor != other.disabledIconColor) return false

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
        ).contentHashCode()
    }
}