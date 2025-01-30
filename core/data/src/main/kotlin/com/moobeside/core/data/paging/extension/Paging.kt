package com.moobeside.core.data.paging.extension

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.moobeside.core.common.kotlin.PAGING_REQUEST_DATA_SIZE
import com.moobeside.core.data.paging.base.MooBesidePagingSource

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/25
 */
fun <T : Any> createPager(
    pageSize: Int = PAGING_REQUEST_DATA_SIZE,
    executor: suspend (Int) -> List<T>
): Pager<Int, T> = Pager(
    config = PagingConfig(
        pageSize = pageSize,
        enablePlaceholders = false,
    ),
    pagingSourceFactory = { MooBesidePagingSource(executor) }
)