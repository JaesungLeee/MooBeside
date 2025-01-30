package com.moobeside.core.domain.repository

import com.moobeside.core.model.Trailer
import kotlinx.coroutines.flow.Flow

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
interface TrailerRepository {
    fun getMovieTrailers(query: String): Flow<List<Trailer>>
}