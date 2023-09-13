package com.jslee.core.ui.decoration

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jslee.core.ui.extension.dp
import com.jslee.core.ui.model.PaddingValues

/**
 * MooBeside
 * @author jaesung
 * @created 2023/09/14
 */
class CommonItemDecoration(
    private val paddingValues: PaddingValues,
    private val layoutType: LayoutType,
) : ContentPaddingItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView) {
        when (layoutType) {
            LayoutType.HORIZONTAL -> {
                outRect.left = paddingValues.start.dp
                outRect.right = paddingValues.end.dp
            }

            LayoutType.VERTICAL -> {
                outRect.top = paddingValues.top.dp
                outRect.bottom = paddingValues.bottom.dp
            }

            LayoutType.GRID -> {
                outRect.set(
                    paddingValues.start.dp,
                    paddingValues.top.dp,
                    paddingValues.end.dp,
                    paddingValues.bottom.dp
                )
            }
        }
    }
}

enum class LayoutType {
    HORIZONTAL, VERTICAL, GRID
}