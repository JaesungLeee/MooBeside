package com.jslee.presentation.feature.detail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.jslee.core.ui.adapter.MultiViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemDetailCastBinding
import com.jslee.presentation.databinding.ItemDetailGalleryBinding
import com.jslee.presentation.databinding.ItemDetailInfoBinding
import com.jslee.presentation.databinding.ItemDetailRateBinding
import com.jslee.presentation.feature.detail.model.item.DetailListItem
import com.jslee.presentation.feature.detail.viewholder.cast.CastInfoViewHolder
import com.jslee.presentation.feature.detail.viewholder.gallery.GalleryInfoViewHolder
import com.jslee.presentation.feature.detail.viewholder.info.MovieInfoViewHolder
import com.jslee.presentation.feature.detail.viewholder.rate.RateInfoViewHolder
import timber.log.Timber

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/21
 */
class MovieDetailAdapter :
    MultiViewTypeListAdapter<DetailListItem, DetailListItem.DetailViewType>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: DetailListItem.DetailViewType,
    ): BaseViewHolder<DetailListItem> {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            DetailListItem.DetailViewType.MOVIE_INFO -> MovieInfoViewHolder(
                ItemDetailInfoBinding.inflate(inflater, parent, false)
            )

            DetailListItem.DetailViewType.CAST -> CastInfoViewHolder(
                ItemDetailCastBinding.inflate(inflater, parent, false),
                onLoadMoreClick = {
                    Timber.e("LoadMore")
                },
                onCastItemClick = {
                    Timber.e(it)
                }
            )

            DetailListItem.DetailViewType.GALLERY -> GalleryInfoViewHolder(
                ItemDetailGalleryBinding.inflate(inflater, parent, false)
            )

            DetailListItem.DetailViewType.RATE -> RateInfoViewHolder(
                ItemDetailRateBinding.inflate(inflater, parent, false)
            )
        }
    }
}