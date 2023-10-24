package com.jslee.presentation.feature.detail.viewholder.info

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemMovieInfoBinding
import com.jslee.presentation.feature.detail.model.MovieInfoItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/24
 */
class MovieInfoItemViewHolder(
    private val binding: ItemMovieInfoBinding,
) : BaseViewHolder<MovieInfoItem>(binding) {

    override fun bindItems(item: MovieInfoItem) = with(binding) {
        movieInfoItem = item
        executePendingBindings()
    }
}