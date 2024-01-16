package com.jslee.presentation.feature.cast.adapter

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
 * @created 2024/01/10
 */
class CastAdapter(
    private val onCastClick: (Long) -> Unit,
) : SingleViewTypeListAdapter<CastInfoUiModel>({ it.personId }) {

    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<CastInfoUiModel> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCastBinding.inflate(inflater, parent, false)
        return CastInfoItemViewHolder(binding, onCastItemClick = onCastClick)
    }
}