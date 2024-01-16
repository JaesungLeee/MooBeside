package com.jslee.presentation.feature.bookmark

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.activityViewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.jslee.presentation.databinding.DialogFilterBottomSheetBinding
import com.jslee.presentation.feature.bookmark.adapter.filter.FilterOptionsAdapter
import dagger.hilt.android.AndroidEntryPoint
import com.jslee.core.designsystem.R as DR

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/05
 */
@AndroidEntryPoint
class FilterBottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: DialogFilterBottomSheetBinding? = null
    val binding: DialogFilterBottomSheetBinding get() = requireNotNull(_binding)

    private val viewModel: BookmarkViewModel by activityViewModels()

    private val filterOptionsAdapter: FilterOptionsAdapter by lazy {
        FilterOptionsAdapter(onFilterClick = viewModel::setBookmarkFilter)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = DialogFilterBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setBackgroundDimWindow()

        binding.rvFilterOptions.adapter = filterOptionsAdapter
        filterOptionsAdapter.submitList(viewModel.getFilterOptions())

        binding.tvConfirmButton.setOnClickListener {
            dialog?.dismiss()
        }
    }

    private fun setBackgroundDimWindow() {
        dialog?.window?.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        dialog?.window?.setDimAmount(0.6f)
    }

    override fun getTheme(): Int {
        return DR.style.MooBeside_BottomSheet
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        const val FILTER_BOTTOM_SHEET_TAG = "FilterBottomSheet"
    }
}