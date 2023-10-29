package com.jslee.core.designsystem

import androidx.annotation.ColorRes

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/01
 */
enum class RateDesign(
    @ColorRes val textColor: Int,
    @ColorRes val backgroundColor: Int,
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