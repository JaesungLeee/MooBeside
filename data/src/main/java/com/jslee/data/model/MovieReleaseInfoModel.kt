package com.jslee.data.model

import com.jslee.domain.model.Movie

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
    certification = certification,
    localizedReleaseDate = localizedReleaseDate
)
