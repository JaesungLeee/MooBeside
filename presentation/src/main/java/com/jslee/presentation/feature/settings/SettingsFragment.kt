package com.jslee.presentation.feature.settings

import android.content.Intent
import androidx.navigation.fragment.findNavController
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentSettingsBinding
import com.jslee.presentation.feature.settings.adapter.SettingsAdapter
import com.jslee.presentation.feature.settings.model.Settings
import com.jslee.presentation.feature.settings.model.navigation.NavigationOption
import com.jslee.presentation.feature.settings.model.navigation.NavigationPath
import com.jslee.presentation.feature.settings.model.navigation.NavigationType
import dagger.hilt.android.AndroidEntryPoint

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class SettingsFragment : BaseFragment<FragmentSettingsBinding>(R.layout.fragment_settings) {

    private val settingsAdapter by lazy { SettingsAdapter(onOptionClick = ::navigateToOptionDetail) }
    private val optionsList by lazy { Settings(requireContext()).provideOptions() }
    override fun initViews() {
        binding.tbSettings.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        binding.rvSettings.adapter = settingsAdapter.also {
            it.submitList(optionsList)
        }
    }

    private fun navigateToOptionDetail(navigationOption: NavigationOption) {
        when (navigationOption.navigationPath) {
            NavigationPath.DETAIL -> {
                val action =
                    SettingsFragmentDirections.actionSettingsToSettingsDetail(navigationOption)
                findNavController().navigate(action)
            }

            NavigationPath.WEB_VIEW -> {
                val action =
                    SettingsFragmentDirections.actionSettingsToSettingsWebView(navigationOption)
                findNavController().navigate(action)
            }

            NavigationPath.EXTERNAL -> {
                if (navigationOption.navigationType == NavigationType.OPEN_SOURCE) {
                    OssLicensesMenuActivity.setActivityTitle("오픈소스 라이센스")
                    startActivity(Intent(requireContext(), OssLicensesMenuActivity::class.java))
                }
            }
        }
    }
}