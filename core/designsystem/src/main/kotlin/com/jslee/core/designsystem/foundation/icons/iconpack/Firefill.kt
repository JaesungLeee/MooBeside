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

public val MooBesideIconPack.Firefill: ImageVector
    get() {
        if (_firefill != null) {
            return _firefill!!
        }
        _firefill = Builder(name = "Firefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.609f, 2.412f)
                curveTo(12.234f, 1.428f, 13.61f, 1.222f, 14.483f, 2.035f)
                curveTo(18.58f, 5.849f, 21.149f, 9.509f, 21.149f, 13.601f)
                curveTo(21.149f, 18.516f, 17.328f, 22.401f, 11.999f, 22.401f)
                curveTo(9.367f, 22.401f, 7.073f, 21.502f, 5.432f, 19.925f)
                curveTo(3.789f, 18.345f, 2.849f, 16.131f, 2.849f, 13.601f)
                curveTo(2.849f, 10.875f, 3.961f, 8.264f, 5.859f, 6.263f)
                curveTo(6.488f, 5.601f, 7.488f, 5.63f, 8.111f, 6.19f)
                lineTo(8.81f, 6.82f)
                lineTo(11.609f, 2.412f)
                close()
                moveTo(8.499f, 15.601f)
                curveTo(8.499f, 17.5f, 10.049f, 19.0f, 11.999f, 19.0f)
                curveTo(13.949f, 19.0f, 15.499f, 17.5f, 15.499f, 15.601f)
                curveTo(15.499f, 13.7f, 13.949f, 12.2f, 11.999f, 10.5f)
                curveTo(10.049f, 12.2f, 8.499f, 13.7f, 8.499f, 15.601f)
                close()
            }
        }
        .build()
        return _firefill!!
    }

private var _firefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Firefill, contentDescription = "")
    }
}
