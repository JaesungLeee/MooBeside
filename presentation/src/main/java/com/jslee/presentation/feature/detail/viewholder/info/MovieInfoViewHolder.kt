package com.jslee.presentation.feature.detail.viewholder.info

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDetailInfoBinding
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/21
 */
class MovieInfoViewHolder(
    private val binding: ItemDetailInfoBinding,
) : BaseViewHolder<DetailListItem.MovieInfo>(binding) {
    override fun bindItems(item: DetailListItem.MovieInfo) = with(binding) {
        movieInfo = item.movieInfoData
        executePendingBindings()
    }
}