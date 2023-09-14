package com.jslee.core.ui.model

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/14
 */
data class PaddingValues(
    val top: Int,
    val bottom: Int,
    val start: Int,
    val end: Int,
) {
    companion object {
        fun horizontal(start: Int, end: Int) = PaddingValues(0, 0, start, end)
        fun vertical(top: Int, bottom: Int) = PaddingValues(top, bottom, 0, 0)
    }
}
