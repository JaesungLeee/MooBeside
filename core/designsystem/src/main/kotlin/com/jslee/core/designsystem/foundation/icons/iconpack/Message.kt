package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.35f, 10.0f)
                curveTo(7.35f, 9.503f, 7.753f, 9.1f, 8.25f, 9.1f)
                horizontalLineTo(15.75f)
                curveTo(16.247f, 9.1f, 16.65f, 9.503f, 16.65f, 10.0f)
                curveTo(16.65f, 10.497f, 16.247f, 10.9f, 15.75f, 10.9f)
                horizontalLineTo(8.25f)
                curveTo(7.753f, 10.9f, 7.35f, 10.497f, 7.35f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.35f, 14.0f)
                curveTo(7.35f, 13.503f, 7.753f, 13.1f, 8.25f, 13.1f)
                horizontalLineTo(12.75f)
                curveTo(13.247f, 13.1f, 13.65f, 13.503f, 13.65f, 14.0f)
                curveTo(13.65f, 14.497f, 13.247f, 14.9f, 12.75f, 14.9f)
                horizontalLineTo(8.25f)
                curveTo(7.753f, 14.9f, 7.35f, 14.497f, 7.35f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.35f)
                curveTo(6.671f, 2.35f, 2.35f, 6.67f, 2.35f, 12.0f)
                curveTo(2.35f, 17.329f, 6.671f, 21.65f, 12.0f, 21.65f)
                curveTo(13.538f, 21.65f, 14.995f, 21.289f, 16.287f, 20.647f)
                lineTo(18.1f, 21.142f)
                curveTo(18.51f, 21.254f, 18.876f, 21.353f, 19.176f, 21.406f)
                curveTo(19.481f, 21.46f, 19.867f, 21.497f, 20.253f, 21.35f)
                curveTo(20.758f, 21.157f, 21.157f, 20.758f, 21.35f, 20.252f)
                curveTo(21.497f, 19.867f, 21.461f, 19.481f, 21.407f, 19.176f)
                curveTo(21.354f, 18.875f, 21.254f, 18.51f, 21.142f, 18.1f)
                lineTo(20.648f, 16.287f)
                curveTo(21.289f, 14.995f, 21.65f, 13.538f, 21.65f, 12.0f)
                curveTo(21.65f, 6.67f, 17.33f, 2.35f, 12.0f, 2.35f)
                close()
                moveTo(4.15f, 12.0f)
                curveTo(4.15f, 7.665f, 7.665f, 4.15f, 12.0f, 4.15f)
                curveTo(16.336f, 4.15f, 19.85f, 7.665f, 19.85f, 12.0f)
                curveTo(19.85f, 13.361f, 19.504f, 14.639f, 18.897f, 15.753f)
                curveTo(18.785f, 15.957f, 18.757f, 16.197f, 18.819f, 16.421f)
                lineTo(19.671f, 19.548f)
                curveTo(19.678f, 19.574f, 19.676f, 19.59f, 19.673f, 19.601f)
                curveTo(19.669f, 19.614f, 19.661f, 19.631f, 19.646f, 19.645f)
                curveTo(19.631f, 19.66f, 19.615f, 19.669f, 19.601f, 19.673f)
                curveTo(19.59f, 19.676f, 19.574f, 19.678f, 19.549f, 19.671f)
                lineTo(16.421f, 18.818f)
                curveTo(16.197f, 18.757f, 15.958f, 18.785f, 15.753f, 18.896f)
                curveTo(14.639f, 19.504f, 13.361f, 19.85f, 12.0f, 19.85f)
                curveTo(7.665f, 19.85f, 4.15f, 16.335f, 4.15f, 12.0f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Message, contentDescription = "")
    }
}
