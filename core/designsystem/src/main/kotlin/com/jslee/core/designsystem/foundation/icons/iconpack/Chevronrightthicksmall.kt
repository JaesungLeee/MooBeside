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

public val MooBesideIconPack.Chevronrightthicksmall: ImageVector
    get() {
        if (_chevronrightthicksmall != null) {
            return _chevronrightthicksmall!!
        }
        _chevronrightthicksmall = Builder(name = "Chevronrightthicksmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.581f, 4.581f)
                curveTo(8.074f, 5.089f, 8.074f, 5.912f, 8.581f, 6.419f)
                lineTo(14.162f, 12.0f)
                lineTo(8.581f, 17.581f)
                curveTo(8.074f, 18.089f, 8.074f, 18.912f, 8.581f, 19.419f)
                curveTo(9.089f, 19.927f, 9.912f, 19.927f, 10.42f, 19.419f)
                lineTo(16.92f, 12.919f)
                curveTo(17.427f, 12.412f, 17.427f, 11.589f, 16.92f, 11.081f)
                lineTo(10.42f, 4.581f)
                curveTo(9.912f, 4.073f, 9.089f, 4.073f, 8.581f, 4.581f)
                close()
            }
        }
        .build()
        return _chevronrightthicksmall!!
    }

private var _chevronrightthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronrightthicksmall, contentDescription = "")
    }
}
