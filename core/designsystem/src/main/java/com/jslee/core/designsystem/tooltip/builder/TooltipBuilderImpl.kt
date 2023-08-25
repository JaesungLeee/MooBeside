package com.jslee.core.designsystem.tooltip.builder

import android.content.Context
import android.util.Log
import android.view.Gravity
import androidx.lifecycle.LifecycleOwner
import com.jslee.core.designsystem.R
import com.jslee.core.designsystem.tooltip.TooltipConfig
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.ArrowPositionRules
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.BalloonSizeSpec
import com.skydoves.balloon.TextForm
import javax.inject.Inject


/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/23
 */
class TooltipBuilderImpl @Inject constructor() : TooltipBuilder {
    override fun setTooltip(
        context: Context,
        lifecycleOwner: LifecycleOwner,
        description: String
    ): Balloon {
        return TooltipConfig.createTooltip(context) {
            setWidth(220)
            setHeight(BalloonSizeSpec.WRAP)
            setText(description)
            setTextColorResource(R.color.TMDB_Green)
            setTextSize(13f)
            setTextGravity(Gravity.START)
            setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
            setArrowSize(10)
            setArrowOrientation(ArrowOrientation.START)
            setArrowPosition(0.5f)
            setPaddingHorizontal(10)
            setPaddingTop(8)
            setPaddingBottom(8)
            setCornerRadius(8f)
            setBackgroundColorResource(R.color.Tmdb_Blue)
            setBalloonAnimation(BalloonAnimation.FADE)
            setLifecycleOwner(lifecycleOwner)
        }
    }

    override fun dismissTooltip(balloon: Balloon) = balloon.dismiss()

}