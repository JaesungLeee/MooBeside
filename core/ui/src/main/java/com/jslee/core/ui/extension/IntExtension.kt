package com.jslee.core.ui.extension

import android.content.res.Resources
import android.util.TypedValue

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */
inline val Int.dp: Int
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), Resources.getSystem().displayMetrics
    ).toInt()