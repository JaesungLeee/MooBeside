package com.jslee.core.date

import java.text.SimpleDateFormat
import java.util.Locale

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/14
 */

fun String?.transformDate(from: DateFormat, to: DateFormat): String {
    if (this.isNullOrBlank()) return "알수없음"

    val inputFormat = SimpleDateFormat(DateFormat.getFormat(from), Locale.getDefault())
    val outputFormat = SimpleDateFormat(DateFormat.getFormat(to), Locale.getDefault())

    val date = runCatching {
        inputFormat.parse(this)
    }.getOrNull() ?: return "알수없음"

    return outputFormat.format(date)
}