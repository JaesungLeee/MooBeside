package com.jslee.core.ui.extension

import android.content.res.Resources
import android.util.TypedValue
import com.jslee.core.ui.UNKNOWN_FIELD

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */

const val HOUR_MINUTE = 60

inline val Int.dp: Int
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), Resources.getSystem().displayMetrics
    ).toInt()

fun Int?.toDisplayRunTime(): String {
    requireNotNull(this) { "runtime null" }

    if (this == 0) return UNKNOWN_FIELD

    val hour = this / HOUR_MINUTE
    val minute = this % HOUR_MINUTE
    return "${hour}시간 ${minute}분"
}
