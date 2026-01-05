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

public val MooBesideIconPack.Chevronup: ImageVector
    get() {
        if (_chevronup != null) {
            return _chevronup!!
        }
        _chevronup = Builder(name = "Chevronup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.363f, 16.136f)
                curveTo(3.715f, 16.488f, 4.285f, 16.488f, 4.636f, 16.136f)
                lineTo(12.0f, 8.773f)
                lineTo(19.363f, 16.136f)
                curveTo(19.715f, 16.488f, 20.285f, 16.488f, 20.636f, 16.136f)
                curveTo(20.988f, 15.785f, 20.988f, 15.215f, 20.636f, 14.864f)
                lineTo(12.636f, 6.864f)
                curveTo(12.285f, 6.512f, 11.715f, 6.512f, 11.363f, 6.864f)
                lineTo(3.363f, 14.864f)
                curveTo(3.012f, 15.215f, 3.012f, 15.785f, 3.363f, 16.136f)
                close()
            }
        }
        .build()
        return _chevronup!!
    }

private var _chevronup: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronup, contentDescription = "")
    }
}
