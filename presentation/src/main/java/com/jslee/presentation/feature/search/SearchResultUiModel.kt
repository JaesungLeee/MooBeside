package com.jslee.presentation.feature.search

import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/15
 */
data class SearchResultUiModel(
    val movieId: Long,
    val posterImageUrl: String
)

fun Movie.toSearchResultUiModel() = SearchResultUiModel(
    movieId = tmdbMovieId ?: -1,
    posterImageUrl = posterImageUrl.orEmpty()
)
