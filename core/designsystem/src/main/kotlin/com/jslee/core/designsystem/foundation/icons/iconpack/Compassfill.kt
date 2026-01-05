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

public val MooBesideIconPack.Compassfill: ImageVector
    get() {
        if (_compassfill != null) {
            return _compassfill!!
        }
        _compassfill = Builder(name = "Compassfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                curveTo(13.5f, 12.829f, 12.828f, 13.5f, 12.0f, 13.5f)
                curveTo(11.172f, 13.5f, 10.5f, 12.829f, 10.5f, 12.0f)
                curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12.0f, 10.5f)
                curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                curveTo(2.1f, 6.532f, 6.532f, 2.1f, 12.0f, 2.1f)
                curveTo(17.468f, 2.1f, 21.9f, 6.532f, 21.9f, 12.0f)
                curveTo(21.9f, 17.467f, 17.468f, 21.9f, 12.0f, 21.9f)
                curveTo(6.532f, 21.9f, 2.1f, 17.467f, 2.1f, 12.0f)
                close()
                moveTo(9.909f, 9.677f)
                curveTo(9.821f, 9.743f, 9.743f, 9.821f, 9.677f, 9.909f)
                curveTo(9.596f, 10.018f, 9.543f, 10.137f, 9.53f, 10.167f)
                lineTo(9.528f, 10.173f)
                lineTo(7.368f, 14.923f)
                curveTo(7.31f, 15.052f, 7.244f, 15.196f, 7.2f, 15.321f)
                lineTo(7.199f, 15.324f)
                curveTo(7.164f, 15.422f, 7.054f, 15.732f, 7.162f, 16.08f)
                curveTo(7.275f, 16.442f, 7.558f, 16.725f, 7.92f, 16.837f)
                curveTo(8.268f, 16.945f, 8.578f, 16.836f, 8.676f, 16.801f)
                lineTo(8.679f, 16.8f)
                curveTo(8.804f, 16.756f, 8.948f, 16.69f, 9.077f, 16.632f)
                lineTo(13.827f, 14.472f)
                lineTo(13.832f, 14.47f)
                curveTo(13.862f, 14.457f, 13.982f, 14.404f, 14.091f, 14.323f)
                curveTo(14.179f, 14.257f, 14.257f, 14.179f, 14.323f, 14.091f)
                curveTo(14.404f, 13.982f, 14.457f, 13.862f, 14.47f, 13.832f)
                lineTo(14.472f, 13.827f)
                lineTo(16.632f, 9.077f)
                curveTo(16.69f, 8.948f, 16.756f, 8.804f, 16.8f, 8.679f)
                lineTo(16.801f, 8.676f)
                curveTo(16.836f, 8.578f, 16.945f, 8.268f, 16.837f, 7.92f)
                curveTo(16.725f, 7.558f, 16.442f, 7.274f, 16.08f, 7.162f)
                curveTo(15.732f, 7.054f, 15.422f, 7.164f, 15.324f, 7.199f)
                lineTo(15.321f, 7.2f)
                curveTo(15.196f, 7.244f, 15.052f, 7.31f, 14.923f, 7.368f)
                lineTo(10.173f, 9.527f)
                lineTo(10.167f, 9.53f)
                curveTo(10.137f, 9.543f, 10.018f, 9.596f, 9.909f, 9.677f)
                close()
            }
        }
        .build()
        return _compassfill!!
    }

private var _compassfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Compassfill, contentDescription = "")
    }
}
