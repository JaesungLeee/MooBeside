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

public val MooBesideIconPack.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.164f, 2.6f)
                horizontalLineTo(15.835f)
                curveTo(16.365f, 2.6f, 16.816f, 2.6f, 17.187f, 2.63f)
                curveTo(17.576f, 2.662f, 17.954f, 2.732f, 18.316f, 2.916f)
                curveTo(18.862f, 3.194f, 19.306f, 3.638f, 19.584f, 4.183f)
                curveTo(19.768f, 4.545f, 19.838f, 4.924f, 19.87f, 5.313f)
                curveTo(19.9f, 5.683f, 19.9f, 6.135f, 19.9f, 6.664f)
                verticalLineTo(21.5f)
                curveTo(19.9f, 21.825f, 19.725f, 22.125f, 19.441f, 22.284f)
                curveTo(19.158f, 22.444f, 18.811f, 22.438f, 18.533f, 22.269f)
                lineTo(12.0f, 18.303f)
                lineTo(5.467f, 22.269f)
                curveTo(5.189f, 22.438f, 4.842f, 22.444f, 4.558f, 22.284f)
                curveTo(4.275f, 22.125f, 4.1f, 21.825f, 4.1f, 21.5f)
                verticalLineTo(6.664f)
                curveTo(4.1f, 6.135f, 4.1f, 5.683f, 4.13f, 5.313f)
                curveTo(4.162f, 4.924f, 4.232f, 4.545f, 4.416f, 4.183f)
                curveTo(4.694f, 3.638f, 5.138f, 3.194f, 5.683f, 2.916f)
                curveTo(6.045f, 2.732f, 6.424f, 2.662f, 6.813f, 2.63f)
                curveTo(7.183f, 2.6f, 7.635f, 2.6f, 8.164f, 2.6f)
                close()
                moveTo(7.8f, 4.4f)
                curveTo(6.985f, 4.4f, 6.791f, 4.411f, 6.66f, 4.454f)
                curveTo(6.325f, 4.563f, 6.063f, 4.825f, 5.954f, 5.16f)
                curveTo(5.911f, 5.292f, 5.9f, 5.485f, 5.9f, 6.3f)
                verticalLineTo(19.901f)
                lineTo(11.533f, 16.481f)
                curveTo(11.82f, 16.306f, 12.18f, 16.306f, 12.467f, 16.481f)
                lineTo(18.1f, 19.901f)
                verticalLineTo(6.3f)
                curveTo(18.1f, 5.485f, 18.089f, 5.292f, 18.046f, 5.16f)
                curveTo(17.937f, 4.825f, 17.675f, 4.563f, 17.34f, 4.454f)
                curveTo(17.208f, 4.411f, 17.014f, 4.4f, 16.2f, 4.4f)
                horizontalLineTo(7.8f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bookmark, contentDescription = "")
    }
}
