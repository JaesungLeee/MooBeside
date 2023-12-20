package com.jslee.presentation.feature.bookmark

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.model.movie.Movie
import com.jslee.domain.usecase.bookmark.GetBookmarkUseCase
import com.jslee.presentation.feature.bookmark.model.item.BookmarkListItem
import com.jslee.presentation.feature.bookmark.model.toBookmarkUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/20
 */
@HiltViewModel
class BookmarkViewModel @Inject constructor(
    getBookmarkUseCase: GetBookmarkUseCase,
) : ViewModel() {

    private val _errorFlow: MutableSharedFlow<Throwable> = MutableSharedFlow()
    val errorFlow = _errorFlow.asSharedFlow()

    val bookmarks = getBookmarkUseCase().map { bookmarkMovies ->
        mapToBookmarkListItem(bookmarkMovies)
    }.catch {
        _errorFlow.emit(it)
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.Eagerly,
        initialValue = emptyList()
    )

    private fun mapToBookmarkListItem(fetchedBookmarks: List<Movie>): List<BookmarkListItem> {
        val bookmarks = fetchedBookmarks.map { it.toBookmarkUiModel() }
        val bookmarkScreenItems = mutableListOf<BookmarkListItem>()
        bookmarkScreenItems.apply {
            add(
                BookmarkListItem.TotalCount(
                    id = 0,
                    count = "총 ${bookmarks.size}개"
                )
            )
            add(
                BookmarkListItem.Bookmark(
                    id = 1,
                    bookmarkData = bookmarks
                )
            )
        }
        return bookmarkScreenItems
    }
}