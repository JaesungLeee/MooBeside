package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MooBesideIconPack.Facesmile: ImageVector
    get() {
        if (_facesmile != null) {
            return _facesmile!!
        }
        _facesmile = Builder(name = "Facesmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.347f, 13.489f)
                curveTo(8.767f, 13.224f, 9.323f, 13.349f, 9.588f, 13.769f)
                curveTo(10.094f, 14.571f, 10.986f, 15.1f, 12.0f, 15.1f)
                curveTo(13.014f, 15.1f, 13.906f, 14.571f, 14.412f, 13.769f)
                curveTo(14.677f, 13.349f, 15.233f, 13.224f, 15.653f, 13.489f)
                curveTo(16.074f, 13.755f, 16.199f, 14.31f, 15.934f, 14.731f)
                curveTo(15.111f, 16.032f, 13.657f, 16.9f, 12.0f, 16.9f)
                curveTo(10.343f, 16.9f, 8.889f, 16.032f, 8.066f, 14.731f)
                curveTo(7.801f, 14.31f, 7.926f, 13.755f, 8.347f, 13.489f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 10.25f)
                curveTo(10.25f, 10.94f, 9.69f, 11.5f, 9.0f, 11.5f)
                curveTo(8.31f, 11.5f, 7.75f, 10.94f, 7.75f, 10.25f)
                curveTo(7.75f, 9.56f, 8.31f, 9.0f, 9.0f, 9.0f)
                curveTo(9.69f, 9.0f, 10.25f, 9.56f, 10.25f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.25f, 10.25f)
                curveTo(16.25f, 10.94f, 15.69f, 11.5f, 15.0f, 11.5f)
                curveTo(14.309f, 11.5f, 13.75f, 10.94f, 13.75f, 10.25f)
                curveTo(13.75f, 9.56f, 14.309f, 9.0f, 15.0f, 9.0f)
                curveTo(15.69f, 9.0f, 16.25f, 9.56f, 16.25f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                curveTo(2.1f, 6.532f, 6.532f, 2.1f, 12.0f, 2.1f)
                curveTo(17.468f, 2.1f, 21.9f, 6.532f, 21.9f, 12.0f)
                curveTo(21.9f, 17.468f, 17.468f, 21.9f, 12.0f, 21.9f)
                curveTo(6.532f, 21.9f, 2.1f, 17.468f, 2.1f, 12.0f)
                close()
                moveTo(12.0f, 3.9f)
                curveTo(7.526f, 3.9f, 3.9f, 7.527f, 3.9f, 12.0f)
                curveTo(3.9f, 16.474f, 7.526f, 20.1f, 12.0f, 20.1f)
                curveTo(16.473f, 20.1f, 20.1f, 16.474f, 20.1f, 12.0f)
                curveTo(20.1f, 7.527f, 16.473f, 3.9f, 12.0f, 3.9f)
                close()
            }
        }
        .build()
        return _facesmile!!
    }

private var _facesmile: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Facesmile, contentDescription = "")
    }
}
