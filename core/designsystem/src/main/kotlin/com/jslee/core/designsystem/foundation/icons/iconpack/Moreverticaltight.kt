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

public val MooBesideIconPack.Moreverticaltight: ImageVector
    get() {
        if (_moreverticaltight != null) {
            return _moreverticaltight!!
        }
        _moreverticaltight = Builder(name = "Moreverticaltight", defaultWidth = 12.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 18.75f)
                curveTo(7.75f, 17.784f, 6.966f, 17.0f, 6.0f, 17.0f)
                curveTo(5.033f, 17.0f, 4.25f, 17.784f, 4.25f, 18.75f)
                curveTo(4.25f, 19.716f, 5.033f, 20.5f, 6.0f, 20.5f)
                curveTo(6.966f, 20.5f, 7.75f, 19.716f, 7.75f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.25f)
                curveTo(6.966f, 10.25f, 7.75f, 11.033f, 7.75f, 12.0f)
                curveTo(7.75f, 12.967f, 6.966f, 13.75f, 6.0f, 13.75f)
                curveTo(5.033f, 13.75f, 4.25f, 12.967f, 4.25f, 12.0f)
                curveTo(4.25f, 11.033f, 5.033f, 10.25f, 6.0f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.5f)
                curveTo(6.966f, 3.5f, 7.75f, 4.284f, 7.75f, 5.25f)
                curveTo(7.75f, 6.216f, 6.966f, 7.0f, 6.0f, 7.0f)
                curveTo(5.033f, 7.0f, 4.25f, 6.216f, 4.25f, 5.25f)
                curveTo(4.25f, 4.284f, 5.033f, 3.5f, 6.0f, 3.5f)
                close()
            }
        }
        .build()
        return _moreverticaltight!!
    }

private var _moreverticaltight: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Moreverticaltight, contentDescription = "")
    }
}
