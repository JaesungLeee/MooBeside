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

public val MooBesideIconPack.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(10.98f, 2.1f, 9.96f, 2.516f, 9.237f, 3.23f)
                lineTo(9.234f, 3.234f)
                curveTo(8.611f, 3.856f, 8.297f, 4.592f, 8.174f, 5.516f)
                lineTo(8.173f, 5.521f)
                curveTo(8.118f, 5.958f, 8.1f, 6.467f, 8.1f, 7.2f)
                verticalLineTo(10.05f)
                curveTo(8.1f, 10.783f, 8.118f, 11.292f, 8.173f, 11.729f)
                lineTo(8.174f, 11.735f)
                curveTo(8.297f, 12.658f, 8.611f, 13.394f, 9.234f, 14.017f)
                lineTo(9.237f, 14.02f)
                curveTo(9.96f, 14.734f, 10.98f, 15.15f, 12.0f, 15.15f)
                curveTo(13.026f, 15.15f, 14.034f, 14.741f, 14.763f, 14.02f)
                lineTo(14.767f, 14.017f)
                curveTo(15.389f, 13.395f, 15.709f, 12.641f, 15.832f, 11.737f)
                lineTo(15.834f, 11.724f)
                curveTo(15.883f, 11.319f, 15.9f, 10.818f, 15.9f, 10.05f)
                verticalLineTo(7.2f)
                curveTo(15.9f, 6.432f, 15.883f, 5.931f, 15.834f, 5.526f)
                lineTo(15.832f, 5.513f)
                curveTo(15.709f, 4.609f, 15.389f, 3.856f, 14.767f, 3.234f)
                lineTo(14.763f, 3.23f)
                curveTo(14.034f, 2.509f, 13.026f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(9.959f, 5.75f)
                curveTo(10.04f, 5.14f, 10.217f, 4.797f, 10.505f, 4.508f)
                curveTo(10.886f, 4.132f, 11.449f, 3.9f, 12.0f, 3.9f)
                curveTo(12.557f, 3.9f, 13.108f, 4.126f, 13.495f, 4.508f)
                curveTo(13.783f, 4.797f, 13.966f, 5.158f, 14.047f, 5.749f)
                curveTo(14.082f, 6.039f, 14.1f, 6.449f, 14.1f, 7.2f)
                verticalLineTo(10.05f)
                curveTo(14.1f, 10.801f, 14.082f, 11.211f, 14.047f, 11.502f)
                curveTo(13.966f, 12.092f, 13.783f, 12.453f, 13.496f, 12.742f)
                curveTo(13.108f, 13.124f, 12.557f, 13.35f, 12.0f, 13.35f)
                curveTo(11.449f, 13.35f, 10.887f, 13.118f, 10.505f, 12.742f)
                curveTo(10.217f, 12.453f, 10.04f, 12.11f, 9.959f, 11.5f)
                curveTo(9.918f, 11.182f, 9.9f, 10.767f, 9.9f, 10.05f)
                verticalLineTo(7.2f)
                curveTo(9.9f, 6.483f, 9.918f, 6.069f, 9.959f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4f, 9.75f)
                curveTo(6.4f, 9.253f, 5.997f, 8.85f, 5.5f, 8.85f)
                curveTo(5.003f, 8.85f, 4.6f, 9.253f, 4.6f, 9.75f)
                verticalLineTo(11.25f)
                curveTo(4.6f, 15.032f, 7.438f, 18.152f, 11.1f, 18.596f)
                verticalLineTo(20.1f)
                horizontalLineTo(8.0f)
                curveTo(7.503f, 20.1f, 7.1f, 20.503f, 7.1f, 21.0f)
                curveTo(7.1f, 21.497f, 7.503f, 21.9f, 8.0f, 21.9f)
                horizontalLineTo(16.0f)
                curveTo(16.497f, 21.9f, 16.9f, 21.497f, 16.9f, 21.0f)
                curveTo(16.9f, 20.503f, 16.497f, 20.1f, 16.0f, 20.1f)
                horizontalLineTo(12.9f)
                verticalLineTo(18.596f)
                curveTo(16.563f, 18.152f, 19.4f, 15.032f, 19.4f, 11.25f)
                verticalLineTo(9.75f)
                curveTo(19.4f, 9.253f, 18.997f, 8.85f, 18.5f, 8.85f)
                curveTo(18.003f, 8.85f, 17.6f, 9.253f, 17.6f, 9.75f)
                verticalLineTo(11.25f)
                curveTo(17.6f, 14.335f, 15.106f, 16.837f, 12.024f, 16.85f)
                curveTo(12.016f, 16.85f, 12.008f, 16.85f, 12.0f, 16.85f)
                curveTo(11.992f, 16.85f, 11.984f, 16.85f, 11.976f, 16.85f)
                curveTo(8.894f, 16.837f, 6.4f, 14.335f, 6.4f, 11.25f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Microphone, contentDescription = "")
    }
}
