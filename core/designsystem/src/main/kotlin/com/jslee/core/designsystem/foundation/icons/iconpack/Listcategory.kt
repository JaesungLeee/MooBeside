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

public val MooBesideIconPack.Listcategory: ImageVector
    get() {
        if (_listcategory != null) {
            return _listcategory!!
        }
        _listcategory = Builder(name = "Listcategory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1f, 5.75f)
                curveTo(3.1f, 5.253f, 3.503f, 4.85f, 4.0f, 4.85f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 4.85f, 20.9f, 5.253f, 20.9f, 5.75f)
                curveTo(20.9f, 6.247f, 20.497f, 6.65f, 20.0f, 6.65f)
                horizontalLineTo(4.0f)
                curveTo(3.503f, 6.65f, 3.1f, 6.247f, 3.1f, 5.75f)
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
                horizontalLineTo(13.75f)
                curveTo(14.247f, 17.35f, 14.65f, 17.753f, 14.65f, 18.25f)
                curveTo(14.65f, 18.747f, 14.247f, 19.15f, 13.75f, 19.15f)
                horizontalLineTo(4.0f)
                curveTo(3.503f, 19.15f, 3.1f, 18.747f, 3.1f, 18.25f)
                close()
            }
        }
        .build()
        return _listcategory!!
    }

private var _listcategory: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Listcategory, contentDescription = "")
    }
}
