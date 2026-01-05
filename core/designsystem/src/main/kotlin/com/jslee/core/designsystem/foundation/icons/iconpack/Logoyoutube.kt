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

public val MooBesideIconPack.Logoyoutube: ImageVector
    get() {
        if (_logoyoutube != null) {
            return _logoyoutube!!
        }
        _logoyoutube = Builder(name = "Logoyoutube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.317f, 4.992f)
                curveTo(21.233f, 5.237f, 21.958f, 5.961f, 22.203f, 6.877f)
                curveTo(22.65f, 8.539f, 22.65f, 12.0f, 22.65f, 12.0f)
                curveTo(22.65f, 12.0f, 22.65f, 15.461f, 22.203f, 17.123f)
                curveTo(21.958f, 18.038f, 21.233f, 18.763f, 20.317f, 19.008f)
                curveTo(18.656f, 19.455f, 12.0f, 19.455f, 12.0f, 19.455f)
                curveTo(12.0f, 19.455f, 5.344f, 19.455f, 3.682f, 19.008f)
                curveTo(2.766f, 18.763f, 2.042f, 18.038f, 1.797f, 17.123f)
                curveTo(1.35f, 15.461f, 1.35f, 12.0f, 1.35f, 12.0f)
                curveTo(1.35f, 12.0f, 1.35f, 8.539f, 1.797f, 6.877f)
                curveTo(2.042f, 5.961f, 2.766f, 5.237f, 3.682f, 4.992f)
                curveTo(5.344f, 4.545f, 12.0f, 4.545f, 12.0f, 4.545f)
                curveTo(12.0f, 4.545f, 18.656f, 4.545f, 20.317f, 4.992f)
                close()
                moveTo(9.87f, 8.805f)
                verticalLineTo(15.195f)
                lineTo(15.408f, 12.0f)
                lineTo(9.87f, 8.805f)
                close()
            }
        }
        .build()
        return _logoyoutube!!
    }

private var _logoyoutube: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Logoyoutube, contentDescription = "")
    }
}
