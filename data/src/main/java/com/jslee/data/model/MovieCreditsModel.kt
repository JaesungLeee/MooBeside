package com.jslee.data.model

import com.jslee.data.TMDB_IMAGE_PREFIX
import com.jslee.domain.model.Cast
import com.jslee.domain.model.Gender
import com.jslee.domain.model.Movie
import com.jslee.domain.model.Staff

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/03
 */
internal data class MovieCreditsModel(
    val casts: List<MovieCastModel>,
    val staffs: List<MovieStaffModel>,
)

internal data class MovieCastModel(
    val personId: Long,
    val genderCode: Int,
    val originalName: String,
    val profilePath: String?,
    val character: String,
)

internal data class MovieStaffModel(
    val personId: Long,
    val genderCode: Int,
    val originalName: String,
    val profilePath: String?,
    val job: String,
)

