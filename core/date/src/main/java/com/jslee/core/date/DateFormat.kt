package com.jslee.core.date

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/14
 */

enum class DateFormat(val pattern: String) {
    YEAR_MONTH_DAY_HYPHEN("yyyy-MM-dd"),
    YEAR_MONTH_DAY_SEC("yyyy-MM-dd'T'HH:mm:ss'Z'"),
    YEAR_MONTH_DAY_MILLIS("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"),
    DISP_YEAR("yyyy년"),
    DISP_YEAR_MONTH_DAY("yyyy년 MM월 dd일");

    companion object {
        fun getFormat(dateFormat: DateFormat): String {
            return when(dateFormat) {
                YEAR_MONTH_DAY_HYPHEN -> YEAR_MONTH_DAY_HYPHEN.pattern
                YEAR_MONTH_DAY_SEC -> YEAR_MONTH_DAY_SEC.pattern
                YEAR_MONTH_DAY_MILLIS -> YEAR_MONTH_DAY_MILLIS.pattern
                DISP_YEAR -> DISP_YEAR.pattern
                DISP_YEAR_MONTH_DAY -> DISP_YEAR_MONTH_DAY.pattern
            }
        }
    }
}