package com.jslee.presentation.feature.boxoffice

import com.jslee.core.date.DateFormat
import com.jslee.core.date.transformDate
import com.jslee.core.ui.extension.toDecimalFormat
import com.jslee.core.ui.extension.toPercentage
import com.jslee.domain.model.movie.Movie

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
    openingDate = localizedReleaseDate?.transformDate(
        DateFormat.YEAR_MONTH_DAY_HYPHEN,
        DateFormat.DISP_YEAR_MONTH_DAY
    ).orEmpty(),
    audienceAmount = boxOffice?.dailyAudienceCount?.toDecimalFormat().orEmpty(),
    averageAudienceGrowth = boxOffice?.dailyAudienceIncrementRatio?.toPercentage().orEmpty(),
    isNewEntry = boxOffice?.rankEntryStatus == "NEW",
    rankIncrement = boxOffice?.rankIncrement.orEmpty()
)

