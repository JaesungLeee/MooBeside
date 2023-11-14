package com.jslee.presentation.feature.detail.model

import com.jslee.domain.model.movie.Movie
import com.jslee.domain.model.movie.MovieStatus
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
    val releaseDate: String,
    val movieStatus: String,
    val genres: List<String>,
    val runtime: Int,
    val certification: String,
)

fun Movie.toMovieDetailUiModel(trailerTitle: String) = MovieDetailUiModel(
    appBarModel = toAppBarModel(),
    detailData = toListItem(trailerTitle)
)

fun Movie.toAppBarModel() = AppBarUiModel(
    movieName = localizedMovieName.orEmpty(),
    posterImageUrl = posterImageUrl,
    backdropImageUrl = backdropImageUrl,
    releaseDate = localizedReleaseDate.orEmpty(),
    movieStatus = MovieStatus.getDescription(movieStatus),
    genres = genres.orEmpty(),
    runtime = runtime ?: 0,
    certification = Certification.getMeaning(certification)
)

const val SCREEN_SHOWN_LIMIT = 4
fun Movie.toListItem(title: String) = listOf(
    DetailListItem.MovieInfo(
        id = 0,
        movieInfoData = toMovieInfoUiModel()
    ),
    DetailListItem.Divider(
        id = 1,
    ),
    DetailListItem.Rate(
        id = 2,
        rateData = toRateUiModel()
    ),
    DetailListItem.Divider(
        id = 3,
    ),
    DetailListItem.Cast(
        id = 4,
        castInfoData = mapToCastInfoUiModel().take(SCREEN_SHOWN_LIMIT)
    ),
    DetailListItem.Divider(
        id = 5,
    ),
    DetailListItem.Gallery(
        id = 6,
        galleryData = mapToGalleryUiModel()
    ),
    DetailListItem.Divider(
        id = 7,
    ),
    DetailListItem.MovieTrailer(
        id = 8,
        title = title,
        trailerData = mapToMovieTrailerUiModel()
    ),
    DetailListItem.Divider(
        id = 9,
    ),
)

