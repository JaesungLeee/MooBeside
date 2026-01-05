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

public val MooBesideIconPack.Pinfill: ImageVector
    get() {
        if (_pinfill != null) {
            return _pinfill!!
        }
        _pinfill = Builder(name = "Pinfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.947f, 2.602f)
                horizontalLineTo(15.053f)
                curveTo(15.469f, 2.602f, 15.842f, 2.602f, 16.141f, 2.629f)
                curveTo(16.445f, 2.657f, 16.821f, 2.723f, 17.152f, 2.961f)
                curveTo(17.586f, 3.275f, 17.868f, 3.757f, 17.928f, 4.289f)
                curveTo(17.974f, 4.694f, 17.847f, 5.053f, 17.722f, 5.332f)
                curveTo(17.599f, 5.607f, 17.416f, 5.931f, 17.212f, 6.294f)
                lineTo(16.4f, 7.737f)
                verticalLineTo(10.685f)
                lineTo(18.149f, 12.871f)
                curveTo(18.46f, 13.26f, 18.731f, 13.599f, 18.92f, 13.885f)
                curveTo(19.105f, 14.165f, 19.319f, 14.545f, 19.319f, 14.999f)
                curveTo(19.32f, 15.578f, 19.057f, 16.125f, 18.605f, 16.486f)
                curveTo(18.25f, 16.769f, 17.82f, 16.84f, 17.486f, 16.87f)
                curveTo(17.144f, 16.901f, 16.71f, 16.901f, 16.212f, 16.901f)
                lineTo(12.9f, 16.901f)
                verticalLineTo(22.001f)
                curveTo(12.9f, 22.498f, 12.497f, 22.901f, 12.0f, 22.901f)
                curveTo(11.503f, 22.901f, 11.1f, 22.498f, 11.1f, 22.001f)
                verticalLineTo(16.901f)
                lineTo(7.788f, 16.901f)
                curveTo(7.29f, 16.901f, 6.856f, 16.901f, 6.515f, 16.87f)
                curveTo(6.18f, 16.84f, 5.75f, 16.769f, 5.395f, 16.486f)
                curveTo(4.943f, 16.125f, 4.68f, 15.578f, 4.681f, 14.999f)
                curveTo(4.681f, 14.545f, 4.895f, 14.165f, 5.08f, 13.885f)
                curveTo(5.269f, 13.599f, 5.54f, 13.26f, 5.851f, 12.871f)
                lineTo(7.6f, 10.685f)
                verticalLineTo(7.737f)
                lineTo(6.788f, 6.294f)
                curveTo(6.584f, 5.931f, 6.402f, 5.607f, 6.279f, 5.332f)
                curveTo(6.154f, 5.053f, 6.027f, 4.694f, 6.072f, 4.289f)
                curveTo(6.132f, 3.757f, 6.414f, 3.275f, 6.849f, 2.961f)
                curveTo(7.179f, 2.723f, 7.555f, 2.657f, 7.859f, 2.629f)
                curveTo(8.159f, 2.602f, 8.531f, 2.602f, 8.947f, 2.602f)
                close()
            }
        }
        .build()
        return _pinfill!!
    }

private var _pinfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Pinfill, contentDescription = "")
    }
}
