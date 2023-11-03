package com.jslee.presentation.feature.bookmark.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
data class BookmarkUiModel(
    val movieId: Long,
    val movieName: String,
    val posterImageUrl: String?,
    val summaryInfo: String,
)