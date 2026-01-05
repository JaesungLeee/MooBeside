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

public val MooBesideIconPack.Templatefill: ImageVector
    get() {
        if (_templatefill != null) {
            return _templatefill!!
        }
        _templatefill = Builder(name = "Templatefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.263f, 2.603f)
                horizontalLineTo(15.738f)
                curveTo(16.546f, 2.603f, 17.207f, 2.603f, 17.744f, 2.646f)
                curveTo(18.3f, 2.692f, 18.802f, 2.789f, 19.271f, 3.028f)
                curveTo(20.005f, 3.402f, 20.601f, 3.998f, 20.975f, 4.732f)
                curveTo(21.214f, 5.201f, 21.311f, 5.703f, 21.356f, 6.259f)
                curveTo(21.4f, 6.796f, 21.4f, 7.457f, 21.4f, 8.265f)
                verticalLineTo(8.601f)
                horizontalLineTo(2.6f)
                verticalLineTo(8.265f)
                curveTo(2.6f, 7.457f, 2.6f, 6.796f, 2.644f, 6.259f)
                curveTo(2.69f, 5.703f, 2.786f, 5.201f, 3.025f, 4.732f)
                curveTo(3.399f, 3.998f, 3.996f, 3.402f, 4.73f, 3.028f)
                curveTo(5.199f, 2.789f, 5.701f, 2.692f, 6.257f, 2.646f)
                curveTo(6.794f, 2.603f, 7.455f, 2.603f, 8.263f, 2.603f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6f, 10.401f)
                verticalLineTo(15.74f)
                curveTo(2.6f, 16.548f, 2.6f, 17.209f, 2.644f, 17.746f)
                curveTo(2.69f, 18.302f, 2.786f, 18.804f, 3.025f, 19.273f)
                curveTo(3.399f, 20.007f, 3.996f, 20.604f, 4.73f, 20.978f)
                curveTo(5.199f, 21.216f, 5.701f, 21.313f, 6.257f, 21.359f)
                curveTo(6.794f, 21.403f, 7.455f, 21.403f, 8.263f, 21.403f)
                horizontalLineTo(8.6f)
                verticalLineTo(10.401f)
                horizontalLineTo(2.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4f, 21.403f)
                horizontalLineTo(15.738f)
                curveTo(16.546f, 21.403f, 17.207f, 21.403f, 17.744f, 21.359f)
                curveTo(18.3f, 21.313f, 18.802f, 21.216f, 19.271f, 20.978f)
                curveTo(20.005f, 20.604f, 20.601f, 20.007f, 20.975f, 19.273f)
                curveTo(21.214f, 18.804f, 21.311f, 18.302f, 21.356f, 17.746f)
                curveTo(21.4f, 17.209f, 21.4f, 16.548f, 21.4f, 15.74f)
                verticalLineTo(10.401f)
                horizontalLineTo(10.4f)
                verticalLineTo(21.403f)
                close()
            }
        }
        .build()
        return _templatefill!!
    }

private var _templatefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Templatefill, contentDescription = "")
    }
}
