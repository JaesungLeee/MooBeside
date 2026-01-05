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

public val MooBesideIconPack.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = Builder(name = "List", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 7.0f)
                curveTo(4.44f, 7.0f, 5.0f, 6.44f, 5.0f, 5.75f)
                curveTo(5.0f, 5.06f, 4.44f, 4.5f, 3.75f, 4.5f)
                curveTo(3.059f, 4.5f, 2.5f, 5.06f, 2.5f, 5.75f)
                curveTo(2.5f, 6.44f, 3.059f, 7.0f, 3.75f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.35f, 5.75f)
                curveTo(7.35f, 5.253f, 7.753f, 4.85f, 8.25f, 4.85f)
                horizontalLineTo(20.25f)
                curveTo(20.747f, 4.85f, 21.15f, 5.253f, 21.15f, 5.75f)
                curveTo(21.15f, 6.247f, 20.747f, 6.65f, 20.25f, 6.65f)
                horizontalLineTo(8.25f)
                curveTo(7.753f, 6.65f, 7.35f, 6.247f, 7.35f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 13.25f)
                curveTo(4.44f, 13.25f, 5.0f, 12.69f, 5.0f, 12.0f)
                curveTo(5.0f, 11.31f, 4.44f, 10.75f, 3.75f, 10.75f)
                curveTo(3.059f, 10.75f, 2.5f, 11.31f, 2.5f, 12.0f)
                curveTo(2.5f, 12.69f, 3.059f, 13.25f, 3.75f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.35f, 12.0f)
                curveTo(7.35f, 11.503f, 7.753f, 11.1f, 8.25f, 11.1f)
                horizontalLineTo(20.25f)
                curveTo(20.747f, 11.1f, 21.15f, 11.503f, 21.15f, 12.0f)
                curveTo(21.15f, 12.497f, 20.747f, 12.9f, 20.25f, 12.9f)
                horizontalLineTo(8.25f)
                curveTo(7.753f, 12.9f, 7.35f, 12.497f, 7.35f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 19.5f)
                curveTo(4.44f, 19.5f, 5.0f, 18.94f, 5.0f, 18.25f)
                curveTo(5.0f, 17.56f, 4.44f, 17.0f, 3.75f, 17.0f)
                curveTo(3.059f, 17.0f, 2.5f, 17.56f, 2.5f, 18.25f)
                curveTo(2.5f, 18.94f, 3.059f, 19.5f, 3.75f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 17.35f)
                curveTo(7.753f, 17.35f, 7.35f, 17.753f, 7.35f, 18.25f)
                curveTo(7.35f, 18.747f, 7.753f, 19.15f, 8.25f, 19.15f)
                horizontalLineTo(20.25f)
                curveTo(20.747f, 19.15f, 21.15f, 18.747f, 21.15f, 18.25f)
                curveTo(21.15f, 17.753f, 20.747f, 17.35f, 20.25f, 17.35f)
                horizontalLineTo(8.25f)
                close()
            }
        }
        .build()
        return _list!!
    }

private var _list: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.List, contentDescription = "")
    }
}
