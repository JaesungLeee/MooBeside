package com.jslee.presentation.feature.detail.viewholder.trailer

import androidx.core.view.doOnAttach
import androidx.core.view.doOnDetach
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.core.ui.extension.setOnSingleClickListener
import com.jslee.presentation.databinding.ItemTrailerBinding
import com.jslee.presentation.feature.detail.model.MovieTrailerUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/31
 */
class TrailerItemViewHolder(
    private val binding: ItemTrailerBinding,
    onTrailerClick: (String) -> Unit,
) : BaseViewHolder<MovieTrailerUiModel>(binding) {

    init {
        initLifecycleOwner(onTrailerClick)
    }

    private fun initLifecycleOwner(onTrailerClick: (String) -> Unit) {
        itemView.apply {
            doOnAttach {
                it.findViewTreeLifecycleOwner()?.let { lifecycleOwner ->
                    binding.lifecycleOwner = lifecycleOwner
                    setTrailerClickListener(onTrailerClick)
                }
            }
            doOnDetach {
                binding.lifecycleOwner = null
            }
        }

    }

    private fun setTrailerClickListener(onTrailerClick: (String) -> Unit) {
        binding.lifecycleOwner?.let { lifecycleOwner ->
            binding.root.setOnSingleClickListener(lifecycleOwner.lifecycleScope) {
                getItem {
                    onTrailerClick(it.videoId)
                }
            }
        }
    }

    override fun bindItems(item: MovieTrailerUiModel) = with(binding) {
        trailer = item
        executePendingBindings()
    }
}