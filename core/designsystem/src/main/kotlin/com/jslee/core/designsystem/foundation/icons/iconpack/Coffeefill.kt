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

public val MooBesideIconPack.Coffeefill: ImageVector
    get() {
        if (_coffeefill != null) {
            return _coffeefill!!
        }
        _coffeefill = Builder(name = "Coffeefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.867f, 3.095f)
                horizontalLineTo(16.134f)
                curveTo(16.526f, 3.095f, 16.872f, 3.095f, 17.159f, 3.119f)
                curveTo(17.465f, 3.144f, 17.782f, 3.2f, 18.09f, 3.357f)
                curveTo(18.542f, 3.587f, 18.909f, 3.954f, 19.139f, 4.406f)
                curveTo(19.256f, 4.635f, 19.317f, 4.87f, 19.351f, 5.1f)
                horizontalLineTo(19.75f)
                curveTo(22.042f, 5.1f, 23.9f, 6.959f, 23.9f, 9.25f)
                curveTo(23.9f, 11.542f, 22.042f, 13.401f, 19.75f, 13.401f)
                horizontalLineTo(18.44f)
                curveTo(17.034f, 16.073f, 14.231f, 17.896f, 11.001f, 17.896f)
                curveTo(6.362f, 17.896f, 2.601f, 14.134f, 2.601f, 9.495f)
                verticalLineTo(6.362f)
                curveTo(2.601f, 5.97f, 2.601f, 5.624f, 2.624f, 5.337f)
                curveTo(2.649f, 5.031f, 2.705f, 4.714f, 2.862f, 4.406f)
                curveTo(3.093f, 3.954f, 3.46f, 3.587f, 3.911f, 3.357f)
                curveTo(4.22f, 3.2f, 4.537f, 3.144f, 4.842f, 3.119f)
                curveTo(5.129f, 3.095f, 5.476f, 3.095f, 5.867f, 3.095f)
                close()
                moveTo(19.75f, 6.9f)
                horizontalLineTo(19.401f)
                verticalLineTo(9.495f)
                curveTo(19.401f, 10.222f, 19.309f, 10.928f, 19.135f, 11.601f)
                horizontalLineTo(19.75f)
                curveTo(21.048f, 11.601f, 22.1f, 10.548f, 22.1f, 9.25f)
                curveTo(22.1f, 7.953f, 21.048f, 6.9f, 19.75f, 6.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.751f, 20.1f)
                curveTo(4.254f, 20.1f, 3.851f, 20.503f, 3.851f, 21.0f)
                curveTo(3.851f, 21.497f, 4.254f, 21.899f, 4.751f, 21.899f)
                horizontalLineTo(17.751f)
                curveTo(18.248f, 21.899f, 18.651f, 21.497f, 18.651f, 21.0f)
                curveTo(18.651f, 20.503f, 18.248f, 20.1f, 17.751f, 20.1f)
                horizontalLineTo(4.751f)
                close()
            }
        }
        .build()
        return _coffeefill!!
    }

private var _coffeefill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Coffeefill, contentDescription = "")
    }
}
