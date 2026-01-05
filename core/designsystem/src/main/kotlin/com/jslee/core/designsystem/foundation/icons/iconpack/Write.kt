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

public val MooBesideIconPack.Write: ImageVector
    get() {
        if (_write != null) {
            return _write!!
        }
        _write = Builder(name = "Write", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.386f, 2.614f)
                curveTo(20.345f, 1.572f, 18.656f, 1.572f, 17.614f, 2.614f)
                lineTo(8.364f, 11.864f)
                curveTo(8.195f, 12.033f, 8.1f, 12.262f, 8.1f, 12.5f)
                verticalLineTo(15.0f)
                curveTo(8.1f, 15.497f, 8.503f, 15.9f, 9.0f, 15.9f)
                horizontalLineTo(11.5f)
                curveTo(11.739f, 15.9f, 11.968f, 15.805f, 12.137f, 15.637f)
                lineTo(21.386f, 6.387f)
                curveTo(22.428f, 5.345f, 22.428f, 3.656f, 21.386f, 2.614f)
                close()
                moveTo(18.886f, 3.887f)
                curveTo(19.225f, 3.548f, 19.775f, 3.548f, 20.114f, 3.887f)
                curveTo(20.452f, 4.226f, 20.452f, 4.775f, 20.114f, 5.114f)
                lineTo(11.127f, 14.1f)
                horizontalLineTo(9.9f)
                verticalLineTo(12.873f)
                lineTo(18.886f, 3.887f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.103f, 3.103f)
                curveTo(12.598f, 3.103f, 13.0f, 3.505f, 13.0f, 4.0f)
                curveTo(13.0f, 4.496f, 12.598f, 4.898f, 12.103f, 4.898f)
                horizontalLineTo(6.8f)
                curveTo(5.985f, 4.898f, 5.792f, 4.909f, 5.66f, 4.952f)
                curveTo(5.325f, 5.06f, 5.063f, 5.323f, 4.954f, 5.658f)
                curveTo(4.911f, 5.789f, 4.9f, 5.983f, 4.9f, 6.798f)
                verticalLineTo(17.198f)
                curveTo(4.9f, 18.012f, 4.911f, 18.206f, 4.954f, 18.338f)
                curveTo(5.063f, 18.673f, 5.325f, 18.935f, 5.66f, 19.044f)
                curveTo(5.792f, 19.087f, 5.985f, 19.098f, 6.8f, 19.098f)
                horizontalLineTo(17.2f)
                curveTo(18.015f, 19.098f, 18.208f, 19.087f, 18.34f, 19.044f)
                curveTo(18.675f, 18.935f, 18.937f, 18.673f, 19.046f, 18.338f)
                curveTo(19.089f, 18.206f, 19.1f, 18.012f, 19.1f, 17.198f)
                verticalLineTo(11.901f)
                curveTo(19.1f, 11.404f, 19.503f, 11.001f, 20.0f, 11.001f)
                curveTo(20.497f, 11.001f, 20.9f, 11.404f, 20.9f, 11.901f)
                verticalLineTo(16.839f)
                curveTo(20.9f, 17.368f, 20.9f, 17.82f, 20.87f, 18.19f)
                curveTo(20.838f, 18.579f, 20.768f, 18.958f, 20.584f, 19.32f)
                curveTo(20.306f, 19.865f, 19.862f, 20.309f, 19.316f, 20.587f)
                curveTo(18.955f, 20.771f, 18.576f, 20.841f, 18.187f, 20.873f)
                curveTo(17.816f, 20.903f, 17.365f, 20.903f, 16.835f, 20.903f)
                horizontalLineTo(7.165f)
                curveTo(6.635f, 20.903f, 6.183f, 20.903f, 5.813f, 20.873f)
                curveTo(5.424f, 20.841f, 5.045f, 20.771f, 4.683f, 20.587f)
                curveTo(4.138f, 20.309f, 3.694f, 19.865f, 3.416f, 19.32f)
                curveTo(3.232f, 18.958f, 3.162f, 18.579f, 3.13f, 18.19f)
                curveTo(3.1f, 17.82f, 3.1f, 17.368f, 3.1f, 16.839f)
                verticalLineTo(7.168f)
                curveTo(3.1f, 6.638f, 3.1f, 6.187f, 3.13f, 5.816f)
                curveTo(3.162f, 5.427f, 3.232f, 5.049f, 3.416f, 4.687f)
                curveTo(3.694f, 4.141f, 4.138f, 3.697f, 4.683f, 3.419f)
                curveTo(5.045f, 3.235f, 5.424f, 3.165f, 5.813f, 3.133f)
                curveTo(6.183f, 3.103f, 6.635f, 3.103f, 7.164f, 3.103f)
                horizontalLineTo(12.103f)
                close()
            }
        }
        .build()
        return _write!!
    }

private var _write: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Write, contentDescription = "")
    }
}
