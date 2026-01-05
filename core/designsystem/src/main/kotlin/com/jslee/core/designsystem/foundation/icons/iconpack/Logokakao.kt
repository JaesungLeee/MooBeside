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

public val MooBesideIconPack.Logokakao: ImageVector
    get() {
        if (_logokakao != null) {
            return _logokakao!!
        }
        _logokakao = Builder(name = "Logokakao", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.154f)
                curveTo(6.796f, 3.154f, 2.572f, 6.435f, 2.572f, 10.471f)
                curveTo(2.572f, 12.988f, 4.203f, 15.185f, 6.692f, 16.524f)
                lineTo(5.645f, 20.361f)
                curveTo(5.626f, 20.438f, 5.63f, 20.518f, 5.657f, 20.592f)
                curveTo(5.684f, 20.666f, 5.734f, 20.73f, 5.798f, 20.775f)
                curveTo(5.863f, 20.82f, 5.94f, 20.845f, 6.019f, 20.845f)
                curveTo(6.098f, 20.845f, 6.175f, 20.821f, 6.239f, 20.776f)
                lineTo(10.822f, 17.731f)
                curveTo(11.208f, 17.731f, 11.604f, 17.797f, 12.0f, 17.797f)
                curveTo(17.205f, 17.797f, 21.429f, 14.516f, 21.429f, 10.471f)
                curveTo(21.429f, 6.426f, 17.205f, 3.154f, 12.0f, 3.154f)
                close()
            }
        }
        .build()
        return _logokakao!!
    }

private var _logokakao: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Logokakao, contentDescription = "")
    }
}
