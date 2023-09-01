package com.jslee.core.ui.base

import androidx.recyclerview.widget.DiffUtil

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class BaseDiffUtil<T : Any>(private val getCompareParam: (T) -> Any) : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        if (oldItem::class != newItem::class) return false
        return getCompareParam(oldItem) == getCompareParam(newItem)
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return compareItems(oldItem, newItem)
    }

    private fun compareItems(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }
}