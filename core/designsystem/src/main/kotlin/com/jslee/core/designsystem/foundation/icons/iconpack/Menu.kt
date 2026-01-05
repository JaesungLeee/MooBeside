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

public val MooBesideIconPack.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.85f)
                curveTo(3.503f, 4.85f, 3.1f, 5.253f, 3.1f, 5.75f)
                curveTo(3.1f, 6.247f, 3.503f, 6.65f, 4.0f, 6.65f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 6.65f, 20.9f, 6.247f, 20.9f, 5.75f)
                curveTo(20.9f, 5.253f, 20.497f, 4.85f, 20.0f, 4.85f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1f, 12.0f)
                curveTo(3.1f, 11.503f, 3.503f, 11.1f, 4.0f, 11.1f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 11.1f, 20.9f, 11.503f, 20.9f, 12.0f)
                curveTo(20.9f, 12.497f, 20.497f, 12.9f, 20.0f, 12.9f)
                horizontalLineTo(4.0f)
                curveTo(3.503f, 12.9f, 3.1f, 12.497f, 3.1f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1f, 18.25f)
                curveTo(3.1f, 17.753f, 3.503f, 17.35f, 4.0f, 17.35f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 17.35f, 20.9f, 17.753f, 20.9f, 18.25f)
                curveTo(20.9f, 18.747f, 20.497f, 19.149f, 20.0f, 19.149f)
                horizontalLineTo(4.0f)
                curveTo(3.503f, 19.149f, 3.1f, 18.747f, 3.1f, 18.25f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Menu, contentDescription = "")
    }
}
