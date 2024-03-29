package com.jslee.presentation.feature.bookmark.model.item

import com.jslee.core.ui.model.ListItem
import com.jslee.presentation.feature.bookmark.model.BookmarkUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/03
 */
sealed class BookmarkListItem(override val viewType: BookmarkViewType) : ListItem {
    enum class BookmarkViewType {
        TOTAL_COUNT,
        BOOKMARK,
        EMPTY;
    }

    data class TotalCount(
        override val id: Long,
        val count: String,
    ) : BookmarkListItem(BookmarkViewType.TOTAL_COUNT)

    data class Bookmark(
        override val id: Long,
        val bookmarkData: List<BookmarkUiModel>,
    ) : BookmarkListItem(BookmarkViewType.BOOKMARK)

    data class EmptyBookmark(
        override val id: Long,
    ) : BookmarkListItem(BookmarkViewType.EMPTY)
}
