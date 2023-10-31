package com.jslee.presentation.feature.detail.model

import com.jslee.core.ui.extension.toDisplayedDateWithFullFormat
import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
data class MovieTrailerUiModel(
    val videoId: String,
    val thumbnailUrl: String,
    val contentTitle: String,
    val description: String,
    val publishedDate: String,
)

fun Movie.mapToMovieTrailerUiModel(): List<MovieTrailerUiModel> = trailers?.map {
    MovieTrailerUiModel(
        videoId = it.videoId,
        thumbnailUrl = it.thumbnailUrl,
        contentTitle = it.contentTitle,
        description = it.description,
        publishedDate = it.publishedDate.toDisplayedDateWithFullFormat()
    )
}.orEmpty()
