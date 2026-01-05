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

public val MooBesideIconPack.Squareplusfill: ImageVector
    get() {
        if (_squareplusfill != null) {
            return _squareplusfill!!
        }
        _squareplusfill = Builder(name = "Squareplusfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.263f, 2.603f)
                horizontalLineTo(15.738f)
                curveTo(16.546f, 2.603f, 17.207f, 2.603f, 17.744f, 2.647f)
                curveTo(18.3f, 2.692f, 18.802f, 2.789f, 19.271f, 3.028f)
                curveTo(20.005f, 3.402f, 20.601f, 3.999f, 20.975f, 4.732f)
                curveTo(21.214f, 5.201f, 21.311f, 5.703f, 21.356f, 6.259f)
                curveTo(21.4f, 6.796f, 21.4f, 7.457f, 21.4f, 8.265f)
                verticalLineTo(15.741f)
                curveTo(21.4f, 16.549f, 21.4f, 17.21f, 21.356f, 17.747f)
                curveTo(21.311f, 18.303f, 21.214f, 18.805f, 20.975f, 19.274f)
                curveTo(20.601f, 20.007f, 20.005f, 20.604f, 19.271f, 20.978f)
                curveTo(18.802f, 21.217f, 18.3f, 21.314f, 17.744f, 21.359f)
                curveTo(17.207f, 21.403f, 16.546f, 21.403f, 15.738f, 21.403f)
                horizontalLineTo(8.263f)
                curveTo(7.454f, 21.403f, 6.794f, 21.403f, 6.257f, 21.359f)
                curveTo(5.701f, 21.314f, 5.199f, 21.217f, 4.73f, 20.978f)
                curveTo(3.996f, 20.604f, 3.399f, 20.007f, 3.025f, 19.274f)
                curveTo(2.786f, 18.805f, 2.69f, 18.303f, 2.644f, 17.747f)
                curveTo(2.6f, 17.21f, 2.6f, 16.549f, 2.6f, 15.741f)
                verticalLineTo(8.265f)
                curveTo(2.6f, 7.457f, 2.6f, 6.796f, 2.644f, 6.259f)
                curveTo(2.69f, 5.703f, 2.786f, 5.201f, 3.025f, 4.732f)
                curveTo(3.399f, 3.999f, 3.996f, 3.402f, 4.73f, 3.028f)
                curveTo(5.199f, 2.789f, 5.701f, 2.692f, 6.257f, 2.647f)
                curveTo(6.794f, 2.603f, 7.454f, 2.603f, 8.263f, 2.603f)
                close()
                moveTo(12.9f, 8.0f)
                curveTo(12.9f, 7.503f, 12.497f, 7.1f, 12.0f, 7.1f)
                curveTo(11.503f, 7.1f, 11.1f, 7.503f, 11.1f, 8.0f)
                verticalLineTo(11.101f)
                horizontalLineTo(8.0f)
                curveTo(7.503f, 11.101f, 7.1f, 11.503f, 7.1f, 12.0f)
                curveTo(7.1f, 12.498f, 7.503f, 12.901f, 8.0f, 12.901f)
                horizontalLineTo(11.1f)
                verticalLineTo(16.0f)
                curveTo(11.1f, 16.498f, 11.503f, 16.9f, 12.0f, 16.9f)
                curveTo(12.497f, 16.9f, 12.9f, 16.498f, 12.9f, 16.0f)
                verticalLineTo(12.901f)
                horizontalLineTo(16.0f)
                curveTo(16.497f, 12.901f, 16.9f, 12.498f, 16.9f, 12.0f)
                curveTo(16.9f, 11.503f, 16.497f, 11.101f, 16.0f, 11.101f)
                horizontalLineTo(12.9f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _squareplusfill!!
    }

private var _squareplusfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Squareplusfill, contentDescription = "")
    }
}
