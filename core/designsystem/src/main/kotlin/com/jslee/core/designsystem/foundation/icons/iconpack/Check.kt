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

public val MooBesideIconPack.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.386f, 6.863f)
                curveTo(19.738f, 7.215f, 19.738f, 7.785f, 19.386f, 8.136f)
                lineTo(10.386f, 17.136f)
                curveTo(10.035f, 17.488f, 9.465f, 17.488f, 9.114f, 17.136f)
                lineTo(4.614f, 12.636f)
                curveTo(4.262f, 12.285f, 4.262f, 11.715f, 4.614f, 11.363f)
                curveTo(4.965f, 11.012f, 5.535f, 11.012f, 5.886f, 11.363f)
                lineTo(9.75f, 15.227f)
                lineTo(18.114f, 6.863f)
                curveTo(18.465f, 6.512f, 19.035f, 6.512f, 19.386f, 6.863f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Check, contentDescription = "")
    }
}
