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

public val MooBesideIconPack.Facesmilefill: ImageVector
    get() {
        if (_facesmilefill != null) {
            return _facesmilefill!!
        }
        _facesmilefill = Builder(name = "Facesmilefill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(10.0f, 10.25f)
                curveTo(10.0f, 10.94f, 9.44f, 11.5f, 8.75f, 11.5f)
                curveTo(8.06f, 11.5f, 7.5f, 10.94f, 7.5f, 10.25f)
                curveTo(7.5f, 9.56f, 8.06f, 9.0f, 8.75f, 9.0f)
                curveTo(9.44f, 9.0f, 10.0f, 9.56f, 10.0f, 10.25f)
                close()
                moveTo(16.5f, 10.25f)
                curveTo(16.5f, 10.94f, 15.94f, 11.5f, 15.25f, 11.5f)
                curveTo(14.559f, 11.5f, 14.0f, 10.94f, 14.0f, 10.25f)
                curveTo(14.0f, 9.56f, 14.559f, 9.0f, 15.25f, 9.0f)
                curveTo(15.94f, 9.0f, 16.5f, 9.56f, 16.5f, 10.25f)
                close()
                moveTo(9.314f, 13.799f)
                curveTo(9.065f, 13.369f, 8.515f, 13.222f, 8.084f, 13.471f)
                curveTo(7.654f, 13.72f, 7.507f, 14.27f, 7.756f, 14.701f)
                curveTo(8.602f, 16.163f, 10.185f, 17.15f, 12.0f, 17.15f)
                curveTo(13.815f, 17.15f, 15.398f, 16.163f, 16.244f, 14.701f)
                curveTo(16.493f, 14.27f, 16.346f, 13.72f, 15.915f, 13.471f)
                curveTo(15.485f, 13.222f, 14.935f, 13.369f, 14.686f, 13.799f)
                curveTo(14.149f, 14.728f, 13.146f, 15.35f, 12.0f, 15.35f)
                curveTo(10.854f, 15.35f, 9.852f, 14.728f, 9.314f, 13.799f)
                close()
            }
        }
        .build()
        return _facesmilefill!!
    }

private var _facesmilefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Facesmilefill, contentDescription = "")
    }
}
