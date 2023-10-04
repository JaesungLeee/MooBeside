package com.jslee.data.model

import com.jslee.domain.model.movie.Certification
import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/02
 */
internal data class MovieReleaseInfoModel(
    val regionCode: String,
    val certification: String,
    val localizedReleaseDate: String,
)

internal fun MovieReleaseInfoModel.toDomain() = Movie(
    certification = Certification.fromCode(certification),
    localizedReleaseDate = localizedReleaseDate
)
