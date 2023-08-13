package com.jslee.data

import kotlin.coroutines.cancellation.CancellationException

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/09
 */

suspend inline fun <T> suspendRunCatching(crossinline block: suspend () -> T): Result<T> = try {
    Result.success(block())
} catch (cancellationException: CancellationException) {
    throw cancellationException
} catch (exception: Exception) {
    Result.failure(exception)
}
