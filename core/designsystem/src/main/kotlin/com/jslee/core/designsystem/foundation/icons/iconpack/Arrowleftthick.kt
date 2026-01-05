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

public val MooBesideIconPack.Arrowleftthick: ImageVector
    get() {
        if (_arrowleftthick != null) {
            return _arrowleftthick!!
        }
        _arrowleftthick = Builder(name = "Arrowleftthick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.581f, 11.081f)
                curveTo(2.073f, 11.588f, 2.073f, 12.411f, 2.581f, 12.919f)
                lineTo(9.581f, 19.919f)
                curveTo(10.089f, 20.427f, 10.912f, 20.427f, 11.419f, 19.919f)
                curveTo(11.927f, 19.412f, 11.927f, 18.588f, 11.419f, 18.081f)
                lineTo(6.639f, 13.3f)
                horizontalLineTo(20.5f)
                curveTo(21.218f, 13.3f, 21.8f, 12.718f, 21.8f, 12.0f)
                curveTo(21.8f, 11.282f, 21.218f, 10.7f, 20.5f, 10.7f)
                lineTo(6.639f, 10.7f)
                lineTo(11.419f, 5.919f)
                curveTo(11.927f, 5.411f, 11.927f, 4.588f, 11.419f, 4.081f)
                curveTo(10.912f, 3.573f, 10.089f, 3.573f, 9.581f, 4.081f)
                lineTo(2.581f, 11.081f)
                close()
            }
        }
        .build()
        return _arrowleftthick!!
    }

private var _arrowleftthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowleftthick, contentDescription = "")
    }
}
