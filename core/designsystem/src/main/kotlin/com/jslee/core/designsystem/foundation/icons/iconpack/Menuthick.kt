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

public val MooBesideIconPack.Menuthick: ImageVector
    get() {
        if (_menuthick != null) {
            return _menuthick!!
        }
        _menuthick = Builder(name = "Menuthick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.5f)
                curveTo(3.31f, 4.5f, 2.75f, 5.059f, 2.75f, 5.75f)
                curveTo(2.75f, 6.44f, 3.31f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(20.0f)
                curveTo(20.691f, 7.0f, 21.25f, 6.44f, 21.25f, 5.75f)
                curveTo(21.25f, 5.059f, 20.691f, 4.5f, 20.0f, 4.5f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 11.309f, 3.31f, 10.75f, 4.0f, 10.75f)
                horizontalLineTo(20.0f)
                curveTo(20.691f, 10.75f, 21.25f, 11.309f, 21.25f, 12.0f)
                curveTo(21.25f, 12.69f, 20.691f, 13.25f, 20.0f, 13.25f)
                horizontalLineTo(4.0f)
                curveTo(3.31f, 13.25f, 2.75f, 12.69f, 2.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 18.249f)
                curveTo(2.75f, 17.559f, 3.31f, 16.999f, 4.0f, 16.999f)
                horizontalLineTo(20.0f)
                curveTo(20.691f, 16.999f, 21.25f, 17.559f, 21.25f, 18.249f)
                curveTo(21.25f, 18.94f, 20.691f, 19.499f, 20.0f, 19.499f)
                horizontalLineTo(4.0f)
                curveTo(3.31f, 19.499f, 2.75f, 18.94f, 2.75f, 18.249f)
                close()
            }
        }
        .build()
        return _menuthick!!
    }

private var _menuthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Menuthick, contentDescription = "")
    }
}
