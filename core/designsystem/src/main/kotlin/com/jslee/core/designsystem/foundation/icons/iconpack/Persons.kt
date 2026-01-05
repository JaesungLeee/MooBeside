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

public val MooBesideIconPack.Persons: ImageVector
    get() {
        if (_persons != null) {
            return _persons!!
        }
        _persons = Builder(name = "Persons", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.1f, 8.0f)
                curveTo(11.1f, 5.846f, 12.846f, 4.1f, 15.0f, 4.1f)
                curveTo(17.154f, 4.1f, 18.9f, 5.846f, 18.9f, 8.0f)
                curveTo(18.9f, 10.153f, 17.154f, 11.9f, 15.0f, 11.9f)
                curveTo(12.846f, 11.9f, 11.1f, 10.153f, 11.1f, 8.0f)
                close()
                moveTo(15.0f, 5.9f)
                curveTo(13.84f, 5.9f, 12.9f, 6.84f, 12.9f, 8.0f)
                curveTo(12.9f, 9.159f, 13.84f, 10.1f, 15.0f, 10.1f)
                curveTo(16.16f, 10.1f, 17.1f, 9.159f, 17.1f, 8.0f)
                curveTo(17.1f, 6.84f, 16.16f, 5.9f, 15.0f, 5.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.578f, 14.447f)
                curveTo(11.021f, 13.559f, 12.946f, 13.099f, 15.0f, 13.099f)
                curveTo(17.054f, 13.099f, 18.979f, 13.559f, 20.421f, 14.447f)
                curveTo(21.878f, 15.344f, 22.9f, 16.726f, 22.9f, 18.499f)
                lineTo(22.9f, 18.826f)
                curveTo(22.9f, 19.013f, 22.9f, 19.203f, 22.887f, 19.365f)
                curveTo(22.872f, 19.546f, 22.836f, 19.77f, 22.72f, 19.998f)
                curveTo(22.562f, 20.309f, 22.31f, 20.561f, 21.999f, 20.719f)
                curveTo(21.771f, 20.836f, 21.547f, 20.871f, 21.366f, 20.886f)
                curveTo(21.204f, 20.899f, 21.014f, 20.899f, 20.827f, 20.899f)
                lineTo(9.173f, 20.9f)
                curveTo(8.987f, 20.9f, 8.797f, 20.9f, 8.634f, 20.887f)
                curveTo(8.454f, 20.872f, 8.229f, 20.836f, 8.001f, 20.72f)
                curveTo(7.691f, 20.562f, 7.438f, 20.309f, 7.28f, 19.999f)
                curveTo(7.164f, 19.771f, 7.128f, 19.547f, 7.113f, 19.366f)
                curveTo(7.1f, 19.203f, 7.1f, 19.013f, 7.1f, 18.827f)
                lineTo(7.1f, 18.499f)
                curveTo(7.1f, 16.726f, 8.122f, 15.344f, 9.578f, 14.447f)
                close()
                moveTo(10.522f, 15.98f)
                curveTo(9.445f, 16.643f, 8.9f, 17.511f, 8.9f, 18.499f)
                lineTo(8.902f, 19.098f)
                lineTo(21.098f, 19.097f)
                lineTo(21.1f, 18.499f)
                curveTo(21.1f, 17.511f, 20.555f, 16.643f, 19.478f, 15.98f)
                curveTo(18.388f, 15.309f, 16.812f, 14.899f, 15.0f, 14.899f)
                curveTo(13.188f, 14.899f, 11.613f, 15.309f, 10.522f, 15.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.975f, 15.631f)
                curveTo(3.993f, 14.97f, 5.308f, 14.645f, 6.69f, 14.604f)
                curveTo(6.236f, 15.166f, 5.866f, 15.806f, 5.623f, 16.519f)
                curveTo(4.959f, 16.643f, 4.392f, 16.857f, 3.954f, 17.141f)
                curveTo(3.272f, 17.584f, 2.9f, 18.19f, 2.9f, 18.998f)
                lineTo(2.9f, 19.099f)
                lineTo(5.301f, 19.099f)
                curveTo(5.303f, 19.229f, 5.308f, 19.374f, 5.319f, 19.512f)
                curveTo(5.343f, 19.804f, 5.409f, 20.292f, 5.676f, 20.816f)
                curveTo(5.69f, 20.844f, 5.705f, 20.871f, 5.719f, 20.899f)
                lineTo(3.001f, 20.899f)
                lineTo(2.949f, 20.899f)
                curveTo(2.777f, 20.9f, 2.539f, 20.901f, 2.322f, 20.842f)
                curveTo(1.753f, 20.69f, 1.309f, 20.246f, 1.156f, 19.677f)
                curveTo(1.098f, 19.46f, 1.099f, 19.222f, 1.1f, 19.05f)
                lineTo(1.1f, 18.998f)
                curveTo(1.1f, 17.505f, 1.847f, 16.362f, 2.975f, 15.631f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 7.1f)
                curveTo(4.898f, 7.1f, 3.6f, 8.398f, 3.6f, 10.0f)
                curveTo(3.6f, 11.601f, 4.898f, 12.899f, 6.5f, 12.899f)
                curveTo(8.102f, 12.899f, 9.4f, 11.601f, 9.4f, 10.0f)
                curveTo(9.4f, 8.398f, 8.102f, 7.1f, 6.5f, 7.1f)
                close()
                moveTo(5.4f, 10.0f)
                curveTo(5.4f, 9.392f, 5.892f, 8.9f, 6.5f, 8.9f)
                curveTo(7.107f, 8.9f, 7.6f, 9.392f, 7.6f, 10.0f)
                curveTo(7.6f, 10.607f, 7.107f, 11.099f, 6.5f, 11.099f)
                curveTo(5.892f, 11.099f, 5.4f, 10.607f, 5.4f, 10.0f)
                close()
            }
        }
        .build()
        return _persons!!
    }

private var _persons: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Persons, contentDescription = "")
    }
}
