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

public val MooBesideIconPack.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.601f)
                curveTo(10.497f, 10.601f, 10.9f, 11.003f, 10.9f, 11.5f)
                verticalLineTo(16.5f)
                curveTo(10.9f, 16.998f, 10.497f, 17.4f, 10.0f, 17.4f)
                curveTo(9.503f, 17.4f, 9.1f, 16.998f, 9.1f, 16.5f)
                verticalLineTo(11.5f)
                curveTo(9.1f, 11.003f, 9.503f, 10.601f, 10.0f, 10.601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.601f)
                curveTo(14.497f, 10.601f, 14.9f, 11.003f, 14.9f, 11.5f)
                verticalLineTo(16.5f)
                curveTo(14.9f, 16.998f, 14.497f, 17.4f, 14.0f, 17.4f)
                curveTo(13.503f, 17.4f, 13.1f, 16.998f, 13.1f, 16.5f)
                verticalLineTo(11.5f)
                curveTo(13.1f, 11.003f, 13.503f, 10.601f, 14.0f, 10.601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 5.851f)
                horizontalLineTo(16.4f)
                curveTo(16.4f, 5.35f, 16.399f, 4.922f, 16.37f, 4.567f)
                curveTo(16.338f, 4.178f, 16.268f, 3.799f, 16.084f, 3.437f)
                curveTo(15.806f, 2.892f, 15.362f, 2.448f, 14.816f, 2.17f)
                curveTo(14.454f, 1.986f, 14.076f, 1.916f, 13.687f, 1.884f)
                curveTo(13.316f, 1.854f, 12.865f, 1.854f, 12.335f, 1.854f)
                horizontalLineTo(11.664f)
                curveTo(11.135f, 1.854f, 10.683f, 1.854f, 10.313f, 1.884f)
                curveTo(9.924f, 1.916f, 9.545f, 1.986f, 9.183f, 2.17f)
                curveTo(8.638f, 2.448f, 8.194f, 2.892f, 7.916f, 3.437f)
                curveTo(7.731f, 3.799f, 7.662f, 4.178f, 7.63f, 4.567f)
                curveTo(7.601f, 4.922f, 7.6f, 5.35f, 7.6f, 5.851f)
                horizontalLineTo(4.0f)
                curveTo(3.503f, 5.851f, 3.1f, 6.254f, 3.1f, 6.751f)
                curveTo(3.1f, 7.248f, 3.503f, 7.651f, 4.0f, 7.651f)
                horizontalLineTo(4.6f)
                lineTo(4.6f, 18.087f)
                curveTo(4.6f, 18.617f, 4.6f, 19.068f, 4.63f, 19.439f)
                curveTo(4.662f, 19.828f, 4.732f, 20.206f, 4.916f, 20.568f)
                curveTo(5.194f, 21.114f, 5.638f, 21.558f, 6.183f, 21.836f)
                curveTo(6.545f, 22.02f, 6.924f, 22.09f, 7.313f, 22.122f)
                curveTo(7.683f, 22.152f, 8.135f, 22.152f, 8.664f, 22.152f)
                horizontalLineTo(15.335f)
                curveTo(15.865f, 22.152f, 16.316f, 22.152f, 16.687f, 22.122f)
                curveTo(17.076f, 22.09f, 17.455f, 22.02f, 17.816f, 21.836f)
                curveTo(18.362f, 21.558f, 18.806f, 21.114f, 19.084f, 20.568f)
                curveTo(19.268f, 20.206f, 19.338f, 19.828f, 19.37f, 19.439f)
                curveTo(19.4f, 19.068f, 19.4f, 18.617f, 19.4f, 18.087f)
                verticalLineTo(7.651f)
                horizontalLineTo(20.0f)
                curveTo(20.497f, 7.651f, 20.9f, 7.248f, 20.9f, 6.751f)
                curveTo(20.9f, 6.254f, 20.497f, 5.851f, 20.0f, 5.851f)
                close()
                moveTo(14.6f, 5.851f)
                horizontalLineTo(9.4f)
                verticalLineTo(5.545f)
                curveTo(9.4f, 4.73f, 9.411f, 4.536f, 9.454f, 4.405f)
                curveTo(9.563f, 4.07f, 9.825f, 3.808f, 10.16f, 3.699f)
                curveTo(10.292f, 3.656f, 10.486f, 3.645f, 11.3f, 3.645f)
                horizontalLineTo(12.7f)
                curveTo(13.515f, 3.645f, 13.708f, 3.656f, 13.84f, 3.699f)
                curveTo(14.175f, 3.808f, 14.438f, 4.07f, 14.546f, 4.405f)
                curveTo(14.589f, 4.536f, 14.6f, 4.73f, 14.6f, 5.545f)
                verticalLineTo(5.851f)
                close()
                moveTo(6.4f, 18.445f)
                verticalLineTo(7.651f)
                horizontalLineTo(17.6f)
                verticalLineTo(18.445f)
                curveTo(17.6f, 19.26f, 17.589f, 19.454f, 17.546f, 19.585f)
                curveTo(17.438f, 19.92f, 17.175f, 20.183f, 16.84f, 20.292f)
                curveTo(16.709f, 20.334f, 16.515f, 20.346f, 15.7f, 20.346f)
                horizontalLineTo(8.3f)
                curveTo(7.486f, 20.346f, 7.292f, 20.334f, 7.16f, 20.292f)
                curveTo(6.825f, 20.183f, 6.563f, 19.92f, 6.454f, 19.585f)
                curveTo(6.411f, 19.454f, 6.4f, 19.26f, 6.4f, 18.445f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Trash, contentDescription = "")
    }
}
