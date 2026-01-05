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

public val MooBesideIconPack.Bubblefill: ImageVector
    get() {
        if (_bubblefill != null) {
            return _bubblefill!!
        }
        _bubblefill = Builder(name = "Bubblefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.35f)
                curveTo(6.671f, 2.35f, 2.35f, 6.67f, 2.35f, 12.0f)
                curveTo(2.35f, 17.33f, 6.671f, 21.65f, 12.0f, 21.65f)
                curveTo(13.538f, 21.65f, 14.995f, 21.289f, 16.287f, 20.647f)
                lineTo(18.1f, 21.142f)
                curveTo(18.51f, 21.254f, 18.876f, 21.354f, 19.176f, 21.407f)
                curveTo(19.481f, 21.46f, 19.867f, 21.497f, 20.253f, 21.35f)
                curveTo(20.758f, 21.157f, 21.157f, 20.758f, 21.35f, 20.253f)
                curveTo(21.497f, 19.867f, 21.461f, 19.481f, 21.407f, 19.176f)
                curveTo(21.354f, 18.876f, 21.254f, 18.51f, 21.142f, 18.1f)
                lineTo(20.648f, 16.287f)
                curveTo(21.289f, 14.995f, 21.65f, 13.538f, 21.65f, 12.0f)
                curveTo(21.65f, 6.67f, 17.33f, 2.35f, 12.0f, 2.35f)
                close()
            }
        }
        .build()
        return _bubblefill!!
    }

private var _bubblefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bubblefill, contentDescription = "")
    }
}
