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

public val MooBesideIconPack.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.499f, 3.949f)
                curveTo(8.732f, 3.534f, 8.102f, 3.194f, 7.597f, 2.976f)
                curveTo(7.11f, 2.766f, 6.545f, 2.577f, 5.976f, 2.7f)
                curveTo(5.225f, 2.861f, 4.596f, 3.373f, 4.285f, 4.077f)
                curveTo(4.051f, 4.609f, 4.121f, 5.201f, 4.228f, 5.72f)
                curveTo(4.339f, 6.259f, 4.545f, 6.944f, 4.796f, 7.78f)
                lineTo(6.063f, 12.0f)
                lineTo(4.796f, 16.22f)
                curveTo(4.545f, 17.056f, 4.339f, 17.741f, 4.228f, 18.28f)
                curveTo(4.121f, 18.799f, 4.051f, 19.391f, 4.285f, 19.923f)
                curveTo(4.596f, 20.626f, 5.225f, 21.138f, 5.976f, 21.3f)
                curveTo(6.545f, 21.422f, 7.11f, 21.233f, 7.597f, 21.024f)
                curveTo(8.102f, 20.806f, 8.732f, 20.465f, 9.499f, 20.05f)
                lineTo(20.359f, 14.18f)
                curveTo(20.752f, 13.967f, 21.101f, 13.779f, 21.365f, 13.604f)
                curveTo(21.629f, 13.428f, 21.946f, 13.179f, 22.124f, 12.792f)
                curveTo(22.355f, 12.289f, 22.355f, 11.711f, 22.124f, 11.208f)
                curveTo(21.946f, 10.821f, 21.629f, 10.572f, 21.365f, 10.396f)
                curveTo(21.101f, 10.22f, 20.752f, 10.032f, 20.359f, 9.82f)
                lineTo(9.499f, 3.949f)
                close()
                moveTo(5.906f, 5.219f)
                curveTo(5.752f, 4.706f, 6.296f, 4.264f, 6.766f, 4.518f)
                lineTo(20.444f, 11.912f)
                curveTo(20.469f, 11.925f, 20.479f, 11.938f, 20.484f, 11.948f)
                curveTo(20.491f, 11.96f, 20.497f, 11.978f, 20.497f, 12.0f)
                curveTo(20.497f, 12.022f, 20.491f, 12.04f, 20.484f, 12.052f)
                curveTo(20.479f, 12.062f, 20.469f, 12.075f, 20.444f, 12.088f)
                lineTo(6.766f, 19.481f)
                curveTo(6.296f, 19.736f, 5.752f, 19.294f, 5.906f, 18.781f)
                lineTo(7.673f, 12.9f)
                horizontalLineTo(13.0f)
                curveTo(13.497f, 12.9f, 13.9f, 12.497f, 13.9f, 12.0f)
                curveTo(13.9f, 11.503f, 13.497f, 11.1f, 13.0f, 11.1f)
                horizontalLineTo(7.673f)
                lineTo(5.906f, 5.219f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Send, contentDescription = "")
    }
}
