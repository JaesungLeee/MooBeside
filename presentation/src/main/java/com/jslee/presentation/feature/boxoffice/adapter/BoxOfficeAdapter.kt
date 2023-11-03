package com.jslee.presentation.feature.boxoffice.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jslee.core.ui.adapter.SingleViewTypeListAdapter
import com.jslee.core.ui.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemBoxOfficeRankBinding
import com.jslee.presentation.feature.boxoffice.BoxOfficeUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
class BoxOfficeAdapter(
    private val onCardClick: (Long) -> Unit,
) : SingleViewTypeListAdapter<BoxOfficeUiModel>({ it.movieId }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<BoxOfficeUiModel> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBoxOfficeRankBinding.inflate(layoutInflater, parent, false)
        return BoxOfficeViewHolder(binding, onCardClick)
    }
}

class BoxOfficeViewHolder(
    private val binding: ItemBoxOfficeRankBinding,
    onCardClick: (Long) -> Unit,
) : BaseViewHolder<BoxOfficeUiModel>(binding) {
    init {
        binding.cvBoxOffice.setOnClickListener {
            getItem {
                onCardClick(it.movieId)
            }
        }
    }

    override fun bindItems(item: BoxOfficeUiModel) {
        with(binding) {
            boxOffice = item
            executePendingBindings()
        }
    }
}