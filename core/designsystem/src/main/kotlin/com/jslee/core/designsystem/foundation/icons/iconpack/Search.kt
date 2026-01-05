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

public val MooBesideIconPack.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 2.1f)
                curveTo(5.637f, 2.1f, 2.1f, 5.637f, 2.1f, 10.0f)
                curveTo(2.1f, 14.363f, 5.637f, 17.9f, 10.0f, 17.9f)
                curveTo(11.857f, 17.9f, 13.565f, 17.259f, 14.913f, 16.186f)
                lineTo(19.863f, 21.136f)
                curveTo(20.215f, 21.488f, 20.785f, 21.488f, 21.136f, 21.136f)
                curveTo(21.488f, 20.785f, 21.488f, 20.215f, 21.136f, 19.864f)
                lineTo(16.186f, 14.914f)
                curveTo(17.259f, 13.565f, 17.9f, 11.857f, 17.9f, 10.0f)
                curveTo(17.9f, 5.637f, 14.363f, 2.1f, 10.0f, 2.1f)
                close()
                moveTo(3.9f, 10.0f)
                curveTo(3.9f, 6.631f, 6.631f, 3.9f, 10.0f, 3.9f)
                curveTo(13.369f, 3.9f, 16.1f, 6.631f, 16.1f, 10.0f)
                curveTo(16.1f, 13.369f, 13.369f, 16.1f, 10.0f, 16.1f)
                curveTo(6.631f, 16.1f, 3.9f, 13.369f, 3.9f, 10.0f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Search, contentDescription = "")
    }
}
