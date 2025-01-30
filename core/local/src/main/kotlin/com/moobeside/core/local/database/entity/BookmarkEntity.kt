package com.moobeside.core.local.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moobeside.core.common.kotlin.TMDB_IMAGE_PREFIX
import com.moobeside.core.model.movie.Movie
import com.moobeside.core.model.movie.MovieStatus

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */

internal const val MOOBESIDE_BOOKMARK_DATABASE = "moobeside_bookmark.db"

@Entity(tableName = MOOBESIDE_BOOKMARK_DATABASE)
data class BookmarkEntity(
    @PrimaryKey @ColumnInfo("movie_id") val movieId: Long? = 0,
    @ColumnInfo("movie_name") val movieName: String? = "",
    @ColumnInfo("poster_url") val posterImageUrl: String? = "",
    @ColumnInfo("runtime") val runtime: Int? = 0,
    @ColumnInfo("released_date") val releasedDate: String? = "",
    @ColumnInfo("genres") val genres: List<String>? = emptyList(),
    @ColumnInfo("status") val releaseStatus: String? = "",
    @ColumnInfo("bookmarked_at") val bookmarkedAt: Long,
)

fun BookmarkEntity.toDomain() = Movie(
    tmdbMovieId = movieId,
    localizedMovieName = movieName,
    posterImageUrl = posterImageUrl?.let { TMDB_IMAGE_PREFIX + it },
    runtime = runtime,
    localizedReleaseDate = releasedDate,
    genres = genres,
    movieStatus = MovieStatus.fromDescription(releaseStatus.orEmpty()),
)

fun Movie.toBookmarkEntity(bookmarkedAt: Long) = BookmarkEntity(
    movieId = tmdbMovieId ?: -1,
    movieName = localizedMovieName.orEmpty(),
    posterImageUrl = posterImageUrl,
    runtime = runtime,
    releasedDate = localizedReleaseDate,
    genres = genres,
    releaseStatus = MovieStatus.getDescription(movieStatus),
    bookmarkedAt = bookmarkedAt
)
