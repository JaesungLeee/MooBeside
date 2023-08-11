package com.jslee.core.date

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
fun Long.toMillisOfPreviousDay(): Long {
    val calendar = Calendar.getInstance().apply {
        timeInMillis = this@toMillisOfPreviousDay
        add(Calendar.DAY_OF_YEAR, -1)
    }
    return calendar.timeInMillis
}

fun Long.toShortenPreviousDate(): String {
    val formatter = SimpleDateFormat("yyyyMMdd", Locale.KOREA)
    return formatter.format(Date(this.toMillisOfPreviousDay()))
}

fun Long.toDisplayedDate(): String {
    val formatter = SimpleDateFormat("yyyy년 M월 d일", Locale.KOREA)
    return formatter.format(Date(this))
}

fun String.toDisplayedDate(): String {
    val splitDate = this.split("-")
    return "${splitDate[0]}년 ${splitDate[1]}월 ${splitDate[2]}일"
}

fun Long.toDisplayedDateWithDay(): String {
    val formatter = SimpleDateFormat("yyyy년 M월 d일 E요일", Locale.KOREA)
    return formatter.format(Date(this))
}

fun Long.toDisplayedPreviousDateWithDay(): String {
    val formatter = SimpleDateFormat("yyyy년 M월 d일 E요일", Locale.KOREA)
    return formatter.format(Date(this.toMillisOfPreviousDay()))
}