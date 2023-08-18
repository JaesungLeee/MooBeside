package com.jslee.presentation.feature.home

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import androidx.viewpager2.widget.ViewPager2.SCROLL_STATE_DRAGGING
import androidx.viewpager2.widget.ViewPager2.SCROLL_STATE_IDLE
import androidx.viewpager2.widget.ViewPager2.SCROLL_STATE_SETTLING
import androidx.viewpager2.widget.ViewPager2.ScrollState
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.jslee.presentation.R
import com.jslee.presentation.common.base.BaseFragment
import com.jslee.presentation.databinding.FragmentHomeBinding
import com.jslee.presentation.feature.home.adapter.HomeBannerAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import timber.log.Timber
import com.jslee.core.designsystem.R as DR

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private val bannerAdapter: HomeBannerAdapter by lazy { HomeBannerAdapter() }
    private lateinit var autoScrollJob: Job
    private var bannerPosition = 0

    override fun onResume() {
        super.onResume()
        createAutoScrollJob()
    }

    override fun onPause() {
        super.onPause()
        autoScrollJob.cancel()
    }

    private fun createAutoScrollJob() {
        autoScrollJob = viewLifecycleOwner.lifecycleScope.launch {
            delay(3000L)
            binding.vpPopularBanner.setCurrentItem(++bannerPosition, true)
        }
    }

    override fun initViews() {
        initToolbarMenu()
        initTopBanner()
    }

    private fun initToolbarMenu() {
        binding.tbScreening.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                DR.id.option_search -> findNavController().navigate(R.id.action_home_to_search)
                DR.id.option_settings -> findNavController().navigate(R.id.action_home_to_settings)
            }
            false
        }
    }

    private fun initTopBanner() {
        binding.tvCurrentPage.text = "1"
        with(binding.vpPopularBanner) {
            registerOnPageChangeCallback(object : OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    Timber.e(position.toString())
                    bannerPosition = position
                    binding.tvCurrentPage.text = "${(bannerPosition % BANNER_COUNT) + 1}"
                }

                override fun onPageScrollStateChanged(state: Int) {
                    super.onPageScrollStateChanged(state)
                    when (state) {
                        SCROLL_STATE_IDLE -> createAutoScrollJob()
                        SCROLL_STATE_DRAGGING -> autoScrollJob.cancel()
                    }
                }
            })
        }
        binding.vpPopularBanner.adapter = bannerAdapter.also {
            it.submitList(
                listOf(
                    BannerUiModel(
                        id = "1",
                        posterImageUrl = "https://image.tmdb.org/t/p/w500/zG9TYiHt0fdaJiWuNEhFrfKzwoi.jpg",
                        movieName = "a"
                    ),
                    BannerUiModel(
                        id = "2",
                        posterImageUrl = "https://image.tmdb.org/t/p/w500/zG9TYiHt0fdaJiWuNEhFrfKzwoi.jpg",
                        movieName = "a"
                    ),
                    BannerUiModel(
                        id = "3",
                        posterImageUrl = "https://image.tmdb.org/t/p/w500/zG9TYiHt0fdaJiWuNEhFrfKzwoi.jpg",
                        movieName = "a"
                    ),
                    BannerUiModel(
                        id = "4",
                        posterImageUrl = "https://image.tmdb.org/t/p/w500/zG9TYiHt0fdaJiWuNEhFrfKzwoi.jpg",
                        movieName = "a"
                    ),
                )
            )
        }
        binding.tvTotalPage.text = "$BANNER_COUNT"
    }

    companion object {
        private const val BANNER_COUNT = 4
    }
}