package com.moobeside.core.remote.network.adapter

import com.moobeside.core.remote.network.ApiResult
import okhttp3.Request
import okio.IOException
import okio.Timeout
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Callback
import retrofit2.Response
import java.lang.reflect.Type

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/29
 */
internal class ApiResultCallAdapter<R>(
    private val bodyType: Type,
) : CallAdapter<R, Call<ApiResult<R>>> {

    override fun adapt(call: Call<R>): Call<ApiResult<R>> = ApiResultCall(call, bodyType)

    override fun responseType(): Type = bodyType
}

internal class ApiResultCall<R>(
    private val delegate: Call<R>,
    private val bodyType: Type,
) : Call<ApiResult<R>> {

    override fun enqueue(callback: Callback<ApiResult<R>>) {
        delegate.enqueue(object : Callback<R> {
            override fun onResponse(call: Call<R>, response: Response<R>) {
                callback.onResponse(
                    this@ApiResultCall,
                    Response.success(response.toSuccessResult())
                )
            }

            override fun onFailure(call: Call<R>, t: Throwable) {
                val exception = when (t) {
                    is IOException -> ApiResult.Failure.NetworkException(t)
                    else -> ApiResult.Failure.UnknownApiException(t)
                }
                callback.onResponse(this@ApiResultCall, Response.success(exception))
            }

            fun Response<R>.toSuccessResult(): ApiResult<R> {
                if (!isSuccessful) {
                    val errorBody = errorBody()?.string()
                    return ApiResult.Failure.HttpException(
                        code = code(),
                        message = message(),
                        body = errorBody ?: "errorBody == null"
                    )
                }

                body()?.let { result ->
                    return ApiResult.Success(result)
                }

                return if (bodyType == Unit::class.java) {
                    @Suppress("UNCHECKED_CAST")
                    ApiResult.Success(Unit as R)
                } else {
                    ApiResult.Failure.UnknownApiException(
                        IllegalStateException("Body가 존재하지 않습니다. ApiResult<Unit>로 정의하세요.")
                    )
                }
            }
        })
    }


    override fun execute(): Response<ApiResult<R>> =
        throw UnsupportedOperationException("This adapter only support asynchronous method. use enqueue")

    override fun clone(): Call<ApiResult<R>> = ApiResultCall(delegate.clone(), bodyType)

    override fun isExecuted(): Boolean = delegate.isExecuted

    override fun cancel() = delegate.cancel()

    override fun isCanceled(): Boolean = delegate.isCanceled

    override fun request(): Request = delegate.request()

    override fun timeout(): Timeout = delegate.timeout()
}