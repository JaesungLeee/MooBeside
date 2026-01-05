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

public val MooBesideIconPack.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.103f)
                curveTo(12.497f, 3.103f, 12.9f, 3.506f, 12.9f, 4.003f)
                verticalLineTo(11.103f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 11.103f, 20.9f, 11.506f, 20.9f, 12.003f)
                curveTo(20.9f, 12.5f, 20.497f, 12.903f, 20.0f, 12.903f)
                horizontalLineTo(12.9f)
                verticalLineTo(20.003f)
                curveTo(12.9f, 20.5f, 12.497f, 20.903f, 12.0f, 20.903f)
                curveTo(11.503f, 20.903f, 11.1f, 20.5f, 11.1f, 20.003f)
                verticalLineTo(12.903f)
                horizontalLineTo(4.0f)
                curveTo(3.503f, 12.903f, 3.1f, 12.5f, 3.1f, 12.003f)
                curveTo(3.1f, 11.506f, 3.503f, 11.103f, 4.0f, 11.103f)
                horizontalLineTo(11.1f)
                verticalLineTo(4.003f)
                curveTo(11.1f, 3.506f, 11.503f, 3.103f, 12.0f, 3.103f)
                close()
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Plus, contentDescription = "")
    }
}
