package com.moobeside.core.data.model

import com.moobeside.core.common.kotlin.TMDB_IMAGE_PREFIX
import com.moobeside.core.model.Gender
import com.moobeside.core.model.movie.Cast
import com.moobeside.core.model.movie.Movie
import com.moobeside.core.model.movie.Staff
import com.moobeside.core.remote.network.dto.response.tmdb.CreditsResponse

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

internal fun MovieCreditsModel.toDomain() = Movie(
    casts = casts.map {
        Cast(
            personId = it.personId,
            gender = Gender.fromCode(it.genderCode),
            originalName = it.originalName,
            profileImageUrl = it.profilePath?.let { path -> TMDB_IMAGE_PREFIX + path },
            character = it.character,
        )
    },
    staffs = staffs.map {
        Staff(
            personId = it.personId,
            gender = Gender.fromCode(it.genderCode),
            originalName = it.originalName,
            profileImageUrl = it.profilePath?.let { path -> TMDB_IMAGE_PREFIX + path },
            job = it.job,
        )
    }
)

internal fun CreditsResponse.toDataModel() = MovieCreditsModel(
    casts = castData.map { castResponse ->
        MovieCastModel(
            personId = castResponse.personId,
            genderCode = castResponse.genderCode,
            originalName = castResponse.originalName,
            profilePath = castResponse.profilePath,
            character = castResponse.character,
        )
    },
    staffs = staffData.map { staffResponse ->
        MovieStaffModel(
            personId = staffResponse.personId,
            genderCode = staffResponse.genderCode,
            originalName = staffResponse.originalName,
            profilePath = staffResponse.profilePath,
            job = staffResponse.job,
        )
    }
)
