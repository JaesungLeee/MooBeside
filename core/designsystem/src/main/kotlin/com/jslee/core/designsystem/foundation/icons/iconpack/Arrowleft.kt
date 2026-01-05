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

public val MooBesideIconPack.Arrowleft: ImageVector
    get() {
        if (_arrowleft != null) {
            return _arrowleft!!
        }
        _arrowleft = Builder(name = "Arrowleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.864f, 11.363f)
                curveTo(2.512f, 11.715f, 2.512f, 12.285f, 2.864f, 12.636f)
                lineTo(9.864f, 19.636f)
                curveTo(10.215f, 19.988f, 10.785f, 19.988f, 11.136f, 19.636f)
                curveTo(11.488f, 19.285f, 11.488f, 18.715f, 11.136f, 18.364f)
                lineTo(5.673f, 12.9f)
                horizontalLineTo(20.5f)
                curveTo(20.997f, 12.9f, 21.4f, 12.497f, 21.4f, 12.0f)
                curveTo(21.4f, 11.503f, 20.997f, 11.1f, 20.5f, 11.1f)
                lineTo(5.673f, 11.1f)
                lineTo(11.136f, 5.636f)
                curveTo(11.488f, 5.285f, 11.488f, 4.715f, 11.136f, 4.364f)
                curveTo(10.785f, 4.012f, 10.215f, 4.012f, 9.864f, 4.364f)
                lineTo(2.864f, 11.363f)
                close()
            }
        }
        .build()
        return _arrowleft!!
    }

private var _arrowleft: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowleft, contentDescription = "")
    }
}
