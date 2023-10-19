package com.jslee.core.ui.extension

import java.text.DecimalFormat

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