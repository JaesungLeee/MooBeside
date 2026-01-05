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

public val MooBesideIconPack.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.165f, 4.349f)
                curveTo(5.635f, 4.349f, 5.183f, 4.349f, 4.813f, 4.379f)
                curveTo(4.424f, 4.411f, 4.045f, 4.481f, 3.683f, 4.665f)
                curveTo(3.138f, 4.943f, 2.694f, 5.387f, 2.416f, 5.933f)
                curveTo(2.232f, 6.294f, 2.162f, 6.673f, 2.13f, 7.062f)
                curveTo(2.1f, 7.433f, 2.1f, 7.884f, 2.1f, 8.414f)
                verticalLineTo(15.585f)
                curveTo(2.1f, 16.114f, 2.1f, 16.566f, 2.13f, 16.936f)
                curveTo(2.162f, 17.325f, 2.232f, 17.704f, 2.416f, 18.066f)
                curveTo(2.694f, 18.611f, 3.138f, 19.055f, 3.683f, 19.333f)
                curveTo(4.045f, 19.517f, 4.424f, 19.587f, 4.813f, 19.619f)
                curveTo(5.184f, 19.649f, 5.635f, 19.649f, 6.165f, 19.649f)
                horizontalLineTo(17.835f)
                curveTo(18.365f, 19.649f, 18.816f, 19.649f, 19.187f, 19.619f)
                curveTo(19.576f, 19.587f, 19.955f, 19.517f, 20.316f, 19.333f)
                curveTo(20.862f, 19.055f, 21.306f, 18.611f, 21.584f, 18.066f)
                curveTo(21.768f, 17.704f, 21.838f, 17.325f, 21.87f, 16.936f)
                curveTo(21.9f, 16.566f, 21.9f, 16.114f, 21.9f, 15.585f)
                verticalLineTo(8.414f)
                curveTo(21.9f, 7.884f, 21.9f, 7.433f, 21.87f, 7.062f)
                curveTo(21.838f, 6.673f, 21.768f, 6.294f, 21.584f, 5.933f)
                curveTo(21.306f, 5.387f, 20.862f, 4.943f, 20.316f, 4.665f)
                curveTo(19.955f, 4.481f, 19.576f, 4.411f, 19.187f, 4.379f)
                curveTo(18.816f, 4.349f, 18.365f, 4.349f, 17.835f, 4.349f)
                horizontalLineTo(6.165f)
                close()
                moveTo(4.66f, 6.204f)
                curveTo(4.792f, 6.162f, 4.985f, 6.15f, 5.8f, 6.15f)
                horizontalLineTo(18.2f)
                curveTo(19.014f, 6.15f, 19.208f, 6.162f, 19.34f, 6.204f)
                curveTo(19.675f, 6.313f, 19.937f, 6.576f, 20.046f, 6.911f)
                curveTo(20.077f, 7.007f, 20.092f, 7.137f, 20.097f, 7.521f)
                lineTo(13.28f, 12.068f)
                curveTo(12.58f, 12.535f, 12.414f, 12.629f, 12.261f, 12.666f)
                curveTo(12.092f, 12.707f, 11.917f, 12.707f, 11.748f, 12.666f)
                curveTo(11.595f, 12.63f, 11.429f, 12.535f, 10.729f, 12.068f)
                lineTo(3.903f, 7.52f)
                curveTo(3.908f, 7.137f, 3.922f, 7.007f, 3.954f, 6.911f)
                curveTo(4.063f, 6.576f, 4.325f, 6.313f, 4.66f, 6.204f)
                close()
                moveTo(3.9f, 9.682f)
                verticalLineTo(15.95f)
                curveTo(3.9f, 16.765f, 3.911f, 16.959f, 3.954f, 17.09f)
                curveTo(4.063f, 17.425f, 4.325f, 17.688f, 4.66f, 17.797f)
                curveTo(4.792f, 17.839f, 4.985f, 17.85f, 5.8f, 17.85f)
                horizontalLineTo(18.2f)
                curveTo(19.014f, 17.85f, 19.208f, 17.839f, 19.34f, 17.797f)
                curveTo(19.675f, 17.688f, 19.937f, 17.425f, 20.046f, 17.09f)
                curveTo(20.089f, 16.959f, 20.1f, 16.765f, 20.1f, 15.95f)
                verticalLineTo(9.683f)
                lineTo(14.173f, 13.636f)
                curveTo(13.638f, 13.994f, 13.188f, 14.295f, 12.681f, 14.417f)
                curveTo(12.237f, 14.523f, 11.774f, 14.523f, 11.329f, 14.417f)
                curveTo(10.822f, 14.296f, 10.372f, 13.995f, 9.837f, 13.637f)
                lineTo(3.9f, 9.682f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Mail, contentDescription = "")
    }
}
