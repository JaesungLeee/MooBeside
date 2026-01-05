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

public val MooBesideIconPack.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.82f, 3.1f)
                curveTo(11.571f, 2.766f, 12.429f, 2.766f, 13.179f, 3.1f)
                curveTo(13.703f, 3.333f, 14.08f, 3.76f, 14.409f, 4.225f)
                curveTo(14.734f, 4.686f, 15.092f, 5.306f, 15.528f, 6.061f)
                lineTo(20.639f, 14.913f)
                curveTo(21.075f, 15.668f, 21.433f, 16.288f, 21.669f, 16.801f)
                curveTo(21.907f, 17.317f, 22.088f, 17.858f, 22.029f, 18.428f)
                curveTo(21.943f, 19.245f, 21.514f, 19.988f, 20.849f, 20.471f)
                curveTo(20.386f, 20.808f, 19.827f, 20.921f, 19.26f, 20.973f)
                curveTo(18.698f, 21.025f, 17.982f, 21.025f, 17.111f, 21.025f)
                horizontalLineTo(6.889f)
                curveTo(6.017f, 21.025f, 5.301f, 21.025f, 4.739f, 20.973f)
                curveTo(4.173f, 20.921f, 3.614f, 20.808f, 3.151f, 20.471f)
                curveTo(2.486f, 19.988f, 2.057f, 19.245f, 1.971f, 18.428f)
                curveTo(1.911f, 17.858f, 2.092f, 17.317f, 2.33f, 16.801f)
                curveTo(2.567f, 16.288f, 2.925f, 15.668f, 3.361f, 14.913f)
                lineTo(8.471f, 6.061f)
                curveTo(8.907f, 5.306f, 9.265f, 4.686f, 9.591f, 4.225f)
                curveTo(9.919f, 3.76f, 10.297f, 3.333f, 10.82f, 3.1f)
                close()
                moveTo(12.953f, 5.2f)
                curveTo(12.529f, 4.466f, 11.471f, 4.466f, 11.047f, 5.2f)
                lineTo(3.903f, 17.575f)
                curveTo(3.479f, 18.308f, 4.008f, 19.225f, 4.855f, 19.225f)
                horizontalLineTo(19.145f)
                curveTo(19.991f, 19.225f, 20.521f, 18.308f, 20.097f, 17.575f)
                lineTo(12.953f, 5.2f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Triangle, contentDescription = "")
    }
}
