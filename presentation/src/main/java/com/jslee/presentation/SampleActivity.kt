package com.jslee.presentation

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.compose.dropUnlessResumed
import androidx.lifecycle.viewModelScope
import com.jslee.core.designsystem.component.button.solid.SolidButton
import com.jslee.core.designsystem.theme.MooBesideAppTheme
import com.moobeside.core.common.android.architecture.MviContainer
import com.moobeside.core.common.android.architecture.contract.Intent
import com.moobeside.core.common.android.architecture.contract.SideEffect
import com.moobeside.core.common.android.architecture.contract.UiState
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.isNavigationBarContrastEnforced = false
        }
        super.onCreate(savedInstanceState)
        setContent {
            MooBesideAppTheme {
                SampleRoute()
            }
        }
    }
}

@Composable
fun SampleRoute(
    modifier: Modifier = Modifier,
    viewModel: SampleViewModel = hiltViewModel()
) {
    val uiState: SampleUiState by viewModel.uiState.collectAsStateWithLifecycle()

    val context = LocalContext.current
    LaunchedEffect(key1 = Unit) {
        viewModel.sideEffect.collectLatest { sideEffect ->
            when (sideEffect) {
                is SampleSideEffect.ShowToast -> {
                    Toast.makeText(context, "INCREASE", Toast.LENGTH_LONG).show()
                }

                else -> {}
            }
        }
    }

    SampleScreen(
        uiState = uiState,
        modifier = modifier,
        onClick = viewModel::clickIncreaseButton,
    )
}

@Composable
fun SampleScreen(
    uiState: SampleUiState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
    ) {
        Text(text = uiState.count.toString())
        SolidButton(
            label = "Click",
            onClick = dropUnlessResumed { onClick() }
        )
    }
}

@HiltViewModel
class SampleViewModel @Inject constructor() : ViewModel() {
    private val container: MviContainer<SampleIntent, SampleSideEffect, SampleUiState> =
        MviContainer(
            initialState = SampleUiState.INITIAL_STATE,
            onIntent = { handleIntent(it) },
        )

    private val mviContext = container.mviContext

    val uiState: StateFlow<SampleUiState> = container.uiState
    val sideEffect: Flow<SampleSideEffect> = container.sideEffect

    private fun intent(intent: SampleIntent) {
        container.handleIntent(intent)
    }

    private fun handleIntent(intent: SampleIntent) {
        when (intent) {
            is SampleIntent.ClickButton -> {
                mviContext.reduce { copy(count = this.count + 1) }
                showToast()
            }
        }
    }

    private fun showToast() {
        viewModelScope.launch {
            mviContext.postSideEffect(SampleSideEffect.ShowToast)
        }
    }

    fun clickIncreaseButton() {
        intent(SampleIntent.ClickButton)
    }
}

sealed interface SampleIntent : Intent {
    data object ClickButton : SampleIntent
}

sealed interface SampleSideEffect : SideEffect {
    data object ShowToast : SampleSideEffect
}

@Stable
data class SampleUiState(
    val isLoading: Boolean,
    val count: Int
) : UiState {
    companion object {
        val INITIAL_STATE = SampleUiState(
            isLoading = false,
            count = 0,
        )
    }
}
