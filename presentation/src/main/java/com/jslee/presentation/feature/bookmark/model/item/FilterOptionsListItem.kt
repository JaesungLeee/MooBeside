package com.jslee.presentation.feature.bookmark.model.item

import com.jslee.core.ui.model.ListItem

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/10
 */
sealed class FilterOptionsListItem(override val viewType: Enum<*>) : ListItem {
    enum class FilterOptionsViewType {
        TEXT_OPTION;
    }

    data class TextOption(
        override val id: Long,
        val description: String,
    ) : FilterOptionsListItem(FilterOptionsViewType.TEXT_OPTION)

//    data class Genre(
//        override val id: Long,
//    ) : FilterOptionsListItem(FilterOptionsViewType.CHIP_OPTION)
//
//    data class MovieStatus(
//        override val id: Long,
//    ) : FilterOptionsListItem(FilterOptionsViewType.CHIP_OPTION)
}