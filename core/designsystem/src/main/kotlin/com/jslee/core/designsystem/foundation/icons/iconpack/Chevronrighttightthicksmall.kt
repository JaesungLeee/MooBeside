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

public val MooBesideIconPack.Chevronrighttightthicksmall: ImageVector
    get() {
        if (_chevronrighttightthicksmall != null) {
            return _chevronrighttightthicksmall!!
        }
        _chevronrighttightthicksmall = Builder(name = "Chevronrighttightthicksmall", defaultWidth =
                12.0.dp, defaultHeight = 24.0.dp, viewportWidth = 12.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.581f, 4.581f)
                curveTo(2.073f, 5.089f, 2.073f, 5.912f, 2.581f, 6.419f)
                lineTo(8.162f, 12.0f)
                lineTo(2.581f, 17.581f)
                curveTo(2.073f, 18.089f, 2.073f, 18.912f, 2.581f, 19.419f)
                curveTo(3.089f, 19.927f, 3.912f, 19.927f, 4.419f, 19.419f)
                lineTo(10.919f, 12.919f)
                curveTo(11.427f, 12.412f, 11.427f, 11.589f, 10.919f, 11.081f)
                lineTo(4.419f, 4.581f)
                curveTo(3.912f, 4.073f, 3.089f, 4.073f, 2.581f, 4.581f)
                close()
            }
        }
        .build()
        return _chevronrighttightthicksmall!!
    }

private var _chevronrighttightthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronrighttightthicksmall, contentDescription = "")
    }
}
