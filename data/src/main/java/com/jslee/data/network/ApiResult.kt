package com.jslee.data.network

import com.jslee.data.exception.BadRequestException
import com.jslee.data.exception.ForbiddenException
import com.jslee.data.exception.InternalServerException
import com.jslee.data.exception.NotFoundException
import com.jslee.data.exception.UnknownException

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/29
 */

internal sealed interface ApiResult<out T> {
    data class Success<T>(val data: T) : ApiResult<T>

    sealed interface Failure : ApiResult<Nothing> {
        data class HttpException(val code: Int, val message: String?, val body: String) : Failure
        data class NetworkException(val exception: Throwable) : Failure
        data class UnknownApiException(val exception: Throwable) : Failure

        fun handleException(): Throwable =
            when (this) {
                is HttpException -> handleHttpException(code, message)
                is NetworkException -> exception
                is UnknownApiException -> exception
            }
    }

    val isSuccess: Boolean get() = this !is Failure
    val isFailure: Boolean get() = this is Failure

    fun exceptionOrNull(): Throwable? =
        when (this) {
            is Failure -> handleException()
            else -> null
        }

    fun getOrNull(): T? =
        when (this) {
            is Success -> data
            else -> null
        }

    fun failureOrThrow(): Failure {
        throwOnSuccess()
        return this as Failure
    }

    fun getOrThrow(): T {
        throwOnFailure()
        return (this as Success).data
    }
}

internal inline fun <T> ApiResult<T>.onSuccess(
    action: (value: T) -> Unit,
): ApiResult<T> {
    if (isSuccess) action(getOrThrow())
    return this
}

internal inline fun <T> ApiResult<T>.onFailure(
    action: (error: ApiResult.Failure) -> Unit,
): ApiResult<T> {
    if (isFailure) action(failureOrThrow())
    return this
}

internal fun ApiResult<*>.throwOnSuccess() {
    if (this is ApiResult.Success) throw IllegalStateException("Cannot be called under Success conditions.")
}

internal fun ApiResult<*>.throwOnFailure() {
    if (this is ApiResult.Failure) {
        throw handleException()
    }
}

private fun handleHttpException(code: Int, message: String?): Exception {
    return when (code) {
        400 -> BadRequestException(originMessage = message)
        403 -> ForbiddenException(originMessage = message)
        404 -> NotFoundException(originMessage = message)
        500, 501, 503, 504 -> InternalServerException(originMessage = message)
        else -> UnknownException(originMessage = message)
    }
}