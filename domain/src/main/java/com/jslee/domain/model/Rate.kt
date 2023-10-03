package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/04
 */
data class Rate(
    val tmdbRate: TmdbRate,
)

data class TmdbRate(
    val averageVoteRate: Double,
    val voteCount: Int,
)
