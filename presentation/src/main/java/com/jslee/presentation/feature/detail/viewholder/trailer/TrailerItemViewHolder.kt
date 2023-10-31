package com.jslee.presentation.feature.detail.viewholder.trailer

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemTrailerBinding
import com.jslee.presentation.feature.detail.model.MovieTrailerUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
class TrailerItemViewHolder(
    private val binding: ItemTrailerBinding,
) : BaseViewHolder<MovieTrailerUiModel>(binding) {

    override fun bindItems(item: MovieTrailerUiModel) = with(binding) {
        trailer = item
        executePendingBindings()
    }
}