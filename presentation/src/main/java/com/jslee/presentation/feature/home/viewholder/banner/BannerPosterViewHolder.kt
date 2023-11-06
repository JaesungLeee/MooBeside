package com.jslee.presentation.feature.home.viewholder.banner

import androidx.recyclerview.widget.ListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemPopularPosterBinding
import com.jslee.presentation.feature.home.model.BannerUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */
class BannerPosterViewHolder(
    private val binding: ItemPopularPosterBinding,
    onBannerClick: (BannerUiModel) -> Unit,
) : BaseViewHolder<BannerUiModel>(binding) {

    init {
        binding.ivHomeBanner.setOnClickListener {
            val itemSize = (bindingAdapter as ListAdapter<*, *>).currentList.size
            val position = bindingAdapterPosition % itemSize

            getItem(position) {
                onBannerClick(it)
            }
        }
    }

    override fun bindItems(item: BannerUiModel) = with(binding) {
        banner = item
        executePendingBindings()
    }
}