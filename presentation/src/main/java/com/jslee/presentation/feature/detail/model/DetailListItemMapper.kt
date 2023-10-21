package com.jslee.presentation.feature.detail.model

import com.jslee.core.ui.extension.toDisplayTime
import com.jslee.core.ui.extension.toDisplayYear
import com.jslee.domain.model.movie.Certification
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.model.movie.MovieStatus
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/17
 */

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
            content = staffs?.first()?.originalName.orEmpty()
        ),
        MovieInfoItem(
            title = "상영 시간",
            content = runtime?.toDisplayTime().orEmpty()
        ),
        MovieInfoItem(
            title = "연령 등급",
            content = Certification.getMeaning(certification)
        ),
        MovieInfoItem(
            title = "장르",
            content = genres?.joinToString().orEmpty()
        ),
        MovieInfoItem(
            title = "제작 회사",
            content = productionCompanies?.joinToString { it.companyName }.orEmpty()
        ),
        MovieInfoItem(
            title = "제작 연도",
            content = localizedReleaseDate?.toDisplayYear().orEmpty()
        )
    )
}

fun Movie.toListItem(): List<DetailListItem> = listOf(
    DetailListItem.MovieInfo(
        id = 0,
        movieInfoData = toMovieInfoUiModel()
    ),
)