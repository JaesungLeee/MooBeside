package com.jslee.presentation.feature.bookmark

import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentBookmarkBinding
import com.jslee.presentation.feature.bookmark.FilterBottomSheetFragment.Companion.FILTER_BOTTOM_SHEET_TAG
import com.jslee.presentation.feature.bookmark.adapter.BookmarkAdapter
import com.jslee.presentation.feature.detail.MovieDetailFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class BookmarkFragment : BaseFragment<FragmentBookmarkBinding>(R.layout.fragment_bookmark) {

    @Inject
    lateinit var fakeBookmarkData: FakeBookmarkData

    private val viewModel: BookmarkViewModel by activityViewModels()

    private val bookmarkAdapter by lazy {
        BookmarkAdapter(
            onBookmarkClick = { movieId ->
                val action = MovieDetailFragmentDirections.actionToMovieDetail(movieId)
                findNavController().navigate(action)
            },
            onNavigateHome = {
                findNavController().popBackStack()
            }
        )
    }

    override fun initViews() {
        initFilterView()
        initBookmarkList()
    }

    private fun initFilterView() {
        binding.ivFilter.setOnClickListener {
            showFilterBottomSheet()
        }
    }

    private fun initBookmarkList() {
        binding.rvBookmark.adapter = bookmarkAdapter
    }

    private fun showFilterBottomSheet() {
        val bottomSheet = FilterBottomSheetFragment()
        bottomSheet.show(childFragmentManager, FILTER_BOTTOM_SHEET_TAG)
    }

    override fun observeStates() {
        repeatOn(lifecycle = Lifecycle.State.RESUMED) {
            viewModel.bookmarks.collectLatest {
                bookmarkAdapter.submitList(it)
            }
        }
    }
}