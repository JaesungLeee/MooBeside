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

public val MooBesideIconPack.Squaremore: ImageVector
    get() {
        if (_squaremore != null) {
            return _squaremore!!
        }
        _squaremore = Builder(name = "Squaremore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 12.553f, 8.802f, 13.0f, 8.25f, 13.0f)
                curveTo(7.697f, 13.0f, 7.25f, 12.553f, 7.25f, 12.0f)
                curveTo(7.25f, 11.448f, 7.697f, 11.0f, 8.25f, 11.0f)
                curveTo(8.802f, 11.0f, 9.25f, 11.448f, 9.25f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.553f, 13.0f, 12.0f)
                curveTo(13.0f, 11.448f, 12.552f, 11.0f, 12.0f, 11.0f)
                curveTo(11.447f, 11.0f, 11.0f, 11.448f, 11.0f, 12.0f)
                curveTo(11.0f, 12.553f, 11.447f, 13.0f, 12.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 13.0f)
                curveTo(16.302f, 13.0f, 16.75f, 12.553f, 16.75f, 12.0f)
                curveTo(16.75f, 11.448f, 16.302f, 11.0f, 15.75f, 11.0f)
                curveTo(15.197f, 11.0f, 14.75f, 11.448f, 14.75f, 12.0f)
                curveTo(14.75f, 12.553f, 15.197f, 13.0f, 15.75f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.263f, 2.602f)
                curveTo(7.455f, 2.602f, 6.794f, 2.602f, 6.257f, 2.646f)
                curveTo(5.701f, 2.691f, 5.199f, 2.788f, 4.73f, 3.027f)
                curveTo(3.996f, 3.401f, 3.399f, 3.998f, 3.025f, 4.731f)
                curveTo(2.786f, 5.2f, 2.69f, 5.702f, 2.644f, 6.258f)
                curveTo(2.6f, 6.795f, 2.6f, 7.456f, 2.6f, 8.264f)
                verticalLineTo(15.74f)
                curveTo(2.6f, 16.548f, 2.6f, 17.209f, 2.644f, 17.746f)
                curveTo(2.69f, 18.302f, 2.786f, 18.804f, 3.025f, 19.273f)
                curveTo(3.399f, 20.006f, 3.996f, 20.603f, 4.73f, 20.977f)
                curveTo(5.199f, 21.216f, 5.701f, 21.313f, 6.257f, 21.358f)
                curveTo(6.794f, 21.402f, 7.455f, 21.402f, 8.263f, 21.402f)
                horizontalLineTo(15.738f)
                curveTo(16.546f, 21.402f, 17.207f, 21.402f, 17.744f, 21.358f)
                curveTo(18.3f, 21.313f, 18.802f, 21.216f, 19.271f, 20.977f)
                curveTo(20.005f, 20.603f, 20.601f, 20.006f, 20.975f, 19.273f)
                curveTo(21.214f, 18.804f, 21.311f, 18.302f, 21.356f, 17.746f)
                curveTo(21.4f, 17.209f, 21.4f, 16.548f, 21.4f, 15.74f)
                verticalLineTo(8.264f)
                curveTo(21.4f, 7.456f, 21.4f, 6.795f, 21.356f, 6.258f)
                curveTo(21.311f, 5.702f, 21.214f, 5.2f, 20.975f, 4.731f)
                curveTo(20.601f, 3.998f, 20.005f, 3.401f, 19.271f, 3.027f)
                curveTo(18.802f, 2.788f, 18.3f, 2.691f, 17.744f, 2.646f)
                curveTo(17.207f, 2.602f, 16.546f, 2.602f, 15.738f, 2.602f)
                horizontalLineTo(8.263f)
                close()
                moveTo(5.547f, 4.631f)
                curveTo(5.72f, 4.543f, 5.959f, 4.476f, 6.403f, 4.44f)
                curveTo(6.858f, 4.403f, 7.445f, 4.402f, 8.3f, 4.402f)
                horizontalLineTo(15.7f)
                curveTo(16.555f, 4.402f, 17.142f, 4.403f, 17.597f, 4.44f)
                curveTo(18.042f, 4.476f, 18.281f, 4.543f, 18.454f, 4.631f)
                curveTo(18.849f, 4.832f, 19.17f, 5.154f, 19.371f, 5.549f)
                curveTo(19.459f, 5.722f, 19.526f, 5.96f, 19.562f, 6.405f)
                curveTo(19.6f, 6.86f, 19.6f, 7.447f, 19.6f, 8.302f)
                verticalLineTo(15.702f)
                curveTo(19.6f, 16.557f, 19.6f, 17.144f, 19.562f, 17.599f)
                curveTo(19.526f, 18.044f, 19.459f, 18.283f, 19.371f, 18.455f)
                curveTo(19.17f, 18.851f, 18.849f, 19.172f, 18.454f, 19.373f)
                curveTo(18.281f, 19.461f, 18.042f, 19.528f, 17.597f, 19.564f)
                curveTo(17.142f, 19.601f, 16.555f, 19.602f, 15.7f, 19.602f)
                horizontalLineTo(8.3f)
                curveTo(7.445f, 19.602f, 6.858f, 19.601f, 6.403f, 19.564f)
                curveTo(5.959f, 19.528f, 5.72f, 19.461f, 5.547f, 19.373f)
                curveTo(5.152f, 19.172f, 4.831f, 18.851f, 4.629f, 18.455f)
                curveTo(4.541f, 18.283f, 4.474f, 18.044f, 4.438f, 17.599f)
                curveTo(4.401f, 17.144f, 4.4f, 16.557f, 4.4f, 15.702f)
                verticalLineTo(8.302f)
                curveTo(4.4f, 7.447f, 4.401f, 6.86f, 4.438f, 6.405f)
                curveTo(4.474f, 5.96f, 4.541f, 5.722f, 4.629f, 5.549f)
                curveTo(4.831f, 5.154f, 5.152f, 4.832f, 5.547f, 4.631f)
                close()
            }
        }
        .build()
        return _squaremore!!
    }

private var _squaremore: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Squaremore, contentDescription = "")
    }
}
