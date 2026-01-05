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

public val MooBesideIconPack.Folderjobfill: ImageVector
    get() {
        if (_folderjobfill != null) {
            return _folderjobfill!!
        }
        _folderjobfill = Builder(name = "Folderjobfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.695f, 3.35f)
                curveTo(8.045f, 3.35f, 8.341f, 3.349f, 8.631f, 3.409f)
                curveTo(8.887f, 3.462f, 9.135f, 3.549f, 9.368f, 3.667f)
                curveTo(9.632f, 3.802f, 9.863f, 3.987f, 10.136f, 4.206f)
                lineTo(11.566f, 5.35f)
                lineTo(17.836f, 5.35f)
                curveTo(18.365f, 5.35f, 18.817f, 5.35f, 19.187f, 5.38f)
                curveTo(19.576f, 5.412f, 19.955f, 5.482f, 20.317f, 5.666f)
                curveTo(20.862f, 5.944f, 21.306f, 6.388f, 21.584f, 6.933f)
                curveTo(21.768f, 7.295f, 21.838f, 7.674f, 21.87f, 8.063f)
                curveTo(21.9f, 8.433f, 21.9f, 8.885f, 21.9f, 9.414f)
                verticalLineTo(16.585f)
                curveTo(21.9f, 17.115f, 21.9f, 17.566f, 21.87f, 17.937f)
                curveTo(21.838f, 18.326f, 21.768f, 18.705f, 21.584f, 19.066f)
                curveTo(21.306f, 19.612f, 20.862f, 20.056f, 20.317f, 20.334f)
                curveTo(19.955f, 20.518f, 19.576f, 20.588f, 19.187f, 20.62f)
                curveTo(18.817f, 20.65f, 18.365f, 20.65f, 17.836f, 20.65f)
                horizontalLineTo(6.165f)
                curveTo(5.635f, 20.65f, 5.184f, 20.65f, 4.813f, 20.62f)
                curveTo(4.424f, 20.588f, 4.046f, 20.518f, 3.684f, 20.334f)
                curveTo(3.138f, 20.056f, 2.694f, 19.612f, 2.416f, 19.066f)
                curveTo(2.232f, 18.705f, 2.162f, 18.326f, 2.13f, 17.937f)
                curveTo(2.1f, 17.566f, 2.1f, 17.115f, 2.1f, 16.585f)
                verticalLineTo(7.414f)
                curveTo(2.1f, 6.885f, 2.1f, 6.433f, 2.13f, 6.063f)
                curveTo(2.162f, 5.674f, 2.232f, 5.295f, 2.416f, 4.933f)
                curveTo(2.694f, 4.388f, 3.138f, 3.944f, 3.684f, 3.666f)
                curveTo(4.046f, 3.482f, 4.424f, 3.412f, 4.813f, 3.38f)
                curveTo(5.184f, 3.35f, 5.635f, 3.35f, 6.165f, 3.35f)
                lineTo(7.695f, 3.35f)
                close()
                moveTo(8.75f, 10.55f)
                curveTo(7.949f, 10.55f, 7.3f, 11.2f, 7.3f, 12.0f)
                curveTo(7.3f, 12.801f, 7.949f, 13.45f, 8.75f, 13.45f)
                curveTo(9.551f, 13.45f, 10.2f, 12.801f, 10.2f, 12.0f)
                curveTo(10.2f, 11.2f, 9.551f, 10.55f, 8.75f, 10.55f)
                close()
                moveTo(8.75f, 14.302f)
                curveTo(7.925f, 14.302f, 7.147f, 14.498f, 6.559f, 14.882f)
                curveTo(5.963f, 15.272f, 5.55f, 15.87f, 5.55f, 16.629f)
                curveTo(5.55f, 16.946f, 5.806f, 17.202f, 6.123f, 17.202f)
                horizontalLineTo(11.377f)
                curveTo(11.693f, 17.202f, 11.95f, 16.946f, 11.95f, 16.629f)
                curveTo(11.95f, 15.87f, 11.536f, 15.272f, 10.941f, 14.882f)
                curveTo(10.353f, 14.498f, 9.574f, 14.302f, 8.75f, 14.302f)
                close()
            }
        }
        .build()
        return _folderjobfill!!
    }

private var _folderjobfill: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Folderjobfill, contentDescription = "")
    }
}
