package com.jslee.presentation.feature.home

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.jslee.core.designsystem.tooltip.builder.TooltipBuilder
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentHomeBinding
import com.jslee.presentation.feature.home.adapter.HomeAdapter
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
    private val homeAdapter: HomeAdapter by lazy { HomeAdapter() }

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
        adapter = homeAdapter
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
}