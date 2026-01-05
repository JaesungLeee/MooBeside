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

public val MooBesideIconPack.Change: ImageVector
    get() {
        if (_change != null) {
            return _change!!
        }
        _change = Builder(name = "Change", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.387f, 11.886f)
                lineTo(20.137f, 8.136f)
                curveTo(20.488f, 7.785f, 20.488f, 7.215f, 20.137f, 6.863f)
                lineTo(16.387f, 3.113f)
                curveTo(16.035f, 2.762f, 15.465f, 2.762f, 15.114f, 3.113f)
                curveTo(14.762f, 3.465f, 14.762f, 4.035f, 15.114f, 4.386f)
                lineTo(17.327f, 6.6f)
                horizontalLineTo(4.5f)
                curveTo(4.003f, 6.6f, 3.6f, 7.003f, 3.6f, 7.5f)
                curveTo(3.6f, 7.997f, 4.003f, 8.4f, 4.5f, 8.4f)
                horizontalLineTo(17.327f)
                lineTo(15.114f, 10.613f)
                curveTo(14.762f, 10.965f, 14.762f, 11.535f, 15.114f, 11.886f)
                curveTo(15.465f, 12.238f, 16.035f, 12.238f, 16.387f, 11.886f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.864f, 17.136f)
                curveTo(3.512f, 16.785f, 3.512f, 16.215f, 3.864f, 15.864f)
                lineTo(7.614f, 12.114f)
                curveTo(7.965f, 11.762f, 8.535f, 11.762f, 8.887f, 12.114f)
                curveTo(9.238f, 12.465f, 9.238f, 13.035f, 8.887f, 13.387f)
                lineTo(6.673f, 15.6f)
                horizontalLineTo(19.5f)
                curveTo(19.997f, 15.6f, 20.4f, 16.003f, 20.4f, 16.5f)
                curveTo(20.4f, 16.997f, 19.997f, 17.4f, 19.5f, 17.4f)
                horizontalLineTo(6.673f)
                lineTo(8.887f, 19.614f)
                curveTo(9.238f, 19.965f, 9.238f, 20.535f, 8.887f, 20.886f)
                curveTo(8.535f, 21.238f, 7.965f, 21.238f, 7.614f, 20.886f)
                lineTo(3.864f, 17.136f)
                close()
            }
        }
        .build()
        return _change!!
    }

private var _change: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Change, contentDescription = "")
    }
}
