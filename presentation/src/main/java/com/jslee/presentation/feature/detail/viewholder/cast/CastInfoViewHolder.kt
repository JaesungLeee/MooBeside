package com.jslee.presentation.feature.detail.viewholder.cast

import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDetailCastBinding
import com.jslee.presentation.feature.detail.adapter.cast.CastInfoListAdapter
import com.jslee.presentation.feature.detail.model.mapper.SCREEN_SHOWN_LIMIT
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/28
 */
class CastInfoViewHolder(
    private val binding: ItemDetailCastBinding,
    onLoadMoreClick: () -> Unit,
    onCastItemClick: (Long) -> Unit,
) : BaseViewHolder<DetailListItem.Cast>(binding) {

    private val castInfoListAdapter = CastInfoListAdapter(onCastItemClick)

    init {
        initCastInfoList()
        binding.btnLoadMore.setOnClickListener {
            onLoadMoreClick()
        }
    }

    private fun initCastInfoList() {
        binding.rvCast.adapter = castInfoListAdapter
    }

    override fun bindItems(item: DetailListItem.Cast) {
        castInfoListAdapter.submitList(item.castInfoData.take(SCREEN_SHOWN_LIMIT))
    }
}