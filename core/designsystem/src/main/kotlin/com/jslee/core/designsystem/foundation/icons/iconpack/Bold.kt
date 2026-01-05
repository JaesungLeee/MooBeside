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

public val MooBesideIconPack.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.65f, 20.5f)
                curveTo(7.81f, 20.5f, 7.39f, 20.5f, 7.069f, 20.337f)
                curveTo(6.787f, 20.193f, 6.557f, 19.963f, 6.413f, 19.681f)
                curveTo(6.25f, 19.36f, 6.25f, 18.94f, 6.25f, 18.1f)
                verticalLineTo(5.899f)
                curveTo(6.25f, 5.059f, 6.25f, 4.639f, 6.413f, 4.318f)
                curveTo(6.557f, 4.036f, 6.787f, 3.806f, 7.069f, 3.663f)
                curveTo(7.39f, 3.499f, 7.81f, 3.499f, 8.65f, 3.499f)
                horizontalLineTo(11.939f)
                curveTo(15.156f, 3.499f, 17.293f, 5.26f, 17.293f, 7.867f)
                curveTo(17.293f, 9.651f, 16.284f, 10.896f, 14.476f, 11.459f)
                verticalLineTo(11.553f)
                curveTo(16.835f, 12.082f, 18.162f, 13.526f, 18.162f, 15.686f)
                curveTo(18.162f, 18.574f, 15.814f, 20.5f, 12.315f, 20.5f)
                horizontalLineTo(8.65f)
                close()
                moveTo(12.339f, 18.574f)
                curveTo(14.687f, 18.574f, 16.049f, 17.447f, 16.049f, 15.545f)
                curveTo(16.049f, 13.643f, 14.616f, 12.516f, 12.151f, 12.516f)
                horizontalLineTo(8.316f)
                verticalLineTo(18.574f)
                horizontalLineTo(12.339f)
                close()
                moveTo(11.775f, 10.637f)
                curveTo(13.935f, 10.637f, 15.18f, 9.675f, 15.18f, 8.031f)
                curveTo(15.18f, 6.387f, 14.006f, 5.425f, 11.963f, 5.425f)
                horizontalLineTo(8.316f)
                verticalLineTo(10.637f)
                horizontalLineTo(11.775f)
                close()
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bold, contentDescription = "")
    }
}
