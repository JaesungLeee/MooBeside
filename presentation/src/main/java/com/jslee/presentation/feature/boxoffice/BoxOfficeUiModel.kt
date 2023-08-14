package com.jslee.presentation.feature.boxoffice

import com.jslee.domain.model.Movie
import com.jslee.presentation.common.extension.toDecimalFormat
import com.jslee.presentation.common.extension.toDisplayedDate
import com.jslee.presentation.common.extension.toPercentage

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
data class BoxOfficeUiModel(
    val rank: String,
    val rankIncrement: String,
    val movieTitle: String,
    val openingDate: String,
    val audienceAmount: String,
    val averageAudienceGrowth: String,
    val isNewEntry: Boolean,
)

fun Movie.toPresentation() = BoxOfficeUiModel(
    rank = boxOffice?.rank.orEmpty(),
    movieTitle = movieName.orEmpty(),
    openingDate = openDate?.toDisplayedDate().orEmpty(),
    audienceAmount = boxOffice?.dailyAudienceCount?.toDecimalFormat().orEmpty(),
    averageAudienceGrowth = boxOffice?.dailyAudienceIncrementRatio?.toPercentage().orEmpty(),
    isNewEntry = boxOffice?.rankEntryStatus == "NEW",
    rankIncrement = boxOffice?.rankIncrement.orEmpty()
)

