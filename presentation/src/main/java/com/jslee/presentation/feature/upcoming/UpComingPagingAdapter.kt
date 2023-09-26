package com.jslee.presentation.feature.upcoming

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.jslee.presentation.databinding.ItemUpComingPosterBinding
import com.jslee.presentation.feature.home.model.UpComingUiModel
import com.jslee.presentation.feature.home.viewholder.upcoming.UpComingPosterViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */
class UpComingPagingAdapter(
    private val onPosterClick: (UpComingUiModel) -> Unit,
) : PagingDataAdapter<UpComingUiModel, UpComingPosterViewHolder>(UP_COMING_DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpComingPosterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemUpComingPosterBinding.inflate(layoutInflater, parent, false)
        return UpComingPosterViewHolder(onPosterClick, binding)
    }

    override fun onBindViewHolder(holder: UpComingPosterViewHolder, position: Int) {
        val item = getItem(position) ?: return
        holder.bindItems(item)
    }

    companion object {
        private val UP_COMING_DIFF_CALLBACK = object : DiffUtil.ItemCallback<UpComingUiModel>() {
            override fun areItemsTheSame(
                oldItem: UpComingUiModel,
                newItem: UpComingUiModel,
            ): Boolean {
                return oldItem.movieId == newItem.movieId
            }

            override fun areContentsTheSame(
                oldItem: UpComingUiModel,
                newItem: UpComingUiModel,
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}