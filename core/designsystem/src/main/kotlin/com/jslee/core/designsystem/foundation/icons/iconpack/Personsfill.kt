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

public val MooBesideIconPack.Personsfill: ImageVector
    get() {
        if (_personsfill != null) {
            return _personsfill!!
        }
        _personsfill = Builder(name = "Personsfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1f, 8.0f)
                curveTo(11.1f, 5.846f, 12.846f, 4.1f, 15.0f, 4.1f)
                curveTo(17.154f, 4.1f, 18.9f, 5.846f, 18.9f, 8.0f)
                curveTo(18.9f, 10.153f, 17.154f, 11.9f, 15.0f, 11.9f)
                curveTo(12.846f, 11.9f, 11.1f, 10.153f, 11.1f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.599f)
                curveTo(12.946f, 13.599f, 11.021f, 14.059f, 9.578f, 14.947f)
                curveTo(8.122f, 15.844f, 7.1f, 17.226f, 7.1f, 18.999f)
                lineTo(7.1f, 19.05f)
                curveTo(7.099f, 19.223f, 7.098f, 19.461f, 7.157f, 19.678f)
                curveTo(7.309f, 20.247f, 7.753f, 20.691f, 8.321f, 20.843f)
                curveTo(8.539f, 20.902f, 8.777f, 20.901f, 8.95f, 20.9f)
                lineTo(9.001f, 20.9f)
                lineTo(21.0f, 20.899f)
                lineTo(21.051f, 20.899f)
                curveTo(21.224f, 20.9f, 21.461f, 20.901f, 21.677f, 20.843f)
                curveTo(22.246f, 20.69f, 22.691f, 20.246f, 22.844f, 19.676f)
                curveTo(22.902f, 19.46f, 22.901f, 19.223f, 22.9f, 19.05f)
                lineTo(22.9f, 18.999f)
                curveTo(22.9f, 17.226f, 21.878f, 15.844f, 20.421f, 14.947f)
                curveTo(18.978f, 14.059f, 17.054f, 13.599f, 15.0f, 13.599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.974f, 16.131f)
                curveTo(3.993f, 15.47f, 5.308f, 15.145f, 6.69f, 15.104f)
                curveTo(5.849f, 16.144f, 5.3f, 17.45f, 5.3f, 18.999f)
                lineTo(5.3f, 19.022f)
                curveTo(5.297f, 19.146f, 5.288f, 19.66f, 5.418f, 20.146f)
                curveTo(5.49f, 20.411f, 5.591f, 20.663f, 5.719f, 20.899f)
                lineTo(2.501f, 20.899f)
                curveTo(1.727f, 20.899f, 1.1f, 20.272f, 1.1f, 19.498f)
                curveTo(1.1f, 18.005f, 1.847f, 16.862f, 2.974f, 16.131f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 7.1f)
                curveTo(4.898f, 7.1f, 3.6f, 8.398f, 3.6f, 10.0f)
                curveTo(3.6f, 11.601f, 4.898f, 12.899f, 6.5f, 12.899f)
                curveTo(8.102f, 12.899f, 9.4f, 11.601f, 9.4f, 10.0f)
                curveTo(9.4f, 8.398f, 8.102f, 7.1f, 6.5f, 7.1f)
                close()
            }
        }
        .build()
        return _personsfill!!
    }

private var _personsfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Personsfill, contentDescription = "")
    }
}
