package com.jslee.data.model

import com.jslee.domain.model.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/02
 */
internal data class ReleaseDateMovieModel(
    val regionCode: String,
    val certification: String,
    val releaseDate: String,
)

internal fun ReleaseDateMovieModel.toDomain() = Movie(
    certification = certification,
    releaseDate = releaseDate
)
