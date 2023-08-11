package com.jslee.domain.repository

import com.jslee.domain.model.Movie
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
interface MovieRepository {

    fun getDailyBoxOffice(targetDate: String): Flow<Result<List<Movie>>>
}