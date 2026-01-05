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

public val MooBesideIconPack.Arrowturndownright: ImageVector
    get() {
        if (_arrowturndownright != null) {
            return _arrowturndownright!!
        }
        _arrowturndownright = Builder(name = "Arrowturndownright", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9f, 3.997f)
                curveTo(5.9f, 3.5f, 5.497f, 3.097f, 5.0f, 3.097f)
                curveTo(4.503f, 3.097f, 4.1f, 3.5f, 4.1f, 3.997f)
                verticalLineTo(5.537f)
                curveTo(4.1f, 6.903f, 4.1f, 7.984f, 4.171f, 8.854f)
                curveTo(4.244f, 9.744f, 4.395f, 10.493f, 4.743f, 11.176f)
                curveTo(5.309f, 12.286f, 6.211f, 13.189f, 7.321f, 13.754f)
                curveTo(8.004f, 14.102f, 8.753f, 14.253f, 9.643f, 14.326f)
                curveTo(10.513f, 14.397f, 11.594f, 14.397f, 12.96f, 14.397f)
                horizontalLineTo(17.329f)
                lineTo(13.863f, 17.862f)
                curveTo(13.512f, 18.214f, 13.512f, 18.784f, 13.863f, 19.135f)
                curveTo(14.215f, 19.486f, 14.785f, 19.486f, 15.136f, 19.135f)
                lineTo(20.136f, 14.135f)
                curveTo(20.488f, 13.783f, 20.488f, 13.214f, 20.136f, 12.862f)
                lineTo(15.136f, 7.862f)
                curveTo(14.785f, 7.511f, 14.215f, 7.511f, 13.863f, 7.862f)
                curveTo(13.512f, 8.214f, 13.512f, 8.783f, 13.863f, 9.135f)
                lineTo(17.326f, 12.597f)
                horizontalLineTo(13.0f)
                curveTo(11.585f, 12.597f, 10.578f, 12.597f, 9.789f, 12.532f)
                curveTo(9.011f, 12.469f, 8.525f, 12.347f, 8.139f, 12.15f)
                curveTo(7.367f, 11.757f, 6.74f, 11.13f, 6.347f, 10.358f)
                curveTo(6.15f, 9.972f, 6.029f, 9.486f, 5.965f, 8.708f)
                curveTo(5.901f, 7.919f, 5.9f, 6.912f, 5.9f, 5.497f)
                verticalLineTo(3.997f)
                close()
            }
        }
        .build()
        return _arrowturndownright!!
    }

private var _arrowturndownright: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowturndownright, contentDescription = "")
    }
}
