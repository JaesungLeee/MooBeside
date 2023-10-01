package com.jslee.core.designsystem

import androidx.annotation.DrawableRes

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/01
 */
enum class RateDesign(
    @DrawableRes val textColor: Int,
    @DrawableRes val backgroundColor: Int,
) {
    TMDB(
        textColor = R.color.Tmdb_Green,
        backgroundColor = R.color.Tmdb_Blue,
    ),
    NAVER(
        textColor = R.color.White,
        backgroundColor = R.color.Naver_Green,
    );
}