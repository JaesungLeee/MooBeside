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

public val MooBesideIconPack.Searchthick: ImageVector
    get() {
        if (_searchthick != null) {
            return _searchthick!!
        }
        _searchthick = Builder(name = "Searchthick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 1.7f)
                curveTo(5.416f, 1.7f, 1.7f, 5.416f, 1.7f, 10.0f)
                curveTo(1.7f, 14.584f, 5.416f, 18.3f, 10.0f, 18.3f)
                curveTo(11.823f, 18.3f, 13.509f, 17.712f, 14.878f, 16.716f)
                lineTo(19.581f, 21.419f)
                curveTo(20.088f, 21.927f, 20.912f, 21.927f, 21.419f, 21.419f)
                curveTo(21.927f, 20.912f, 21.927f, 20.088f, 21.419f, 19.581f)
                lineTo(16.716f, 14.878f)
                curveTo(17.712f, 13.508f, 18.3f, 11.823f, 18.3f, 10.0f)
                curveTo(18.3f, 5.416f, 14.584f, 1.7f, 10.0f, 1.7f)
                close()
                moveTo(4.3f, 10.0f)
                curveTo(4.3f, 6.852f, 6.852f, 4.3f, 10.0f, 4.3f)
                curveTo(13.148f, 4.3f, 15.7f, 6.852f, 15.7f, 10.0f)
                curveTo(15.7f, 13.148f, 13.148f, 15.7f, 10.0f, 15.7f)
                curveTo(6.852f, 15.7f, 4.3f, 13.148f, 4.3f, 10.0f)
                close()
            }
        }
        .build()
        return _searchthick!!
    }

private var _searchthick: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Searchthick, contentDescription = "")
    }
}
