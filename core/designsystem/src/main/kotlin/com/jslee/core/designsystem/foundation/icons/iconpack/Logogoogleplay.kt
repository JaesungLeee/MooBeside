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

public val MooBesideIconPack.Logogoogleplay: ImageVector
    get() {
        if (_logogoogleplay != null) {
            return _logogoogleplay!!
        }
        _logogoogleplay = Builder(name = "Logogoogleplay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.718f, 7.724f)
                lineTo(7.229f, 2.803f)
                curveTo(6.912f, 2.611f, 6.535f, 2.5f, 6.128f, 2.5f)
                curveTo(5.299f, 2.5f, 4.58f, 2.979f, 4.229f, 3.67f)
                lineTo(12.003f, 11.441f)
                lineTo(15.718f, 7.724f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.001f, 4.573f)
                curveTo(4.0f, 4.592f, 4.0f, 4.61f, 4.0f, 4.628f)
                verticalLineTo(19.386f)
                curveTo(4.0f, 19.407f, 4.0f, 19.427f, 4.001f, 19.448f)
                lineTo(11.438f, 12.007f)
                lineTo(4.001f, 4.573f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.235f, 20.344f)
                curveTo(4.588f, 21.032f, 5.304f, 21.5f, 6.128f, 21.5f)
                curveTo(6.52f, 21.5f, 6.889f, 21.397f, 7.207f, 21.205f)
                lineTo(7.229f, 21.19f)
                lineTo(15.724f, 16.29f)
                lineTo(12.004f, 12.572f)
                lineTo(4.235f, 20.344f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.449f, 15.884f)
                lineTo(19.896f, 13.896f)
                curveTo(20.561f, 13.533f, 21.012f, 12.831f, 21.012f, 12.026f)
                curveTo(21.012f, 11.22f, 20.569f, 10.518f, 19.903f, 10.164f)
                verticalLineTo(10.156f)
                horizontalLineTo(19.896f)
                lineTo(16.433f, 8.14f)
                lineTo(12.569f, 12.006f)
                lineTo(16.449f, 15.884f)
                close()
            }
        }
        .build()
        return _logogoogleplay!!
    }

private var _logogoogleplay: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Logogoogleplay, contentDescription = "")
    }
}
