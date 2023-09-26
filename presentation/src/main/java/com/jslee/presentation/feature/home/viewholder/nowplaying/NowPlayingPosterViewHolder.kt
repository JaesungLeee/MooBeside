package com.jslee.presentation.feature.home.viewholder.nowplaying

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemMovieThumbnailBinding
import com.jslee.presentation.databinding.ItemNowPlayingPosterBinding
import com.jslee.presentation.feature.home.model.NowPlayingUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/08
 */
class NowPlayingPosterViewHolder(
    onPosterClick: (NowPlayingUiModel) -> Unit,
    private val binding: ItemNowPlayingPosterBinding,
) : BaseViewHolder<NowPlayingUiModel>(binding) {

    init {
        binding.ivPoster.setOnClickListener {
            getItem {
                onPosterClick(it)
            }
        }
    }

    override fun bindItems(item: NowPlayingUiModel) = with(binding) {
        nowPlaying = item
        executePendingBindings()
    }
}