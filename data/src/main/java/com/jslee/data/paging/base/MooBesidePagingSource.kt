package com.jslee.data.paging.base

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import kotlin.coroutines.coroutineContext

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/25
 */
internal class MooBesidePagingSource<T : Any>(
    private val executor: suspend (Int) -> List<T>
) : PagingSource<Int, T>() {
    override fun getRefreshKey(state: PagingState<Int, T>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, T> =
        withContext(Dispatchers.IO) {
            val page = params.key ?: INITIAL_PAGE

            val context = coroutineContext
            Log.e("DISPATCHER", context.toString())

            if (page != INITIAL_PAGE) delay(300L)

            try {
                val result = executor.invoke(page)

                LoadResult.Page(
                    data = result,
                    prevKey = if (page == INITIAL_PAGE) null else page - 1,
                    nextKey = if (result.isEmpty()) null else page + 1,
                )
            } catch (e: HttpException) {
                e.printStackTrace()
                throw e
            } catch (e: Throwable) {
                LoadResult.Error(e)
            }
        }

    companion object {
        private const val INITIAL_PAGE = 1
    }
}
