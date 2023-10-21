package com.jslee.presentation.feature.detail.model

import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/21
 */
data class MovieDetailUiModel(
    val movieName: String,
    val posterImageUrl: String?,
    val summaryInfo: String,
    val detailData: List<DetailListItem>,
)
