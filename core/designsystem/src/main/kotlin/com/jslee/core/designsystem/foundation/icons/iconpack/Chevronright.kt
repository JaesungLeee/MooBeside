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

public val MooBesideIconPack.Chevronright: ImageVector
    get() {
        if (_chevronright != null) {
            return _chevronright!!
        }
        _chevronright = Builder(name = "Chevronright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.863f, 3.363f)
                curveTo(7.512f, 3.714f, 7.512f, 4.284f, 7.863f, 4.636f)
                lineTo(15.227f, 11.999f)
                lineTo(7.863f, 19.363f)
                curveTo(7.512f, 19.714f, 7.512f, 20.284f, 7.863f, 20.635f)
                curveTo(8.215f, 20.987f, 8.785f, 20.987f, 9.136f, 20.635f)
                lineTo(17.136f, 12.635f)
                curveTo(17.488f, 12.284f, 17.488f, 11.714f, 17.136f, 11.363f)
                lineTo(9.136f, 3.363f)
                curveTo(8.785f, 3.011f, 8.215f, 3.011f, 7.863f, 3.363f)
                close()
            }
        }
        .build()
        return _chevronright!!
    }

private var _chevronright: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronright, contentDescription = "")
    }
}
