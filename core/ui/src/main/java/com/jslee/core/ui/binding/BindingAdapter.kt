package com.jslee.core.ui.binding

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.jslee.core.designsystem.RateDesign
import com.jslee.core.ui.R
import com.jslee.core.designsystem.R as DR

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/11
 */

@BindingAdapter("newEntry")
fun TextView.setNewEntry(isNewEntry: Boolean) {
    if (!isNewEntry) return

    isVisible = true
    text = resources.getString(R.string.box_office_is_new)
    setTextColor(ContextCompat.getColor(context, DR.color.Amber))
}

@BindingAdapter("rankIncrementText")
fun TextView.setRankIncrementText(rankIncrement: String?) {
    if (rankIncrement == null || rankIncrement.toInt() == 0) return

    isVisible = true
    text = rankIncrement
    setTextColor(ContextCompat.getColor(context, DR.color.Gray03))
}

@BindingAdapter("rankIncrementDrawable")
fun ImageView.setRankIncrementDrawable(rankIncrement: String?) {
    if (rankIncrement == null) return

    when {
        rankIncrement.toInt() > 0 -> {
            setRankDrawable(this, DR.drawable.ic_arrow_up_14, DR.color.Blue)
        }

        rankIncrement.toInt() < 0 -> {
            setRankDrawable(this, DR.drawable.ic_arrow_down_14, DR.color.Green)
        }

        else -> return
    }
}

fun setRankDrawable(view: ImageView, drawableId: Int, colorId: Int) {
    view.apply {
        isVisible = true
        setImageDrawable(
            ContextCompat.getDrawable(context, drawableId)
        )
        setColorFilter(ContextCompat.getColor(context, colorId))
    }
}

@BindingAdapter("rateStyle")
fun TextView.setRateStyle(style: RateDesign) {
    setTextColor(ContextCompat.getColor(context, style.textColor))
    setBackgroundColor(ContextCompat.getColor(context, style.backgroundColor))
}

@BindingAdapter("bookmark")
fun ImageView.setBookmark(isBookmark: Boolean) {
    if (isBookmark) {
        setImageResource(DR.drawable.ic_heart_red_24)
    } else {
        setImageResource(DR.drawable.ic_heart_24)
    }
}

@BindingAdapter("layoutVisibility")
fun View.setLayoutVisibility(hasContent: Boolean) {
    isVisible = hasContent
}