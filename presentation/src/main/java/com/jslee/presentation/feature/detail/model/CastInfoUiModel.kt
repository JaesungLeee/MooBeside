package com.jslee.presentation.feature.detail.model

import com.jslee.domain.model.movie.Movie

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/28
 */
data class CastInfoUiModel(
    val profileImageUrl: String?,
    val name: String,
    val role: String,
)

fun Movie.mapToCastInfoUiModel(): List<CastInfoUiModel> {
    val castList = mutableListOf<CastInfoUiModel>()
    castList.add(
        staffs?.first()?.run {
            CastInfoUiModel(
                profileImageUrl = profileImageUrl,
                name = originalName,
                role = job
            )
        } ?: return emptyList()
    )
    casts?.forEach { cast ->
        castList.add(
            CastInfoUiModel(
                profileImageUrl = cast.profileImageUrl,
                name = cast.originalName,
                role = cast.character
            )
        )
    }
    return castList
}
