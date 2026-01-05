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

public val MooBesideIconPack.Circleblock: ImageVector
    get() {
        if (_circleblock != null) {
            return _circleblock!!
        }
        _circleblock = Builder(name = "Circleblock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(6.532f, 2.1f, 2.1f, 6.532f, 2.1f, 12.0f)
                curveTo(2.1f, 17.468f, 6.532f, 21.9f, 12.0f, 21.9f)
                curveTo(17.468f, 21.9f, 21.9f, 17.468f, 21.9f, 12.0f)
                curveTo(21.9f, 6.532f, 17.468f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(3.9f, 12.0f)
                curveTo(3.9f, 7.527f, 7.527f, 3.9f, 12.0f, 3.9f)
                curveTo(13.913f, 3.9f, 15.67f, 4.563f, 17.056f, 5.671f)
                lineTo(5.671f, 17.056f)
                curveTo(4.563f, 15.67f, 3.9f, 13.913f, 3.9f, 12.0f)
                close()
                moveTo(6.944f, 18.329f)
                curveTo(8.33f, 19.437f, 10.087f, 20.1f, 12.0f, 20.1f)
                curveTo(16.473f, 20.1f, 20.1f, 16.474f, 20.1f, 12.0f)
                curveTo(20.1f, 10.088f, 19.437f, 8.33f, 18.329f, 6.944f)
                lineTo(6.944f, 18.329f)
                close()
            }
        }
        .build()
        return _circleblock!!
    }

private var _circleblock: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circleblock, contentDescription = "")
    }
}
