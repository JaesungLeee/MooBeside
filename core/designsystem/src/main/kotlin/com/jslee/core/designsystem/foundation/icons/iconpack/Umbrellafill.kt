package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.foundation.icons.MooBesideIconPack
import kotlin.Unit

public val MooBesideIconPack.Umbrellafill: ImageVector
    get() {
        if (_umbrellafill != null) {
            return _umbrellafill!!
        }
        _umbrellafill = Builder(name = "Umbrellafill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6f, 12.5f)
                curveTo(1.6f, 6.756f, 6.256f, 2.1f, 12.0f, 2.1f)
                curveTo(17.743f, 2.1f, 22.4f, 6.756f, 22.4f, 12.5f)
                curveTo(22.4f, 12.658f, 22.396f, 12.815f, 22.389f, 12.971f)
                curveTo(22.374f, 13.306f, 22.174f, 13.605f, 21.87f, 13.747f)
                curveTo(21.565f, 13.888f, 21.208f, 13.849f, 20.941f, 13.644f)
                curveTo(20.334f, 13.177f, 19.576f, 12.9f, 18.75f, 12.9f)
                curveTo(17.841f, 12.9f, 17.014f, 13.235f, 16.38f, 13.79f)
                curveTo(16.078f, 14.054f, 15.637f, 14.087f, 15.3f, 13.869f)
                curveTo(14.588f, 13.41f, 13.774f, 13.095f, 12.9f, 12.966f)
                verticalLineTo(19.25f)
                curveTo(12.9f, 20.99f, 11.489f, 22.4f, 9.75f, 22.4f)
                curveTo(8.01f, 22.4f, 6.6f, 20.99f, 6.6f, 19.25f)
                curveTo(6.6f, 18.753f, 7.003f, 18.351f, 7.5f, 18.351f)
                curveTo(7.997f, 18.351f, 8.4f, 18.753f, 8.4f, 19.25f)
                curveTo(8.4f, 19.996f, 9.004f, 20.601f, 9.75f, 20.601f)
                curveTo(10.495f, 20.601f, 11.1f, 19.996f, 11.1f, 19.25f)
                verticalLineTo(12.966f)
                curveTo(10.225f, 13.095f, 9.411f, 13.41f, 8.699f, 13.869f)
                curveTo(8.362f, 14.086f, 7.921f, 14.054f, 7.619f, 13.79f)
                curveTo(6.985f, 13.235f, 6.158f, 12.9f, 5.25f, 12.9f)
                curveTo(4.424f, 12.9f, 3.665f, 13.177f, 3.058f, 13.644f)
                curveTo(2.792f, 13.849f, 2.434f, 13.888f, 2.13f, 13.747f)
                curveTo(1.825f, 13.605f, 1.625f, 13.306f, 1.61f, 12.971f)
                curveTo(1.603f, 12.814f, 1.6f, 12.658f, 1.6f, 12.5f)
                close()
            }
        }
        .build()
        return _umbrellafill!!
    }

private var _umbrellafill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Umbrellafill, contentDescription = "")
    }
}
