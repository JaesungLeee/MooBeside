package com.jslee.core.ui.base

import androidx.recyclerview.widget.ListAdapter

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
abstract class BaseListAdapter<T : Any>(
    getCompareParam: (T) -> Any
) : ListAdapter<T, BaseViewHolder<T>>(BaseDiffUtil<T>(getCompareParam)) {

    override fun getItemCount(): Int = currentList.size

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        val item = currentList[position]
        holder.bindItems(item)
    }
}