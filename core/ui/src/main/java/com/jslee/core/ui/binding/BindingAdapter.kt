package com.jslee.core.ui.binding

import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.jslee.core.designsystem.RateDesign
import com.jslee.core.ui.R
import com.jslee.core.designsystem.R as DR


/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/11
 */
object BindingAdapter {
    @JvmStatic
    @BindingAdapter("newEntry")
    fun TextView.setNewEntry(isNewEntry: Boolean) {
        if (isNewEntry) {
            isVisible = true
            text = resources.getString(R.string.box_office_is_new)
            setTextColor(ContextCompat.getColor(this.context, DR.color.Amber))
        } else {
            isVisible = false
        }
    }

    @JvmStatic
    @BindingAdapter("rankIncrementText")
    fun TextView.setRankIncrementText(rankIncrement: String?) {
        if (!rankIncrement.isNullOrEmpty()) {
            if (rankIncrement.toInt() == 0) return
            isVisible = true
            text = rankIncrement
            setTextColor(ContextCompat.getColor(this.context, DR.color.Gray03))
        } else {
            isVisible = false
        }
    }


    @JvmStatic
    @BindingAdapter("rankIncrementDrawable")
    fun ImageView.setRankIncrementDrawable(rankIncrement: String?) {
        if (!rankIncrement.isNullOrEmpty()) {
            if (rankIncrement.toInt() == 0) return
            if (rankIncrement.toInt() > 0) {
                isVisible = true
                setImageDrawable(
                    ContextCompat.getDrawable(this.context, DR.drawable.ic_arrow_up_14)
                )
                setColorFilter(ContextCompat.getColor(this.context, DR.color.Blue))
            } else {
                isVisible = true
                setImageDrawable(
                    ContextCompat.getDrawable(this.context, DR.drawable.ic_arrow_down_14)
                )
                setColorFilter(ContextCompat.getColor(this.context, DR.color.Green))
            }
        } else setImageDrawable(null)
    }

    @JvmStatic
    @BindingAdapter("posterImage")
    fun ImageView.setPosterImage(imageUrl: String?) {
        if (!imageUrl.isNullOrEmpty()) {
            Glide.with(this.context)
                .load(imageUrl)
                .fitCenter()
                .override(400, 600)
                .into(this)
        } else {
        }
    }

    @JvmStatic
    @BindingAdapter("rateStyle")
    fun TextView.setRateStyle(style: RateDesign) {
        setTextColor(ContextCompat.getColor(context, style.textColor))
        setBackgroundColor(ContextCompat.getColor(context, style.backgroundColor))
    }
}