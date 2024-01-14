package com.jslee.presentation.feature.castdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.usecase.PersonInformationUseCase
import com.jslee.presentation.feature.castdetail.model.toUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
@HiltViewModel
class CastDetailViewModel @Inject constructor(
    private val personInfoUseCase: PersonInformationUseCase,
) : ViewModel() {

    private val _errorFlow: MutableSharedFlow<Throwable> = MutableSharedFlow()
    val errorFlow = _errorFlow.asSharedFlow()

    private val _uiState: MutableStateFlow<CastDetailUiState> =
        MutableStateFlow(CastDetailUiState.Loading)
    val uiState = _uiState.asStateFlow()

    fun getPerson(personId: Long) {
        viewModelScope.launch {
            personInfoUseCase.loadPersonInfo(personId)
                .catch {
                    _errorFlow.emit(it)
                }.collectLatest {
                    _uiState.value = CastDetailUiState.Success(it.toUiModel())
                }
        }
    }
}
