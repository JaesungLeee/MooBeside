package com.jslee.presentation.feature.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jslee.domain.usecase.SearchMovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/16
 */
@HiltViewModel
class SearchViewModel @Inject constructor(
    searchMovieUseCase: SearchMovieUseCase
) : ViewModel() {

    private val searchQuery: MutableStateFlow<String> = MutableStateFlow("")

    @OptIn(ExperimentalCoroutinesApi::class, FlowPreview::class)
    val searchResult = searchQuery
        .debounce(500L)
        .filter { query ->
            return@filter query.isNotEmpty()
        }.flatMapLatest { query ->
            searchMovieUseCase(query)
                .catch {
                    Failure(it.toString())
                }.map { remoteList ->
                    Success(remoteList.map { it.toPresentation() })
                }
        }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000L),
            Idle
        )

    fun setSearchQuery(query: String) {
        searchQuery.value = query
    }
}

sealed interface SearchUiState
object Idle : SearchUiState
object EmptyResult : SearchUiState
object Loading : SearchUiState
data class Success(val data: List<SearchResultUiModel>) : SearchUiState
data class Failure(val message: String?) : SearchUiState