package com.jslee.core.designsystem.tooltip.builder

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import com.jslee.core.designsystem.R
import com.jslee.core.designsystem.tooltip.TooltipConfig
import com.skydoves.balloon.ArrowPositionRules
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.BalloonSizeSpec
import javax.inject.Inject


/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/23
 */
class TooltipBuilderImpl @Inject constructor() : TooltipBuilder {
    override fun showTooltip(
        context: Context,
        lifecycleOwner: LifecycleOwner,
        text: String
    ): Balloon {
        return TooltipConfig.createTooltip(context) {
            setWidthRatio(1.0f)
            setHeight(BalloonSizeSpec.WRAP)
            setText(text)
            setTextColorResource(R.color.White)
            setTextSize(15f)
            setIconDrawableResource(R.drawable.ic_person_16)
            setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
            setArrowSize(10)
            setArrowPosition(0.5f)
            setPadding(12)
            setCornerRadius(8f)
            setBackgroundColorResource(R.color.Blurple)
            setBalloonAnimation(BalloonAnimation.ELASTIC)
            setLifecycleOwner(lifecycleOwner)
        }
    }

    override fun dismissTooltip(balloon: Balloon) = balloon.dismiss()

}