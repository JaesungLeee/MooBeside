package com.moobeside.core.common.kotlin.extension

import java.text.DecimalFormat

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/13
 */
val emptyString: String
    get() = ""

fun String.toDecimalFormat(): String {
    val decimalFormat = DecimalFormat("#,###명")
    return decimalFormat.format(this.toInt())
}

fun String.toPercentage() = "($this%)"

fun getMovieSummaryInfo(releaseYear: String, movieStatus: String, genres: List<String>): String {
    val genre = genres.joinToString("/")
    return "$releaseYear · $movieStatus · $genre"
}

fun getRateInfo(rate: Double?, voteCount: Int): String {
    val roundedRate = roundVoteRate(rate)
    return "$roundedRate / ${voteCount}개의 리뷰"
}

fun roundVoteRate(voteRate: Double?): String {
    val roundedRate = "%.1f".format(voteRate)
    return "${roundedRate}점"
}