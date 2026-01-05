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

public val MooBesideIconPack.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.863f, 4.863f)
                curveTo(5.215f, 4.512f, 5.785f, 4.512f, 6.136f, 4.863f)
                lineTo(12.0f, 10.727f)
                lineTo(17.863f, 4.863f)
                curveTo(18.215f, 4.512f, 18.785f, 4.512f, 19.136f, 4.863f)
                curveTo(19.488f, 5.215f, 19.488f, 5.785f, 19.136f, 6.136f)
                lineTo(13.273f, 12.0f)
                lineTo(19.136f, 17.864f)
                curveTo(19.488f, 18.215f, 19.488f, 18.785f, 19.136f, 19.136f)
                curveTo(18.785f, 19.488f, 18.215f, 19.488f, 17.863f, 19.136f)
                lineTo(12.0f, 13.273f)
                lineTo(6.136f, 19.136f)
                curveTo(5.785f, 19.488f, 5.215f, 19.488f, 4.863f, 19.136f)
                curveTo(4.512f, 18.785f, 4.512f, 18.215f, 4.863f, 17.864f)
                lineTo(10.727f, 12.0f)
                lineTo(4.863f, 6.136f)
                curveTo(4.512f, 5.785f, 4.512f, 5.215f, 4.863f, 4.863f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Close, contentDescription = "")
    }
}
