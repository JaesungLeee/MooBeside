package com.jslee.core.designsystem.foundation.icons.iconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

public val MooBesideIconPack.Folderfill: ImageVector
    get() {
        if (_folderfill != null) {
            return _folderfill!!
        }
        _folderfill = Builder(name = "Folderfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.631f, 3.409f)
                curveTo(8.341f, 3.349f, 8.045f, 3.35f, 7.695f, 3.35f)
                lineTo(6.165f, 3.35f)
                curveTo(5.635f, 3.35f, 5.184f, 3.35f, 4.813f, 3.38f)
                curveTo(4.424f, 3.412f, 4.046f, 3.482f, 3.684f, 3.666f)
                curveTo(3.138f, 3.944f, 2.694f, 4.388f, 2.416f, 4.933f)
                curveTo(2.232f, 5.295f, 2.162f, 5.674f, 2.13f, 6.063f)
                curveTo(2.1f, 6.433f, 2.1f, 6.885f, 2.1f, 7.414f)
                verticalLineTo(16.585f)
                curveTo(2.1f, 17.115f, 2.1f, 17.566f, 2.13f, 17.937f)
                curveTo(2.162f, 18.326f, 2.232f, 18.705f, 2.416f, 19.066f)
                curveTo(2.694f, 19.612f, 3.138f, 20.056f, 3.684f, 20.334f)
                curveTo(4.046f, 20.518f, 4.424f, 20.588f, 4.813f, 20.62f)
                curveTo(5.184f, 20.65f, 5.635f, 20.65f, 6.165f, 20.65f)
                horizontalLineTo(17.836f)
                curveTo(18.365f, 20.65f, 18.817f, 20.65f, 19.187f, 20.62f)
                curveTo(19.576f, 20.588f, 19.955f, 20.518f, 20.317f, 20.334f)
                curveTo(20.862f, 20.056f, 21.306f, 19.612f, 21.584f, 19.066f)
                curveTo(21.768f, 18.705f, 21.838f, 18.326f, 21.87f, 17.937f)
                curveTo(21.9f, 17.566f, 21.9f, 17.115f, 21.9f, 16.585f)
                verticalLineTo(9.415f)
                curveTo(21.9f, 8.885f, 21.9f, 8.433f, 21.87f, 8.063f)
                curveTo(21.838f, 7.674f, 21.768f, 7.295f, 21.584f, 6.933f)
                curveTo(21.306f, 6.388f, 20.862f, 5.944f, 20.317f, 5.666f)
                curveTo(19.955f, 5.482f, 19.576f, 5.412f, 19.187f, 5.38f)
                curveTo(18.817f, 5.35f, 18.365f, 5.35f, 17.836f, 5.35f)
                lineTo(11.566f, 5.35f)
                lineTo(10.136f, 4.206f)
                curveTo(9.863f, 3.987f, 9.632f, 3.802f, 9.368f, 3.667f)
                curveTo(9.135f, 3.549f, 8.887f, 3.462f, 8.631f, 3.409f)
                close()
            }
        }
        .build()
        return _folderfill!!
    }

private var _folderfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Folderfill, contentDescription = "")
    }
}
