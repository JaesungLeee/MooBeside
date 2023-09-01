package com.jslee.presentation.feature.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jslee.presentation.databinding.ItemHomeBannerBinding
import com.jslee.presentation.feature.home.model.BannerUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/17
 */
class HomeBannerAdapter : ListAdapter<BannerUiModel, HomeBannerViewHolder>(bannerDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBannerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemHomeBannerBinding.inflate(layoutInflater, parent, false)
        return HomeBannerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeBannerViewHolder, position: Int) {
        val item = currentList[position % currentList.size]
        holder.bindItems(item)
    }

    override fun getItemCount(): Int = Int.MAX_VALUE

    companion object {
        private val bannerDiffCallback = object : DiffUtil.ItemCallback<BannerUiModel>() {
            override fun areItemsTheSame(
                oldItem: BannerUiModel,
                newItem: BannerUiModel
            ): Boolean {
                return oldItem.movieId == newItem.movieId
            }

            override fun areContentsTheSame(
                oldItem: BannerUiModel,
                newItem: BannerUiModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}

class HomeBannerViewHolder(
    private val binding: ItemHomeBannerBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bindItems(item: BannerUiModel) {
        with(binding) {
            banner = item
            executePendingBindings()
        }
    }
}