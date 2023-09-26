package com.jslee.presentation.feature.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.SingleViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemNowPlayingPosterBinding
import com.jslee.presentation.feature.home.model.NowPlayingUiModel
import com.jslee.presentation.feature.home.viewholder.nowplaying.NowPlayingPosterViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/08
 */
class NowPlayingMovieAdapter(
    private val onPosterClick: (NowPlayingUiModel) -> Unit,
) : SingleViewTypeListAdapter<NowPlayingUiModel>({ it.movieId }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<NowPlayingUiModel> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemNowPlayingPosterBinding.inflate(layoutInflater, parent, false)
        return NowPlayingPosterViewHolder(onPosterClick, binding)
    }
}