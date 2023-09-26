package com.jslee.presentation.feature.now

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.jslee.presentation.databinding.ItemNowPlayingPosterBinding
import com.jslee.presentation.feature.home.model.NowPlayingUiModel
import com.jslee.presentation.feature.home.viewholder.nowplaying.NowPlayingPosterViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/15
 */
class NowPlayingPagingAdapter(
    private val onPosterClick: (NowPlayingUiModel) -> Unit,
) : PagingDataAdapter<NowPlayingUiModel, NowPlayingPosterViewHolder>(NOW_PLAYING_DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NowPlayingPosterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemNowPlayingPosterBinding.inflate(layoutInflater, parent, false)
        return NowPlayingPosterViewHolder(onPosterClick, binding)
    }

    override fun onBindViewHolder(holder: NowPlayingPosterViewHolder, position: Int) {
        val item = getItem(position) ?: return
        holder.bindItems(item)
    }

    companion object {
        private val NOW_PLAYING_DIFF_CALLBACK =
            object : DiffUtil.ItemCallback<NowPlayingUiModel>() {
                override fun areItemsTheSame(
                    oldItem: NowPlayingUiModel,
                    newItem: NowPlayingUiModel,
                ): Boolean {
                    return oldItem.movieId == newItem.movieId
                }

                override fun areContentsTheSame(
                    oldItem: NowPlayingUiModel,
                    newItem: NowPlayingUiModel,
                ): Boolean {
                    return oldItem == newItem
                }
            }
    }
}