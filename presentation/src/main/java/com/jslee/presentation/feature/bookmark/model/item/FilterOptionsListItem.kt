package com.jslee.presentation.feature.bookmark.model.item

import com.moobeside.core.common.ui.recyclerview.model.ListItem
import com.moobeside.core.model.BookmarkFilter

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