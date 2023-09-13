package com.jslee.presentation.feature.home.decoration

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jslee.core.ui.decoration.ContentPaddingItemDecoration
import com.jslee.core.ui.extension.dp
import com.jslee.core.ui.model.PaddingValues

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/14
 */
class HomeUpComingItemDecoration(
    private val paddingValues: PaddingValues
) : ContentPaddingItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView) {
        outRect.set(
            paddingValues.start.dp,
            paddingValues.top.dp,
            paddingValues.end.dp,
            paddingValues.bottom.dp
        )
    }
}