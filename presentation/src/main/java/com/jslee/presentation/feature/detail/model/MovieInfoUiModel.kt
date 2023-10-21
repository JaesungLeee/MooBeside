package com.jslee.presentation.feature.detail.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/17
 */
data class MovieInfoUiModel(
    val tagLine: String,
    val overview: String,
    val movieInfoData: List<MovieInfoItem>,
    val isOverviewExpanded: Boolean = false,
)

data class MovieInfoItem(
    val title: String,
    val content: String,
)