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
    castList.addDirector(this)
    castList.addActors(this)

    return castList
}

private fun MutableList<CastInfoUiModel>.addDirector(movie: Movie) {
    add(
        movie.staffs?.find { it.isDirector }?.run {
            CastInfoUiModel(
                profileImageUrl = profileImageUrl,
                name = originalName,
                role = job
            )
        } ?: return
    )
}

private fun MutableList<CastInfoUiModel>.addActors(movie: Movie) {
    movie.casts?.forEach { cast ->
        add(
            CastInfoUiModel(
                profileImageUrl = cast.profileImageUrl,
                name = cast.originalName,
                role = cast.character
            )
        )
    }
}
