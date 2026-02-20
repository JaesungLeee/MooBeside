package com.moobeside.feature.showing.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.moobeside.feature.showing.vm.ShowingUiState

@Composable
internal fun ShowingScreen(
    uiState: ShowingUiState,
    modifier: Modifier = Modifier,
) {
    Text(
        text = "Showing Screen"
    )
}