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

public val MooBesideIconPack.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.6f)
                curveTo(12.257f, 2.6f, 12.49f, 2.708f, 12.654f, 2.882f)
                lineTo(17.136f, 7.364f)
                curveTo(17.488f, 7.716f, 17.488f, 8.286f, 17.136f, 8.637f)
                curveTo(16.785f, 8.988f, 16.215f, 8.988f, 15.863f, 8.637f)
                lineTo(12.9f, 5.673f)
                verticalLineTo(15.0f)
                curveTo(12.9f, 15.497f, 12.497f, 15.9f, 12.0f, 15.9f)
                curveTo(11.503f, 15.9f, 11.1f, 15.497f, 11.1f, 15.0f)
                verticalLineTo(5.673f)
                lineTo(8.136f, 8.637f)
                curveTo(7.785f, 8.988f, 7.215f, 8.988f, 6.864f, 8.637f)
                curveTo(6.512f, 8.286f, 6.512f, 7.716f, 6.864f, 7.364f)
                lineTo(11.346f, 2.882f)
                curveTo(11.51f, 2.708f, 11.742f, 2.6f, 12.0f, 2.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.15f, 14.9f)
                curveTo(21.15f, 14.403f, 20.747f, 14.0f, 20.25f, 14.0f)
                curveTo(19.753f, 14.0f, 19.35f, 14.403f, 19.35f, 14.9f)
                verticalLineTo(17.45f)
                curveTo(19.35f, 18.265f, 19.339f, 18.459f, 19.296f, 18.59f)
                curveTo(19.188f, 18.925f, 18.925f, 19.188f, 18.59f, 19.296f)
                curveTo(18.459f, 19.339f, 18.265f, 19.35f, 17.45f, 19.35f)
                horizontalLineTo(6.55f)
                curveTo(5.736f, 19.35f, 5.542f, 19.339f, 5.41f, 19.296f)
                curveTo(5.075f, 19.188f, 4.813f, 18.925f, 4.704f, 18.59f)
                curveTo(4.661f, 18.459f, 4.65f, 18.265f, 4.65f, 17.45f)
                verticalLineTo(14.9f)
                curveTo(4.65f, 14.403f, 4.247f, 14.0f, 3.75f, 14.0f)
                curveTo(3.253f, 14.0f, 2.85f, 14.403f, 2.85f, 14.9f)
                verticalLineTo(17.086f)
                curveTo(2.85f, 17.615f, 2.85f, 18.067f, 2.88f, 18.437f)
                curveTo(2.912f, 18.826f, 2.982f, 19.205f, 3.166f, 19.567f)
                curveTo(3.444f, 20.112f, 3.888f, 20.556f, 4.434f, 20.834f)
                curveTo(4.796f, 21.019f, 5.174f, 21.088f, 5.563f, 21.12f)
                curveTo(5.934f, 21.15f, 6.385f, 21.15f, 6.915f, 21.15f)
                horizontalLineTo(17.086f)
                curveTo(17.615f, 21.15f, 18.067f, 21.15f, 18.437f, 21.12f)
                curveTo(18.826f, 21.088f, 19.205f, 21.019f, 19.567f, 20.834f)
                curveTo(20.112f, 20.556f, 20.556f, 20.112f, 20.834f, 19.567f)
                curveTo(21.018f, 19.205f, 21.088f, 18.826f, 21.12f, 18.437f)
                curveTo(21.15f, 18.067f, 21.15f, 17.616f, 21.15f, 17.086f)
                verticalLineTo(14.9f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Upload, contentDescription = "")
    }
}
