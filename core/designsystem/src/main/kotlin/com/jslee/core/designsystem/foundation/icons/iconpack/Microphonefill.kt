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

public val MooBesideIconPack.Microphonefill: ImageVector
    get() {
        if (_microphonefill != null) {
            return _microphonefill!!
        }
        _microphonefill = Builder(name = "Microphonefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.415f, 3.16f)
                curveTo(10.091f, 2.491f, 11.045f, 2.102f, 12.0f, 2.102f)
                curveTo(12.96f, 2.102f, 13.903f, 2.485f, 14.586f, 3.16f)
                lineTo(14.589f, 3.163f)
                curveTo(15.173f, 3.747f, 15.472f, 4.454f, 15.587f, 5.295f)
                lineTo(15.589f, 5.309f)
                curveTo(15.634f, 5.685f, 15.65f, 6.148f, 15.65f, 6.852f)
                verticalLineTo(10.151f)
                curveTo(15.65f, 10.855f, 15.634f, 11.318f, 15.589f, 11.694f)
                lineTo(15.587f, 11.707f)
                curveTo(15.473f, 12.549f, 15.173f, 13.255f, 14.589f, 13.839f)
                lineTo(14.586f, 13.843f)
                curveTo(13.903f, 14.518f, 12.96f, 14.901f, 12.0f, 14.901f)
                curveTo(11.045f, 14.901f, 10.091f, 14.512f, 9.415f, 13.843f)
                lineTo(9.411f, 13.839f)
                curveTo(8.827f, 13.255f, 8.533f, 12.564f, 8.418f, 11.705f)
                lineTo(8.418f, 11.699f)
                curveTo(8.366f, 11.294f, 8.35f, 10.823f, 8.35f, 10.151f)
                verticalLineTo(6.852f)
                curveTo(8.35f, 6.179f, 8.366f, 5.709f, 8.418f, 5.303f)
                lineTo(8.418f, 5.298f)
                curveTo(8.533f, 4.439f, 8.827f, 3.748f, 9.411f, 3.163f)
                lineTo(9.415f, 3.16f)
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
                curveTo(12.02f, 16.85f, 12.016f, 16.85f, 12.012f, 16.85f)
                curveTo(12.008f, 16.85f, 12.004f, 16.85f, 12.0f, 16.85f)
                curveTo(11.992f, 16.85f, 11.984f, 16.85f, 11.976f, 16.85f)
                curveTo(8.894f, 16.837f, 6.4f, 14.335f, 6.4f, 11.25f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _microphonefill!!
    }

private var _microphonefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Microphonefill, contentDescription = "")
    }
}
