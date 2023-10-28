package com.jslee.presentation.feature.detail.adapter.gallery

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.SingleViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemPhotoBinding
import com.jslee.presentation.feature.detail.model.GalleryUiModel
import com.jslee.presentation.feature.detail.viewholder.gallery.GalleryItemViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/29
 */
class GalleryItemListAdapter : SingleViewTypeListAdapter<GalleryUiModel>({ it.id }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<GalleryUiModel> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPhotoBinding.inflate(inflater, parent, false)
        return GalleryItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<GalleryUiModel>, position: Int) {
        super.onBindViewHolder(holder, position)
    }
}