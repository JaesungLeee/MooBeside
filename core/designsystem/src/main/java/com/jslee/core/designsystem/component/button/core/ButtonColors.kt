package com.jslee.core.designsystem.component.button.core

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse

@Immutable
internal class ButtonColors constructor(
    val containerColor: Color,
    val contentColor: Color,
    val disabledContainerColor: Color,
    val disabledContentColor: Color
) {
    fun copy(
        containerColor: Color = this.containerColor,
        contentColor: Color = this.contentColor,
        disabledContainerColor: Color = this.disabledContainerColor,
        disabledContentColor: Color = this.disabledContentColor
    ) = ButtonColors(
        containerColor.takeOrElse { this.containerColor },
        contentColor.takeOrElse { this.contentColor },
        disabledContainerColor.takeOrElse { this.disabledContainerColor },
        disabledContentColor.takeOrElse { this.disabledContentColor },
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (contentColor != other.contentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledContentColor != other.disabledContentColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + contentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + disabledContentColor.hashCode()
        return result
    }

    internal fun containerColor(enabled: Boolean): Color {
        return if (enabled) containerColor else disabledContainerColor
    }

    internal fun contentColor(enabled: Boolean): Color {
        return if (enabled) contentColor else disabledContentColor
    }
}
