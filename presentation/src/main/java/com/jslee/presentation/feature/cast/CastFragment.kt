package com.jslee.presentation.feature.cast

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentCastBinding
import com.jslee.presentation.feature.cast.adapter.CastAdapter
import timber.log.Timber

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/10
 */
class CastFragment : BaseFragment<FragmentCastBinding>(R.layout.fragment_cast) {

    private val navArgs by navArgs<CastFragmentArgs>()
    private val castAdapter by lazy {
        CastAdapter(
            onCastClick = {
                Timber.e("$it")
            }
        )
    }

    override fun initViews() {
        val casts = navArgs.casts.toList()

        binding.apply {
            tbCast.setNavigationOnClickListener {
                findNavController().navigateUp()
            }

            rvCast.adapter = castAdapter.also {
                it.submitList(casts)
            }
        }
    }
}