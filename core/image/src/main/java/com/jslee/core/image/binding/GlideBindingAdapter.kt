package com.jslee.core.image.binding

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable
import com.jslee.core.designsystem.R

/**
 * MooBeside
 * @author jaesung
 * @created 2024/02/14
 */

const val ANIM_DURATION = 1800L

fun getShimmerEffectDrawable(context: Context): Drawable {
    val shimmer = Shimmer.ColorHighlightBuilder()
        .setBaseColor(ContextCompat.getColor(context, R.color.Gray09))
        .setHighlightColor(ContextCompat.getColor(context, R.color.Gray06))
        .setDuration(ANIM_DURATION)
        .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
        .setAutoStart(true)
        .build()

    return ShimmerDrawable().apply {
        setShimmer(shimmer)
    }
}

@BindingAdapter("posterImage")
fun ImageView.setPosterImage(imageUrl: String?) {
    val context = this.context ?: return

    Glide.with(context)
        .load(imageUrl)
        .placeholder(getShimmerEffectDrawable(context))
        .optionalFitCenter()
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean,
            ): Boolean = false

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean,
            ): Boolean {
                Log.e("Logger", "source : $dataSource")
                return false
            }
        })
        .into(this)
}

@BindingAdapter("profileImage")
fun ImageView.setProfileImage(imageUrl: String?) {
    Glide.with(this.context)
        .load(imageUrl)
        .centerCrop()
        .error(R.drawable.ic_person_24)
        .into(this)
}