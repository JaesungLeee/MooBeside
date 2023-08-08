package com.jslee.presentation.feature.boxoffice.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jslee.presentation.databinding.ItemBoxOfficeRankBinding
import com.jslee.presentation.feature.boxoffice.BoxOfficeUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */
class BoxOfficeAdapter(
    private val onCardClick: () -> Unit
) : ListAdapter<BoxOfficeUiModel, BoxOfficeViewHolder>(diffCallBack) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxOfficeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBoxOfficeRankBinding.inflate(layoutInflater, parent, false)
        return BoxOfficeViewHolder(binding, onCardClick)
    }

    override fun onBindViewHolder(holder: BoxOfficeViewHolder, position: Int) {
        val item = currentList[position]
        holder.bindItems(item)
    }

    companion object {
        val diffCallBack = object : DiffUtil.ItemCallback<BoxOfficeUiModel>() {
            override fun areItemsTheSame(
                oldItem: BoxOfficeUiModel,
                newItem: BoxOfficeUiModel
            ): Boolean {
                return oldItem.rank == newItem.rank
            }

            override fun areContentsTheSame(
                oldItem: BoxOfficeUiModel,
                newItem: BoxOfficeUiModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}

class BoxOfficeViewHolder(
    private val binding: ItemBoxOfficeRankBinding,
    onCardClick: () -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.cvBoxOffice.setOnClickListener {
            onCardClick()
        }
    }
    fun bindItems(item: BoxOfficeUiModel) {
        with(binding) {
            boxOffice = item
            executePendingBindings()
        }
    }
}