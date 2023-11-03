package com.jslee.presentation.feature.boxoffice

import com.jslee.domain.model.movie.Movie
import com.jslee.core.ui.extension.toDecimalFormat
import com.jslee.core.ui.extension.toDisplayedDate
import com.jslee.core.ui.extension.toPercentage

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
data class BoxOfficeUiModel(
    val movieId: Long,
    val rank: String,
    val rankIncrement: String,
    val movieTitle: String,
    val openingDate: String,
    val audienceAmount: String,
    val averageAudienceGrowth: String,
    val isNewEntry: Boolean,
)

fun Movie.toPresentation() = BoxOfficeUiModel(
    movieId = tmdbMovieId ?: -1,
    rank = boxOffice?.rank.orEmpty(),
    movieTitle = localizedMovieName.orEmpty(),
    openingDate = localizedReleaseDate?.toDisplayedDate().orEmpty(),
    audienceAmount = boxOffice?.dailyAudienceCount?.toDecimalFormat().orEmpty(),
    averageAudienceGrowth = boxOffice?.dailyAudienceIncrementRatio?.toPercentage().orEmpty(),
    isNewEntry = boxOffice?.rankEntryStatus == "NEW",
    rankIncrement = boxOffice?.rankIncrement.orEmpty()
)

