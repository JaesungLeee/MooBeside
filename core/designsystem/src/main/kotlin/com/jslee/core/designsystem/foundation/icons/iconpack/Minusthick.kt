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

public val MooBesideIconPack.Minusthick: ImageVector
    get() {
        if (_minusthick != null) {
            return _minusthick!!
        }
        _minusthick = Builder(name = "Minusthick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7f, 11.999f)
                curveTo(2.7f, 11.281f, 3.282f, 10.699f, 4.0f, 10.699f)
                horizontalLineTo(20.0f)
                curveTo(20.718f, 10.699f, 21.3f, 11.281f, 21.3f, 11.999f)
                curveTo(21.3f, 12.717f, 20.718f, 13.299f, 20.0f, 13.299f)
                horizontalLineTo(4.0f)
                curveTo(3.282f, 13.299f, 2.7f, 12.717f, 2.7f, 11.999f)
                close()
            }
        }
        .build()
        return _minusthick!!
    }

private var _minusthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Minusthick, contentDescription = "")
    }
}
