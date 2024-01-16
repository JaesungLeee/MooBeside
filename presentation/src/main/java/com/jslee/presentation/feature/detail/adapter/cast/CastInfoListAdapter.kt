package com.jslee.presentation.feature.detail.adapter.cast

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.SingleViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemCastBinding
import com.jslee.presentation.feature.detail.model.CastInfoUiModel
import com.jslee.presentation.feature.detail.viewholder.cast.CastInfoItemViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/28
 */
class CastInfoListAdapter(
    private val onCastItemClick: (Long) -> Unit,
) : SingleViewTypeListAdapter<CastInfoUiModel>({ it.name }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<CastInfoUiModel> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCastBinding.inflate(inflater, parent, false)
        return CastInfoItemViewHolder(binding, onCastItemClick)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<CastInfoUiModel>, position: Int) {
        val item = currentList[position] ?: return
        holder.bindItems(item)
    }
}