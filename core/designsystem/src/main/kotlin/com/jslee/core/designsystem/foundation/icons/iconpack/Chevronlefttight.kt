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

public val MooBesideIconPack.Chevronlefttight: ImageVector
    get() {
        if (_chevronlefttight != null) {
            return _chevronlefttight!!
        }
        _chevronlefttight = Builder(name = "Chevronlefttight", defaultWidth = 12.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.136f, 3.363f)
                curveTo(10.488f, 3.714f, 10.488f, 4.284f, 10.136f, 4.636f)
                lineTo(2.773f, 11.999f)
                lineTo(10.136f, 19.363f)
                curveTo(10.488f, 19.714f, 10.488f, 20.284f, 10.136f, 20.636f)
                curveTo(9.785f, 20.987f, 9.215f, 20.987f, 8.864f, 20.636f)
                lineTo(0.864f, 12.636f)
                curveTo(0.512f, 12.284f, 0.512f, 11.714f, 0.864f, 11.363f)
                lineTo(8.864f, 3.363f)
                curveTo(9.215f, 3.011f, 9.785f, 3.011f, 10.136f, 3.363f)
                close()
            }
        }
        .build()
        return _chevronlefttight!!
    }

private var _chevronlefttight: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronlefttight, contentDescription = "")
    }
}
