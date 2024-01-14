package com.jslee.presentation.feature.detail.model

import com.jslee.core.date.DateFormat
import com.jslee.core.date.toDisplayDate
import com.jslee.core.ui.UNKNOWN_FIELD
import com.jslee.core.ui.extension.toDisplayRunTime
import com.jslee.domain.model.movie.Certification
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.model.movie.MovieStatus
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/14
 */

fun Movie.toMovieDetailUiModel(trailerTitle: String) = MovieDetailUiModel(
    movieId = tmdbMovieId ?: -1,
    appBarModel = toAppBarModel(),
    detailData = toMovieDetailListItem(trailerTitle)
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
fun Movie.toMovieDetailListItem(title: String) = listOf(
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
        castInfoData = mapToCastInfoUiModel()
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
            content = localizedReleaseDate?.toDisplayDate(
                DateFormat.YEAR_MONTH_DAY_MILLIS,
                DateFormat.DISP_YEAR_MONTH_DAY
            ) ?: UNKNOWN_FIELD
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

fun Movie.toRateUiModel() = RateUiModel(
    tmdbRate = roundWithSingleDecimal(rateInfo?.tmdbRate?.averageVoteRate),
    naverRate = "0.0"
)

fun roundWithSingleDecimal(value: Double?): String {
    requireNotNull(value) {
        "Value cannot be null"
    }
    return String.format("%.1f", value)
}

fun Movie.mapToCastInfoUiModel(): List<CastInfoUiModel> {
    val castList = mutableListOf<CastInfoUiModel>()
    castList.addDirector(this)
    castList.addActors(this)

    return castList
}


private fun MutableList<CastInfoUiModel>.addDirector(movie: Movie) {
    add(
        movie.staffs?.find { it.isDirector }?.run {
            CastInfoUiModel(
                personId = personId,
                profileImageUrl = profileImageUrl,
                name = originalName,
                role = job
            )
        } ?: return
    )
}

private fun MutableList<CastInfoUiModel>.addActors(movie: Movie) {
    movie.casts?.forEach { cast ->
        add(
            CastInfoUiModel(
                personId = cast.personId,
                profileImageUrl = cast.profileImageUrl,
                name = cast.originalName,
                role = cast.character
            )
        )
    }
}

fun Movie.mapToGalleryUiModel(): List<GalleryUiModel> {
    return images?.map {
        GalleryUiModel(
            id = System.currentTimeMillis() / 1000,
            galleryImageUrl = it
        )
    }.orEmpty()
}

fun Movie.mapToMovieTrailerUiModel(): List<MovieTrailerUiModel> = trailers?.map {
    MovieTrailerUiModel(
        videoId = it.videoId,
        thumbnailUrl = it.thumbnailUrl,
        contentTitle = it.contentTitle,
        description = it.description,
        publishedDate = it.publishedDate.toDisplayDate(
            DateFormat.YEAR_MONTH_DAY_SEC,
            DateFormat.DISP_YEAR_MONTH_DAY
        )
    )
}.orEmpty()

fun MovieDetailUiModel.toDomain(movieId: Long): Movie {
    return Movie(
        tmdbMovieId = movieId,
        localizedMovieName = appBarModel.movieName,
        runtime = appBarModel.runtime,
        movieStatus = MovieStatus.fromDescription(appBarModel.movieStatus),
        genres = appBarModel.genres,
        localizedReleaseDate = appBarModel.releaseDate,
        posterImageUrl = appBarModel.posterImageUrl,
        certification = Certification.fromCode(appBarModel.certification)
    )
}
