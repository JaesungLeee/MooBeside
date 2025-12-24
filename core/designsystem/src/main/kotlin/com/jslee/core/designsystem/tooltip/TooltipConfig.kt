package com.jslee.core.designsystem.tooltip

import android.content.Context
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.createBalloon

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/23
 */
object TooltipConfig {

    fun createTooltip(context: Context, builder: Balloon.Builder.() -> Unit): Balloon {
        return createBalloon(context, builder)
    }
}