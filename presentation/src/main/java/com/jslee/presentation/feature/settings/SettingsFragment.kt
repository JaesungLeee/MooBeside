package com.jslee.presentation.feature.settings

import androidx.navigation.fragment.findNavController
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentSettingsBinding
import com.jslee.presentation.feature.settings.adapter.SettingsAdapter
import com.jslee.presentation.feature.settings.model.Settings
import dagger.hilt.android.AndroidEntryPoint

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class SettingsFragment : BaseFragment<FragmentSettingsBinding>(R.layout.fragment_settings) {

    private val settingsAdapter by lazy { SettingsAdapter() }
    private val optionsList by lazy { Settings.provideOptions() }
    override fun initViews() {
        binding.tbSettings.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        binding.rvSettings.adapter = settingsAdapter.also {
            it.submitList(optionsList)
        }
    }
}