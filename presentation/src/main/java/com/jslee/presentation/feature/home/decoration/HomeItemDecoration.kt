package com.jslee.presentation.feature.home.decoration

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jslee.core.ui.extension.dp

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */
class HomeItemDecoration(
    private val size: Int
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val adapterPosition = parent.getChildAdapterPosition(view)
        val itemViewType = parent.adapter?.getItemViewType(adapterPosition)

        when (itemViewType) {
            DIVIDER -> outRect.top = size.dp
            else -> outRect.setEmpty()
        }
    }

    companion object {
        private const val HEADER = 0
        private const val BANNER_CONTENT = 1
        private const val NOW_PLAYING_CONTENT = 2
        private const val UP_COMING_CONTENT = 3
        private const val DIVIDER = 4
    }
}