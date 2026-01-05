package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Squarecheck: ImageVector
    get() {
        if (_squarecheck != null) {
            return _squarecheck!!
        }
        _squarecheck = Builder(name = "Squarecheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.646f, 9.876f)
                curveTo(16.992f, 9.519f, 16.983f, 8.949f, 16.625f, 8.603f)
                curveTo(16.268f, 8.258f, 15.699f, 8.267f, 15.353f, 8.624f)
                lineTo(10.677f, 13.455f)
                lineTo(8.647f, 11.352f)
                curveTo(8.302f, 10.995f, 7.732f, 10.985f, 7.375f, 11.33f)
                curveTo(7.017f, 11.675f, 7.007f, 12.245f, 7.352f, 12.602f)
                lineTo(10.028f, 15.375f)
                curveTo(10.198f, 15.551f, 10.432f, 15.65f, 10.675f, 15.65f)
                curveTo(10.92f, 15.65f, 11.153f, 15.551f, 11.323f, 15.376f)
                lineTo(16.646f, 9.876f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.262f, 2.6f)
                curveTo(7.454f, 2.6f, 6.793f, 2.6f, 6.256f, 2.644f)
                curveTo(5.701f, 2.689f, 5.198f, 2.786f, 4.73f, 3.025f)
                curveTo(3.996f, 3.399f, 3.399f, 3.996f, 3.025f, 4.73f)
                curveTo(2.786f, 5.198f, 2.689f, 5.701f, 2.644f, 6.256f)
                curveTo(2.6f, 6.793f, 2.6f, 7.454f, 2.6f, 8.262f)
                verticalLineTo(15.738f)
                curveTo(2.6f, 16.546f, 2.6f, 17.207f, 2.644f, 17.744f)
                curveTo(2.689f, 18.3f, 2.786f, 18.802f, 3.025f, 19.271f)
                curveTo(3.399f, 20.004f, 3.996f, 20.601f, 4.73f, 20.975f)
                curveTo(5.198f, 21.214f, 5.701f, 21.311f, 6.256f, 21.356f)
                curveTo(6.793f, 21.4f, 7.454f, 21.4f, 8.262f, 21.4f)
                horizontalLineTo(15.738f)
                curveTo(16.546f, 21.4f, 17.207f, 21.4f, 17.744f, 21.356f)
                curveTo(18.3f, 21.311f, 18.802f, 21.214f, 19.271f, 20.975f)
                curveTo(20.004f, 20.601f, 20.601f, 20.004f, 20.975f, 19.271f)
                curveTo(21.214f, 18.802f, 21.311f, 18.3f, 21.356f, 17.744f)
                curveTo(21.4f, 17.207f, 21.4f, 16.546f, 21.4f, 15.738f)
                verticalLineTo(8.262f)
                curveTo(21.4f, 7.454f, 21.4f, 6.793f, 21.356f, 6.256f)
                curveTo(21.311f, 5.701f, 21.214f, 5.198f, 20.975f, 4.73f)
                curveTo(20.601f, 3.996f, 20.004f, 3.399f, 19.271f, 3.025f)
                curveTo(18.802f, 2.786f, 18.3f, 2.689f, 17.744f, 2.644f)
                curveTo(17.207f, 2.6f, 16.546f, 2.6f, 15.738f, 2.6f)
                horizontalLineTo(8.262f)
                close()
                moveTo(5.547f, 4.629f)
                curveTo(5.72f, 4.541f, 5.958f, 4.474f, 6.403f, 4.438f)
                curveTo(6.858f, 4.401f, 7.445f, 4.4f, 8.3f, 4.4f)
                horizontalLineTo(15.7f)
                curveTo(16.555f, 4.4f, 17.142f, 4.401f, 17.597f, 4.438f)
                curveTo(18.042f, 4.474f, 18.281f, 4.541f, 18.454f, 4.629f)
                curveTo(18.849f, 4.83f, 19.17f, 5.152f, 19.371f, 5.547f)
                curveTo(19.459f, 5.72f, 19.526f, 5.958f, 19.562f, 6.403f)
                curveTo(19.599f, 6.858f, 19.6f, 7.445f, 19.6f, 8.3f)
                verticalLineTo(15.7f)
                curveTo(19.6f, 16.555f, 19.599f, 17.142f, 19.562f, 17.597f)
                curveTo(19.526f, 18.042f, 19.459f, 18.281f, 19.371f, 18.454f)
                curveTo(19.17f, 18.849f, 18.849f, 19.17f, 18.454f, 19.371f)
                curveTo(18.281f, 19.459f, 18.042f, 19.526f, 17.597f, 19.562f)
                curveTo(17.142f, 19.599f, 16.555f, 19.6f, 15.7f, 19.6f)
                horizontalLineTo(8.3f)
                curveTo(7.445f, 19.6f, 6.858f, 19.599f, 6.403f, 19.562f)
                curveTo(5.958f, 19.526f, 5.72f, 19.459f, 5.547f, 19.371f)
                curveTo(5.152f, 19.17f, 4.83f, 18.849f, 4.629f, 18.454f)
                curveTo(4.541f, 18.281f, 4.474f, 18.042f, 4.438f, 17.597f)
                curveTo(4.401f, 17.142f, 4.4f, 16.555f, 4.4f, 15.7f)
                verticalLineTo(8.3f)
                curveTo(4.4f, 7.445f, 4.401f, 6.858f, 4.438f, 6.403f)
                curveTo(4.474f, 5.958f, 4.541f, 5.72f, 4.629f, 5.547f)
                curveTo(4.83f, 5.152f, 5.152f, 4.83f, 5.547f, 4.629f)
                close()
            }
        }
        .build()
        return _squarecheck!!
    }

private var _squarecheck: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Squarecheck, contentDescription = "")
    }
}
