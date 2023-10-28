package com.jslee.presentation.feature.detail.viewholder.cast

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemCastBinding
import com.jslee.presentation.feature.detail.model.CastInfoUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/28
 */
class CastInfoItemViewHolder(
    private val binding: ItemCastBinding,
    onCastItemClick: (String) -> Unit,
) : BaseViewHolder<CastInfoUiModel>(binding) {

    init {
        binding.root.setOnClickListener {
            getItem {
                onCastItemClick(it.name)
            }
        }
    }

    override fun bindItems(item: CastInfoUiModel) = with(binding) {
        castInfo = item
        executePendingBindings()
    }
}