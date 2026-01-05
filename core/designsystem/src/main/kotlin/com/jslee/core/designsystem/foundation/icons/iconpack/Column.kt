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

public val MooBesideIconPack.Column: ImageVector
    get() {
        if (_column != null) {
            return _column!!
        }
        _column = Builder(name = "Column", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.238f, 3.1f)
                curveTo(17.046f, 3.1f, 17.707f, 3.1f, 18.244f, 3.144f)
                curveTo(18.8f, 3.189f, 19.302f, 3.286f, 19.771f, 3.525f)
                curveTo(20.505f, 3.899f, 21.101f, 4.496f, 21.475f, 5.23f)
                curveTo(21.714f, 5.698f, 21.811f, 6.201f, 21.857f, 6.756f)
                curveTo(21.9f, 7.293f, 21.9f, 7.954f, 21.9f, 8.762f)
                verticalLineTo(15.238f)
                curveTo(21.9f, 16.046f, 21.9f, 16.707f, 21.857f, 17.244f)
                curveTo(21.811f, 17.8f, 21.714f, 18.302f, 21.475f, 18.771f)
                curveTo(21.101f, 19.504f, 20.505f, 20.101f, 19.771f, 20.475f)
                curveTo(19.302f, 20.714f, 18.8f, 20.811f, 18.244f, 20.856f)
                curveTo(17.707f, 20.9f, 17.046f, 20.9f, 16.238f, 20.9f)
                horizontalLineTo(7.763f)
                curveTo(6.955f, 20.9f, 6.294f, 20.9f, 5.757f, 20.856f)
                curveTo(5.201f, 20.811f, 4.699f, 20.714f, 4.23f, 20.475f)
                curveTo(3.496f, 20.101f, 2.899f, 19.504f, 2.525f, 18.771f)
                curveTo(2.287f, 18.302f, 2.19f, 17.8f, 2.144f, 17.244f)
                curveTo(2.1f, 16.707f, 2.1f, 16.046f, 2.1f, 15.238f)
                verticalLineTo(8.762f)
                curveTo(2.1f, 7.954f, 2.1f, 7.293f, 2.144f, 6.756f)
                curveTo(2.19f, 6.201f, 2.287f, 5.698f, 2.525f, 5.23f)
                curveTo(2.899f, 4.496f, 3.496f, 3.899f, 4.23f, 3.525f)
                curveTo(4.699f, 3.286f, 5.201f, 3.189f, 5.757f, 3.144f)
                curveTo(6.294f, 3.1f, 6.955f, 3.1f, 7.763f, 3.1f)
                horizontalLineTo(16.238f)
                close()
                moveTo(14.1f, 4.9f)
                horizontalLineTo(9.9f)
                verticalLineTo(19.1f)
                horizontalLineTo(14.1f)
                verticalLineTo(4.9f)
                close()
                moveTo(15.9f, 19.1f)
                verticalLineTo(4.9f)
                horizontalLineTo(16.2f)
                curveTo(17.055f, 4.9f, 17.642f, 4.901f, 18.097f, 4.938f)
                curveTo(18.542f, 4.974f, 18.781f, 5.041f, 18.954f, 5.129f)
                curveTo(19.349f, 5.33f, 19.67f, 5.652f, 19.872f, 6.047f)
                curveTo(19.959f, 6.22f, 20.026f, 6.458f, 20.063f, 6.903f)
                curveTo(20.1f, 7.358f, 20.1f, 7.945f, 20.1f, 8.8f)
                verticalLineTo(15.2f)
                curveTo(20.1f, 16.055f, 20.1f, 16.642f, 20.063f, 17.097f)
                curveTo(20.026f, 17.542f, 19.959f, 17.781f, 19.872f, 17.954f)
                curveTo(19.67f, 18.349f, 19.349f, 18.67f, 18.954f, 18.871f)
                curveTo(18.781f, 18.959f, 18.542f, 19.026f, 18.097f, 19.062f)
                curveTo(17.642f, 19.099f, 17.055f, 19.1f, 16.2f, 19.1f)
                horizontalLineTo(15.9f)
                close()
                moveTo(7.8f, 4.9f)
                horizontalLineTo(8.1f)
                verticalLineTo(19.1f)
                horizontalLineTo(7.8f)
                curveTo(6.945f, 19.1f, 6.358f, 19.099f, 5.903f, 19.062f)
                curveTo(5.459f, 19.026f, 5.22f, 18.959f, 5.047f, 18.871f)
                curveTo(4.652f, 18.67f, 4.331f, 18.349f, 4.129f, 17.954f)
                curveTo(4.041f, 17.781f, 3.975f, 17.542f, 3.938f, 17.097f)
                curveTo(3.901f, 16.642f, 3.9f, 16.055f, 3.9f, 15.2f)
                verticalLineTo(8.8f)
                curveTo(3.9f, 7.945f, 3.901f, 7.358f, 3.938f, 6.903f)
                curveTo(3.975f, 6.458f, 4.041f, 6.22f, 4.129f, 6.047f)
                curveTo(4.331f, 5.652f, 4.652f, 5.33f, 5.047f, 5.129f)
                curveTo(5.22f, 5.041f, 5.459f, 4.974f, 5.903f, 4.938f)
                curveTo(6.358f, 4.901f, 6.945f, 4.9f, 7.8f, 4.9f)
                close()
            }
        }
        .build()
        return _column!!
    }

private var _column: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Column, contentDescription = "")
    }
}
