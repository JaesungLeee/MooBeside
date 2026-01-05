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

public val MooBesideIconPack.Textvariable: ImageVector
    get() {
        if (_textvariable != null) {
            return _textvariable!!
        }
        _textvariable = Builder(name = "Textvariable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.078f, 10.573f)
                curveTo(3.477f, 10.86f, 2.903f, 11.135f, 2.903f, 12.001f)
                curveTo(2.903f, 12.867f, 3.477f, 13.141f, 4.078f, 13.429f)
                curveTo(4.682f, 13.717f, 5.0f, 14.299f, 5.0f, 15.235f)
                verticalLineTo(17.757f)
                curveTo(5.0f, 20.07f, 5.8f, 21.5f, 8.1f, 21.5f)
                curveTo(8.6f, 21.5f, 9.0f, 21.098f, 9.0f, 20.601f)
                curveTo(9.0f, 20.104f, 8.6f, 19.7f, 8.103f, 19.7f)
                curveTo(7.1f, 19.7f, 6.8f, 18.891f, 6.8f, 17.799f)
                verticalLineTo(15.342f)
                curveTo(6.8f, 13.32f, 6.034f, 12.171f, 4.8f, 12.171f)
                verticalLineTo(11.831f)
                curveTo(6.034f, 11.831f, 6.8f, 10.682f, 6.8f, 8.66f)
                verticalLineTo(6.203f)
                curveTo(6.8f, 5.11f, 7.1f, 4.3f, 8.104f, 4.3f)
                curveTo(8.6f, 4.3f, 9.0f, 3.897f, 9.0f, 3.4f)
                curveTo(9.0f, 2.903f, 8.6f, 2.5f, 8.1f, 2.5f)
                curveTo(5.8f, 2.5f, 5.0f, 3.932f, 5.0f, 6.245f)
                verticalLineTo(8.767f)
                curveTo(5.0f, 9.703f, 4.682f, 10.285f, 4.078f, 10.573f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.925f, 10.573f)
                curveTo(20.526f, 10.86f, 21.1f, 11.135f, 21.1f, 12.001f)
                curveTo(21.1f, 12.867f, 20.526f, 13.141f, 19.925f, 13.429f)
                curveTo(19.321f, 13.717f, 19.003f, 14.299f, 19.003f, 15.235f)
                verticalLineTo(17.757f)
                curveTo(19.003f, 20.07f, 18.203f, 21.5f, 15.903f, 21.5f)
                curveTo(15.403f, 21.5f, 15.003f, 21.098f, 15.003f, 20.601f)
                curveTo(15.003f, 20.104f, 15.403f, 19.7f, 15.9f, 19.7f)
                curveTo(16.903f, 19.7f, 17.203f, 18.891f, 17.203f, 17.799f)
                verticalLineTo(15.342f)
                curveTo(17.203f, 13.32f, 17.969f, 12.171f, 19.203f, 12.171f)
                verticalLineTo(11.831f)
                curveTo(17.969f, 11.831f, 17.203f, 10.682f, 17.203f, 8.66f)
                verticalLineTo(6.203f)
                curveTo(17.203f, 5.11f, 16.903f, 4.3f, 15.899f, 4.3f)
                curveTo(15.403f, 4.3f, 15.003f, 3.897f, 15.003f, 3.4f)
                curveTo(15.003f, 2.903f, 15.403f, 2.5f, 15.903f, 2.5f)
                curveTo(18.203f, 2.5f, 19.003f, 3.932f, 19.003f, 6.245f)
                verticalLineTo(8.767f)
                curveTo(19.003f, 9.703f, 19.321f, 10.285f, 19.925f, 10.573f)
                close()
            }
        }
        .build()
        return _textvariable!!
    }

private var _textvariable: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Textvariable, contentDescription = "")
    }
}
