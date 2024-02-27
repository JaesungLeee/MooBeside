package com.jslee.presentation.feature.detail.model

import android.os.Parcelable
import com.jslee.core.date.DateFormat
import com.jslee.core.date.transformDate
import com.jslee.core.ui.extension.emptyString
import com.jslee.core.ui.extension.getSummaryInfo
import com.jslee.presentation.feature.detail.model.item.DetailListItem
import kotlinx.parcelize.Parcelize

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
) {
    private val displayYear =
        releaseDate.transformDate(DateFormat.YEAR_MONTH_DAY_MILLIS, DateFormat.DISP_YEAR)
    val movieSummary = getSummaryInfo(displayYear, movieStatus, genres)
}

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

@Parcelize
data class CastInfoUiModel(
    val personId: Long,
    val profileImageUrl: String?,
    val name: String,
    val role: String,
) : Parcelable

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
) {
    val isEmptyDescription = description == emptyString
}

data class RateUiModel(
    val tmdbRate: String,
    val naverRate: String,
)
