package com.jslee.presentation.feature.cast

import androidx.navigation.fragment.navArgs
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentCastBinding
import timber.log.Timber

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/10
 */
class CastFragment : BaseFragment<FragmentCastBinding>(R.layout.fragment_cast) {

    private val navArgs by navArgs<CastFragmentArgs>()

    override fun initViews() {
        val a = navArgs.casts.toList()
        Timber.e("$a")
    }
}