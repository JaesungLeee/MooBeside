package com.moobeside.feature.showing.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.moobeside.feature.showing.vm.ShowingUiState
import com.moobeside.feature.showing.vm.ShowingViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
internal fun ShowingRoute(
    modifier: Modifier = Modifier,
    viewModel: ShowingViewModel = hiltViewModel(),
) {
    val uiState: ShowingUiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(key1 = Unit) {
        viewModel.sideEffect.collectLatest { sideEffect ->
            when (sideEffect) {
                else -> {}
            }
        }
    }

    ShowingScreen(
        uiState = uiState,
        modifier = modifier,
    )
}
