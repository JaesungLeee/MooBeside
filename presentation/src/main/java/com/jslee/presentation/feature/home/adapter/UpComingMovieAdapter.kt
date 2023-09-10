package com.jslee.presentation.feature.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.SingleViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemUpComingPosterBinding
import com.jslee.presentation.feature.home.model.UpComingUiModel
import com.jslee.presentation.feature.home.viewholder.upcoming.UpComingPosterViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/08
 */
class UpComingMovieAdapter : SingleViewTypeListAdapter<UpComingUiModel>({ it.movieId }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<UpComingUiModel> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemUpComingPosterBinding.inflate(layoutInflater, parent, false)
        return UpComingPosterViewHolder(binding)
    }
}