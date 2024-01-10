package com.jslee.presentation.feature.castdetail

import androidx.navigation.fragment.navArgs
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentCastDetailBinding
import timber.log.Timber

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/10
 */
class CastDetailFragment : BaseFragment<FragmentCastDetailBinding>(R.layout.fragment_cast_detail) {

    private val navArgs by navArgs<CastDetailFragmentArgs>()

    override fun initViews() {
        Timber.e("${navArgs.personId}")

    }
}