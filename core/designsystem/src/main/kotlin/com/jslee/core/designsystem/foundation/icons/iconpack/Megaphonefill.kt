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

public val MooBesideIconPack.Megaphonefill: ImageVector
    get() {
        if (_megaphonefill != null) {
            return _megaphonefill!!
        }
        _megaphonefill = Builder(name = "Megaphonefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6f, 15.144f)
                curveTo(5.17f, 15.133f, 4.814f, 15.103f, 4.491f, 15.016f)
                curveTo(3.145f, 14.655f, 2.093f, 13.604f, 1.733f, 12.258f)
                curveTo(1.599f, 11.76f, 1.6f, 11.182f, 1.6f, 10.378f)
                verticalLineTo(10.119f)
                curveTo(1.6f, 9.316f, 1.599f, 8.738f, 1.733f, 8.24f)
                curveTo(2.093f, 6.894f, 3.145f, 5.842f, 4.491f, 5.482f)
                curveTo(4.989f, 5.348f, 5.567f, 5.349f, 6.37f, 5.349f)
                lineTo(9.85f, 5.349f)
                lineTo(16.674f, 3.003f)
                curveTo(16.829f, 2.95f, 16.997f, 2.892f, 17.145f, 2.856f)
                curveTo(17.305f, 2.816f, 17.553f, 2.771f, 17.832f, 2.839f)
                curveTo(18.181f, 2.925f, 18.484f, 3.141f, 18.678f, 3.443f)
                curveTo(18.834f, 3.685f, 18.872f, 3.934f, 18.886f, 4.098f)
                curveTo(18.9f, 4.25f, 18.9f, 4.428f, 18.9f, 4.592f)
                verticalLineTo(15.906f)
                curveTo(18.9f, 16.07f, 18.9f, 16.248f, 18.886f, 16.399f)
                curveTo(18.872f, 16.563f, 18.834f, 16.812f, 18.678f, 17.055f)
                curveTo(18.484f, 17.357f, 18.181f, 17.573f, 17.832f, 17.658f)
                curveTo(17.553f, 17.727f, 17.305f, 17.682f, 17.145f, 17.642f)
                curveTo(16.997f, 17.606f, 16.829f, 17.548f, 16.674f, 17.495f)
                lineTo(10.9f, 15.51f)
                verticalLineTo(18.999f)
                curveTo(10.9f, 20.462f, 9.714f, 21.649f, 8.25f, 21.649f)
                curveTo(6.786f, 21.649f, 5.6f, 20.462f, 5.6f, 18.999f)
                verticalLineTo(15.144f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4f, 7.499f)
                curveTo(22.4f, 7.002f, 21.997f, 6.599f, 21.5f, 6.599f)
                curveTo(21.003f, 6.599f, 20.6f, 7.002f, 20.6f, 7.499f)
                verticalLineTo(12.999f)
                curveTo(20.6f, 13.496f, 21.003f, 13.899f, 21.5f, 13.899f)
                curveTo(21.997f, 13.899f, 22.4f, 13.496f, 22.4f, 12.999f)
                verticalLineTo(7.499f)
                close()
            }
        }
        .build()
        return _megaphonefill!!
    }

private var _megaphonefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Megaphonefill, contentDescription = "")
    }
}
