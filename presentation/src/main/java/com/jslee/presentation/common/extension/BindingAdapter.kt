package com.jslee.presentation.common.extension

import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.jslee.core.designsystem.R as DR
import com.jslee.presentation.R

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
            setTextColor(ContextCompat.getColor(this.context, DR.color.Green))
        }
    }
}