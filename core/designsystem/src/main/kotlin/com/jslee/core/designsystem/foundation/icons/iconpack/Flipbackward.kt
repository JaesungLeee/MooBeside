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

public val MooBesideIconPack.Flipbackward: ImageVector
    get() {
        if (_flipbackward != null) {
            return _flipbackward!!
        }
        _flipbackward = Builder(name = "Flipbackward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.637f, 5.136f)
                curveTo(8.988f, 4.785f, 8.988f, 4.215f, 8.637f, 3.863f)
                curveTo(8.285f, 3.512f, 7.716f, 3.512f, 7.364f, 3.863f)
                lineTo(2.864f, 8.363f)
                curveTo(2.695f, 8.532f, 2.6f, 8.761f, 2.6f, 9.0f)
                curveTo(2.6f, 9.238f, 2.695f, 9.467f, 2.864f, 9.636f)
                lineTo(7.364f, 14.136f)
                curveTo(7.716f, 14.488f, 8.285f, 14.488f, 8.637f, 14.136f)
                curveTo(8.988f, 13.785f, 8.988f, 13.215f, 8.637f, 12.863f)
                lineTo(5.674f, 9.9f)
                horizontalLineTo(15.5f)
                curveTo(17.764f, 9.9f, 19.6f, 11.736f, 19.6f, 14.0f)
                curveTo(19.6f, 16.265f, 17.764f, 18.1f, 15.5f, 18.1f)
                horizontalLineTo(12.0f)
                curveTo(11.503f, 18.1f, 11.1f, 18.503f, 11.1f, 19.0f)
                curveTo(11.1f, 19.497f, 11.503f, 19.9f, 12.0f, 19.9f)
                horizontalLineTo(15.5f)
                curveTo(18.758f, 19.9f, 21.4f, 17.259f, 21.4f, 14.0f)
                curveTo(21.4f, 10.742f, 18.758f, 8.1f, 15.5f, 8.1f)
                horizontalLineTo(5.673f)
                lineTo(8.637f, 5.136f)
                close()
            }
        }
        .build()
        return _flipbackward!!
    }

private var _flipbackward: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Flipbackward, contentDescription = "")
    }
}
