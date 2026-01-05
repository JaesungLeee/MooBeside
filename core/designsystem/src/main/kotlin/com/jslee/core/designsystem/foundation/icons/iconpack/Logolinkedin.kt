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

public val MooBesideIconPack.Logolinkedin: ImageVector
    get() {
        if (_logolinkedin != null) {
            return _logolinkedin!!
        }
        _logolinkedin = Builder(name = "Logolinkedin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.389f, 2.35f)
                horizontalLineTo(9.611f)
                curveTo(8.524f, 2.35f, 7.653f, 2.35f, 6.95f, 2.408f)
                curveTo(6.227f, 2.467f, 5.601f, 2.591f, 5.026f, 2.884f)
                curveTo(4.104f, 3.354f, 3.354f, 4.104f, 2.884f, 5.026f)
                curveTo(2.591f, 5.601f, 2.467f, 6.227f, 2.408f, 6.95f)
                curveTo(2.35f, 7.653f, 2.35f, 8.524f, 2.35f, 9.611f)
                verticalLineTo(14.389f)
                curveTo(2.35f, 15.476f, 2.35f, 16.347f, 2.408f, 17.051f)
                curveTo(2.467f, 17.773f, 2.591f, 18.399f, 2.884f, 18.975f)
                curveTo(3.354f, 19.897f, 4.104f, 20.646f, 5.026f, 21.116f)
                curveTo(5.601f, 21.409f, 6.227f, 21.534f, 6.95f, 21.593f)
                curveTo(7.653f, 21.65f, 8.524f, 21.65f, 9.611f, 21.65f)
                horizontalLineTo(14.389f)
                curveTo(15.476f, 21.65f, 16.347f, 21.65f, 17.051f, 21.593f)
                curveTo(17.773f, 21.534f, 18.399f, 21.409f, 18.975f, 21.116f)
                curveTo(19.897f, 20.646f, 20.646f, 19.897f, 21.116f, 18.975f)
                curveTo(21.409f, 18.399f, 21.534f, 17.773f, 21.593f, 17.051f)
                curveTo(21.65f, 16.347f, 21.65f, 15.476f, 21.65f, 14.389f)
                verticalLineTo(9.611f)
                curveTo(21.65f, 8.524f, 21.65f, 7.653f, 21.593f, 6.95f)
                curveTo(21.534f, 6.227f, 21.409f, 5.601f, 21.116f, 5.026f)
                curveTo(20.646f, 4.104f, 19.897f, 3.354f, 18.975f, 2.884f)
                curveTo(18.399f, 2.591f, 17.773f, 2.467f, 17.051f, 2.408f)
                curveTo(16.347f, 2.35f, 15.476f, 2.35f, 14.389f, 2.35f)
                close()
                moveTo(6.55f, 7.85f)
                curveTo(6.55f, 8.567f, 7.13f, 9.149f, 7.849f, 9.149f)
                curveTo(8.566f, 9.149f, 9.146f, 8.564f, 9.146f, 7.85f)
                curveTo(9.146f, 7.132f, 8.566f, 6.55f, 7.849f, 6.55f)
                curveTo(7.13f, 6.55f, 6.55f, 7.132f, 6.55f, 7.85f)
                close()
                moveTo(6.73f, 17.35f)
                horizontalLineTo(8.969f)
                verticalLineTo(10.132f)
                horizontalLineTo(6.73f)
                verticalLineTo(17.35f)
                close()
                moveTo(17.35f, 17.35f)
                horizontalLineTo(15.113f)
                verticalLineTo(13.842f)
                curveTo(15.113f, 13.006f, 15.099f, 11.928f, 13.949f, 11.928f)
                curveTo(12.785f, 11.928f, 12.608f, 12.84f, 12.608f, 13.783f)
                verticalLineTo(17.35f)
                horizontalLineTo(10.375f)
                verticalLineTo(10.132f)
                horizontalLineTo(12.52f)
                verticalLineTo(11.119f)
                horizontalLineTo(12.55f)
                curveTo(12.847f, 10.552f, 13.578f, 9.952f, 14.665f, 9.952f)
                curveTo(16.931f, 9.952f, 17.35f, 11.447f, 17.35f, 13.39f)
                verticalLineTo(17.35f)
                close()
            }
        }
        .build()
        return _logolinkedin!!
    }

private var _logolinkedin: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Logolinkedin, contentDescription = "")
    }
}
