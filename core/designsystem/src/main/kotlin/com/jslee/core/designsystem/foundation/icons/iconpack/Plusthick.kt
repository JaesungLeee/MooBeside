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

public val MooBesideIconPack.Plusthick: ImageVector
    get() {
        if (_plusthick != null) {
            return _plusthick!!
        }
        _plusthick = Builder(name = "Plusthick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.702f)
                curveTo(12.718f, 2.702f, 13.3f, 3.284f, 13.3f, 4.002f)
                verticalLineTo(10.702f)
                horizontalLineTo(20.0f)
                curveTo(20.718f, 10.702f, 21.3f, 11.284f, 21.3f, 12.002f)
                curveTo(21.3f, 12.72f, 20.718f, 13.302f, 20.0f, 13.302f)
                horizontalLineTo(13.3f)
                verticalLineTo(20.002f)
                curveTo(13.3f, 20.72f, 12.718f, 21.302f, 12.0f, 21.302f)
                curveTo(11.282f, 21.302f, 10.7f, 20.72f, 10.7f, 20.002f)
                verticalLineTo(13.302f)
                horizontalLineTo(4.0f)
                curveTo(3.282f, 13.302f, 2.7f, 12.72f, 2.7f, 12.002f)
                curveTo(2.7f, 11.284f, 3.282f, 10.702f, 4.0f, 10.702f)
                horizontalLineTo(10.7f)
                verticalLineTo(4.002f)
                curveTo(10.7f, 3.284f, 11.282f, 2.702f, 12.0f, 2.702f)
                close()
            }
        }
        .build()
        return _plusthick!!
    }

private var _plusthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Plusthick, contentDescription = "")
    }
}
