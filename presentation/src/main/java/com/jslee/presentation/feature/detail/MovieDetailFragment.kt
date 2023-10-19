package com.jslee.presentation.feature.detail

import androidx.fragment.app.viewModels
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentMovieDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class MovieDetailFragment :
    BaseFragment<FragmentMovieDetailBinding>(R.layout.fragment_movie_detail) {

    private val viewModel: MovieDetailViewModel by viewModels()
    private val itemAdapter by lazy { ListItemAdapter(ItemProvider.provideItem()) }

    override fun initViews() {
        viewModel.getMovieDetails(872585)
        binding.rvMovieDetail.adapter = itemAdapter
    }

object ItemProvider {

    fun provideItem(): List<Item> {
        val data = mutableListOf<Item>()
        (1..100).forEachIndexed { index, _ ->
            data.add(
                Item(
                    id = index.toLong(),
                    text = "${index}번째 TextView"
                )
            )
        }
        return data.toList()
    }
}

data class Item(    val id: Long,    val text: String,)