package com.jslee.core.ui.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
abstract class BaseViewHolder<T : Any>(
    binding: ViewDataBinding
) : RecyclerView.ViewHolder(binding.root) {

    /* must implement */
    open fun bindItems(item: T) {}
}