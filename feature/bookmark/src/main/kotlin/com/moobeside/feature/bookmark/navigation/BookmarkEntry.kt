package com.moobeside.feature.bookmark.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.moobeside.feature.bookmark.screen.BookmarkRoute

fun EntryProviderScope<NavKey>.bookmarkEntry() {
    entry<BookMark> {
        BookmarkRoute()
    }
}
