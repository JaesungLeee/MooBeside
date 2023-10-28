package com.jslee.presentation.feature.detail.viewholder.gallery

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.core.ui.decoration.CommonItemDecoration
import com.jslee.core.ui.decoration.LayoutType
import com.jslee.core.ui.model.PaddingValues
import com.jslee.presentation.databinding.ItemDetailGalleryBinding
import com.jslee.presentation.feature.detail.adapter.gallery.GalleryItemListAdapter
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/29
 */
class GalleryInfoViewHolder(
    private val binding: ItemDetailGalleryBinding,
) : BaseViewHolder<DetailListItem.Gallery>(binding) {

    private val galleryItemListAdapter = GalleryItemListAdapter()

    init {
        initGalleryItemList()
    }

    private fun initGalleryItemList() = with(binding.rvGallery) {
        adapter = galleryItemListAdapter

        val paddingValues = PaddingValues.horizontal(0, 8)
        addItemDecoration(CommonItemDecoration(paddingValues, LayoutType.HORIZONTAL))
    }

    override fun bindItems(item: DetailListItem.Gallery) {
        galleryItemListAdapter.submitList(item.galleryData)
    }
}