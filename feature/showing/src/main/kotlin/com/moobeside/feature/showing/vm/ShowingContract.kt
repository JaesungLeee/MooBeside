package com.moobeside.feature.showing.vm

import androidx.compose.runtime.Stable
import com.moobeside.core.common.android.architecture.contract.Intent
import com.moobeside.core.common.android.architecture.contract.SideEffect
import com.moobeside.core.common.android.architecture.contract.UiState

sealed interface ShowingIntent : Intent

sealed interface ShowingSideEffect : SideEffect

@Stable
data class ShowingUiState(
    val isLoading: Boolean,
) : UiState {
    companion object {
        val INITIAL_STATE = ShowingUiState(
            isLoading = false,
        )
    }
}