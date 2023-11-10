package com.jslee.presentation.feature.bookmark

import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.extension.showToast
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentBookmarkBinding
import com.jslee.presentation.feature.bookmark.FilterBottomSheetFragment.Companion.FILTER_BOTTOM_SHEET_TAG
import com.jslee.presentation.feature.bookmark.adapter.BookmarkAdapter
import dagger.hilt.android.AndroidEntryPoint
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

    private val bookmarkAdapter by lazy {
        BookmarkAdapter(
            onBookmarkClick = {
                requireActivity().showToast("북마크 클릭")
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
        binding.rvBookmark.adapter = bookmarkAdapter.also {
            it.submitList(fakeBookmarkData.provideBookmarkInfoData())
        }
    }

    private fun showFilterBottomSheet() {
        val bottomSheet = FilterBottomSheetFragment()
        bottomSheet.show(childFragmentManager, FILTER_BOTTOM_SHEET_TAG)
    }
}