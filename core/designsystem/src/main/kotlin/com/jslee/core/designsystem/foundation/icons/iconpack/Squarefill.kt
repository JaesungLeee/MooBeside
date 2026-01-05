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

public val MooBesideIconPack.Squarefill: ImageVector
    get() {
        if (_squarefill != null) {
            return _squarefill!!
        }
        _squarefill = Builder(name = "Squarefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.262f, 2.6f)
                curveTo(7.454f, 2.6f, 6.794f, 2.6f, 6.257f, 2.644f)
                curveTo(5.701f, 2.689f, 5.199f, 2.786f, 4.73f, 3.025f)
                curveTo(3.996f, 3.399f, 3.399f, 3.996f, 3.025f, 4.73f)
                curveTo(2.786f, 5.198f, 2.69f, 5.701f, 2.644f, 6.256f)
                curveTo(2.6f, 6.793f, 2.6f, 7.454f, 2.6f, 8.262f)
                verticalLineTo(15.738f)
                curveTo(2.6f, 16.546f, 2.6f, 17.207f, 2.644f, 17.744f)
                curveTo(2.69f, 18.3f, 2.786f, 18.802f, 3.025f, 19.271f)
                curveTo(3.399f, 20.004f, 3.996f, 20.601f, 4.73f, 20.975f)
                curveTo(5.199f, 21.214f, 5.701f, 21.311f, 6.257f, 21.356f)
                curveTo(6.794f, 21.4f, 7.454f, 21.4f, 8.262f, 21.4f)
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
            }
        }
        .build()
        return _squarefill!!
    }

private var _squarefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Squarefill, contentDescription = "")
    }
}
