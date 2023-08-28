package com.jslee.presentation.feature.now

import androidx.navigation.fragment.findNavController
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentNowPlayingBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class NowPlayingFragment :
    BaseFragment<FragmentNowPlayingBinding>(R.layout.fragment_now_playing) {
    override fun initViews() {
        initToolbar()
    }

    private fun initToolbar() {
        binding.tbNowPlaying.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}