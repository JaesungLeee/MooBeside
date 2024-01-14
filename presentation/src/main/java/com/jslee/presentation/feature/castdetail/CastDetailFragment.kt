package com.jslee.presentation.feature.castdetail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentCastDetailBinding
import com.jslee.presentation.feature.castdetail.adpater.ParticipateMovieAdapter
import com.jslee.presentation.feature.castdetail.model.ParticipationTab
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

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
        binding.tbCastDetail.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
        binding.rvParticipation.adapter = movieAdapter
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
            viewModel.uiState.collectLatest { uiState ->
                handleUiState(uiState)
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
}