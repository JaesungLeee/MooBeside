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

public val MooBesideIconPack.Logoapple: ImageVector
    get() {
        if (_logoapple != null) {
            return _logoapple!!
        }
        _logoapple = Builder(name = "Logoapple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.956f, 21.948f)
                curveTo(10.236f, 21.948f, 10.798f, 21.06f, 12.393f, 21.06f)
                curveTo(13.989f, 21.06f, 14.371f, 21.914f, 15.786f, 21.914f)
                curveTo(17.202f, 21.914f, 18.112f, 20.588f, 18.999f, 19.285f)
                curveTo(19.988f, 17.791f, 20.392f, 16.33f, 20.426f, 16.263f)
                curveTo(20.336f, 16.241f, 17.662f, 15.106f, 17.662f, 11.949f)
                curveTo(17.662f, 9.208f, 19.774f, 7.972f, 19.887f, 7.882f)
                curveTo(18.494f, 5.815f, 16.37f, 5.77f, 15.797f, 5.77f)
                curveTo(14.236f, 5.77f, 12.955f, 6.747f, 12.146f, 6.747f)
                curveTo(11.281f, 6.747f, 10.135f, 5.826f, 8.776f, 5.826f)
                curveTo(6.192f, 5.826f, 3.574f, 8.028f, 3.574f, 12.174f)
                curveTo(3.574f, 14.746f, 4.552f, 17.476f, 5.742f, 19.24f)
                curveTo(6.765f, 20.734f, 7.664f, 21.959f, 8.956f, 21.959f)
                verticalLineTo(21.948f)
                close()
                moveTo(12.247f, 5.523f)
                curveTo(13.18f, 5.523f, 14.359f, 4.871f, 15.056f, 4.006f)
                curveTo(15.685f, 3.22f, 16.146f, 2.119f, 16.146f, 1.018f)
                curveTo(16.146f, 0.872f, 16.134f, 0.714f, 16.101f, 0.602f)
                curveTo(15.056f, 0.647f, 13.809f, 1.321f, 13.056f, 2.231f)
                curveTo(12.461f, 2.928f, 11.922f, 4.006f, 11.922f, 5.118f)
                curveTo(11.922f, 5.276f, 11.944f, 5.444f, 11.966f, 5.5f)
                curveTo(12.034f, 5.512f, 12.135f, 5.523f, 12.247f, 5.523f)
                close()
            }
        }
        .build()
        return _logoapple!!
    }

private var _logoapple: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Logoapple, contentDescription = "")
    }
}
