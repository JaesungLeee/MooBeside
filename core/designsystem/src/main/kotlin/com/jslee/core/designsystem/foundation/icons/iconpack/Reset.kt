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

public val MooBesideIconPack.Reset: ImageVector
    get() {
        if (_reset != null) {
            return _reset!!
        }
        _reset = Builder(name = "Reset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.456f, 6.771f)
                lineTo(8.137f, 5.453f)
                curveTo(11.052f, 3.729f, 14.871f, 4.121f, 17.375f, 6.626f)
                curveTo(20.344f, 9.594f, 20.344f, 14.406f, 17.375f, 17.374f)
                curveTo(14.408f, 20.341f, 9.595f, 20.341f, 6.627f, 17.374f)
                curveTo(5.143f, 15.889f, 4.401f, 13.945f, 4.402f, 11.999f)
                curveTo(4.402f, 11.502f, 3.999f, 11.099f, 3.502f, 11.099f)
                curveTo(3.005f, 11.099f, 2.602f, 11.501f, 2.602f, 11.998f)
                curveTo(2.601f, 14.403f, 3.519f, 16.811f, 5.355f, 18.646f)
                curveTo(9.026f, 22.317f, 14.977f, 22.317f, 18.648f, 18.646f)
                curveTo(22.319f, 14.975f, 22.319f, 9.024f, 18.648f, 5.353f)
                curveTo(15.436f, 2.141f, 10.48f, 1.74f, 6.831f, 4.147f)
                lineTo(5.567f, 2.882f)
                curveTo(5.309f, 2.625f, 4.922f, 2.548f, 4.586f, 2.687f)
                curveTo(4.249f, 2.826f, 4.03f, 3.155f, 4.03f, 3.519f)
                lineTo(4.03f, 7.408f)
                curveTo(4.03f, 7.646f, 4.125f, 7.875f, 4.294f, 8.044f)
                curveTo(4.463f, 8.213f, 4.691f, 8.308f, 4.93f, 8.308f)
                horizontalLineTo(8.819f)
                curveTo(9.183f, 8.308f, 9.511f, 8.088f, 9.651f, 7.752f)
                curveTo(9.79f, 7.416f, 9.713f, 7.029f, 9.456f, 6.771f)
                close()
            }
        }
        .build()
        return _reset!!
    }

private var _reset: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Reset, contentDescription = "")
    }
}
