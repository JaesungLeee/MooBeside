package com.jslee.core.date

import java.text.SimpleDateFormat
import java.util.Locale

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/14
 */

fun String?.toDisplayDate(from: DateFormat, to: DateFormat): String {
    if (this.isNullOrBlank()) return "알수없음"

    val inputFormat = SimpleDateFormat(DateFormat.getFormat(from), Locale.getDefault())
    val outputFormat = SimpleDateFormat(DateFormat.getFormat(to), Locale.getDefault())

    val date = inputFormat.parse(this) ?: throw Exception()
    return outputFormat.format(date)
}