package com.jslee.presentation.feature.boxoffice

import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
@FragmentScoped
class FakeBoxOfficeData @Inject constructor() {
    fun provideData(): List<BoxOfficeUiModel> {
        return List(10) {
            BoxOfficeUiModel(
                rank = "1",
                movieTitle = "존 윅3 (John Wick 3)",
                openingDate = "2022년 10월 3일",
                audienceAmount = "4,000명",
                averageAudienceGrowth = "(-14.5%)"
            )
        }
    }
}