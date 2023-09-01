package com.jslee.presentation.feature.home.viewholder.movie

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemMovieThumbnailBinding
import com.jslee.presentation.feature.home.model.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class UpComingMovieViewHolder(private val binding: ItemMovieThumbnailBinding) :
    BaseViewHolder<HomeListItem.UpComingContent>(binding) {
    override fun bindItems(item: HomeListItem.UpComingContent) = with(binding) {
        executePendingBindings()
    }
}