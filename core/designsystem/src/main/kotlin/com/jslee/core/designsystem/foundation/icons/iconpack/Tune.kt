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

public val MooBesideIconPack.Tune: ImageVector
    get() {
        if (_tune != null) {
            return _tune!!
        }
        _tune = Builder(name = "Tune", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.711f, 8.65f)
                horizontalLineTo(3.5f)
                curveTo(3.003f, 8.65f, 2.6f, 8.247f, 2.6f, 7.75f)
                curveTo(2.6f, 7.253f, 3.003f, 6.85f, 3.5f, 6.85f)
                horizontalLineTo(11.712f)
                curveTo(12.113f, 5.269f, 13.545f, 4.101f, 15.25f, 4.101f)
                curveTo(16.955f, 4.101f, 18.386f, 5.269f, 18.788f, 6.85f)
                horizontalLineTo(20.5f)
                curveTo(20.997f, 6.85f, 21.4f, 7.253f, 21.4f, 7.75f)
                curveTo(21.4f, 8.247f, 20.997f, 8.65f, 20.5f, 8.65f)
                horizontalLineTo(18.788f)
                curveTo(18.388f, 10.231f, 16.955f, 11.401f, 15.25f, 11.401f)
                curveTo(13.544f, 11.401f, 12.112f, 10.231f, 11.711f, 8.65f)
                close()
                moveTo(13.4f, 7.751f)
                curveTo(13.4f, 6.729f, 14.228f, 5.901f, 15.25f, 5.901f)
                curveTo(16.271f, 5.901f, 17.1f, 6.729f, 17.1f, 7.751f)
                curveTo(17.1f, 8.772f, 16.271f, 9.601f, 15.25f, 9.601f)
                curveTo(14.228f, 9.601f, 13.4f, 8.772f, 13.4f, 7.751f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.211f, 17.15f)
                horizontalLineTo(3.5f)
                curveTo(3.003f, 17.15f, 2.6f, 16.747f, 2.6f, 16.25f)
                curveTo(2.6f, 15.753f, 3.003f, 15.35f, 3.5f, 15.35f)
                horizontalLineTo(5.212f)
                curveTo(5.613f, 13.769f, 7.045f, 12.601f, 8.75f, 12.601f)
                curveTo(10.455f, 12.601f, 11.887f, 13.769f, 12.288f, 15.35f)
                horizontalLineTo(20.5f)
                curveTo(20.997f, 15.35f, 21.4f, 15.753f, 21.4f, 16.25f)
                curveTo(21.4f, 16.747f, 20.997f, 17.15f, 20.5f, 17.15f)
                horizontalLineTo(12.288f)
                curveTo(11.888f, 18.731f, 10.455f, 19.901f, 8.75f, 19.901f)
                curveTo(7.044f, 19.901f, 5.612f, 18.731f, 5.211f, 17.15f)
                close()
                moveTo(6.9f, 16.251f)
                curveTo(6.9f, 15.229f, 7.728f, 14.401f, 8.75f, 14.401f)
                curveTo(9.772f, 14.401f, 10.6f, 15.229f, 10.6f, 16.251f)
                curveTo(10.6f, 17.272f, 9.772f, 18.101f, 8.75f, 18.101f)
                curveTo(7.728f, 18.101f, 6.9f, 17.272f, 6.9f, 16.251f)
                close()
            }
        }
        .build()
        return _tune!!
    }

private var _tune: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Tune, contentDescription = "")
    }
}
