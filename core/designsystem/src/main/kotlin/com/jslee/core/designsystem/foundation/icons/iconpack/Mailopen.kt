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

public val MooBesideIconPack.Mailopen: ImageVector
    get() {
        if (_mailopen != null) {
            return _mailopen!!
        }
        _mailopen = Builder(name = "Mailopen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.676f, 2.583f)
                curveTo(12.231f, 2.476f, 11.768f, 2.476f, 11.324f, 2.583f)
                curveTo(10.817f, 2.704f, 10.367f, 3.005f, 9.832f, 3.363f)
                lineTo(3.84f, 7.357f)
                curveTo(3.403f, 7.648f, 3.035f, 7.893f, 2.76f, 8.228f)
                curveTo(2.518f, 8.523f, 2.336f, 8.862f, 2.225f, 9.227f)
                curveTo(2.099f, 9.642f, 2.099f, 10.085f, 2.1f, 10.609f)
                lineTo(2.1f, 16.585f)
                curveTo(2.1f, 17.115f, 2.1f, 17.566f, 2.13f, 17.936f)
                curveTo(2.162f, 18.325f, 2.232f, 18.704f, 2.416f, 19.066f)
                curveTo(2.694f, 19.611f, 3.138f, 20.055f, 3.683f, 20.333f)
                curveTo(4.045f, 20.518f, 4.424f, 20.587f, 4.813f, 20.619f)
                curveTo(5.184f, 20.649f, 5.635f, 20.649f, 6.165f, 20.649f)
                horizontalLineTo(17.835f)
                curveTo(18.365f, 20.649f, 18.816f, 20.649f, 19.187f, 20.619f)
                curveTo(19.576f, 20.587f, 19.955f, 20.518f, 20.316f, 20.333f)
                curveTo(20.862f, 20.055f, 21.306f, 19.611f, 21.584f, 19.066f)
                curveTo(21.768f, 18.704f, 21.838f, 18.325f, 21.87f, 17.936f)
                curveTo(21.9f, 17.566f, 21.9f, 17.115f, 21.9f, 16.585f)
                lineTo(21.9f, 10.609f)
                curveTo(21.9f, 10.085f, 21.901f, 9.642f, 21.775f, 9.227f)
                curveTo(21.664f, 8.862f, 21.482f, 8.523f, 21.24f, 8.228f)
                curveTo(20.965f, 7.893f, 20.597f, 7.648f, 20.16f, 7.357f)
                lineTo(14.168f, 3.363f)
                curveTo(13.633f, 3.005f, 13.183f, 2.704f, 12.676f, 2.583f)
                close()
                moveTo(11.62f, 4.37f)
                curveTo(11.865f, 4.28f, 12.135f, 4.28f, 12.38f, 4.37f)
                curveTo(12.478f, 4.407f, 12.589f, 4.473f, 13.054f, 4.783f)
                lineTo(19.379f, 9.0f)
                lineTo(13.281f, 13.068f)
                curveTo(12.58f, 13.535f, 12.414f, 13.63f, 12.261f, 13.666f)
                curveTo(12.093f, 13.707f, 11.917f, 13.707f, 11.748f, 13.667f)
                curveTo(11.595f, 13.63f, 11.429f, 13.535f, 10.729f, 13.068f)
                lineTo(4.622f, 9.0f)
                lineTo(10.946f, 4.783f)
                curveTo(11.411f, 4.473f, 11.522f, 4.407f, 11.62f, 4.37f)
                close()
                moveTo(3.9f, 10.682f)
                verticalLineTo(16.949f)
                curveTo(3.9f, 17.764f, 3.911f, 17.957f, 3.954f, 18.089f)
                curveTo(4.063f, 18.424f, 4.325f, 18.686f, 4.66f, 18.795f)
                curveTo(4.792f, 18.838f, 4.985f, 18.849f, 5.8f, 18.849f)
                horizontalLineTo(18.2f)
                curveTo(19.014f, 18.849f, 19.208f, 18.838f, 19.34f, 18.795f)
                curveTo(19.675f, 18.686f, 19.937f, 18.424f, 20.046f, 18.089f)
                curveTo(20.089f, 17.957f, 20.1f, 17.764f, 20.1f, 16.949f)
                verticalLineTo(10.683f)
                lineTo(14.173f, 14.637f)
                curveTo(13.638f, 14.994f, 13.188f, 15.295f, 12.681f, 15.417f)
                curveTo(12.237f, 15.523f, 11.774f, 15.524f, 11.33f, 15.417f)
                curveTo(10.823f, 15.296f, 10.373f, 14.995f, 9.837f, 14.638f)
                lineTo(3.9f, 10.682f)
                close()
            }
        }
        .build()
        return _mailopen!!
    }

private var _mailopen: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MooBesideIconPack.Mailopen, contentDescription = "")
    }
}
