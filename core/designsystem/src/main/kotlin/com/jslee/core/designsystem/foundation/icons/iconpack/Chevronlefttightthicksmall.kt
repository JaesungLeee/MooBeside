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

public val MooBesideIconPack.Chevronlefttightthicksmall: ImageVector
    get() {
        if (_chevronlefttightthicksmall != null) {
            return _chevronlefttightthicksmall!!
        }
        _chevronlefttightthicksmall = Builder(name = "Chevronlefttightthicksmall", defaultWidth =
                12.0.dp, defaultHeight = 24.0.dp, viewportWidth = 12.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.419f, 4.581f)
                curveTo(9.927f, 5.088f, 9.927f, 5.912f, 9.419f, 6.419f)
                lineTo(3.838f, 12.0f)
                lineTo(9.419f, 17.581f)
                curveTo(9.927f, 18.088f, 9.927f, 18.912f, 9.419f, 19.419f)
                curveTo(8.911f, 19.927f, 8.088f, 19.927f, 7.58f, 19.419f)
                lineTo(1.08f, 12.919f)
                curveTo(0.573f, 12.411f, 0.573f, 11.588f, 1.08f, 11.081f)
                lineTo(7.58f, 4.581f)
                curveTo(8.088f, 4.073f, 8.911f, 4.073f, 9.419f, 4.581f)
                close()
            }
        }
        .build()
        return _chevronlefttightthicksmall!!
    }

private var _chevronlefttightthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronlefttightthicksmall, contentDescription = "")
    }
}
