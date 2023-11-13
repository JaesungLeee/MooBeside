package com.jslee.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jslee.data.database.MOOBESIDE_BOOKMARK_DATABASE
import com.jslee.domain.model.movie.MovieStatus

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
@Entity(tableName = MOOBESIDE_BOOKMARK_DATABASE)
internal data class BookmarkEntity(
    @PrimaryKey @ColumnInfo("movie_id") val movieId: Long,
    @ColumnInfo("movie_name") val localizedMovieName: String,
    @ColumnInfo("poster_url") val posterImageUrl: String,
    @ColumnInfo("runtime") val runtime: Int,
    @ColumnInfo("released_year") val movieReleasedYear: String,
    @ColumnInfo("genres") val genres: List<String>,
    @ColumnInfo("status") val movieReleaseStatus: String,
    @ColumnInfo("bookmarked_at") val bookmarkedAt: Long,
)
