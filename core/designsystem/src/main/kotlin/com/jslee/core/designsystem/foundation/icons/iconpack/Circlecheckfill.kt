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

public val MooBesideIconPack.Circlecheckfill: ImageVector
    get() {
        if (_circlecheckfill != null) {
            return _circlecheckfill!!
        }
        _circlecheckfill = Builder(name = "Circlecheckfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                curveTo(2.1f, 6.532f, 6.532f, 2.1f, 12.0f, 2.1f)
                curveTo(17.468f, 2.1f, 21.9f, 6.532f, 21.9f, 12.0f)
                curveTo(21.9f, 17.468f, 17.468f, 21.9f, 12.0f, 21.9f)
                curveTo(6.532f, 21.9f, 2.1f, 17.468f, 2.1f, 12.0f)
                close()
                moveTo(16.647f, 9.876f)
                curveTo(16.992f, 9.519f, 16.983f, 8.949f, 16.626f, 8.603f)
                curveTo(16.269f, 8.257f, 15.699f, 8.267f, 15.353f, 8.624f)
                lineTo(10.677f, 13.455f)
                lineTo(8.647f, 11.352f)
                curveTo(8.302f, 10.995f, 7.733f, 10.984f, 7.375f, 11.33f)
                curveTo(7.017f, 11.675f, 7.007f, 12.245f, 7.352f, 12.602f)
                lineTo(10.029f, 15.375f)
                curveTo(10.198f, 15.55f, 10.432f, 15.65f, 10.676f, 15.65f)
                curveTo(10.92f, 15.65f, 11.153f, 15.551f, 11.323f, 15.376f)
                lineTo(16.647f, 9.876f)
                close()
            }
        }
        .build()
        return _circlecheckfill!!
    }

private var _circlecheckfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circlecheckfill, contentDescription = "")
    }
}
