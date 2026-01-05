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

public val MooBesideIconPack.Linehorizontalthick: ImageVector
    get() {
        if (_linehorizontalthick != null) {
            return _linehorizontalthick!!
        }
        _linehorizontalthick = Builder(name = "Linehorizontalthick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.7f, 12.0f)
                curveTo(4.7f, 11.282f, 5.282f, 10.7f, 6.0f, 10.7f)
                horizontalLineTo(18.0f)
                curveTo(18.718f, 10.7f, 19.3f, 11.282f, 19.3f, 12.0f)
                curveTo(19.3f, 12.718f, 18.718f, 13.3f, 18.0f, 13.3f)
                horizontalLineTo(6.0f)
                curveTo(5.282f, 13.3f, 4.7f, 12.718f, 4.7f, 12.0f)
                close()
            }
        }
        .build()
        return _linehorizontalthick!!
    }

private var _linehorizontalthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Linehorizontalthick, contentDescription = "")
    }
}
