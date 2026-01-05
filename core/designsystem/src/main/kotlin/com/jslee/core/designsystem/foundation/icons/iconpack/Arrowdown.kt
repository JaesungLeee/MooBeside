package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Arrowdown: ImageVector
    get() {
        if (_arrowdown != null) {
            return _arrowdown!!
        }
        _arrowdown = Builder(name = "Arrowdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.364f, 21.136f)
                curveTo(11.715f, 21.488f, 12.285f, 21.488f, 12.637f, 21.136f)
                lineTo(19.636f, 14.136f)
                curveTo(19.988f, 13.785f, 19.988f, 13.215f, 19.636f, 12.863f)
                curveTo(19.285f, 12.512f, 18.715f, 12.512f, 18.364f, 12.863f)
                lineTo(12.9f, 18.327f)
                lineTo(12.9f, 3.5f)
                curveTo(12.9f, 3.003f, 12.497f, 2.6f, 12.0f, 2.6f)
                curveTo(11.503f, 2.6f, 11.1f, 3.003f, 11.1f, 3.5f)
                verticalLineTo(18.327f)
                lineTo(5.637f, 12.863f)
                curveTo(5.285f, 12.512f, 4.715f, 12.512f, 4.364f, 12.863f)
                curveTo(4.012f, 13.215f, 4.012f, 13.785f, 4.364f, 14.136f)
                lineTo(11.364f, 21.136f)
                close()
            }
        }
        .build()
        return _arrowdown!!
    }

private var _arrowdown: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowdown, contentDescription = "")
    }
}
