package com.jslee.presentation.feature.boxoffice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.core.date.getDisplayedDate
import com.jslee.domain.usecase.GetDailyBoxOfficeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/11
 */
@HiltViewModel
class BoxOfficeViewModel @Inject constructor(
    private val getDailyBoxOfficeUseCase: GetDailyBoxOfficeUseCase
) : ViewModel() {

    init {
        getDailyBoxOffice("20230810")
    }

    private val _boxOfficeUiState: MutableStateFlow<BoxOfficeUiState> = MutableStateFlow(Loading)
    val boxOfficeUiState = _boxOfficeUiState.asStateFlow()

    fun getDailyBoxOffice(targetDate: String) {
        viewModelScope.launch {
            getDailyBoxOfficeUseCase.invoke(targetDate).catch {
                Timber.e(it.message)
                _boxOfficeUiState.value = Failure
            }.collect { remoteBoxOffice ->
                val dailyBoxOffice = remoteBoxOffice.map { it.toPresentation() }
                _boxOfficeUiState.value = Success(dailyBoxOffice)
            }
        }
    }
}

sealed interface BoxOfficeUiState
object Loading : BoxOfficeUiState
data class Success(val data: List<BoxOfficeUiModel>) : BoxOfficeUiState
object Failure : BoxOfficeUiState