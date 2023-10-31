package com.jslee.presentation.feature.detail.viewholder.trailer

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDetailTrailerBinding
import com.jslee.presentation.feature.detail.adapter.trailer.MovieTrailerListAdapter
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
class TrailerInfoViewHolder(
    private val binding: ItemDetailTrailerBinding,
) : BaseViewHolder<DetailListItem.MovieTrailer>(binding) {

    private val movieTrailerListAdapter = MovieTrailerListAdapter()

    init {
        initMovieTrailerAdapter()
    }

    private fun initMovieTrailerAdapter() = with(binding) {
        rvTrailer.adapter = movieTrailerListAdapter
    }

    override fun bindItems(item: DetailListItem.MovieTrailer) = with(binding) {
        tvTrailerTitle.text = "오펜하이머 예고편"
        movieTrailerListAdapter.submitList(item.trailerData)
        executePendingBindings()
    }
}