package com.jslee.core.ui.decoration

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jslee.core.ui.extension.dp
import com.jslee.core.ui.model.PaddingValues

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/10
 */
class DividerViewItemDecoration(
    private val paddingValues: PaddingValues,
    private val viewType: Int = DIVIDER,
) : ContentPaddingItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView) {
        val adapterPosition = parent.getChildAdapterPosition(view)
        val itemViewType = parent.adapter?.getItemViewType(adapterPosition)

        when (itemViewType) {
            viewType -> outRect.set(
                paddingValues.start.dp,
                paddingValues.top.dp,
                paddingValues.end.dp,
                paddingValues.bottom.dp
            )

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
