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

public val MooBesideIconPack.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.774f, 18.464f)
                curveTo(8.141f, 20.065f, 9.818f, 20.829f, 11.998f, 20.829f)
                curveTo(15.521f, 20.829f, 17.869f, 18.809f, 17.869f, 15.757f)
                curveTo(17.869f, 14.611f, 17.546f, 13.675f, 16.853f, 12.9f)
                horizontalLineTo(20.5f)
                curveTo(20.997f, 12.9f, 21.4f, 12.497f, 21.4f, 12.0f)
                curveTo(21.4f, 11.503f, 20.997f, 11.1f, 20.5f, 11.1f)
                horizontalLineTo(13.868f)
                curveTo(13.507f, 10.97f, 13.118f, 10.848f, 12.703f, 10.732f)
                lineTo(11.857f, 10.497f)
                curveTo(9.627f, 9.886f, 8.852f, 9.229f, 8.852f, 7.937f)
                curveTo(8.852f, 6.27f, 10.12f, 5.143f, 11.998f, 5.143f)
                curveTo(13.241f, 5.143f, 14.349f, 5.642f, 15.223f, 6.59f)
                curveTo(15.598f, 6.998f, 16.203f, 7.156f, 16.682f, 6.878f)
                curveTo(17.19f, 6.584f, 17.359f, 5.921f, 16.977f, 5.476f)
                curveTo(15.722f, 4.01f, 13.944f, 3.17f, 11.998f, 3.17f)
                curveTo(8.946f, 3.17f, 6.738f, 5.19f, 6.738f, 7.937f)
                curveTo(6.738f, 9.268f, 7.25f, 10.3f, 8.346f, 11.1f)
                horizontalLineTo(3.5f)
                curveTo(3.003f, 11.1f, 2.6f, 11.503f, 2.6f, 12.0f)
                curveTo(2.6f, 12.497f, 3.003f, 12.9f, 3.5f, 12.9f)
                horizontalLineTo(13.005f)
                curveTo(15.022f, 13.586f, 15.755f, 14.387f, 15.755f, 15.757f)
                curveTo(15.755f, 17.682f, 14.323f, 18.856f, 11.998f, 18.856f)
                curveTo(10.541f, 18.856f, 9.47f, 18.39f, 8.478f, 17.285f)
                curveTo(8.108f, 16.873f, 7.498f, 16.742f, 7.03f, 17.039f)
                curveTo(6.536f, 17.353f, 6.394f, 18.018f, 6.774f, 18.464f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Strikethrough, contentDescription = "")
    }
}
