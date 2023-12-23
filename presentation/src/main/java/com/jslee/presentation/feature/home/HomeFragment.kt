package com.jslee.presentation.feature.home

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.jslee.core.designsystem.tooltip.builder.TooltipBuilder
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.decoration.DividerViewItemDecoration
import com.jslee.core.ui.model.PaddingValues
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentHomeBinding
import com.jslee.presentation.feature.detail.MovieDetailFragmentDirections
import com.jslee.presentation.feature.home.adapter.HomeAdapter
import com.jslee.presentation.feature.home.model.BannerUiModel
import com.jslee.presentation.feature.home.model.NowPlayingUiModel
import com.jslee.presentation.feature.home.model.UpComingUiModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.jslee.core.designsystem.R as DR

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    @Inject
    lateinit var tooltip: TooltipBuilder
    private val viewModel: HomeViewModel by viewModels()
    private val homeAdapter: HomeAdapter = HomeAdapter()

    override fun initViews() {
        initToolbarMenu()
        initRecyclerView()
    }

    private fun initToolbarMenu() {
        binding.tbHome.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                DR.id.option_search -> findNavController().navigate(R.id.action_home_to_search)
                DR.id.option_settings -> findNavController().navigate(R.id.action_home_to_settings)
            }
            false
        }
    }

    private fun initRecyclerView() = with(binding.rvHome) {
        adapter = homeAdapter.also { initClickListener(it) }
        val paddingValues = PaddingValues.vertical(20, 0)
        addItemDecoration(DividerViewItemDecoration(paddingValues))
    }

    private fun initClickListener(adapter: HomeAdapter) {
        adapter.setHomeClickListener(object : HomeClickListener {
            override fun onLoadMoreClick(position: Int) {
                navigateDestinationWith(position)
            }

            override fun onBannerClick(item: BannerUiModel) {
                navigateToMovieDetail(item.movieId)
            }

            override fun onNowPlayingPosterClick(item: NowPlayingUiModel) {
                navigateToMovieDetail(item.movieId)
            }

            override fun onUpComingPosterClick(item: UpComingUiModel) {
                navigateToMovieDetail(item.movieId)
            }
        })
    }

    override fun observeStates() {
        repeatOn(Lifecycle.State.STARTED) {
            launch {
                viewModel.homeUiState.collectLatest { uiState ->
                    handleState(uiState)
                }
            }

            launch {
                viewModel.errorFlow.collectLatest { throwable ->
                    handleException(throwable)
                }
            }
        }
    }

    private fun handleState(uiState: HomeUiState) = when (uiState) {
        is HomeUiState.Loading -> {}
        is HomeUiState.Success -> {
            homeAdapter.submitList(uiState.data)
        }
    }

    private fun handleException(exception: Throwable) {

    }

    private fun navigateDestinationWith(position: Int) = when (position) {
        3 -> findNavController().navigate(R.id.action_home_to_nowPlaying)
        6 -> findNavController().navigate(R.id.action_home_to_upComing)
        else -> Unit
    }
    
    private fun navigateToMovieDetail(movieId: Long) {
        val action = MovieDetailFragmentDirections.actionToMovieDetail(movieId)
        findNavController().navigate(action)
    }
}