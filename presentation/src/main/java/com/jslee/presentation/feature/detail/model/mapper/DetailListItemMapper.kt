package com.jslee.presentation.feature.detail.model.mapper

import com.moobeside.core.model.movie.Movie
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2024/02/28
 */

fun Movie.toMovieDetailListItem(title: String): List<DetailListItem> {
    val movieDetailContents = mutableListOf<DetailListItem>()

    return movieDetailContents.apply {
        addMovieInfoContents(this@toMovieDetailListItem)
        addCastInfoContents(this@toMovieDetailListItem)
        if (!isEmptyImages) addGalleryContents(this@toMovieDetailListItem)
        addTrailerContents(title, this@toMovieDetailListItem)
    }
}

private fun MutableList<DetailListItem>.addMovieInfoContents(movie: Movie) {
    add(
        DetailListItem.MovieInfo(
            id = 0,
            movieInfoData = movie.toMovieInfoUiModel()
        )
    )
    add(
        DetailListItem.Divider(
            id = 1,
        )
    )
}

private fun MutableList<DetailListItem>.addCastInfoContents(
    movie: Movie,
) {
    add(
        DetailListItem.Cast(
            id = 2,
            castInfoData = movie.mapToCastInfoUiModel()
        )
    )
    add(
        DetailListItem.Divider(
            id = 3,
        )
    )
}

private fun MutableList<DetailListItem>.addGalleryContents(movie: Movie) {
    add(
        DetailListItem.Gallery(
            id = 4,
            galleryData = movie.mapToGalleryUiModel()
        )
    )
    add(
        DetailListItem.Divider(
            id = 5,
        )
    )
}

private fun MutableList<DetailListItem>.addTrailerContents(title: String, movie: Movie) {
    add(
        DetailListItem.MovieTrailer(
            id = 6,
            title = title,
            trailerData = movie.mapToMovieTrailerUiModel()
        )
    )
}
