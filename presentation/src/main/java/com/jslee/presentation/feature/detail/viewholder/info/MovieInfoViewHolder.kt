package com.jslee.presentation.feature.detail.viewholder.info

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.core.ui.decoration.CommonItemDecoration
import com.jslee.core.ui.decoration.LayoutType
import com.jslee.core.ui.model.PaddingValues
import com.jslee.presentation.databinding.ItemDetailInfoBinding
import com.jslee.presentation.feature.detail.adapter.info.MovieInfoListAdapter
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/21
 */
class MovieInfoViewHolder(
    private val binding: ItemDetailInfoBinding,
) : BaseViewHolder<DetailListItem.MovieInfo>(binding) {

    private val movieInfoListAdapter = MovieInfoListAdapter()

    init {
        initMovieInfoList()
    }

    private fun initMovieInfoList() = with(binding.rvMovieInfo) {
        adapter = movieInfoListAdapter
        val paddingValues = PaddingValues.horizontal(0, 24)
        addItemDecoration(CommonItemDecoration(paddingValues, LayoutType.HORIZONTAL))
    }

    override fun bindItems(item: DetailListItem.MovieInfo) = with(binding) {
        movieInfo = item.movieInfoData
        movieInfoListAdapter.submitList(item.movieInfoData.movieInfoData)
        executePendingBindings()
    }
}