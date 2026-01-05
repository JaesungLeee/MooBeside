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

public val MooBesideIconPack.Chevronleftthicksmall: ImageVector
    get() {
        if (_chevronleftthicksmall != null) {
            return _chevronleftthicksmall!!
        }
        _chevronleftthicksmall = Builder(name = "Chevronleftthicksmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.419f, 4.581f)
                curveTo(15.927f, 5.088f, 15.927f, 5.912f, 15.419f, 6.419f)
                lineTo(9.839f, 12.0f)
                lineTo(15.419f, 17.581f)
                curveTo(15.927f, 18.088f, 15.927f, 18.912f, 15.419f, 19.419f)
                curveTo(14.912f, 19.927f, 14.089f, 19.927f, 13.581f, 19.419f)
                lineTo(7.081f, 12.919f)
                curveTo(6.573f, 12.411f, 6.573f, 11.588f, 7.081f, 11.081f)
                lineTo(13.581f, 4.581f)
                curveTo(14.089f, 4.073f, 14.912f, 4.073f, 15.419f, 4.581f)
                close()
            }
        }
        .build()
        return _chevronleftthicksmall!!
    }

private var _chevronleftthicksmall: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Chevronleftthicksmall, contentDescription = "")
    }
}
