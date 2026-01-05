package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.922f, 9.67f)
                curveTo(9.826f, 9.741f, 9.741f, 9.826f, 9.671f, 9.922f)
                curveTo(9.584f, 10.04f, 9.531f, 10.172f, 9.518f, 10.205f)
                lineTo(9.516f, 10.211f)
                lineTo(7.649f, 14.663f)
                curveTo(7.599f, 14.782f, 7.54f, 14.921f, 7.502f, 15.042f)
                curveTo(7.47f, 15.141f, 7.375f, 15.44f, 7.483f, 15.775f)
                curveTo(7.597f, 16.127f, 7.873f, 16.403f, 8.224f, 16.516f)
                curveTo(8.56f, 16.625f, 8.858f, 16.529f, 8.957f, 16.498f)
                curveTo(9.078f, 16.459f, 9.217f, 16.401f, 9.337f, 16.35f)
                lineTo(13.788f, 14.484f)
                lineTo(13.794f, 14.481f)
                curveTo(13.827f, 14.468f, 13.959f, 14.415f, 14.078f, 14.329f)
                curveTo(14.174f, 14.259f, 14.259f, 14.174f, 14.329f, 14.077f)
                curveTo(14.415f, 13.959f, 14.469f, 13.827f, 14.482f, 13.794f)
                lineTo(14.484f, 13.788f)
                lineTo(16.351f, 9.337f)
                curveTo(16.401f, 9.217f, 16.459f, 9.078f, 16.498f, 8.957f)
                curveTo(16.53f, 8.858f, 16.625f, 8.559f, 16.517f, 8.224f)
                curveTo(16.403f, 7.872f, 16.127f, 7.597f, 15.776f, 7.483f)
                curveTo(15.44f, 7.375f, 15.142f, 7.47f, 15.042f, 7.502f)
                curveTo(14.922f, 7.54f, 14.783f, 7.599f, 14.663f, 7.649f)
                lineTo(10.212f, 9.515f)
                lineTo(10.206f, 9.518f)
                curveTo(10.173f, 9.531f, 10.041f, 9.584f, 9.922f, 9.67f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                curveTo(11.448f, 13.0f, 11.0f, 12.552f, 11.0f, 12.0f)
                curveTo(11.0f, 11.448f, 11.448f, 11.0f, 12.0f, 11.0f)
                curveTo(12.552f, 11.0f, 13.0f, 11.448f, 13.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.1f)
                curveTo(6.532f, 2.1f, 2.1f, 6.532f, 2.1f, 12.0f)
                curveTo(2.1f, 17.467f, 6.532f, 21.9f, 12.0f, 21.9f)
                curveTo(17.468f, 21.9f, 21.9f, 17.467f, 21.9f, 12.0f)
                curveTo(21.9f, 6.532f, 17.468f, 2.1f, 12.0f, 2.1f)
                close()
                moveTo(3.9f, 12.0f)
                curveTo(3.9f, 7.526f, 7.527f, 3.9f, 12.0f, 3.9f)
                curveTo(16.474f, 3.9f, 20.1f, 7.526f, 20.1f, 12.0f)
                curveTo(20.1f, 16.473f, 16.474f, 20.1f, 12.0f, 20.1f)
                curveTo(7.527f, 20.1f, 3.9f, 16.473f, 3.9f, 12.0f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Compass, contentDescription = "")
    }
}
