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

public val MooBesideIconPack.Likefill: ImageVector
    get() {
        if (_likefill != null) {
            return _likefill!!
        }
        _likefill = Builder(name = "Likefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.786f, 3.834f)
                curveTo(10.156f, 2.936f, 11.031f, 2.35f, 12.003f, 2.35f)
                curveTo(13.327f, 2.35f, 14.4f, 3.423f, 14.4f, 4.747f)
                verticalLineTo(9.1f)
                lineTo(17.603f, 9.1f)
                curveTo(18.22f, 9.1f, 18.741f, 9.1f, 19.163f, 9.136f)
                curveTo(19.602f, 9.174f, 20.031f, 9.258f, 20.426f, 9.485f)
                curveTo(21.014f, 9.822f, 21.466f, 10.356f, 21.701f, 10.992f)
                curveTo(21.86f, 11.419f, 21.871f, 11.856f, 21.836f, 12.295f)
                curveTo(21.802f, 12.717f, 21.716f, 13.231f, 21.614f, 13.84f)
                lineTo(20.83f, 18.51f)
                curveTo(20.755f, 18.957f, 20.691f, 19.341f, 20.613f, 19.656f)
                curveTo(20.531f, 19.99f, 20.42f, 20.309f, 20.221f, 20.607f)
                curveTo(19.918f, 21.062f, 19.493f, 21.422f, 18.994f, 21.646f)
                curveTo(18.666f, 21.793f, 18.333f, 21.849f, 17.991f, 21.875f)
                curveTo(17.668f, 21.9f, 17.278f, 21.9f, 16.824f, 21.9f)
                horizontalLineTo(6.9f)
                verticalLineTo(10.843f)
                lineTo(9.786f, 3.834f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1f, 10.85f)
                lineTo(3.778f, 10.85f)
                curveTo(3.658f, 10.85f, 3.519f, 10.849f, 3.398f, 10.859f)
                curveTo(3.259f, 10.871f, 3.066f, 10.899f, 2.864f, 11.002f)
                curveTo(2.601f, 11.136f, 2.387f, 11.351f, 2.253f, 11.614f)
                curveTo(2.15f, 11.816f, 2.121f, 12.009f, 2.11f, 12.148f)
                curveTo(2.1f, 12.269f, 2.1f, 12.407f, 2.1f, 12.528f)
                verticalLineTo(20.222f)
                curveTo(2.1f, 20.342f, 2.1f, 20.48f, 2.11f, 20.601f)
                curveTo(2.121f, 20.74f, 2.15f, 20.934f, 2.253f, 21.135f)
                curveTo(2.387f, 21.399f, 2.601f, 21.613f, 2.864f, 21.747f)
                curveTo(3.066f, 21.85f, 3.259f, 21.878f, 3.398f, 21.89f)
                curveTo(3.519f, 21.9f, 3.658f, 21.9f, 3.778f, 21.9f)
                lineTo(5.1f, 21.9f)
                verticalLineTo(10.85f)
                close()
            }
        }
        .build()
        return _likefill!!
    }

private var _likefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Likefill, contentDescription = "")
    }
}
