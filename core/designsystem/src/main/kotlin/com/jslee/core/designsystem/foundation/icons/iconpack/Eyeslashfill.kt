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

public val MooBesideIconPack.Eyeslashfill: ImageVector
    get() {
        if (_eyeslashfill != null) {
            return _eyeslashfill!!
        }
        _eyeslashfill = Builder(name = "Eyeslashfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.637f, 4.113f)
                curveTo(4.285f, 3.762f, 3.715f, 3.762f, 3.364f, 4.113f)
                curveTo(3.012f, 4.465f, 3.012f, 5.035f, 3.364f, 5.386f)
                lineTo(5.069f, 7.091f)
                curveTo(3.695f, 8.226f, 2.604f, 9.691f, 1.918f, 11.364f)
                curveTo(1.751f, 11.771f, 1.751f, 12.227f, 1.918f, 12.634f)
                curveTo(3.546f, 16.603f, 7.45f, 19.399f, 12.006f, 19.399f)
                curveTo(13.584f, 19.399f, 15.084f, 19.063f, 16.438f, 18.46f)
                lineTo(18.364f, 20.386f)
                curveTo(18.715f, 20.737f, 19.285f, 20.737f, 19.636f, 20.386f)
                curveTo(19.988f, 20.035f, 19.988f, 19.465f, 19.636f, 19.113f)
                lineTo(4.637f, 4.113f)
                close()
                moveTo(13.555f, 15.578f)
                lineTo(12.076f, 14.099f)
                curveTo(12.051f, 14.099f, 12.026f, 14.1f, 12.0f, 14.1f)
                curveTo(10.84f, 14.1f, 9.9f, 13.16f, 9.9f, 12.0f)
                curveTo(9.9f, 11.974f, 9.9f, 11.949f, 9.901f, 11.924f)
                lineTo(8.422f, 10.445f)
                curveTo(8.215f, 10.921f, 8.1f, 11.447f, 8.1f, 12.0f)
                curveTo(8.1f, 14.154f, 9.846f, 15.9f, 12.0f, 15.9f)
                curveTo(12.553f, 15.9f, 13.079f, 15.785f, 13.555f, 15.578f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.819f, 12.795f)
                lineTo(19.468f, 16.444f)
                curveTo(20.595f, 15.385f, 21.497f, 14.088f, 22.094f, 12.634f)
                curveTo(22.261f, 12.227f, 22.261f, 11.771f, 22.094f, 11.364f)
                curveTo(20.465f, 7.395f, 16.562f, 4.599f, 12.006f, 4.599f)
                curveTo(10.696f, 4.599f, 9.441f, 4.83f, 8.278f, 5.254f)
                lineTo(11.205f, 8.181f)
                curveTo(11.462f, 8.128f, 11.727f, 8.1f, 12.0f, 8.1f)
                curveTo(14.154f, 8.1f, 15.9f, 9.846f, 15.9f, 12.0f)
                curveTo(15.9f, 12.273f, 15.872f, 12.538f, 15.819f, 12.795f)
                close()
            }
        }
        .build()
        return _eyeslashfill!!
    }

private var _eyeslashfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Eyeslashfill, contentDescription = "")
    }
}
