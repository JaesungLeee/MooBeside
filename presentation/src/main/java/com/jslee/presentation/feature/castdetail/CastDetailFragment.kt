package com.jslee.presentation.feature.castdetail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.tabs.TabLayout
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentCastDetailBinding
import com.jslee.presentation.feature.castdetail.adpater.ParticipateMovieAdapter
import com.jslee.presentation.feature.castdetail.model.ParticipationTab
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/10
 */
@AndroidEntryPoint
class CastDetailFragment : BaseFragment<FragmentCastDetailBinding>(R.layout.fragment_cast_detail) {

    private val viewModel: CastDetailViewModel by viewModels()
    private val navArgs by navArgs<CastDetailFragmentArgs>()
    private val movieAdapter by lazy {
        ParticipateMovieAdapter(
            onMovieClick = {
                val action = CastDetailFragmentDirections.actionCastDetailToMovieDetail(it)
                findNavController().navigate(action)
            }
        )
    }

    override fun initViews() {
        viewModel.getPerson(navArgs.personId)
        setParticipationTabs()
        setTabSelectedListener()

        binding.tbCastDetail.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
        binding.rvParticipation.adapter = movieAdapter
    }

    private fun setTabSelectedListener() {
        binding.tlParticipation.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewModel.setParticipationTab(tab?.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }

    private fun setParticipationTabs() {
        val tabs = enumValues<ParticipationTab>().asList()
        tabs.forEach { tab ->
            binding.tlParticipation.apply {
                addTab(this.newTab().setText(tab.role))
            }
        }
    }

    override fun observeStates() {
        repeatOn {
            launch {
                viewModel.uiState.collectLatest { uiState ->
                    handleUiState(uiState)
                }
            }

            launch {
                viewModel.tab.collect {
                    submitParticipationData(it)
                }
            }
        }
    }

    private fun handleUiState(uiState: CastDetailUiState) {
        when (uiState) {
            is CastDetailUiState.Loading -> {

            }

            is CastDetailUiState.Success -> {
                movieAdapter.submitList(uiState.uiModel.participateAsCast)
                binding.personInfo = uiState.uiModel.personInfo
            }
        }
    }

    private fun submitParticipationData(tab: ParticipationTab) {
        val uiState = viewModel.uiState.value
        if (uiState !is CastDetailUiState.Success) return

        when (tab) {
            ParticipationTab.CAST -> movieAdapter.submitList(uiState.uiModel.participateAsCast)
            ParticipationTab.CREW -> movieAdapter.submitList(uiState.uiModel.participateAsCrew)
        }
    }
}