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

public val MooBesideIconPack.Checkthick: ImageVector
    get() {
        if (_checkthick != null) {
            return _checkthick!!
        }
        _checkthick = Builder(name = "Checkthick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.67f, 6.581f)
                curveTo(20.177f, 7.089f, 20.177f, 7.912f, 19.67f, 8.419f)
                lineTo(10.67f, 17.419f)
                curveTo(10.162f, 17.927f, 9.339f, 17.927f, 8.831f, 17.419f)
                lineTo(4.331f, 12.919f)
                curveTo(3.824f, 12.412f, 3.824f, 11.589f, 4.331f, 11.081f)
                curveTo(4.839f, 10.573f, 5.662f, 10.573f, 6.17f, 11.081f)
                lineTo(9.75f, 14.662f)
                lineTo(17.831f, 6.581f)
                curveTo(18.339f, 6.073f, 19.162f, 6.073f, 19.67f, 6.581f)
                close()
            }
        }
        .build()
        return _checkthick!!
    }

private var _checkthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Checkthick, contentDescription = "")
    }
}
