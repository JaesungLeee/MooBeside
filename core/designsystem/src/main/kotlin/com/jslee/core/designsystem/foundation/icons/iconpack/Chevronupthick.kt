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

public val MooBesideIconPack.Chevronupthick: ImageVector
    get() {
        if (_chevronupthick != null) {
            return _chevronupthick!!
        }
        _chevronupthick = Builder(name = "Chevronupthick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.081f, 16.419f)
                curveTo(3.589f, 16.927f, 4.412f, 16.927f, 4.919f, 16.419f)
                lineTo(12.0f, 9.338f)
                lineTo(19.081f, 16.419f)
                curveTo(19.589f, 16.927f, 20.412f, 16.927f, 20.919f, 16.419f)
                curveTo(21.427f, 15.912f, 21.427f, 15.089f, 20.919f, 14.581f)
                lineTo(12.919f, 6.581f)
                curveTo(12.412f, 6.073f, 11.589f, 6.073f, 11.081f, 6.581f)
                lineTo(3.081f, 14.581f)
                curveTo(2.573f, 15.089f, 2.573f, 15.912f, 3.081f, 16.419f)
                close()
            }
        }
        .build()
        return _chevronupthick!!
    }

private var _chevronupthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronupthick, contentDescription = "")
    }
}
