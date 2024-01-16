package com.jslee.presentation.feature.bookmark

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.model.BookmarkFilter
import com.jslee.domain.usecase.bookmark.GetBookmarkUseCase
import com.jslee.presentation.feature.bookmark.model.BookmarkUiModel
import com.jslee.presentation.feature.bookmark.model.item.BookmarkListItem
import com.jslee.presentation.feature.bookmark.model.item.FilterOptionsListItem
import com.jslee.presentation.feature.bookmark.model.toBookmarkUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/20
 */
@HiltViewModel
class BookmarkViewModel @Inject constructor(
    private val getBookmarkUseCase: GetBookmarkUseCase,
) : ViewModel() {

    private val _errorFlow: MutableSharedFlow<Throwable> = MutableSharedFlow()
    val errorFlow = _errorFlow.asSharedFlow()

    val bookmarks: StateFlow<List<BookmarkListItem>>

    private val filterOption: MutableStateFlow<BookmarkFilter> =
        MutableStateFlow(BookmarkFilter.LATEST_RELEASE)

    init {
        bookmarks = filterOption.flatMapLatest { filter ->
            getBookmarks(filter)
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.Eagerly,
            initialValue = emptyList()
        )
    }

    private fun getBookmarks(filter: BookmarkFilter): Flow<List<BookmarkListItem>> {
        return getBookmarkUseCase.byOrder(filter).catch {
            _errorFlow.emit(it)
        }.map { bookmarkMovies ->
            val bookmarks = bookmarkMovies.map { it.toBookmarkUiModel() }
            mapToBookmarkListItems(bookmarks)
        }
    }

    private fun mapToBookmarkListItems(bookmarks: List<BookmarkUiModel>): List<BookmarkListItem> {
        val bookmarkListItems = mutableListOf<BookmarkListItem>()
        bookmarkListItems.apply {
            add(
                BookmarkListItem.TotalCount(
                    id = 0,
                    count = "총 ${bookmarks.size}개"
                )
            )
            if (bookmarks.isEmpty()) {
                add(
                    BookmarkListItem.EmptyBookmark(
                        id = 1
                    )
                )
            }
            add(
                BookmarkListItem.Bookmark(
                    id = 2,
                    bookmarkData = bookmarks
                )
            )
        }
        return bookmarkListItems
    }

    fun setBookmarkFilter(filter: BookmarkFilter) {
        filterOption.update { filter }
    }

    fun getFilterOptions(): List<FilterOptionsListItem> = listOf(
        FilterOptionsListItem.TextOption(
            id = BookmarkFilter.LATEST_RELEASE.ordinal.toLong(),
            filter = BookmarkFilter.LATEST_RELEASE,
        ),
        FilterOptionsListItem.TextOption(
            id = BookmarkFilter.LATEST_BOOKMARK.ordinal.toLong(),
            filter = BookmarkFilter.LATEST_BOOKMARK,
        ),
        FilterOptionsListItem.TextOption(
            id = BookmarkFilter.SHORTEST_RUNTIME.ordinal.toLong(),
            filter = BookmarkFilter.SHORTEST_RUNTIME,
        ),
    )
}