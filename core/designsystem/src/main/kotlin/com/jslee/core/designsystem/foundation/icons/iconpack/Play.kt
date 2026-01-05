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

public val MooBesideIconPack.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.834f, 18.63f)
                curveTo(9.25f, 19.57f, 8.459f, 20.041f, 7.808f, 19.978f)
                curveTo(7.24f, 19.923f, 6.723f, 19.628f, 6.386f, 19.168f)
                curveTo(6.0f, 18.641f, 6.0f, 17.72f, 6.0f, 15.879f)
                verticalLineTo(8.122f)
                curveTo(6.0f, 6.281f, 6.0f, 5.36f, 6.386f, 4.832f)
                curveTo(6.723f, 4.372f, 7.24f, 4.078f, 7.808f, 4.023f)
                curveTo(8.459f, 3.96f, 9.25f, 4.43f, 10.834f, 5.37f)
                lineTo(17.366f, 9.249f)
                curveTo(18.892f, 10.155f, 19.655f, 10.608f, 19.913f, 11.196f)
                curveTo(20.139f, 11.709f, 20.139f, 12.292f, 19.913f, 12.805f)
                curveTo(19.655f, 13.392f, 18.892f, 13.846f, 17.366f, 14.752f)
                lineTo(10.834f, 18.63f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Play, contentDescription = "")
    }
}
