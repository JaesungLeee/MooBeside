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

public val MooBesideIconPack.Quote: ImageVector
    get() {
        if (_quote != null) {
            return _quote!!
        }
        _quote = Builder(name = "Quote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.136f, 5.364f)
                curveTo(9.488f, 5.715f, 9.488f, 6.285f, 9.136f, 6.636f)
                curveTo(8.897f, 6.876f, 8.662f, 7.109f, 8.432f, 7.338f)
                curveTo(7.313f, 8.448f, 6.317f, 9.436f, 5.548f, 10.404f)
                curveTo(5.114f, 10.95f, 4.78f, 11.457f, 4.547f, 11.939f)
                curveTo(5.248f, 11.265f, 6.201f, 10.85f, 7.25f, 10.85f)
                curveTo(9.404f, 10.85f, 11.15f, 12.596f, 11.15f, 14.75f)
                curveTo(11.15f, 16.904f, 9.404f, 18.65f, 7.25f, 18.65f)
                lineTo(7.206f, 18.65f)
                curveTo(5.703f, 18.64f, 4.458f, 18.125f, 3.596f, 17.163f)
                curveTo(2.738f, 16.206f, 2.35f, 14.908f, 2.35f, 13.5f)
                curveTo(2.35f, 11.944f, 3.128f, 10.556f, 4.139f, 9.284f)
                curveTo(4.981f, 8.225f, 6.07f, 7.145f, 7.188f, 6.035f)
                curveTo(7.413f, 5.813f, 7.639f, 5.589f, 7.864f, 5.364f)
                curveTo(8.215f, 5.012f, 8.785f, 5.012f, 9.136f, 5.364f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.636f, 5.364f)
                curveTo(19.988f, 5.715f, 19.988f, 6.285f, 19.636f, 6.636f)
                curveTo(19.397f, 6.876f, 19.162f, 7.109f, 18.932f, 7.337f)
                curveTo(17.814f, 8.447f, 16.817f, 9.436f, 16.048f, 10.404f)
                curveTo(15.614f, 10.95f, 15.28f, 11.457f, 15.047f, 11.939f)
                curveTo(15.748f, 11.265f, 16.701f, 10.85f, 17.75f, 10.85f)
                curveTo(19.904f, 10.85f, 21.65f, 12.596f, 21.65f, 14.75f)
                curveTo(21.65f, 16.904f, 19.904f, 18.65f, 17.75f, 18.65f)
                lineTo(17.706f, 18.65f)
                curveTo(16.203f, 18.64f, 14.958f, 18.125f, 14.096f, 17.163f)
                curveTo(13.238f, 16.206f, 12.85f, 14.908f, 12.85f, 13.5f)
                curveTo(12.85f, 11.944f, 13.628f, 10.556f, 14.639f, 9.284f)
                curveTo(15.481f, 8.225f, 16.57f, 7.145f, 17.688f, 6.035f)
                curveTo(17.913f, 5.813f, 18.139f, 5.589f, 18.364f, 5.364f)
                curveTo(18.715f, 5.012f, 19.285f, 5.012f, 19.636f, 5.364f)
                close()
            }
        }
        .build()
        return _quote!!
    }

private var _quote: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Quote, contentDescription = "")
    }
}
