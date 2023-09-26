package com.jslee.presentation.feature.home.viewholder.banner

import android.view.View
import androidx.core.view.doOnAttach
import androidx.core.view.doOnDetach
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import androidx.viewpager2.widget.ViewPager2.SCROLL_STATE_DRAGGING
import androidx.viewpager2.widget.ViewPager2.SCROLL_STATE_IDLE
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemHomeBannerBinding
import com.jslee.presentation.feature.home.adapter.PopularMovieBannerAdapter
import com.jslee.presentation.feature.home.model.BannerUiModel
import com.jslee.presentation.feature.home.model.item.HomeListItem
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/01
 */
class BannerViewHolder(
    onBannerClick: (BannerUiModel) -> Unit,
    private val binding: ItemHomeBannerBinding,
) : BaseViewHolder<HomeListItem.BannerContent>(binding) {

    private val bannerAdapter: PopularMovieBannerAdapter by lazy {
        PopularMovieBannerAdapter(onBannerClick = onBannerClick)
    }
    private lateinit var autoScrollJob: Job
    private var currentPosition = 0

    init {
        initLifecycleOwner(itemView)
        initBannerAdapter()
        initBannerIndicator()
    }

    private fun initLifecycleOwner(itemView: View) = with(itemView) {
        /**
         * RecyclerView.Adapter#onViewAttachedToWindow 대신 doOnAttach를 통해 lifecycleOwner를 주입
         * https://pluu.github.io/blog/android/2021/09/20/lifecycleowner/
         */
        doOnAttach {
            it.findViewTreeLifecycleOwner()?.let { viewLifecycleOwner ->
                binding.lifecycleOwner = viewLifecycleOwner
                addLifecycleObserver(binding.lifecycleOwner)
            }
        }
        doOnDetach {
            binding.lifecycleOwner = null
        }
    }

    private fun addLifecycleObserver(lifecycleOwner: LifecycleOwner?) {
        lifecycleOwner?.lifecycle?.addObserver(BannerLifecycleObserver(
            onResumeCalled = { createAutoScrollJob(it) },
            onDestroyCalled = { autoScrollJob.cancel() }
        ))
    }

    private fun initBannerAdapter() {
        binding.vpPopularBanner.adapter = bannerAdapter
        binding.vpPopularBanner.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                currentPosition = position
                binding.tvCurrentPage.text = "${(currentPosition % BANNER_LIST_COUNT) + 1}"
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                when (state) {
                    SCROLL_STATE_IDLE -> if (!autoScrollJob.isActive) createAutoScrollJob(binding.lifecycleOwner)
                    SCROLL_STATE_DRAGGING -> autoScrollJob.cancel()
                }
            }
        })
    }

    private fun createAutoScrollJob(lifecycleOwner: LifecycleOwner?) {
        autoScrollJob = lifecycleOwner?.lifecycleScope?.launch {
            delay(3000L)
            binding.vpPopularBanner.setCurrentItem(++currentPosition, true)
        }!!
    }

    private fun initBannerIndicator() {
        binding.tvCurrentPage.text = "$CURRENT_PAGE"
        binding.tvTotalPage.text = "$BANNER_LIST_COUNT"
    }

    override fun bindItems(item: HomeListItem.BannerContent) {
        bannerAdapter.submitList(item.bannerData)
    }

    companion object {
        private const val BANNER_LIST_COUNT = 20
        private const val CURRENT_PAGE = 1
    }
}

class BannerLifecycleObserver(
    private val onResumeCalled: (LifecycleOwner) -> Unit,
    private val onDestroyCalled: () -> Unit,
) : DefaultLifecycleObserver {
    override fun onResume(owner: LifecycleOwner) {
        onResumeCalled(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        onDestroyCalled()
    }
}
