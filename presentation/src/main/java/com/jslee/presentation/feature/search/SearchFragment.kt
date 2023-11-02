package com.jslee.presentation.feature.search

import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.extension.showToast
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentSearchBinding
import com.jslee.presentation.feature.search.adapter.SearchAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import timber.log.Timber

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {

    private val viewModel: SearchViewModel by viewModels()
    private val searchAdapter by lazy {
        SearchAdapter(
            onCardClick = {
                navigateToDetail(it)
            }
        )
    }

    private fun navigateToDetail(movieId: Long) {
        val argument = bundleOf(Pair("movieId", movieId))
        findNavController().navigate(R.id.action_to_movie_detail, argument)
    }

    override fun initViews() {
        initToolbar()
        initRecyclerView()
        initSearchBar()
    }

    private fun initRecyclerView() {
        binding.rvSearch.adapter = searchAdapter
    }

    private fun initToolbar() {
        binding.tbSearch.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    private fun initSearchBar() {
        binding.etSearch.addTextChangedListener { query ->
            viewModel.setSearchQuery(query?.toString().orEmpty())
        }
    }

    override fun observeStates() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                with(viewModel) {
                    launch {
                        searchResult.collectLatest { uiState ->
                            when (uiState) {
                                Idle -> Unit
                                EmptyResult -> {
                                    Timber.e("EmptyResult")
                                }

                                Loading -> {
                                    Timber.e("Loading")
                                    requireContext().showToast("로딩중")
                                }

                                is Success -> {
                                    Timber.e("Success")
                                    searchAdapter.submitData(uiState.data)
                                }

                                is Failure -> {
                                    Timber.e("Failure")
                                    requireContext().showToast(uiState.message.orEmpty())
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}