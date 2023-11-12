package com.jslee.presentation.feature.bookmark.model

import com.jslee.presentation.feature.bookmark.model.item.FilterOptionsListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/12
 */

fun provideFilterOptions(): List<FilterOptionsListItem> = listOf(
    FilterOptionsListItem.TextOption(
        id = 0,
        description = "최신 영화 순"
    ),
    FilterOptionsListItem.TextOption(
        id = 1,
        description = "최근에 담은 순"
    ),
    FilterOptionsListItem.TextOption(
        id = 2,
        description = "상영 시간 짧은 순"
    ),
)