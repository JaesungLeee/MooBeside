package com.jslee.core.ui.base

import androidx.databinding.ViewDataBinding
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
abstract class BaseViewHolder<out T>(
    binding: ViewDataBinding,
) : RecyclerView.ViewHolder(binding.root) {

    /* must implement */
    open fun bindItems(item: @UnsafeVariance T) {}

    private fun getItem(position: Int): Any? {
        return when (val adapter = bindingAdapter) {
            is ListAdapter<*, *> -> {
                adapter.currentList[position]
            }

            is PagingDataAdapter<*, *> -> {
                adapter.peek(position)
            }

            else -> {
                throw IllegalAccessException()
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    protected fun getItem(
        position: Int = bindingAdapterPosition,
        action: (item: T) -> Unit,
    ) {
        val item = getItem(position) as? T ?: return
        action(item)
    }
}