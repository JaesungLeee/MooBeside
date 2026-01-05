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

public val MooBesideIconPack.Arrowrightthick: ImageVector
    get() {
        if (_arrowrightthick != null) {
            return _arrowrightthick!!
        }
        _arrowrightthick = Builder(name = "Arrowrightthick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.419f, 11.081f)
                curveTo(21.927f, 11.588f, 21.927f, 12.411f, 21.419f, 12.919f)
                lineTo(14.419f, 19.919f)
                curveTo(13.912f, 20.427f, 13.089f, 20.427f, 12.581f, 19.919f)
                curveTo(12.073f, 19.412f, 12.073f, 18.588f, 12.581f, 18.081f)
                lineTo(17.362f, 13.3f)
                horizontalLineTo(3.5f)
                curveTo(2.782f, 13.3f, 2.2f, 12.718f, 2.2f, 12.0f)
                curveTo(2.2f, 11.282f, 2.782f, 10.7f, 3.5f, 10.7f)
                horizontalLineTo(17.362f)
                lineTo(12.581f, 5.919f)
                curveTo(12.073f, 5.412f, 12.073f, 4.588f, 12.581f, 4.081f)
                curveTo(13.089f, 3.573f, 13.912f, 3.573f, 14.419f, 4.081f)
                lineTo(21.419f, 11.081f)
                close()
            }
        }
        .build()
        return _arrowrightthick!!
    }

private var _arrowrightthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowrightthick, contentDescription = "")
    }
}
