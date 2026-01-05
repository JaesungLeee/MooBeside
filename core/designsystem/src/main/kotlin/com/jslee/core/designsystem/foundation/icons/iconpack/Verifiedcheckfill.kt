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

public val MooBesideIconPack.Verifiedcheckfill: ImageVector
    get() {
        if (_verifiedcheckfill != null) {
            return _verifiedcheckfill!!
        }
        _verifiedcheckfill = Builder(name = "Verifiedcheckfill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.026f, 2.427f)
                curveTo(11.111f, 1.325f, 12.889f, 1.325f, 13.975f, 2.427f)
                lineTo(15.088f, 3.557f)
                curveTo(15.272f, 3.744f, 15.525f, 3.849f, 15.787f, 3.847f)
                lineTo(17.373f, 3.835f)
                curveTo(18.92f, 3.823f, 20.177f, 5.08f, 20.166f, 6.627f)
                lineTo(20.154f, 8.213f)
                curveTo(20.152f, 8.476f, 20.257f, 8.729f, 20.444f, 8.913f)
                lineTo(21.573f, 10.026f)
                curveTo(22.676f, 11.112f, 22.676f, 12.889f, 21.573f, 13.975f)
                lineTo(20.444f, 15.088f)
                curveTo(20.257f, 15.273f, 20.152f, 15.525f, 20.154f, 15.788f)
                lineTo(20.166f, 17.374f)
                curveTo(20.177f, 18.921f, 18.92f, 20.178f, 17.373f, 20.166f)
                lineTo(15.788f, 20.154f)
                curveTo(15.525f, 20.153f, 15.272f, 20.257f, 15.088f, 20.444f)
                lineTo(13.975f, 21.574f)
                curveTo(12.889f, 22.676f, 11.111f, 22.676f, 10.026f, 21.574f)
                lineTo(8.913f, 20.444f)
                curveTo(8.728f, 20.257f, 8.476f, 20.153f, 8.213f, 20.154f)
                lineTo(6.627f, 20.166f)
                curveTo(5.08f, 20.178f, 3.823f, 18.921f, 3.834f, 17.374f)
                lineTo(3.846f, 15.788f)
                curveTo(3.848f, 15.525f, 3.744f, 15.273f, 3.557f, 15.088f)
                lineTo(2.427f, 13.975f)
                curveTo(1.325f, 12.889f, 1.325f, 11.112f, 2.427f, 10.026f)
                lineTo(3.557f, 8.913f)
                curveTo(3.744f, 8.729f, 3.848f, 8.476f, 3.846f, 8.213f)
                lineTo(3.834f, 6.627f)
                curveTo(3.823f, 5.08f, 5.08f, 3.823f, 6.627f, 3.835f)
                lineTo(8.213f, 3.847f)
                curveTo(8.476f, 3.849f, 8.728f, 3.744f, 8.913f, 3.557f)
                lineTo(10.026f, 2.427f)
                close()
                moveTo(16.386f, 10.136f)
                curveTo(16.738f, 9.785f, 16.738f, 9.215f, 16.386f, 8.864f)
                curveTo(16.035f, 8.512f, 15.465f, 8.512f, 15.114f, 8.864f)
                lineTo(10.75f, 13.227f)
                lineTo(8.887f, 11.364f)
                curveTo(8.535f, 11.012f, 7.965f, 11.012f, 7.614f, 11.364f)
                curveTo(7.262f, 11.715f, 7.262f, 12.285f, 7.614f, 12.636f)
                lineTo(10.113f, 15.136f)
                curveTo(10.282f, 15.305f, 10.511f, 15.4f, 10.75f, 15.4f)
                curveTo(10.988f, 15.4f, 11.217f, 15.305f, 11.386f, 15.136f)
                lineTo(16.386f, 10.136f)
                close()
            }
        }
        .build()
        return _verifiedcheckfill!!
    }

private var _verifiedcheckfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Verifiedcheckfill, contentDescription = "")
    }
}
