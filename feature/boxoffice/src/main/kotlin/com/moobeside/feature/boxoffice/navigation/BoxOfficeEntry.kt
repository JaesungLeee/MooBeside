package com.moobeside.feature.boxoffice.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.moobeside.feature.boxoffice.screen.BoxOfficeRoute

fun EntryProviderScope<NavKey>.boxOfficeEntry() {
    entry<BoxOffice> {
        BoxOfficeRoute()
    }
}
