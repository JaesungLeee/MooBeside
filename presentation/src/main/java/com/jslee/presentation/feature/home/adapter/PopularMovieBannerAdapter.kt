package com.jslee.presentation.feature.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.SingleViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemPopularPosterBinding
import com.jslee.presentation.feature.home.model.BannerUiModel
import com.jslee.presentation.feature.home.viewholder.banner.BannerPosterViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/17
 */
class PopularMovieBannerAdapter(
    private val onBannerClick : (BannerUiModel) -> Unit
) : SingleViewTypeListAdapter<BannerUiModel>({ it.movieId }) {

    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<BannerUiModel> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemPopularPosterBinding.inflate(layoutInflater, parent, false)
        return BannerPosterViewHolder(binding, onBannerClick)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<BannerUiModel>, position: Int) {
        val item = currentList[position % currentList.size]
        holder.bindItems(item)
    }

    override fun getItemCount(): Int = Int.MAX_VALUE
}
