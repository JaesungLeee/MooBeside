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

public val MooBesideIconPack.Arrowdownthick: ImageVector
    get() {
        if (_arrowdownthick != null) {
            return _arrowdownthick!!
        }
        _arrowdownthick = Builder(name = "Arrowdownthick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.081f, 21.419f)
                curveTo(11.589f, 21.927f, 12.412f, 21.927f, 12.919f, 21.419f)
                lineTo(19.919f, 14.419f)
                curveTo(20.427f, 13.911f, 20.427f, 13.088f, 19.919f, 12.581f)
                curveTo(19.412f, 12.073f, 18.588f, 12.073f, 18.081f, 12.581f)
                lineTo(13.3f, 17.361f)
                verticalLineTo(3.5f)
                curveTo(13.3f, 2.782f, 12.718f, 2.2f, 12.0f, 2.2f)
                curveTo(11.282f, 2.2f, 10.7f, 2.782f, 10.7f, 3.5f)
                verticalLineTo(17.361f)
                lineTo(5.919f, 12.581f)
                curveTo(5.412f, 12.073f, 4.589f, 12.073f, 4.081f, 12.581f)
                curveTo(3.573f, 13.088f, 3.573f, 13.911f, 4.081f, 14.419f)
                lineTo(11.081f, 21.419f)
                close()
            }
        }
        .build()
        return _arrowdownthick!!
    }

private var _arrowdownthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Arrowdownthick, contentDescription = "")
    }
}
