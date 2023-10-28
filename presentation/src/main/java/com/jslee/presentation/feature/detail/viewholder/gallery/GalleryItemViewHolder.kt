package com.jslee.presentation.feature.detail.viewholder.gallery

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemPhotoBinding
import com.jslee.presentation.feature.detail.model.GalleryUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/29
 */
class GalleryItemViewHolder(
    private val binding: ItemPhotoBinding,
) : BaseViewHolder<GalleryUiModel>(binding) {
    override fun bindItems(item: GalleryUiModel) = with(binding) {
        gallery = item
        executePendingBindings()
    }
}