package com.jslee.presentation.feature.now

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.decoration.CommonItemDecoration
import com.jslee.core.ui.decoration.LayoutType
import com.jslee.core.ui.model.PaddingValues
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentNowPlayingBinding
import com.jslee.presentation.feature.detail.MovieDetailFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class NowPlayingFragment :
    BaseFragment<FragmentNowPlayingBinding>(R.layout.fragment_now_playing) {

    private val viewModel: NowPlayingViewModel by viewModels()
    private val nowPlayingAdapter: NowPlayingPagingAdapter by lazy {
        NowPlayingPagingAdapter(
            onPosterClick = {
                val action = MovieDetailFragmentDirections.actionToMovieDetail(it.movieId)
                findNavController().navigate(action)
            }
        )
    }

    override fun initViews() {
        initToolbar()
        initRecyclerView()
    }

    private fun initToolbar() {
        binding.tbNowPlaying.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun initRecyclerView() = with(binding.rvNowPlaying) {
        adapter = nowPlayingAdapter
        val paddingValues = PaddingValues(2, 2, 2, 2)
        addItemDecoration(CommonItemDecoration(paddingValues, LayoutType.GRID))
    }

    override fun observeStates() {
        repeatOn(Lifecycle.State.STARTED) {
            launch {
                viewModel.nowPlayingUiState.collectLatest {
                    handleUiState(it)
                }
            }

            launch {
                viewModel.eventFlow.collect {
                    handleException(it)
                }
            }
        }
    }

    private suspend fun handleUiState(uiState: NowPlayingUiState) = when (uiState) {
        Loading -> {

        }

        is Success -> {
            nowPlayingAdapter.submitData(uiState.data)
        }
    }

    private fun handleException(throwable: Throwable) {

    }
}