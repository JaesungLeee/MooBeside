package com.jslee.core.designsystem.foundation.shape

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import com.jslee.core.designsystem.foundation.shape.token.ShapeAccessKeyToken

@Immutable
class Shapes(
    val extraSmall: CornerBasedShape = ShapeDefaults.ExtraSmall,
    val small: CornerBasedShape = ShapeDefaults.Small,
    val medium: CornerBasedShape = ShapeDefaults.Medium,
    val large: CornerBasedShape = ShapeDefaults.Large,
    val extraLarge: CornerBasedShape = ShapeDefaults.ExtraLarge,
    val full: CornerBasedShape = ShapeDefaults.Full,
    val none: Shape = ShapeDefaults.None
) {
    fun copy(
        extraSmall: CornerBasedShape = this.extraSmall,
        small: CornerBasedShape = this.small,
        medium: CornerBasedShape = this.medium,
        large: CornerBasedShape = this.large,
        extraLarge: CornerBasedShape = this.extraLarge,
    ): Shapes = Shapes(
        extraSmall = extraSmall,
        small = small,
        medium = medium,
        large = large,
        extraLarge = extraLarge,
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shapes) return false
        if (extraSmall != other.extraSmall) return false
        if (small != other.small) return false
        if (medium != other.medium) return false
        if (large != other.large) return false
        if (extraLarge != other.extraLarge) return false
        return true
    }

    override fun hashCode(): Int {
        var result = extraSmall.hashCode()
        result = 31 * result + small.hashCode()
        result = 31 * result + medium.hashCode()
        result = 31 * result + large.hashCode()
        result = 31 * result + extraLarge.hashCode()
        return result
    }
}

internal fun Shapes.fromToken(value: ShapeAccessKeyToken): Shape {
    return when (value) {
        ShapeAccessKeyToken.CornerExtraLarge -> extraLarge
        ShapeAccessKeyToken.CornerLarge -> large
        ShapeAccessKeyToken.CornerMedium -> medium
        ShapeAccessKeyToken.CornerSmall -> small
        ShapeAccessKeyToken.CornerExtraSmall -> extraSmall
        ShapeAccessKeyToken.CornerFull -> full
        ShapeAccessKeyToken.CornerNone -> none
    }
}

internal val LocalShapes = staticCompositionLocalOf { Shapes() }