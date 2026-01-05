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

public val MooBesideIconPack.Chevronrighttight: ImageVector
    get() {
        if (_chevronrighttight != null) {
            return _chevronrighttight!!
        }
        _chevronrighttight = Builder(name = "Chevronrighttight", defaultWidth = 12.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.863f, 3.363f)
                curveTo(1.512f, 3.714f, 1.512f, 4.284f, 1.863f, 4.636f)
                lineTo(9.227f, 11.999f)
                lineTo(1.863f, 19.363f)
                curveTo(1.512f, 19.714f, 1.512f, 20.284f, 1.863f, 20.635f)
                curveTo(2.215f, 20.987f, 2.785f, 20.987f, 3.136f, 20.635f)
                lineTo(11.136f, 12.635f)
                curveTo(11.488f, 12.284f, 11.488f, 11.714f, 11.136f, 11.363f)
                lineTo(3.136f, 3.363f)
                curveTo(2.785f, 3.011f, 2.215f, 3.011f, 1.863f, 3.363f)
                close()
            }
        }
        .build()
        return _chevronrighttight!!
    }

private var _chevronrighttight: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronrighttight, contentDescription = "")
    }
}
