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

public val MooBesideIconPack.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.043f, 2.35f)
                curveTo(8.152f, 2.349f, 7.375f, 2.347f, 6.661f, 2.797f)
                curveTo(6.355f, 2.991f, 6.087f, 3.278f, 5.889f, 3.548f)
                curveTo(5.69f, 3.819f, 5.497f, 4.16f, 5.404f, 4.51f)
                curveTo(5.206f, 5.261f, 5.39f, 5.956f, 5.616f, 6.673f)
                curveTo(6.427f, 9.255f, 8.046f, 11.08f, 9.412f, 12.25f)
                curveTo(8.046f, 13.42f, 6.427f, 15.246f, 5.616f, 17.828f)
                curveTo(5.39f, 18.545f, 5.206f, 19.24f, 5.404f, 19.99f)
                curveTo(5.497f, 20.34f, 5.69f, 20.682f, 5.889f, 20.953f)
                curveTo(6.087f, 21.223f, 6.355f, 21.51f, 6.661f, 21.703f)
                curveTo(7.375f, 22.153f, 8.152f, 22.152f, 9.043f, 22.151f)
                horizontalLineTo(14.957f)
                curveTo(15.848f, 22.152f, 16.625f, 22.153f, 17.338f, 21.703f)
                curveTo(17.645f, 21.51f, 17.913f, 21.223f, 18.111f, 20.953f)
                curveTo(18.309f, 20.682f, 18.503f, 20.34f, 18.596f, 19.99f)
                curveTo(18.794f, 19.24f, 18.61f, 18.545f, 18.384f, 17.828f)
                curveTo(17.573f, 15.246f, 15.953f, 13.42f, 14.588f, 12.25f)
                curveTo(15.953f, 11.08f, 17.573f, 9.255f, 18.384f, 6.673f)
                curveTo(18.61f, 5.956f, 18.794f, 5.261f, 18.596f, 4.51f)
                curveTo(18.503f, 4.16f, 18.309f, 3.819f, 18.111f, 3.548f)
                curveTo(17.913f, 3.278f, 17.645f, 2.991f, 17.338f, 2.797f)
                curveTo(16.625f, 2.347f, 15.848f, 2.349f, 14.957f, 2.35f)
                horizontalLineTo(9.043f)
                close()
                moveTo(7.162f, 5.518f)
                curveTo(7.012f, 4.892f, 7.536f, 4.15f, 8.5f, 4.15f)
                horizontalLineTo(15.5f)
                curveTo(16.463f, 4.15f, 16.988f, 4.892f, 16.837f, 5.518f)
                curveTo(16.197f, 8.188f, 14.499f, 10.019f, 13.117f, 11.132f)
                curveTo(12.406f, 11.705f, 12.406f, 12.795f, 13.117f, 13.368f)
                curveTo(14.499f, 14.482f, 16.197f, 16.313f, 16.837f, 18.982f)
                curveTo(16.988f, 19.609f, 16.463f, 20.35f, 15.5f, 20.35f)
                horizontalLineTo(8.5f)
                curveTo(7.536f, 20.35f, 7.012f, 19.609f, 7.162f, 18.982f)
                curveTo(7.803f, 16.313f, 9.501f, 14.482f, 10.883f, 13.368f)
                curveTo(11.594f, 12.795f, 11.594f, 11.705f, 10.883f, 11.132f)
                curveTo(9.501f, 10.019f, 7.803f, 8.188f, 7.162f, 5.518f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Hourglass, contentDescription = "")
    }
}
