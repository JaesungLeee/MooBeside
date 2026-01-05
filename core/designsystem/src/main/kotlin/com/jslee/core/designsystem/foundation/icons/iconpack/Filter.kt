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

public val MooBesideIconPack.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.906f, 3.098f)
                horizontalLineTo(18.093f)
                curveTo(18.641f, 3.098f, 19.112f, 3.098f, 19.479f, 3.131f)
                curveTo(19.83f, 3.162f, 20.292f, 3.235f, 20.659f, 3.542f)
                curveTo(21.118f, 3.927f, 21.369f, 4.507f, 21.335f, 5.106f)
                curveTo(21.308f, 5.583f, 21.045f, 5.97f, 20.827f, 6.247f)
                curveTo(20.6f, 6.537f, 20.277f, 6.88f, 19.902f, 7.279f)
                lineTo(14.9f, 12.605f)
                verticalLineTo(18.953f)
                lineTo(14.9f, 18.969f)
                curveTo(14.901f, 19.037f, 14.905f, 19.251f, 14.834f, 19.456f)
                curveTo(14.776f, 19.624f, 14.682f, 19.777f, 14.557f, 19.904f)
                curveTo(14.406f, 20.059f, 14.212f, 20.152f, 14.151f, 20.181f)
                lineTo(14.137f, 20.188f)
                lineTo(11.077f, 21.718f)
                curveTo(10.981f, 21.766f, 10.86f, 21.826f, 10.752f, 21.869f)
                curveTo(10.636f, 21.914f, 10.406f, 21.993f, 10.125f, 21.952f)
                curveTo(9.798f, 21.904f, 9.506f, 21.723f, 9.317f, 21.452f)
                curveTo(9.154f, 21.22f, 9.122f, 20.978f, 9.11f, 20.854f)
                curveTo(9.1f, 20.738f, 9.1f, 20.604f, 9.1f, 20.496f)
                lineTo(9.1f, 12.605f)
                lineTo(4.097f, 7.279f)
                curveTo(3.722f, 6.88f, 3.4f, 6.537f, 3.172f, 6.247f)
                curveTo(2.955f, 5.97f, 2.691f, 5.583f, 2.664f, 5.106f)
                curveTo(2.63f, 4.507f, 2.881f, 3.927f, 3.341f, 3.542f)
                curveTo(3.708f, 3.235f, 4.17f, 3.162f, 4.52f, 3.131f)
                curveTo(4.887f, 3.098f, 5.359f, 3.098f, 5.906f, 3.098f)
                close()
                moveTo(4.488f, 5.067f)
                lineTo(10.656f, 11.632f)
                curveTo(10.813f, 11.799f, 10.9f, 12.019f, 10.9f, 12.248f)
                verticalLineTo(19.794f)
                lineTo(13.1f, 18.694f)
                verticalLineTo(12.248f)
                curveTo(13.1f, 12.019f, 13.187f, 11.799f, 13.344f, 11.632f)
                lineTo(19.511f, 5.067f)
                curveTo(19.571f, 5.003f, 19.526f, 4.898f, 19.438f, 4.898f)
                horizontalLineTo(4.561f)
                curveTo(4.474f, 4.898f, 4.428f, 5.003f, 4.488f, 5.067f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Filter, contentDescription = "")
    }
}
