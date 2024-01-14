package com.jslee.presentation.feature.castdetail.adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.SingleViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemParticipateMovieBinding
import com.jslee.presentation.feature.castdetail.model.ParticipateMovieUiModel
import com.jslee.presentation.feature.castdetail.viewholder.ParticipateMovieViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/14
 */
class ParticipateMovieAdapter :
    SingleViewTypeListAdapter<ParticipateMovieUiModel>({ it.movieId }) {

    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<ParticipateMovieUiModel> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemParticipateMovieBinding.inflate(inflater, parent, false)
        return ParticipateMovieViewHolder(binding)
    }
}