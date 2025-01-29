package com.jslee.presentation.feature.home.viewholder.upcoming

import com.moobeside.core.common.ui.recyclerview.base.BaseViewHolder
import com.moobeside.core.common.ui.recyclerview.model.PaddingValues
import com.jslee.presentation.databinding.ItemHomeMovieBinding
import com.jslee.presentation.feature.home.adapter.UpComingMovieAdapter
import com.moobeside.core.common.ui.recyclerview.decoration.CommonItemDecoration
import com.moobeside.core.common.ui.recyclerview.decoration.LayoutType
import com.jslee.presentation.feature.home.model.UpComingUiModel
import com.jslee.presentation.feature.home.model.item.HomeListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class UpComingMovieViewHolder(
    onUpComingPosterClick: (UpComingUiModel) -> Unit,
    private val binding: ItemHomeMovieBinding,
) : BaseViewHolder<HomeListItem.UpComingContent>(binding) {

    private val movieAdapter by lazy { UpComingMovieAdapter(onUpComingPosterClick) }
    override fun bindItems(item: HomeListItem.UpComingContent) {
        with(binding.rvMovie) {
            adapter = movieAdapter.also {
                it.submitList(item.upComingData)
            }
            val paddingValues = PaddingValues.horizontal(4, 4)
            addItemDecoration(CommonItemDecoration(paddingValues, LayoutType.HORIZONTAL))
        }
        binding.executePendingBindings()
    }
}