package com.jslee.domain.repository

import com.jslee.domain.model.Trailer
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
interface TrailerRepository {
    fun getMovieTrailers(query: String): Flow<List<Trailer>>
}