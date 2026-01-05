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

public val MooBesideIconPack.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.75f, 2.351f)
                curveTo(14.872f, 2.351f, 13.35f, 3.873f, 13.35f, 5.751f)
                curveTo(13.35f, 6.017f, 13.38f, 6.277f, 13.439f, 6.526f)
                lineTo(7.701f, 9.644f)
                curveTo(7.083f, 9.0f, 6.213f, 8.6f, 5.25f, 8.6f)
                curveTo(3.372f, 8.6f, 1.85f, 10.122f, 1.85f, 12.0f)
                curveTo(1.85f, 13.877f, 3.372f, 15.4f, 5.25f, 15.4f)
                curveTo(6.212f, 15.4f, 7.082f, 15.0f, 7.7f, 14.357f)
                lineTo(13.438f, 17.475f)
                curveTo(13.38f, 17.724f, 13.35f, 17.983f, 13.35f, 18.25f)
                curveTo(13.35f, 20.127f, 14.872f, 21.65f, 16.75f, 21.65f)
                curveTo(18.628f, 21.65f, 20.15f, 20.127f, 20.15f, 18.25f)
                curveTo(20.15f, 16.372f, 18.628f, 14.85f, 16.75f, 14.85f)
                curveTo(15.786f, 14.85f, 14.917f, 15.25f, 14.298f, 15.894f)
                lineTo(8.561f, 12.776f)
                curveTo(8.619f, 12.526f, 8.65f, 12.267f, 8.65f, 12.0f)
                curveTo(8.65f, 11.733f, 8.619f, 11.474f, 8.561f, 11.225f)
                lineTo(14.299f, 8.107f)
                curveTo(14.917f, 8.75f, 15.787f, 9.151f, 16.75f, 9.151f)
                curveTo(18.628f, 9.151f, 20.15f, 7.628f, 20.15f, 5.751f)
                curveTo(20.15f, 3.873f, 18.628f, 2.351f, 16.75f, 2.351f)
                close()
                moveTo(15.15f, 5.751f)
                curveTo(15.15f, 4.867f, 15.866f, 4.151f, 16.75f, 4.151f)
                curveTo(17.633f, 4.151f, 18.35f, 4.867f, 18.35f, 5.751f)
                curveTo(18.35f, 6.634f, 17.633f, 7.351f, 16.75f, 7.351f)
                curveTo(15.866f, 7.351f, 15.15f, 6.634f, 15.15f, 5.751f)
                close()
                moveTo(3.65f, 12.0f)
                curveTo(3.65f, 11.116f, 4.366f, 10.4f, 5.25f, 10.4f)
                curveTo(6.133f, 10.4f, 6.85f, 11.116f, 6.85f, 12.0f)
                curveTo(6.85f, 12.883f, 6.133f, 13.6f, 5.25f, 13.6f)
                curveTo(4.366f, 13.6f, 3.65f, 12.883f, 3.65f, 12.0f)
                close()
                moveTo(15.15f, 18.25f)
                curveTo(15.15f, 17.366f, 15.866f, 16.65f, 16.75f, 16.65f)
                curveTo(17.633f, 16.65f, 18.35f, 17.366f, 18.35f, 18.25f)
                curveTo(18.35f, 19.133f, 17.633f, 19.85f, 16.75f, 19.85f)
                curveTo(15.866f, 19.85f, 15.15f, 19.133f, 15.15f, 18.25f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Share, contentDescription = "")
    }
}
