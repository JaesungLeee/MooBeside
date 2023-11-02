package com.jslee.presentation.feature.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemMovieThumbnailBinding
import com.jslee.presentation.feature.search.SearchResultUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/15
 */
class SearchAdapter(
    private val onCardClick: (Long) -> Unit,
) : PagingDataAdapter<SearchResultUiModel, SearchViewHolder>(searchDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemMovieThumbnailBinding.inflate(layoutInflater, parent, false)
        return SearchViewHolder(binding, onCardClick)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val item = getItem(position)
        holder.bindItems(item ?: return)
    }

    companion object {
        private val searchDiffCallback = object : DiffUtil.ItemCallback<SearchResultUiModel>() {
            override fun areItemsTheSame(
                oldItem: SearchResultUiModel,
                newItem: SearchResultUiModel,
            ): Boolean {
                return oldItem.posterImageUrl == newItem.posterImageUrl
            }

            override fun areContentsTheSame(
                oldItem: SearchResultUiModel,
                newItem: SearchResultUiModel,
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}

class SearchViewHolder(
    private val binding: ItemMovieThumbnailBinding,
    onCardClick: (Long) -> Unit,
) : BaseViewHolder<SearchResultUiModel>(binding) {
    init {
        binding.cvMovie.setOnClickListener {
            getItem {
                onCardClick(it.movieId)
            }
        }
    }

    override fun bindItems(item: SearchResultUiModel) = with(binding) {
        searchResult = item
        executePendingBindings()
    }
}
