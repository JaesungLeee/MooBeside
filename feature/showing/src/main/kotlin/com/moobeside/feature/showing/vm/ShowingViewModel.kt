package com.moobeside.feature.showing.vm

import androidx.lifecycle.ViewModel
import com.moobeside.core.common.android.architecture.MviContainer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
//@HiltViewModel(assistedFactory = ShowingViewModel.Factory::class)
class ShowingViewModel @Inject constructor(
//    @Assisted private val navKey: Showing
) : ViewModel() {
    private val container: MviContainer<ShowingIntent, ShowingSideEffect, ShowingUiState> =
        MviContainer(
            initialState = ShowingUiState.INITIAL_STATE,
            onIntent = { handleIntent(it) }
        )

    private val mviContext = container.mviContext

    val uiState: StateFlow<ShowingUiState> = container.uiState
    val sideEffect: Flow<ShowingSideEffect> = container.sideEffect

    private fun intent(intent: ShowingIntent) {
        container.handleIntent(intent)
    }

    private fun handleIntent(intent: ShowingIntent) {
        when (intent) {
            else -> {}
        }
    }

//    @AssistedFactory
//    interface Factory {
//        fun create(navKey: Showing): ShowingViewModel
//    }
}