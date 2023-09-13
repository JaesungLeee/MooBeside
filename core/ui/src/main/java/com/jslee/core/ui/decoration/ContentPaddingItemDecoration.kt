package com.jslee.core.ui.decoration

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jslee.core.ui.extension.dp
import com.jslee.core.ui.model.PaddingValues

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/13
 */
abstract class ContentPaddingItemDecoration : RecyclerView.ItemDecoration() {
    abstract fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView)

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        getItemOffsets(outRect, view, parent)
    }
}
