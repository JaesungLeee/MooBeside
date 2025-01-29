package com.jslee.presentation.feature.detail.adapter.info

import android.view.LayoutInflater
import android.view.ViewGroup
import com.moobeside.core.common.ui.recyclerview.adapter.SingleViewTypeListAdapter
import com.moobeside.core.common.ui.recyclerview.base.BaseViewHolder
import com.jslee.presentation.databinding.ItemMovieInfoBinding
import com.jslee.presentation.feature.detail.model.MovieInfoItem
import com.jslee.presentation.feature.detail.viewholder.info.MovieInfoItemViewHolder

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/24
 */
class MovieInfoListAdapter : SingleViewTypeListAdapter<MovieInfoItem>({ it.title }) {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<MovieInfoItem> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMovieInfoBinding.inflate(inflater, parent, false)
        return MovieInfoItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<MovieInfoItem>, position: Int) {
        val item = currentList[position] ?: return
        holder.bindItems(item)
    }
}