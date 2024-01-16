package com.jslee.presentation.feature.bookmark.model.item

import com.jslee.core.ui.model.ListItem
import com.jslee.domain.model.BookmarkFilter

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/10
 */
sealed class FilterOptionsListItem(override val viewType: Enum<*>) : ListItem {
    enum class FilterOptionsViewType {
        //        CHIP_OPTION,
        TEXT_OPTION;
    }

    data class TextOption(
        override val id: Long,
        val filter: BookmarkFilter,
    ) : FilterOptionsListItem(FilterOptionsViewType.TEXT_OPTION)
}