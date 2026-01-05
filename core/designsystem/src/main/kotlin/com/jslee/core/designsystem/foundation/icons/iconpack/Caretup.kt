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

public val MooBesideIconPack.Caretup: ImageVector
    get() {
        if (_caretup != null) {
            return _caretup!!
        }
        _caretup = Builder(name = "Caretup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.863f, 9.293f)
                curveTo(13.225f, 8.508f, 12.906f, 8.116f, 12.522f, 7.973f)
                curveTo(12.186f, 7.848f, 11.815f, 7.848f, 11.479f, 7.973f)
                curveTo(11.094f, 8.116f, 10.776f, 8.508f, 10.138f, 9.293f)
                lineTo(8.68f, 11.087f)
                curveTo(7.664f, 12.338f, 7.155f, 12.964f, 7.152f, 13.491f)
                curveTo(7.149f, 13.95f, 7.356f, 14.384f, 7.713f, 14.671f)
                curveTo(8.125f, 15.001f, 8.931f, 15.001f, 10.543f, 15.001f)
                horizontalLineTo(13.458f)
                curveTo(15.07f, 15.001f, 15.876f, 15.001f, 16.287f, 14.671f)
                curveTo(16.645f, 14.384f, 16.852f, 13.95f, 16.849f, 13.491f)
                curveTo(16.846f, 12.964f, 16.337f, 12.338f, 15.321f, 11.087f)
                lineTo(13.863f, 9.293f)
                close()
            }
        }
        .build()
        return _caretup!!
    }

private var _caretup: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Caretup, contentDescription = "")
    }
}
