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

public val MooBesideIconPack.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.989f, 3.822f)
                curveTo(17.146f, 2.665f, 19.021f, 2.665f, 20.178f, 3.822f)
                curveTo(21.335f, 4.978f, 21.335f, 6.854f, 20.178f, 8.011f)
                lineTo(7.553f, 20.636f)
                curveTo(7.384f, 20.805f, 7.156f, 20.9f, 6.917f, 20.9f)
                horizontalLineTo(4.0f)
                curveTo(3.503f, 20.9f, 3.1f, 20.497f, 3.1f, 20.0f)
                verticalLineTo(17.083f)
                curveTo(3.1f, 16.844f, 3.195f, 16.615f, 3.364f, 16.447f)
                lineTo(15.989f, 3.822f)
                close()
                moveTo(18.905f, 5.094f)
                curveTo(18.451f, 4.64f, 17.715f, 4.64f, 17.262f, 5.094f)
                lineTo(4.9f, 17.456f)
                verticalLineTo(19.1f)
                horizontalLineTo(6.544f)
                lineTo(18.905f, 6.738f)
                curveTo(19.359f, 6.284f, 19.359f, 5.548f, 18.905f, 5.094f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Pencil, contentDescription = "")
    }
}
