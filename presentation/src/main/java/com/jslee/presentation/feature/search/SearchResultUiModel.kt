package com.jslee.presentation.feature.search

import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/15
 */
data class SearchResultUiModel(
    val posterImageUrl: String
)

fun Movie.toPresentation() = SearchResultUiModel(
    posterImageUrl = posterImageUrl.orEmpty()
)
