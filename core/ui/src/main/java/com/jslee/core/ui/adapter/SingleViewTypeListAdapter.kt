package com.jslee.core.ui.adapter

import android.view.ViewGroup
import com.jslee.core.ui.base.BaseListAdapter
import com.jslee.core.ui.base.BaseViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
abstract class SingleViewTypeListAdapter<T : Any>(
    getCompareParam: (T) -> Any
) : BaseListAdapter<T>(getCompareParam) {

    abstract fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<T>
    final override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        return onCreateViewHolder(parent)
    }
}