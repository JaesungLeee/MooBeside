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

public val MooBesideIconPack.Circlefill: ImageVector
    get() {
        if (_circlefill != null) {
            return _circlefill!!
        }
        _circlefill = Builder(name = "Circlefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                curveTo(2.1f, 6.532f, 6.532f, 2.1f, 12.0f, 2.1f)
                curveTo(17.468f, 2.1f, 21.9f, 6.532f, 21.9f, 12.0f)
                curveTo(21.9f, 17.468f, 17.468f, 21.9f, 12.0f, 21.9f)
                curveTo(6.532f, 21.9f, 2.1f, 17.468f, 2.1f, 12.0f)
                close()
            }
        }
        .build()
        return _circlefill!!
    }

private var _circlefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circlefill, contentDescription = "")
    }
}
