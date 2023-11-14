package com.jslee.presentation.feature.detail

import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.jslee.core.external.ExternalLauncher
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.decoration.DividerViewItemDecoration
import com.jslee.core.ui.extension.dp
import com.jslee.core.ui.extension.emptyString
import com.jslee.core.ui.extension.showToast
import com.jslee.core.ui.model.PaddingValues
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentMovieDetailBinding
import com.jslee.presentation.feature.detail.adapter.MovieDetailAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject
import com.jslee.core.designsystem.R as DR

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class MovieDetailFragment :
    BaseFragment<FragmentMovieDetailBinding>(R.layout.fragment_movie_detail) {

    @Inject
    lateinit var externalLauncher: ExternalLauncher

    private val viewModel: MovieDetailViewModel by viewModels()
    private val movieId: Long by lazy { arguments?.getLong("movieId") ?: 0L }
    private val movieDetailAdapter by lazy {
        MovieDetailAdapter(
            onTrailerClick = { videoId ->
                externalLauncher.launchTrailer(requireActivity(), videoId) {
                    requireActivity().showToast("앱을 실행시킬 수 없습니다.")
                }
            },
            onTrailerLoadMoreClick = { query ->
                externalLauncher.launchSearch(requireActivity(), query) {
                    requireActivity().showToast("앱을 실행시킬 수 없습니다.")
                }
            }
        )
    }

    override fun initViews() {
//        runCatching {
//            requireArguments().getLong("movieId")
//        }.onSuccess {
//            viewModel.getMovieDetails(it)
//        }.getOrElse {
//            requireActivity().showToast("Error !!")
//        }
        viewModel.getMovieDetails(movieId)
        setActionBarCollapsedListener()
        initToolbar()
        initRecyclerView()


    }

    private fun initRecyclerView() = with(binding.rvMovieDetail) {
        adapter = movieDetailAdapter
        val paddingValues = PaddingValues.vertical(0, 0)
        addItemDecoration(DividerViewItemDecoration(paddingValues))
    }

    private fun initToolbar() = with(binding.tbMovieDetail) {
        setNavigationOnClickListener { findNavController().navigateUp() }
        setOnMenuItemClickListener { menu ->
            when (menu.itemId) {
                DR.id.option_bookmark -> {
                    viewModel.toggleBookmark(movieId)
                    true
                }

                DR.id.option_share -> {
                    true
                }

                else -> false
            }
        }
    }

    override fun observeStates() {
        repeatOn {
            viewModel.detailUiState.collectLatest { handleUiState(it) }
        }
    }

    private fun handleUiState(uiState: MovieDetailUiState) {
        when (uiState) {
            MovieDetailUiState.Loading -> {}

            is MovieDetailUiState.Success -> {
                binding.appBarModel = uiState.data.appBarModel
                movieDetailAdapter.submitList(uiState.data.detailData)
            }
        }
    }

    private fun setActionBarCollapsedListener() = with(binding) {
        ablMovieDetail.addOnOffsetChangedListener { _, verticalOffset ->
            val isCollapsed = ctlMovieDetail.height + verticalOffset <= 64.dp
            setToolbarIconTint(isCollapsed)
            setToolbarTitle(isCollapsed)
        }
    }

    private fun setToolbarTitle(isCollapsed: Boolean) = with(binding.ctlMovieDetail) {
        if (isCollapsed) {
            title = viewModel.movieName.value
            setCollapsedTitleTextAppearance(DR.style.MooBesideTextAppearance_Title1)
        } else {
            title = emptyString
        }
    }

    private fun setToolbarIconTint(isCollapsed: Boolean) {
        val colorTint = getIconColor(isCollapsed)
        binding.tbMovieDetail.setNavigationIconTint(colorTint)
    }

    private fun getIconColor(isCollapsed: Boolean): Int {
        val color = if (isCollapsed) {
            ContextCompat.getColor(requireContext(), DR.color.Black)
        } else {
            ContextCompat.getColor(requireContext(), DR.color.White)
        }
        return color
    }
}