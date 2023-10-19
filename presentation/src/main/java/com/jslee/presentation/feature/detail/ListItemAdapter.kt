package com.jslee.presentation.feature.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jslee.presentation.databinding.ItemListBinding

/**
 * AndroidStudyPlayGround
 * @author jaesung
 * @created 2023/10/18
 */
class ListItemAdapter(
    private val dataSet: List<Item>,
) : RecyclerView.Adapter<ListItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListBinding.inflate(inflater, parent, false)
        return ListItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bindView(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}

class ListItemViewHolder(
    private val binding: ItemListBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bindView(item: Item) {
        binding.item = item
    }
}
