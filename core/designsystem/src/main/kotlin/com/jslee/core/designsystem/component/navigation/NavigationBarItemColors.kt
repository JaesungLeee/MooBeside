package com.jslee.core.designsystem.component.navigation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse

@Immutable
internal class NavigationBarItemColors(
    val selectedIconColor: Color,
    val selectedLabelColor: Color,
    val unselectedIconColor: Color,
    val unselectedLabelColor: Color,
) {
    fun copy(
        selectedIconColor: Color = this.selectedIconColor,
        selectedLabelColor: Color = this.selectedLabelColor,
        unselectedIconColor: Color = this.unselectedIconColor,
        unselectedLabelColor: Color = this.unselectedLabelColor
    ): NavigationBarItemColors = NavigationBarItemColors(
        selectedIconColor = selectedIconColor.takeOrElse { this.selectedIconColor },
        selectedLabelColor = selectedLabelColor.takeOrElse { this.selectedLabelColor },
        unselectedIconColor = unselectedIconColor.takeOrElse { this.unselectedIconColor },
        unselectedLabelColor = unselectedLabelColor.takeOrElse { this.selectedLabelColor },
    )

    @Stable
    internal fun iconColor(selected: Boolean): Color =
        if (selected) selectedIconColor else unselectedIconColor

    @Stable
    internal fun labelColor(selected: Boolean): Color =
        if (selected) selectedLabelColor else unselectedLabelColor

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is NavigationBarItemColors) return false

        if (selectedIconColor != other.selectedIconColor) return false
        if (selectedLabelColor != other.selectedLabelColor) return false
        if (unselectedIconColor != other.unselectedIconColor) return false
        if (unselectedLabelColor != other.unselectedLabelColor) return false

        return true
    }

    override fun hashCode(): Int {
        return arrayOf(
            selectedIconColor,
            selectedLabelColor,
            unselectedIconColor,
            unselectedLabelColor
        ).contentHashCode()
    }
}
