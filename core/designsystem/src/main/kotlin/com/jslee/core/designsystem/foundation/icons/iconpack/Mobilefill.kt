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

public val MooBesideIconPack.Mobilefill: ImageVector
    get() {
        if (_mobilefill != null) {
            return _mobilefill!!
        }
        _mobilefill = Builder(name = "Mobilefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.414f, 2.1f)
                horizontalLineTo(14.585f)
                curveTo(15.115f, 2.1f, 15.566f, 2.1f, 15.937f, 2.13f)
                curveTo(16.326f, 2.162f, 16.705f, 2.231f, 17.066f, 2.416f)
                curveTo(17.612f, 2.694f, 18.056f, 3.137f, 18.334f, 3.683f)
                curveTo(18.518f, 4.045f, 18.588f, 4.424f, 18.62f, 4.813f)
                curveTo(18.65f, 5.183f, 18.65f, 5.634f, 18.65f, 6.164f)
                verticalLineTo(17.835f)
                curveTo(18.65f, 18.365f, 18.65f, 18.816f, 18.62f, 19.187f)
                curveTo(18.588f, 19.576f, 18.518f, 19.954f, 18.334f, 20.316f)
                curveTo(18.056f, 20.862f, 17.612f, 21.306f, 17.066f, 21.583f)
                curveTo(16.705f, 21.768f, 16.326f, 21.838f, 15.937f, 21.869f)
                curveTo(15.566f, 21.9f, 15.115f, 21.9f, 14.585f, 21.9f)
                horizontalLineTo(9.414f)
                curveTo(8.885f, 21.9f, 8.433f, 21.9f, 8.063f, 21.869f)
                curveTo(7.674f, 21.838f, 7.295f, 21.768f, 6.933f, 21.583f)
                curveTo(6.388f, 21.306f, 5.944f, 20.862f, 5.666f, 20.316f)
                curveTo(5.482f, 19.954f, 5.412f, 19.576f, 5.38f, 19.187f)
                curveTo(5.35f, 18.816f, 5.35f, 18.365f, 5.35f, 17.835f)
                verticalLineTo(6.164f)
                curveTo(5.35f, 5.634f, 5.35f, 5.183f, 5.38f, 4.813f)
                curveTo(5.412f, 4.424f, 5.482f, 4.045f, 5.666f, 3.683f)
                curveTo(5.944f, 3.137f, 6.388f, 2.694f, 6.933f, 2.416f)
                curveTo(7.295f, 2.231f, 7.674f, 2.162f, 8.063f, 2.13f)
                curveTo(8.433f, 2.1f, 8.885f, 2.1f, 9.414f, 2.1f)
                close()
                moveTo(10.0f, 17.826f)
                curveTo(9.627f, 17.826f, 9.325f, 18.128f, 9.325f, 18.5f)
                curveTo(9.325f, 18.873f, 9.627f, 19.176f, 10.0f, 19.176f)
                horizontalLineTo(14.0f)
                curveTo(14.373f, 19.176f, 14.675f, 18.873f, 14.675f, 18.5f)
                curveTo(14.675f, 18.128f, 14.373f, 17.826f, 14.0f, 17.826f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _mobilefill!!
    }

private var _mobilefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Mobilefill, contentDescription = "")
    }
}
