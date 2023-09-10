package com.jslee.presentation.feature.home

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.jslee.core.designsystem.tooltip.builder.TooltipBuilder
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentHomeBinding
import com.jslee.presentation.feature.home.adapter.HomeAdapter
import com.jslee.presentation.feature.home.adapter.BannerAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
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
    private val bannerAdapter: BannerAdapter by lazy { BannerAdapter() }
    private lateinit var autoScrollJob: Job
    private var currentPosition = 0

//    override fun onResume() {
//        super.onResume()
//        createAutoScrollJob()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        autoScrollJob.cancel()
//    }
//
//    private fun createAutoScrollJob() {
//        autoScrollJob = viewLifecycleOwner.lifecycleScope.launch {
//            delay(3000L)
//            binding.vpPopularBanner.setCurrentItem(++currentPosition, true)
//        }
//    }

    override fun initViews() {
        initToolbarMenu()
        initRecyclerView()
//        initTopBanner()
//        initTooltip()
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

//    private fun initTopBanner() {
//        binding.tvCurrentPage.text = "$CURRENT_PAGE"
//        binding.tvTotalPage.text = "$BANNER_COUNT"
//
//        with(binding.vpPopularBanner) {
//            registerOnPageChangeCallback(object : OnPageChangeCallback() {
//                override fun onPageSelected(position: Int) {
//                    super.onPageSelected(position)
//                    currentPosition = position
//                    binding.tvCurrentPage.text = "${(currentPosition % BANNER_COUNT) + 1}"
//                }
//
//                override fun onPageScrollStateChanged(state: Int) {
//                    super.onPageScrollStateChanged(state)
//                    when (state) {
//                        SCROLL_STATE_IDLE -> createAutoScrollJob()
//                        SCROLL_STATE_DRAGGING -> autoScrollJob.cancel()
//                    }
//                }
//            })
//        }
//    }


//    private fun initTooltip() {
//        binding.ivBannerTooltip.setOnClickListener {
//            val tooltip = tooltip.setTooltip(
//                requireContext(),
//                viewLifecycleOwner,
//                getString(R.string.tooltip_banner_description)
//            )
//            tooltip.showAlignRight(binding.ivBannerTooltip, xOff = 8)
//        }
//    }

    override fun observeStates() {
        repeatOn(Lifecycle.State.STARTED) {
//            launch {
//                viewModel.banner.collectLatest { bannerList ->
//                    binding.vpPopularBanner.adapter = bannerAdapter.also {
//                        it.submitList(bannerList)
//                    }
//                }
//            }

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