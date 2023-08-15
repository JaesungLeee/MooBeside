package com.jslee.presentation.feature.home

import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.jslee.presentation.R
import com.jslee.core.designsystem.R as DR
import com.jslee.presentation.common.base.BaseFragment
import com.jslee.presentation.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override fun initViews() {
        initToolbarMenu()


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
}