package com.jslee.core.ui.extension

import java.text.DecimalFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/13
 */
val emptyString: String
    get() = ""

fun String.toDisplayedDate(): String {
    val splitDate = this.split("-")
    return "${splitDate[0]}년 ${splitDate[1]}월 ${splitDate[2]}일"
}

fun String.toDecimalFormat(): String {
    val decimalFormat = DecimalFormat("#,###명")
    return decimalFormat.format(this.toInt())
}

fun String.toPercentage() = "($this%)"

fun String.toDisplayedDateWithFullFormat(): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.KOREA)
    val outputFormat = SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA)

    val date = inputFormat.parse(this) ?: throw Exception()
    return outputFormat.format(date)
}
fun String.toDisplayYear(): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.KOREA)
    val outputFormat = SimpleDateFormat("yyyy년", Locale.KOREA)

    val date = inputFormat.parse(this) ?: throw Exception()
    return outputFormat.format(date)
}

fun makeSummaryInfo(releaseDate: String?, movieStatus: String, genres: List<String>?): String {
    val genre = genres?.joinToString("/")
    val year = releaseDate?.toDisplayYear()
    return "$year · $movieStatus · $genre"
}