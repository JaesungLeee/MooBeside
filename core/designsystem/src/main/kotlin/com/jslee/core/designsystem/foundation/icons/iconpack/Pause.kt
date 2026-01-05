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

public val MooBesideIconPack.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(5.75f, 18.465f, 5.75f, 18.698f, 5.801f, 18.888f)
                curveTo(5.94f, 19.406f, 6.344f, 19.81f, 6.862f, 19.949f)
                curveTo(7.053f, 20.0f, 7.285f, 20.0f, 7.75f, 20.0f)
                curveTo(8.215f, 20.0f, 8.447f, 20.0f, 8.638f, 19.949f)
                curveTo(9.156f, 19.81f, 9.56f, 19.406f, 9.699f, 18.888f)
                curveTo(9.75f, 18.698f, 9.75f, 18.465f, 9.75f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(9.75f, 5.535f, 9.75f, 5.303f, 9.699f, 5.112f)
                curveTo(9.56f, 4.594f, 9.156f, 4.19f, 8.638f, 4.051f)
                curveTo(8.447f, 4.0f, 8.215f, 4.0f, 7.75f, 4.0f)
                curveTo(7.285f, 4.0f, 7.053f, 4.0f, 6.862f, 4.051f)
                curveTo(6.344f, 4.19f, 5.94f, 4.594f, 5.801f, 5.112f)
                curveTo(5.75f, 5.303f, 5.75f, 5.535f, 5.75f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.199f, 5.112f)
                curveTo(18.25f, 5.303f, 18.25f, 5.535f, 18.25f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(18.25f, 18.465f, 18.25f, 18.698f, 18.199f, 18.888f)
                curveTo(18.06f, 19.406f, 17.656f, 19.81f, 17.138f, 19.949f)
                curveTo(16.947f, 20.0f, 16.715f, 20.0f, 16.25f, 20.0f)
                curveTo(15.785f, 20.0f, 15.552f, 20.0f, 15.362f, 19.949f)
                curveTo(14.844f, 19.81f, 14.44f, 19.406f, 14.301f, 18.888f)
                curveTo(14.25f, 18.698f, 14.25f, 18.465f, 14.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(14.25f, 5.535f, 14.25f, 5.303f, 14.301f, 5.112f)
                curveTo(14.44f, 4.594f, 14.844f, 4.19f, 15.362f, 4.051f)
                curveTo(15.552f, 4.0f, 15.785f, 4.0f, 16.25f, 4.0f)
                curveTo(16.715f, 4.0f, 16.947f, 4.0f, 17.138f, 4.051f)
                curveTo(17.656f, 4.19f, 18.06f, 4.594f, 18.199f, 5.112f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Pause, contentDescription = "")
    }
}
