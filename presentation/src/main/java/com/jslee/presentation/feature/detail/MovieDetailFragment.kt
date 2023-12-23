package com.jslee.presentation.feature.detail

import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
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
import timber.log.Timber
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
    private val safeArgs: MovieDetailFragmentArgs by navArgs()
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
        viewModel.getMovieDetails(safeArgs.movieId)
        initRecyclerView()
        initClickListener()
        setActionBarCollapsedListener()
    }

    private fun initRecyclerView() = with(binding.rvMovieDetail) {
        adapter = movieDetailAdapter
        val paddingValues = PaddingValues.vertical(0, 0)
        addItemDecoration(DividerViewItemDecoration(paddingValues))
    }

    private fun initClickListener() {
        binding.tbMovieDetail.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        binding.ivShare.setOnClickListener {
            requireActivity().showToast("공유")
        }

        binding.ivHeart.setOnClickListener {
            viewModel.toggleBookmark(safeArgs.movieId)
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
            ContextCompat.getColor(requireContext(), DR.color.Gray04)
        } else {
            ContextCompat.getColor(requireContext(), DR.color.Gray06)
        }
        return color
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
                binding.isBookmarked = uiState.isBookmarked
                movieDetailAdapter.submitList(uiState.data.detailData)
            }
        }
    }
}