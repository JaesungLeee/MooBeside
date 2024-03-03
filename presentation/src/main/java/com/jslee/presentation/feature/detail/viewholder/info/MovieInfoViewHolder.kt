package com.jslee.presentation.feature.detail.viewholder.info

import android.text.TextUtils
import androidx.core.view.doOnPreDraw
import androidx.core.view.isVisible
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

private const val COLLAPSED_OVERVIEW_LENGTH = 4

class MovieInfoViewHolder(
    private val binding: ItemDetailInfoBinding,
) : BaseViewHolder<DetailListItem.MovieInfo>(binding) {

    private val movieInfoListAdapter = MovieInfoListAdapter()

    init {
        initMovieInfoList()
        setLoadMoreTextClickListener()
        handleMovieOverviewExpandedState()
    }

    private fun initMovieInfoList() = with(binding.rvMovieInfo) {
        adapter = movieInfoListAdapter
        val paddingValues = PaddingValues.horizontal(0, 24)
        addItemDecoration(CommonItemDecoration(paddingValues, LayoutType.HORIZONTAL))
    }

    private fun handleMovieOverviewExpandedState() {
        binding.tvMovieOverview.doOnPreDraw {
            val lineCount = binding.tvMovieOverview.lineCount
            if (lineCount > COLLAPSED_OVERVIEW_LENGTH) {
                binding.tvMovieOverview.apply {
                    ellipsize = TextUtils.TruncateAt.END
                    maxLines = COLLAPSED_OVERVIEW_LENGTH
                }
                binding.tvLoadMore.isVisible = true
            } else {
                binding.tvLoadMore.isVisible = false
            }
        }
    }

    private fun setLoadMoreTextClickListener() {
        binding.tvLoadMore.setOnClickListener { loadMoreText ->
            loadMoreText.isVisible = false
            binding.tvMovieOverview.apply {
                ellipsize = null
                maxLines = Int.MAX_VALUE
            }
        }
    }

    override fun bindItems(item: DetailListItem.MovieInfo) = with(binding) {
        movieInfo = item.movieInfoData
        movieInfoListAdapter.submitList(item.movieInfoData.movieInfoData)
        executePendingBindings()
    }
}