package com.jslee.presentation.feature.castdetail.viewholder

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemParticipateMovieBinding
import com.jslee.presentation.feature.castdetail.model.ParticipateMovieUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/14
 */
class ParticipateMovieViewHolder(
    private val binding: ItemParticipateMovieBinding
) : BaseViewHolder<ParticipateMovieUiModel>(binding) {

    override fun bindItems(item: ParticipateMovieUiModel) {
        with(binding) {
            participateMovie = item
            executePendingBindings()
        }
    }
}