package com.jslee.core.designsystem.tooltip.builder

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import com.skydoves.balloon.Balloon

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/23
 */
interface TooltipBuilder {
    fun showTooltip(context: Context, lifecycleOwner: LifecycleOwner, text: String): Balloon
    fun dismissTooltip(balloon: Balloon)
}