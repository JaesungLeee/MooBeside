package com.jslee.presentation.feature.home.viewholder.nowplaying

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.core.ui.decoration.CommonItemDecoration
import com.jslee.core.ui.decoration.LayoutType
import com.jslee.core.ui.model.PaddingValues
import com.jslee.presentation.databinding.ItemHomeMovieBinding
import com.jslee.presentation.feature.home.adapter.NowPlayingMovieAdapter
import com.jslee.presentation.feature.home.model.NowPlayingUiModel
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class NowPlayingMovieViewHolder(
    onNowPlayingPosterClick: (NowPlayingUiModel) -> Unit,
    private val binding: ItemHomeMovieBinding,
) : BaseViewHolder<HomeListItem.NowPlayingContent>(binding) {

    private val movieAdapter by lazy { NowPlayingMovieAdapter(onNowPlayingPosterClick) }
    override fun bindItems(item: HomeListItem.NowPlayingContent) {
        with(binding.rvMovie) {
            adapter = movieAdapter.also {
                it.submitList(item.nowPlayingData)
            }
            val paddingValues = PaddingValues.horizontal(4, 4)
            addItemDecoration(CommonItemDecoration(paddingValues, LayoutType.HORIZONTAL))
        }
        binding.executePendingBindings()
    }
}