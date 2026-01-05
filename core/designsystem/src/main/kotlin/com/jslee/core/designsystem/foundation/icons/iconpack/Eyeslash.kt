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

public val MooBesideIconPack.Eyeslash: ImageVector
    get() {
        if (_eyeslash != null) {
            return _eyeslash!!
        }
        _eyeslash = Builder(name = "Eyeslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.819f, 12.795f)
                curveTo(15.872f, 12.539f, 15.9f, 12.273f, 15.9f, 12.0f)
                curveTo(15.9f, 9.846f, 14.154f, 8.1f, 12.0f, 8.1f)
                curveTo(11.727f, 8.1f, 11.462f, 8.128f, 11.205f, 8.181f)
                lineTo(15.819f, 12.795f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.364f, 4.113f)
                curveTo(3.715f, 3.762f, 4.285f, 3.762f, 4.637f, 4.113f)
                lineTo(6.572f, 6.049f)
                curveTo(8.172f, 5.127f, 10.027f, 4.6f, 12.006f, 4.6f)
                curveTo(16.562f, 4.6f, 20.465f, 7.395f, 22.094f, 11.365f)
                curveTo(22.261f, 11.771f, 22.261f, 12.228f, 22.094f, 12.634f)
                curveTo(21.269f, 14.646f, 19.859f, 16.356f, 18.077f, 17.553f)
                lineTo(19.636f, 19.113f)
                curveTo(19.988f, 19.465f, 19.988f, 20.035f, 19.636f, 20.386f)
                curveTo(19.285f, 20.737f, 18.715f, 20.737f, 18.364f, 20.386f)
                lineTo(16.438f, 18.46f)
                curveTo(15.084f, 19.064f, 13.584f, 19.399f, 12.006f, 19.399f)
                curveTo(7.45f, 19.399f, 3.546f, 16.604f, 1.918f, 12.634f)
                curveTo(1.751f, 12.228f, 1.751f, 11.771f, 1.918f, 11.365f)
                curveTo(2.604f, 9.691f, 3.695f, 8.226f, 5.069f, 7.092f)
                lineTo(3.364f, 5.386f)
                curveTo(3.012f, 5.035f, 3.012f, 4.465f, 3.364f, 4.113f)
                close()
                moveTo(6.349f, 8.371f)
                curveTo(5.152f, 9.322f, 4.2f, 10.568f, 3.603f, 12.0f)
                curveTo(4.975f, 15.288f, 8.22f, 17.599f, 12.006f, 17.599f)
                curveTo(13.075f, 17.599f, 14.101f, 17.415f, 15.054f, 17.076f)
                lineTo(13.555f, 15.578f)
                curveTo(13.079f, 15.785f, 12.553f, 15.9f, 12.0f, 15.9f)
                curveTo(9.846f, 15.9f, 8.1f, 14.154f, 8.1f, 12.0f)
                curveTo(8.1f, 11.447f, 8.215f, 10.921f, 8.423f, 10.445f)
                lineTo(6.349f, 8.371f)
                close()
                moveTo(16.774f, 16.251f)
                curveTo(18.39f, 15.255f, 19.67f, 13.769f, 20.408f, 12.0f)
                curveTo(19.037f, 8.711f, 15.791f, 6.4f, 12.006f, 6.4f)
                curveTo(10.528f, 6.4f, 9.133f, 6.752f, 7.9f, 7.377f)
                lineTo(16.774f, 16.251f)
                close()
                moveTo(9.901f, 11.924f)
                lineTo(12.076f, 14.099f)
                curveTo(12.051f, 14.1f, 12.026f, 14.1f, 12.0f, 14.1f)
                curveTo(10.84f, 14.1f, 9.9f, 13.16f, 9.9f, 12.0f)
                curveTo(9.9f, 11.974f, 9.901f, 11.949f, 9.901f, 11.924f)
                close()
            }
        }
        .build()
        return _eyeslash!!
    }

private var _eyeslash: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Eyeslash, contentDescription = "")
    }
}
