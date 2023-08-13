package com.jslee.presentation.feature.boxoffice

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.usecase.GetDailyBoxOfficeUseCase
import com.jslee.presentation.common.extension.toShortenPreviousDate
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
        getDailyBoxOffice(System.currentTimeMillis().toShortenPreviousDate())
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
                Log.e("CHECK", "$dailyBoxOffice")
                _boxOfficeUiState.value = Success(dailyBoxOffice)
            }
        }
    }

    fun updateBoxOfficeByTargetDate(query: String) {
        getDailyBoxOffice(query)
    }
}

sealed interface BoxOfficeUiState
object Loading : BoxOfficeUiState
data class Success(val data: List<BoxOfficeUiModel>) : BoxOfficeUiState
object Failure : BoxOfficeUiState