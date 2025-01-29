package com.jslee.presentation.feature.detail.adapter.trailer

import android.view.LayoutInflater
import android.view.ViewGroup
import com.moobeside.core.common.ui.recyclerview.adapter.SingleViewTypeListAdapter
import com.moobeside.core.common.ui.recyclerview.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemTrailerBinding
import com.jslee.presentation.feature.detail.model.MovieTrailerUiModel
import com.jslee.presentation.feature.detail.viewholder.trailer.TrailerItemViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
class MovieTrailerListAdapter(
    private val onTrailerClick: (String) -> Unit,
) : SingleViewTypeListAdapter<MovieTrailerUiModel>({ it.videoId }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<MovieTrailerUiModel> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTrailerBinding.inflate(inflater, parent, false)
        return TrailerItemViewHolder(binding, onTrailerClick)
    }
}