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

public val MooBesideIconPack.Trianglefill: ImageVector
    get() {
        if (_trianglefill != null) {
            return _trianglefill!!
        }
        _trianglefill = Builder(name = "Trianglefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.179f, 3.1f)
                curveTo(12.429f, 2.766f, 11.571f, 2.766f, 10.82f, 3.1f)
                curveTo(10.297f, 3.333f, 9.919f, 3.76f, 9.591f, 4.225f)
                curveTo(9.265f, 4.686f, 8.907f, 5.306f, 8.471f, 6.061f)
                lineTo(3.361f, 14.913f)
                curveTo(2.925f, 15.668f, 2.567f, 16.288f, 2.33f, 16.801f)
                curveTo(2.092f, 17.317f, 1.911f, 17.858f, 1.971f, 18.428f)
                curveTo(2.057f, 19.245f, 2.486f, 19.988f, 3.151f, 20.471f)
                curveTo(3.614f, 20.808f, 4.173f, 20.921f, 4.739f, 20.973f)
                curveTo(5.301f, 21.025f, 6.017f, 21.025f, 6.889f, 21.025f)
                horizontalLineTo(17.111f)
                curveTo(17.982f, 21.025f, 18.698f, 21.025f, 19.26f, 20.973f)
                curveTo(19.827f, 20.921f, 20.386f, 20.808f, 20.849f, 20.471f)
                curveTo(21.514f, 19.988f, 21.943f, 19.245f, 22.029f, 18.428f)
                curveTo(22.088f, 17.858f, 21.907f, 17.317f, 21.669f, 16.801f)
                curveTo(21.433f, 16.288f, 21.075f, 15.668f, 20.639f, 14.913f)
                lineTo(15.528f, 6.061f)
                curveTo(15.092f, 5.306f, 14.734f, 4.686f, 14.409f, 4.225f)
                curveTo(14.08f, 3.76f, 13.703f, 3.333f, 13.179f, 3.1f)
                close()
            }
        }
        .build()
        return _trianglefill!!
    }

private var _trianglefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Trianglefill, contentDescription = "")
    }
}
