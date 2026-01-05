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

public val MooBesideIconPack.Bookmarkfill: ImageVector
    get() {
        if (_bookmarkfill != null) {
            return _bookmarkfill!!
        }
        _bookmarkfill = Builder(name = "Bookmarkfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.164f, 2.6f)
                curveTo(7.635f, 2.6f, 7.183f, 2.6f, 6.813f, 2.63f)
                curveTo(6.424f, 2.662f, 6.045f, 2.732f, 5.683f, 2.916f)
                curveTo(5.138f, 3.194f, 4.694f, 3.638f, 4.416f, 4.183f)
                curveTo(4.232f, 4.545f, 4.162f, 4.924f, 4.13f, 5.313f)
                curveTo(4.1f, 5.683f, 4.1f, 6.135f, 4.1f, 6.664f)
                verticalLineTo(21.5f)
                curveTo(4.1f, 21.825f, 4.275f, 22.125f, 4.558f, 22.284f)
                curveTo(4.842f, 22.444f, 5.189f, 22.438f, 5.467f, 22.269f)
                lineTo(12.0f, 18.303f)
                lineTo(18.533f, 22.269f)
                curveTo(18.811f, 22.438f, 19.158f, 22.444f, 19.441f, 22.284f)
                curveTo(19.725f, 22.125f, 19.9f, 21.825f, 19.9f, 21.5f)
                verticalLineTo(6.664f)
                curveTo(19.9f, 6.135f, 19.9f, 5.683f, 19.87f, 5.313f)
                curveTo(19.838f, 4.924f, 19.768f, 4.545f, 19.584f, 4.183f)
                curveTo(19.306f, 3.638f, 18.862f, 3.194f, 18.316f, 2.916f)
                curveTo(17.954f, 2.732f, 17.576f, 2.662f, 17.187f, 2.63f)
                curveTo(16.816f, 2.6f, 16.365f, 2.6f, 15.835f, 2.6f)
                horizontalLineTo(8.164f)
                close()
            }
        }
        .build()
        return _bookmarkfill!!
    }

private var _bookmarkfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Bookmarkfill, contentDescription = "")
    }
}
