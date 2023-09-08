package com.jslee.presentation.feature.home.viewholder.upcoming

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemHomeMovieBinding
import com.jslee.presentation.feature.home.adapter.UpComingMovieAdapter
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class UpComingMovieViewHolder(private val binding: ItemHomeMovieBinding) :
    BaseViewHolder<HomeListItem.UpComingContent>(binding) {

    private val movieAdapter by lazy { UpComingMovieAdapter() }
    override fun bindItems(item: HomeListItem.UpComingContent) = with(binding) {
        rvMovie.adapter = movieAdapter.also {
            it.submitList(item.upComingData)
        }
        executePendingBindings()
    }
}