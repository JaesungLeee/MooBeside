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

public val MooBesideIconPack.Circlequestionfill: ImageVector
    get() {
        if (_circlequestionfill != null) {
            return _circlequestionfill!!
        }
        _circlequestionfill = Builder(name = "Circlequestionfill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                curveTo(2.1f, 6.532f, 6.532f, 2.1f, 12.0f, 2.1f)
                curveTo(17.468f, 2.1f, 21.9f, 6.532f, 21.9f, 12.0f)
                curveTo(21.9f, 17.468f, 17.468f, 21.9f, 12.0f, 21.9f)
                curveTo(6.532f, 21.9f, 2.1f, 17.468f, 2.1f, 12.0f)
                close()
                moveTo(11.11f, 13.116f)
                curveTo(11.013f, 13.641f, 11.46f, 14.08f, 11.993f, 14.08f)
                curveTo(12.526f, 14.08f, 12.93f, 13.633f, 13.11f, 13.132f)
                curveTo(13.345f, 12.481f, 13.817f, 12.084f, 14.287f, 11.689f)
                curveTo(14.946f, 11.135f, 15.602f, 10.583f, 15.602f, 9.337f)
                curveTo(15.602f, 7.415f, 14.044f, 6.282f, 12.061f, 6.282f)
                curveTo(10.258f, 6.282f, 8.899f, 7.233f, 8.501f, 8.775f)
                curveTo(8.368f, 9.292f, 8.816f, 9.733f, 9.349f, 9.733f)
                curveTo(9.881f, 9.733f, 10.272f, 9.272f, 10.519f, 8.801f)
                curveTo(10.784f, 8.294f, 11.294f, 8.005f, 11.985f, 8.0f)
                curveTo(12.935f, 8.007f, 13.596f, 8.555f, 13.596f, 9.413f)
                curveTo(13.596f, 10.111f, 13.159f, 10.446f, 12.645f, 10.84f)
                curveTo(12.048f, 11.298f, 11.346f, 11.836f, 11.11f, 13.116f)
                close()
                moveTo(10.769f, 16.466f)
                curveTo(10.761f, 17.15f, 11.278f, 17.652f, 12.0f, 17.652f)
                curveTo(12.707f, 17.652f, 13.224f, 17.15f, 13.231f, 16.466f)
                curveTo(13.224f, 15.782f, 12.707f, 15.281f, 12.0f, 15.281f)
                curveTo(11.278f, 15.281f, 10.761f, 15.782f, 10.769f, 16.466f)
                close()
            }
        }
        .build()
        return _circlequestionfill!!
    }

private var _circlequestionfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Circlequestionfill, contentDescription = "")
    }
}
