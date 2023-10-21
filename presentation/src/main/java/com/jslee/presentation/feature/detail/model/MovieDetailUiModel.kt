package com.jslee.presentation.feature.detail.model

import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/21
 */
data class MovieDetailUiModel(
    val appBarModel: AppBarUiModel,
    val detailData: List<DetailListItem>,
)

data class AppBarUiModel(
    val movieName: String,
    val posterImageUrl: String?,
    val backdropImageUrl: String?,
    val summaryInfo: String,
)