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
fun Long.getMillisOfPreviousDay(): Long {
    val calendar = Calendar.getInstance().apply {
        timeInMillis = this@getMillisOfPreviousDay
        add(Calendar.DAY_OF_YEAR, -1)
    }
    return calendar.timeInMillis
}

fun Long.getDisplayedDate(): String {
    val formatter = SimpleDateFormat("yyyy년 M월 d일", Locale.KOREA)
    return formatter.format(Date(this))
}

fun Long.getDisplayedDateWithDay(): String {
    val formatter = SimpleDateFormat("yyyy년 M월 d일 E요일", Locale.KOREA)
    return formatter.format(Date(this))
}