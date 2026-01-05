package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(6.256f, 2.1f, 1.6f, 6.756f, 1.6f, 12.5f)
                curveTo(1.6f, 12.658f, 1.603f, 12.814f, 1.61f, 12.971f)
                curveTo(1.625f, 13.306f, 1.825f, 13.605f, 2.13f, 13.747f)
                curveTo(2.434f, 13.888f, 2.792f, 13.849f, 3.058f, 13.644f)
                curveTo(3.665f, 13.177f, 4.424f, 12.9f, 5.25f, 12.9f)
                curveTo(6.158f, 12.9f, 6.985f, 13.235f, 7.619f, 13.79f)
                curveTo(7.921f, 14.054f, 8.362f, 14.086f, 8.699f, 13.869f)
                curveTo(9.411f, 13.41f, 10.225f, 13.095f, 11.1f, 12.966f)
                verticalLineTo(19.25f)
                curveTo(11.1f, 19.996f, 10.495f, 20.601f, 9.75f, 20.601f)
                curveTo(9.004f, 20.601f, 8.4f, 19.996f, 8.4f, 19.25f)
                curveTo(8.4f, 18.753f, 7.997f, 18.351f, 7.5f, 18.351f)
                curveTo(7.003f, 18.351f, 6.6f, 18.753f, 6.6f, 19.25f)
                curveTo(6.6f, 20.99f, 8.01f, 22.4f, 9.75f, 22.4f)
                curveTo(11.489f, 22.4f, 12.9f, 20.99f, 12.9f, 19.25f)
                verticalLineTo(12.966f)
                curveTo(13.774f, 13.095f, 14.588f, 13.41f, 15.3f, 13.869f)
                curveTo(15.637f, 14.087f, 16.078f, 14.054f, 16.38f, 13.79f)
                curveTo(17.014f, 13.235f, 17.841f, 12.9f, 18.75f, 12.9f)
                curveTo(19.576f, 12.9f, 20.334f, 13.177f, 20.941f, 13.644f)
                curveTo(21.208f, 13.849f, 21.565f, 13.888f, 21.87f, 13.747f)
                curveTo(22.174f, 13.605f, 22.374f, 13.306f, 22.389f, 12.971f)
                curveTo(22.396f, 12.815f, 22.4f, 12.658f, 22.4f, 12.5f)
                curveTo(22.4f, 6.756f, 17.743f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(5.25f, 11.1f)
                curveTo(4.626f, 11.1f, 4.027f, 11.206f, 3.469f, 11.401f)
                curveTo(4.009f, 7.17f, 7.622f, 3.9f, 12.0f, 3.9f)
                curveTo(16.377f, 3.9f, 19.99f, 7.17f, 20.53f, 11.401f)
                curveTo(19.972f, 11.206f, 19.373f, 11.1f, 18.75f, 11.1f)
                curveTo(17.628f, 11.1f, 16.584f, 11.443f, 15.72f, 12.03f)
                curveTo(14.611f, 11.436f, 13.344f, 11.1f, 12.0f, 11.1f)
                curveTo(10.656f, 11.1f, 9.388f, 11.436f, 8.279f, 12.03f)
                curveTo(7.415f, 11.443f, 6.372f, 11.1f, 5.25f, 11.1f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Umbrella, contentDescription = "")
    }
}
