package com.jslee.presentation.feature.detail.model

import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/21
 */
data class MovieDetailUiModel(
    val movieId: Long,
    val appBarModel: AppBarUiModel,
    val detailData: List<DetailListItem>,
)

data class AppBarUiModel(
    val movieName: String,
    val posterImageUrl: String?,
    val backdropImageUrl: String?,
    val releaseDate: String,
    val movieStatus: String,
    val genres: List<String>,
    val runtime: Int,
    val certification: String,
)

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

data class CastInfoUiModel(
    val profileImageUrl: String?,
    val name: String,
    val role: String,
)

data class GalleryUiModel(
    val id: Long,
    val galleryImageUrl: String?,
)

data class MovieTrailerUiModel(
    val videoId: String,
    val thumbnailUrl: String,
    val contentTitle: String,
    val description: String,
    val publishedDate: String,
)

data class RateUiModel(
    val tmdbRate: String,
    val naverRate: String,
)
