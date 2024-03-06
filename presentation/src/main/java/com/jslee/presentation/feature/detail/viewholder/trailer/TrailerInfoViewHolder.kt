package com.jslee.presentation.feature.detail.viewholder.trailer

import androidx.core.view.doOnAttach
import androidx.core.view.doOnDetach
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.core.ui.extension.setOnSingleClickListener
import com.jslee.presentation.R
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
    onLoadMoreClick: (String) -> Unit,
    onTrailerClick: (String) -> Unit,
) : BaseViewHolder<DetailListItem.MovieTrailer>(binding) {

    private val movieTrailerListAdapter: MovieTrailerListAdapter by lazy {
        MovieTrailerListAdapter(onTrailerClick)
    }

    init {
        initLifecycleOwner()
        initMovieTrailerAdapter()
        setTrailerLoadMoreClickListener(onLoadMoreClick)
    }

    private fun initLifecycleOwner() {
        itemView.apply {
            doOnAttach {
                itemView.findViewTreeLifecycleOwner()?.let {
                    binding.lifecycleOwner = it
                }
            }
            doOnDetach {
                binding.lifecycleOwner = null
            }
        }
    }

    private fun initMovieTrailerAdapter() = with(binding) {
        rvTrailer.adapter = movieTrailerListAdapter
    }

    private fun setTrailerLoadMoreClickListener(onLoadMoreClick: (String) -> Unit) {
        binding.apply {
            lifecycleOwner?.let { lifecycleOwner ->
                btnLoadMore.setOnSingleClickListener(lifecycleOwner.lifecycleScope) {
                    getItem {
                        onLoadMoreClick(it.title)
                    }
                }
            }
        }
    }

    override fun bindItems(item: DetailListItem.MovieTrailer) = with(binding) {
        tvTrailerTitle.text = root.context.getString(R.string.text_trailer_title, item.title)
        movieTrailerListAdapter.submitList(item.trailerData)
        executePendingBindings()
    }
}