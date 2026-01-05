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

public val MooBesideIconPack.Graduationfill: ImageVector
    get() {
        if (_graduationfill != null) {
            return _graduationfill!!
        }
        _graduationfill = Builder(name = "Graduationfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.387f, 3.188f)
                curveTo(12.142f, 3.071f, 11.858f, 3.071f, 11.613f, 3.188f)
                lineTo(2.6f, 7.48f)
                curveTo(2.383f, 7.582f, 2.169f, 7.684f, 2.003f, 7.783f)
                curveTo(1.843f, 7.878f, 1.563f, 8.059f, 1.403f, 8.39f)
                curveTo(1.216f, 8.776f, 1.216f, 9.225f, 1.403f, 9.61f)
                curveTo(1.563f, 9.941f, 1.843f, 10.123f, 2.003f, 10.217f)
                curveTo(2.169f, 10.316f, 2.383f, 10.418f, 2.6f, 10.521f)
                lineTo(11.613f, 14.813f)
                curveTo(11.858f, 14.929f, 12.142f, 14.929f, 12.387f, 14.813f)
                lineTo(20.98f, 10.721f)
                verticalLineTo(15.5f)
                curveTo(20.98f, 15.997f, 21.383f, 16.4f, 21.88f, 16.4f)
                curveTo(22.377f, 16.4f, 22.78f, 15.997f, 22.78f, 15.5f)
                verticalLineTo(9.0f)
                curveTo(22.78f, 8.842f, 22.739f, 8.693f, 22.667f, 8.564f)
                curveTo(22.648f, 8.505f, 22.624f, 8.447f, 22.597f, 8.39f)
                curveTo(22.437f, 8.059f, 22.156f, 7.878f, 21.997f, 7.783f)
                curveTo(21.83f, 7.684f, 21.616f, 7.582f, 21.4f, 7.48f)
                lineTo(12.387f, 3.188f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1f, 13.706f)
                lineTo(10.839f, 16.439f)
                curveTo(11.573f, 16.788f, 12.426f, 16.788f, 13.161f, 16.439f)
                lineTo(18.9f, 13.706f)
                lineTo(18.9f, 16.32f)
                curveTo(18.901f, 16.942f, 18.901f, 17.465f, 18.732f, 17.941f)
                curveTo(18.583f, 18.358f, 18.34f, 18.736f, 18.023f, 19.045f)
                curveTo(17.661f, 19.398f, 17.185f, 19.615f, 16.62f, 19.873f)
                lineTo(13.628f, 21.244f)
                curveTo(13.216f, 21.433f, 12.869f, 21.593f, 12.496f, 21.658f)
                curveTo(12.168f, 21.715f, 11.832f, 21.715f, 11.504f, 21.658f)
                curveTo(11.13f, 21.593f, 10.783f, 21.433f, 10.372f, 21.244f)
                lineTo(7.38f, 19.873f)
                curveTo(6.815f, 19.615f, 6.339f, 19.398f, 5.977f, 19.045f)
                curveTo(5.659f, 18.736f, 5.417f, 18.358f, 5.268f, 17.941f)
                curveTo(5.098f, 17.465f, 5.099f, 16.942f, 5.1f, 16.32f)
                lineTo(5.1f, 13.706f)
                close()
            }
        }
        .build()
        return _graduationfill!!
    }

private var _graduationfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Graduationfill, contentDescription = "")
    }
}
