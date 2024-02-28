package com.jslee.presentation.feature.detail.model.mapper

import com.jslee.domain.model.movie.Movie
import com.jslee.presentation.feature.detail.model.item.DetailListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2024/02/28
 */


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

private fun MutableList<DetailListItem>.addRateInfoContents(movie: Movie) {
    add(
        DetailListItem.Rate(
            id = 2,
            rateData = movie.toRateUiModel()
        )
    )
    add(
        DetailListItem.Divider(
            id = 3,
        )
    )
}

private fun MutableList<DetailListItem>.addCastInfoContents(
    movie: Movie,
) {
    add(
        DetailListItem.Cast(
            id = 4,
            castInfoData = movie.mapToCastInfoUiModel()
        )
    )
    add(
        DetailListItem.Divider(
            id = 5,
        )
    )
}

private fun MutableList<DetailListItem>.addGalleryContents(movie: Movie) {
    add(
        DetailListItem.Gallery(
            id = 6,
            galleryData = movie.mapToGalleryUiModel()
        )
    )
    add(
        DetailListItem.Divider(
            id = 7,
        )
    )
}

private fun MutableList<DetailListItem>.addTrailerContents(title: String, movie: Movie) {
    add(
        DetailListItem.MovieTrailer(
            id = 8,
            title = title,
            trailerData = movie.mapToMovieTrailerUiModel()
        )
    )
}
