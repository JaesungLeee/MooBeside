package com.jslee.presentation.common.extension

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/13
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


fun Long.toDisplayedDateWithDay(): String {
    val formatter = SimpleDateFormat("yyyy년 M월 d일 E요일", Locale.KOREA)
    return formatter.format(Date(this))
}

fun Long.toDisplayedPreviousDateWithDay(): String {
    val formatter = SimpleDateFormat("yyyy년 M월 d일 E요일", Locale.KOREA)
    return formatter.format(Date(this.toMillisOfPreviousDay()))
}