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

public val MooBesideIconPack.Arrowupthick: ImageVector
    get() {
        if (_arrowupthick != null) {
            return _arrowupthick!!
        }
        _arrowupthick = Builder(name = "Arrowupthick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.081f, 2.581f)
                curveTo(11.589f, 2.073f, 12.412f, 2.073f, 12.919f, 2.581f)
                lineTo(19.919f, 9.581f)
                curveTo(20.427f, 10.088f, 20.427f, 10.911f, 19.919f, 11.419f)
                curveTo(19.412f, 11.927f, 18.588f, 11.927f, 18.081f, 11.419f)
                lineTo(13.3f, 6.638f)
                verticalLineTo(20.5f)
                curveTo(13.3f, 21.218f, 12.718f, 21.8f, 12.0f, 21.8f)
                curveTo(11.282f, 21.8f, 10.7f, 21.218f, 10.7f, 20.5f)
                verticalLineTo(6.638f)
                lineTo(5.919f, 11.419f)
                curveTo(5.412f, 11.927f, 4.589f, 11.927f, 4.081f, 11.419f)
                curveTo(3.573f, 10.911f, 3.573f, 10.088f, 4.081f, 9.581f)
                lineTo(11.081f, 2.581f)
                close()
            }
        }
        .build()
        return _arrowupthick!!
    }

private var _arrowupthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowupthick, contentDescription = "")
    }
}
