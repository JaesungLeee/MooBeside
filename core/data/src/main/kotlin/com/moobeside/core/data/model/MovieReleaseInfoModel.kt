package com.moobeside.core.data.model

import com.moobeside.core.common.kotlin.UNKNOWN_FIELD
import com.moobeside.core.model.movie.Certification
import com.moobeside.core.model.movie.Movie
import com.moobeside.core.remote.network.dto.response.tmdb.TmdbReleaseInfoResponse

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

internal fun TmdbReleaseInfoResponse.toDataModel() = MovieReleaseInfoModel(
    regionCode = regionCode,
    certification = releaseInfo.map { it.certification }.firstOrNull() ?: UNKNOWN_FIELD,
    localizedReleaseDate = releaseInfo.map { it.localizedReleaseDate }.firstOrNull()
        ?: UNKNOWN_FIELD
)