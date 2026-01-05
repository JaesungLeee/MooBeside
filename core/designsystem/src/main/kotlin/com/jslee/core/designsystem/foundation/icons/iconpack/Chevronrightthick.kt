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

public val MooBesideIconPack.Chevronrightthick: ImageVector
    get() {
        if (_chevronrightthick != null) {
            return _chevronrightthick!!
        }
        _chevronrightthick = Builder(name = "Chevronrightthick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.581f, 3.08f)
                curveTo(7.074f, 3.588f, 7.074f, 4.411f, 7.581f, 4.919f)
                lineTo(14.662f, 12.0f)
                lineTo(7.581f, 19.08f)
                curveTo(7.074f, 19.588f, 7.074f, 20.411f, 7.581f, 20.919f)
                curveTo(8.089f, 21.426f, 8.912f, 21.426f, 9.42f, 20.919f)
                lineTo(17.42f, 12.919f)
                curveTo(17.927f, 12.411f, 17.927f, 11.588f, 17.42f, 11.08f)
                lineTo(9.42f, 3.08f)
                curveTo(8.912f, 2.573f, 8.089f, 2.573f, 7.581f, 3.08f)
                close()
            }
        }
        .build()
        return _chevronrightthick!!
    }

private var _chevronrightthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronrightthick, contentDescription = "")
    }
}
