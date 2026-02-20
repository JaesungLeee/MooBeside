package com.moobeside.feature.showing.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.moobeside.feature.showing.screen.ShowingRoute

fun EntryProviderScope<NavKey>.showingEntry() {
    entry<Showing> { key ->
//        val viewModel: ShowingViewModel =
//            hiltViewModel<ShowingViewModel, ShowingViewModel.Factory> { factory ->
//                factory.create(key)
//            }

        ShowingRoute()
    }
}