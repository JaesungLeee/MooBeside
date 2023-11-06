package com.jslee.presentation.feature.detail.model

import com.jslee.core.ui.UNKNOWN_FIELD
import com.jslee.core.ui.extension.toDisplayDateWithMillisFormat
import com.jslee.core.ui.extension.toDisplayRunTime
import com.jslee.domain.model.movie.Certification
import com.jslee.domain.model.movie.Movie

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

fun Movie.toMovieInfoUiModel() = MovieInfoUiModel(
    tagLine = tagline.orEmpty(),
    overview = overview.orEmpty(),
    movieInfoData = mapToMovieInfoItem(),
    isOverviewExpanded = false
)

fun Movie.mapToMovieInfoItem(): List<MovieInfoItem> {
    return listOf(
        MovieInfoItem(
            title = "감독",
            content = staffs?.find { it.isDirector }?.originalName ?: UNKNOWN_FIELD
        ),
        MovieInfoItem(
            title = "국내 개봉일",
            content = localizedReleaseDate?.toDisplayDateWithMillisFormat() ?: UNKNOWN_FIELD
        ),
        MovieInfoItem(
            title = "상영 시간",
            content = runtime?.toDisplayRunTime() ?: UNKNOWN_FIELD
        ),
        MovieInfoItem(
            title = "연령 등급",
            content = Certification.getMeaning(certification)
        ),
        MovieInfoItem(
            title = "장르",
            content = genres?.joinToString() ?: UNKNOWN_FIELD
        ),
        MovieInfoItem(
            title = "제작사",
            content = productionCompanies?.joinToString { it.companyName } ?: UNKNOWN_FIELD
        ),
    )
}
