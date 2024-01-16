package com.jslee.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jslee.data.TMDB_IMAGE_PREFIX
import com.jslee.data.database.MOOBESIDE_BOOKMARK_DATABASE
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.model.movie.MovieStatus

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
@Entity(tableName = MOOBESIDE_BOOKMARK_DATABASE)
internal data class BookmarkEntity(
    @PrimaryKey @ColumnInfo("movie_id") val movieId: Long? = 0,
    @ColumnInfo("movie_name") val movieName: String? = "",
    @ColumnInfo("poster_url") val posterImageUrl: String? = "",
    @ColumnInfo("runtime") val runtime: Int? = 0,
    @ColumnInfo("released_date") val releasedDate: String? = "",
    @ColumnInfo("genres") val genres: List<String>? = emptyList(),
    @ColumnInfo("status") val releaseStatus: String? = "",
    @ColumnInfo("bookmarked_at") val bookmarkedAt: Long,
)

internal fun BookmarkEntity.toDomain() = Movie(
    tmdbMovieId = movieId,
    localizedMovieName = movieName,
    posterImageUrl = TMDB_IMAGE_PREFIX + posterImageUrl,
    runtime = runtime,
    localizedReleaseDate = releasedDate,
    genres = genres,
    movieStatus = MovieStatus.fromDescription(releaseStatus.orEmpty()),
)

internal fun Movie.toBookmarkEntity(bookmarkedAt: Long) = BookmarkEntity(
    movieId = tmdbMovieId ?: -1,
    movieName = localizedMovieName.orEmpty(),
    posterImageUrl = posterImageUrl,
    runtime = runtime,
    releasedDate = localizedReleaseDate,
    genres = genres,
    releaseStatus = MovieStatus.getDescription(movieStatus),
    bookmarkedAt = bookmarkedAt
)
