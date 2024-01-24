package com.jslee.core.ui.binding

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable
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
    if (isNewEntry) {
        isVisible = true
        text = resources.getString(R.string.box_office_is_new)
        setTextColor(ContextCompat.getColor(this.context, DR.color.Amber))
    } else {
        isVisible = false
    }
}

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

fun getShimmerEffectDrawable(context: Context): Drawable {
    val shimmer = Shimmer.ColorHighlightBuilder()
        .setBaseColor(ContextCompat.getColor(context, DR.color.Gray09))
        .setHighlightColor(ContextCompat.getColor(context, DR.color.Gray06))
        .setDuration(1800)
        .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
        .setAutoStart(true)
        .build()

    return ShimmerDrawable().apply {
        setShimmer(shimmer)
    }
}

@BindingAdapter("posterImage")
fun ImageView.setPosterImage(imageUrl: String?) {
    Glide.with(this.context)
        .load(imageUrl)
        .placeholder(getShimmerEffectDrawable(this.context))
        .into(this)
}

@BindingAdapter("profileImage")
fun ImageView.setProfileImage(imageUrl: String?) {
    Glide.with(this.context)
        .load(imageUrl)
        .centerCrop()
        .error(DR.drawable.ic_person_24)
        .into(this)
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