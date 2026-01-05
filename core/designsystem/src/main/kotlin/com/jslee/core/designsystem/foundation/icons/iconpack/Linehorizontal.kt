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

public val MooBesideIconPack.Linehorizontal: ImageVector
    get() {
        if (_linehorizontal != null) {
            return _linehorizontal!!
        }
        _linehorizontal = Builder(name = "Linehorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.1f, 12.0f)
                curveTo(5.1f, 11.503f, 5.503f, 11.1f, 6.0f, 11.1f)
                horizontalLineTo(18.0f)
                curveTo(18.497f, 11.1f, 18.9f, 11.503f, 18.9f, 12.0f)
                curveTo(18.9f, 12.497f, 18.497f, 12.9f, 18.0f, 12.9f)
                horizontalLineTo(6.0f)
                curveTo(5.503f, 12.9f, 5.1f, 12.497f, 5.1f, 12.0f)
                close()
            }
        }
        .build()
        return _linehorizontal!!
    }

private var _linehorizontal: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Linehorizontal, contentDescription = "")
    }
}
