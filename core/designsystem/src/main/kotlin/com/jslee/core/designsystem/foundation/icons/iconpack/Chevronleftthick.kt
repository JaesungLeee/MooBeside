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

public val MooBesideIconPack.Chevronleftthick: ImageVector
    get() {
        if (_chevronleftthick != null) {
            return _chevronleftthick!!
        }
        _chevronleftthick = Builder(name = "Chevronleftthick", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.42f, 3.08f)
                curveTo(16.927f, 3.588f, 16.927f, 4.411f, 16.42f, 4.919f)
                lineTo(9.339f, 11.999f)
                lineTo(16.42f, 19.08f)
                curveTo(16.927f, 19.588f, 16.927f, 20.411f, 16.42f, 20.919f)
                curveTo(15.912f, 21.426f, 15.089f, 21.426f, 14.581f, 20.919f)
                lineTo(6.581f, 12.919f)
                curveTo(6.073f, 12.411f, 6.073f, 11.588f, 6.581f, 11.08f)
                lineTo(14.581f, 3.08f)
                curveTo(15.089f, 2.572f, 15.912f, 2.572f, 16.42f, 3.08f)
                close()
            }
        }
        .build()
        return _chevronleftthick!!
    }

private var _chevronleftthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronleftthick, contentDescription = "")
    }
}
