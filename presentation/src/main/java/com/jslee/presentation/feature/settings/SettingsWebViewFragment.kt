package com.jslee.presentation.feature.settings

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentSettingsWebViewBinding
import com.jslee.presentation.feature.settings.model.navigation.NavigationType

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/08
 */
class SettingsWebViewFragment :
    BaseFragment<FragmentSettingsWebViewBinding>(R.layout.fragment_settings_web_view) {

    private val navArgs by navArgs<SettingsWebViewFragmentArgs>()

    override fun initViews() {
        val type = navArgs.navigationOption.navigationType
        binding.toolbarTitle = NavigationType.getDescription(type)

        binding.tbSettingsDetail.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
    }
}