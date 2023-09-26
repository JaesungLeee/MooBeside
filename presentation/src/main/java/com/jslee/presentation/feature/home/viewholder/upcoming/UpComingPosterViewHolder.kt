package com.jslee.presentation.feature.home.viewholder.upcoming

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemUpComingPosterBinding
import com.jslee.presentation.feature.home.model.UpComingUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/08
 */
class UpComingPosterViewHolder(
    onPosterClick: (UpComingUiModel) -> Unit,
    private val binding: ItemUpComingPosterBinding,
) : BaseViewHolder<UpComingUiModel>(binding) {

    init {
        binding.ivPoster.setOnClickListener {
            getItem {
                onPosterClick(it)
            }
        }
    }

    override fun bindItems(item: UpComingUiModel) = with(binding) {
        upComing = item
        executePendingBindings()
    }
}