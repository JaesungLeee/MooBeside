package com.jslee.presentation.feature.detail

import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.extension.dp
import com.jslee.core.ui.extension.emptyString
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentMovieDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import com.jslee.core.designsystem.R as DR

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class MovieDetailFragment :
    BaseFragment<FragmentMovieDetailBinding>(R.layout.fragment_movie_detail) {

    private val viewModel: MovieDetailViewModel by viewModels()
    private val movieId: Long by lazy { arguments?.getLong("movieId") ?: 0L }
    private val itemAdapter by lazy { ListItemAdapter(ItemProvider.provideItem()) }

    override fun initViews() {
        viewModel.getMovieDetails(movieId)
        setActionBarCollapsedListener()

        binding.rvMovieDetail.adapter = itemAdapter
    }

    private fun setActionBarCollapsedListener() = with(binding) {
        ablMovieDetail.addOnOffsetChangedListener { _, verticalOffset ->
            val isCollapsed = ctlMovieDetail.height + verticalOffset <= 64.dp
            setToolbarIconTint(isCollapsed)
            setToolbarTitle(isCollapsed)
        }
    }

    private fun setToolbarTitle(isCollapsed: Boolean) = with(binding.ctlMovieDetail) {
        if (isCollapsed) {
            title = "오펜하이머"
            setCollapsedTitleTextAppearance(DR.style.MooBesideTextAppearance_Title1)
        } else {
            title = emptyString
        }
    }

    private fun setToolbarIconTint(isCollapsed: Boolean) {
        val colorTint = getIconColor(isCollapsed)
        binding.tbMovieDetail.setNavigationIconTint(colorTint)
    }

    private fun getIconColor(isCollapsed: Boolean): Int {
        val color = if (isCollapsed) {
            ContextCompat.getColor(requireContext(), DR.color.Black)
        } else {
            ContextCompat.getColor(requireContext(), DR.color.White)
        }
        return color
    }
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

data class Item(
    val id: Long,
    val text: String,
)