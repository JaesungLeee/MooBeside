package com.jslee.presentation.feature.upcoming

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.decoration.CommonItemDecoration
import com.jslee.core.ui.decoration.LayoutType
import com.jslee.core.ui.model.PaddingValues
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentUpComingBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class UpComingFragment : BaseFragment<FragmentUpComingBinding>(R.layout.fragment_up_coming) {

    private val viewModel: UpComingViewModel by viewModels()
    private val upComingPagingAdapter: UpComingPagingAdapter by lazy { UpComingPagingAdapter() }

    override fun initViews() {
        initToolbar()
        initRecyclerView()
    }

    private fun initToolbar() {
        binding.tbUpComing.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun initRecyclerView() = with(binding.rvUpComing) {
        adapter = upComingPagingAdapter
        val paddingValues = PaddingValues(2, 2, 2, 2)
        addItemDecoration(CommonItemDecoration(paddingValues, LayoutType.GRID))
    }

    override fun observeStates() {
        repeatOn {
            launch {
                viewModel.upComingUiState.collectLatest { uiState ->
                    when (uiState) {
                        Idle -> {}
                        is Success -> {
                            upComingPagingAdapter.submitData(uiState.data)
                        }
                    }
                }
            }

            launch {
                viewModel.eventFlow.collect {
                    handleException(it)
                }
            }
        }
    }

    private fun handleException(throwable: Throwable) {

    }
}