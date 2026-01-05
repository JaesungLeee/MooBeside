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

public val MooBesideIconPack.Chevrondoubleleft: ImageVector
    get() {
        if (_chevrondoubleleft != null) {
            return _chevrondoubleleft!!
        }
        _chevrondoubleleft = Builder(name = "Chevrondoubleleft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.637f, 4.639f)
                curveTo(11.988f, 4.287f, 11.988f, 3.718f, 11.637f, 3.366f)
                curveTo(11.285f, 3.015f, 10.715f, 3.015f, 10.364f, 3.366f)
                lineTo(2.364f, 11.366f)
                curveTo(2.012f, 11.718f, 2.012f, 12.288f, 2.364f, 12.639f)
                lineTo(10.364f, 20.639f)
                curveTo(10.715f, 20.99f, 11.285f, 20.99f, 11.637f, 20.639f)
                curveTo(11.988f, 20.288f, 11.988f, 19.718f, 11.637f, 19.366f)
                lineTo(4.273f, 12.002f)
                lineTo(11.637f, 4.639f)
                close()
                moveTo(21.137f, 4.639f)
                curveTo(21.488f, 4.288f, 21.488f, 3.718f, 21.137f, 3.367f)
                curveTo(20.785f, 3.015f, 20.215f, 3.015f, 19.864f, 3.367f)
                lineTo(11.864f, 11.366f)
                curveTo(11.512f, 11.718f, 11.512f, 12.288f, 11.864f, 12.639f)
                lineTo(19.864f, 20.639f)
                curveTo(20.215f, 20.991f, 20.785f, 20.991f, 21.137f, 20.639f)
                curveTo(21.488f, 20.288f, 21.488f, 19.718f, 21.137f, 19.367f)
                lineTo(13.773f, 12.003f)
                lineTo(21.137f, 4.639f)
                close()
            }
        }
        .build()
        return _chevrondoubleleft!!
    }

private var _chevrondoubleleft: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoubleleft, contentDescription = "")
    }
}
