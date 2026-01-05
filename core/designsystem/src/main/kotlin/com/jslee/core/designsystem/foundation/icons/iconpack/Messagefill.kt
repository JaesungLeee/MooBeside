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

public val MooBesideIconPack.Messagefill: ImageVector
    get() {
        if (_messagefill != null) {
            return _messagefill!!
        }
        _messagefill = Builder(name = "Messagefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.35f, 12.0f)
                curveTo(2.35f, 6.67f, 6.671f, 2.35f, 12.0f, 2.35f)
                curveTo(17.33f, 2.35f, 21.65f, 6.67f, 21.65f, 12.0f)
                curveTo(21.65f, 13.538f, 21.289f, 14.995f, 20.648f, 16.287f)
                lineTo(21.142f, 18.099f)
                curveTo(21.254f, 18.51f, 21.354f, 18.875f, 21.407f, 19.176f)
                curveTo(21.461f, 19.481f, 21.497f, 19.867f, 21.35f, 20.252f)
                curveTo(21.157f, 20.758f, 20.758f, 21.157f, 20.253f, 21.35f)
                curveTo(19.867f, 21.497f, 19.481f, 21.46f, 19.176f, 21.406f)
                curveTo(18.876f, 21.353f, 18.51f, 21.254f, 18.1f, 21.142f)
                lineTo(16.287f, 20.647f)
                curveTo(14.995f, 21.289f, 13.538f, 21.65f, 12.0f, 21.65f)
                curveTo(6.671f, 21.65f, 2.35f, 17.329f, 2.35f, 12.0f)
                close()
                moveTo(7.1f, 10.0f)
                curveTo(7.1f, 9.503f, 7.503f, 9.1f, 8.0f, 9.1f)
                horizontalLineTo(16.0f)
                curveTo(16.497f, 9.1f, 16.9f, 9.503f, 16.9f, 10.0f)
                curveTo(16.9f, 10.497f, 16.497f, 10.9f, 16.0f, 10.9f)
                horizontalLineTo(8.0f)
                curveTo(7.503f, 10.9f, 7.1f, 10.497f, 7.1f, 10.0f)
                close()
                moveTo(7.1f, 14.0f)
                curveTo(7.1f, 13.503f, 7.503f, 13.1f, 8.0f, 13.1f)
                horizontalLineTo(12.75f)
                curveTo(13.247f, 13.1f, 13.65f, 13.503f, 13.65f, 14.0f)
                curveTo(13.65f, 14.497f, 13.247f, 14.9f, 12.75f, 14.9f)
                horizontalLineTo(8.0f)
                curveTo(7.503f, 14.9f, 7.1f, 14.497f, 7.1f, 14.0f)
                close()
            }
        }
        .build()
        return _messagefill!!
    }

private var _messagefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Messagefill, contentDescription = "")
    }
}
