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

public val MooBesideIconPack.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 4.15f)
                curveTo(7.665f, 4.15f, 4.15f, 7.665f, 4.15f, 12.0f)
                curveTo(4.15f, 16.336f, 7.665f, 19.85f, 12.0f, 19.85f)
                curveTo(13.361f, 19.85f, 14.639f, 19.504f, 15.753f, 18.897f)
                curveTo(15.958f, 18.785f, 16.197f, 18.757f, 16.421f, 18.818f)
                lineTo(18.536f, 19.395f)
                curveTo(18.995f, 19.521f, 19.28f, 19.597f, 19.489f, 19.634f)
                curveTo(19.564f, 19.647f, 19.611f, 19.652f, 19.637f, 19.653f)
                curveTo(19.643f, 19.648f, 19.649f, 19.643f, 19.653f, 19.637f)
                curveTo(19.652f, 19.611f, 19.647f, 19.564f, 19.634f, 19.489f)
                curveTo(19.597f, 19.28f, 19.521f, 18.995f, 19.395f, 18.536f)
                lineTo(18.819f, 16.421f)
                curveTo(18.757f, 16.197f, 18.785f, 15.958f, 18.897f, 15.753f)
                curveTo(19.504f, 14.639f, 19.85f, 13.361f, 19.85f, 12.0f)
                curveTo(19.85f, 7.665f, 16.336f, 4.15f, 12.0f, 4.15f)
                close()
                moveTo(2.35f, 12.0f)
                curveTo(2.35f, 6.671f, 6.671f, 2.35f, 12.0f, 2.35f)
                curveTo(17.33f, 2.35f, 21.65f, 6.671f, 21.65f, 12.0f)
                curveTo(21.65f, 13.538f, 21.289f, 14.995f, 20.648f, 16.287f)
                lineTo(21.142f, 18.1f)
                curveTo(21.254f, 18.51f, 21.354f, 18.876f, 21.407f, 19.176f)
                curveTo(21.461f, 19.481f, 21.497f, 19.867f, 21.35f, 20.253f)
                curveTo(21.157f, 20.758f, 20.758f, 21.157f, 20.253f, 21.35f)
                curveTo(19.867f, 21.497f, 19.481f, 21.461f, 19.176f, 21.407f)
                curveTo(18.876f, 21.354f, 18.51f, 21.254f, 18.1f, 21.142f)
                lineTo(16.287f, 20.648f)
                curveTo(14.995f, 21.289f, 13.538f, 21.65f, 12.0f, 21.65f)
                curveTo(6.671f, 21.65f, 2.35f, 17.33f, 2.35f, 12.0f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bubble, contentDescription = "")
    }
}
