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

public val MooBesideIconPack.Arrowturndownleft: ImageVector
    get() {
        if (_arrowturndownleft != null) {
            return _arrowturndownleft!!
        }
        _arrowturndownleft = Builder(name = "Arrowturndownleft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 3.997f)
                curveTo(19.9f, 3.5f, 19.497f, 3.097f, 19.0f, 3.097f)
                curveTo(18.503f, 3.097f, 18.1f, 3.5f, 18.1f, 3.997f)
                verticalLineTo(5.497f)
                curveTo(18.1f, 6.912f, 18.099f, 7.919f, 18.035f, 8.708f)
                curveTo(17.971f, 9.486f, 17.85f, 9.972f, 17.653f, 10.358f)
                curveTo(17.26f, 11.13f, 16.633f, 11.757f, 15.861f, 12.15f)
                curveTo(15.474f, 12.347f, 14.989f, 12.469f, 14.211f, 12.532f)
                curveTo(13.422f, 12.597f, 12.415f, 12.597f, 11.0f, 12.597f)
                horizontalLineTo(6.674f)
                lineTo(10.136f, 9.135f)
                curveTo(10.488f, 8.784f, 10.488f, 8.214f, 10.136f, 7.862f)
                curveTo(9.785f, 7.511f, 9.215f, 7.511f, 8.863f, 7.862f)
                lineTo(3.863f, 12.862f)
                curveTo(3.512f, 13.214f, 3.512f, 13.784f, 3.863f, 14.135f)
                lineTo(8.863f, 19.135f)
                curveTo(9.215f, 19.486f, 9.785f, 19.486f, 10.136f, 19.135f)
                curveTo(10.488f, 18.784f, 10.488f, 18.214f, 10.136f, 17.862f)
                lineTo(6.671f, 14.397f)
                horizontalLineTo(11.04f)
                curveTo(12.406f, 14.397f, 13.487f, 14.397f, 14.357f, 14.326f)
                curveTo(15.247f, 14.253f, 15.996f, 14.102f, 16.678f, 13.754f)
                curveTo(17.789f, 13.189f, 18.691f, 12.286f, 19.257f, 11.176f)
                curveTo(19.605f, 10.493f, 19.756f, 9.744f, 19.829f, 8.854f)
                curveTo(19.9f, 7.984f, 19.9f, 6.903f, 19.9f, 5.537f)
                verticalLineTo(3.997f)
                close()
            }
        }
        .build()
        return _arrowturndownleft!!
    }

private var _arrowturndownleft: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowturndownleft, contentDescription = "")
    }
}
