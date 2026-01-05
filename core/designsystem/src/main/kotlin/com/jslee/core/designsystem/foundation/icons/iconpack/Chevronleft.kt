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

public val MooBesideIconPack.Chevronleft: ImageVector
    get() {
        if (_chevronleft != null) {
            return _chevronleft!!
        }
        _chevronleft = Builder(name = "Chevronleft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.136f, 3.363f)
                curveTo(16.488f, 3.714f, 16.488f, 4.284f, 16.136f, 4.636f)
                lineTo(8.773f, 11.999f)
                lineTo(16.136f, 19.363f)
                curveTo(16.488f, 19.714f, 16.488f, 20.284f, 16.136f, 20.636f)
                curveTo(15.785f, 20.987f, 15.215f, 20.987f, 14.863f, 20.636f)
                lineTo(6.864f, 12.636f)
                curveTo(6.512f, 12.284f, 6.512f, 11.714f, 6.864f, 11.363f)
                lineTo(14.863f, 3.363f)
                curveTo(15.215f, 3.011f, 15.785f, 3.011f, 16.136f, 3.363f)
                close()
            }
        }
        .build()
        return _chevronleft!!
    }

private var _chevronleft: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronleft, contentDescription = "")
    }
}
