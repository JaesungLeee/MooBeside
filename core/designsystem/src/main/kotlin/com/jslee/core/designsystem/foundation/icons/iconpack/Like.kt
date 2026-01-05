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

public val MooBesideIconPack.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.003f, 2.35f)
                curveTo(11.031f, 2.35f, 10.156f, 2.936f, 9.786f, 3.834f)
                lineTo(6.897f, 10.85f)
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
                lineTo(16.824f, 21.9f)
                curveTo(17.278f, 21.9f, 17.668f, 21.9f, 17.991f, 21.875f)
                curveTo(18.333f, 21.849f, 18.666f, 21.793f, 18.994f, 21.646f)
                curveTo(19.493f, 21.422f, 19.918f, 21.062f, 20.221f, 20.607f)
                curveTo(20.42f, 20.309f, 20.531f, 19.99f, 20.613f, 19.656f)
                curveTo(20.691f, 19.341f, 20.755f, 18.957f, 20.83f, 18.51f)
                lineTo(21.614f, 13.84f)
                curveTo(21.716f, 13.231f, 21.802f, 12.717f, 21.836f, 12.295f)
                curveTo(21.871f, 11.856f, 21.86f, 11.419f, 21.701f, 10.992f)
                curveTo(21.466f, 10.356f, 21.014f, 9.822f, 20.426f, 9.485f)
                curveTo(20.031f, 9.258f, 19.602f, 9.174f, 19.163f, 9.136f)
                curveTo(18.741f, 9.1f, 18.22f, 9.1f, 17.603f, 9.1f)
                lineTo(14.4f, 9.1f)
                verticalLineTo(4.747f)
                curveTo(14.4f, 3.423f, 13.327f, 2.35f, 12.003f, 2.35f)
                close()
                moveTo(11.45f, 4.52f)
                curveTo(11.542f, 4.296f, 11.761f, 4.15f, 12.003f, 4.15f)
                curveTo(12.333f, 4.15f, 12.6f, 4.417f, 12.6f, 4.747f)
                verticalLineTo(10.0f)
                curveTo(12.6f, 10.497f, 13.003f, 10.9f, 13.5f, 10.9f)
                horizontalLineTo(18.037f)
                curveTo(18.479f, 10.9f, 18.773f, 10.9f, 18.998f, 10.913f)
                curveTo(19.219f, 10.926f, 19.31f, 10.949f, 19.357f, 10.965f)
                curveTo(19.724f, 11.099f, 19.994f, 11.417f, 20.064f, 11.802f)
                curveTo(20.073f, 11.85f, 20.08f, 11.944f, 20.056f, 12.164f)
                curveTo(20.032f, 12.388f, 19.984f, 12.677f, 19.91f, 13.114f)
                lineTo(19.004f, 18.514f)
                curveTo(18.889f, 19.203f, 18.853f, 19.363f, 18.799f, 19.475f)
                curveTo(18.664f, 19.758f, 18.414f, 19.97f, 18.112f, 20.057f)
                curveTo(17.993f, 20.091f, 17.83f, 20.1f, 17.131f, 20.1f)
                horizontalLineTo(8.4f)
                verticalLineTo(11.928f)
                lineTo(11.45f, 4.52f)
                close()
                moveTo(6.6f, 12.65f)
                horizontalLineTo(3.9f)
                verticalLineTo(20.1f)
                horizontalLineTo(6.6f)
                verticalLineTo(12.65f)
                close()
            }
        }
        .build()
        return _like!!
    }

private var _like: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Like, contentDescription = "")
    }
}
