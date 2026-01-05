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

public val MooBesideIconPack.Chevrondoubleright: ImageVector
    get() {
        if (_chevrondoubleright != null) {
            return _chevrondoubleright!!
        }
        _chevrondoubleright = Builder(name = "Chevrondoubleright", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.864f, 4.64f)
                curveTo(2.512f, 4.288f, 2.512f, 3.719f, 2.864f, 3.367f)
                curveTo(3.215f, 3.016f, 3.785f, 3.016f, 4.137f, 3.367f)
                lineTo(12.137f, 11.367f)
                curveTo(12.488f, 11.719f, 12.488f, 12.288f, 12.137f, 12.64f)
                lineTo(4.137f, 20.64f)
                curveTo(3.785f, 20.991f, 3.215f, 20.991f, 2.864f, 20.64f)
                curveTo(2.512f, 20.288f, 2.512f, 19.719f, 2.864f, 19.367f)
                lineTo(10.227f, 12.003f)
                lineTo(2.864f, 4.64f)
                close()
                moveTo(12.364f, 4.64f)
                curveTo(12.012f, 4.288f, 12.012f, 3.719f, 12.364f, 3.367f)
                curveTo(12.715f, 3.016f, 13.285f, 3.016f, 13.637f, 3.367f)
                lineTo(21.637f, 11.367f)
                curveTo(21.988f, 11.719f, 21.988f, 12.288f, 21.637f, 12.64f)
                lineTo(13.637f, 20.64f)
                curveTo(13.285f, 20.991f, 12.715f, 20.991f, 12.364f, 20.64f)
                curveTo(12.012f, 20.288f, 12.012f, 19.719f, 12.364f, 19.367f)
                lineTo(19.727f, 12.003f)
                lineTo(12.364f, 4.64f)
                close()
            }
        }
        .build()
        return _chevrondoubleright!!
    }

private var _chevrondoubleright: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevrondoubleright, contentDescription = "")
    }
}
