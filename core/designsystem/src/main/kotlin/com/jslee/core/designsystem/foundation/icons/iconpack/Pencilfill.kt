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

public val MooBesideIconPack.Pencilfill: ImageVector
    get() {
        if (_pencilfill != null) {
            return _pencilfill!!
        }
        _pencilfill = Builder(name = "Pencilfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.178f, 3.822f)
                curveTo(19.021f, 2.665f, 17.146f, 2.665f, 15.989f, 3.822f)
                lineTo(3.364f, 16.447f)
                curveTo(3.195f, 16.615f, 3.1f, 16.844f, 3.1f, 17.083f)
                verticalLineTo(20.0f)
                curveTo(3.1f, 20.497f, 3.503f, 20.9f, 4.0f, 20.9f)
                horizontalLineTo(6.917f)
                curveTo(7.156f, 20.9f, 7.384f, 20.805f, 7.553f, 20.636f)
                lineTo(20.178f, 8.011f)
                curveTo(21.335f, 6.854f, 21.335f, 4.978f, 20.178f, 3.822f)
                close()
            }
        }
        .build()
        return _pencilfill!!
    }

private var _pencilfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Pencilfill, contentDescription = "")
    }
}
