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
class BoxOfficeAdapter : ListAdapter<BoxOfficeUiModel, BoxOfficeViewHolder>(diffCallBack) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxOfficeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBoxOfficeRankBinding.inflate(layoutInflater, parent, false)
        return BoxOfficeViewHolder(binding)
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
                return oldItem.test == newItem.test
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
    private val binding: ItemBoxOfficeRankBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bindItems(item: BoxOfficeUiModel) {

    }
}