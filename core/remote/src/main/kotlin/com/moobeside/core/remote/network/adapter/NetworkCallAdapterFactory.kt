package com.moobeside.core.remote.network.adapter

import com.moobeside.core.remote.network.ApiResult
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/29
 */
internal class NetworkCallAdapterFactory : CallAdapter.Factory() {

    override fun get(
        returnType: Type,
        annotations: Array<out Annotation>,
        retrofit: Retrofit,
    ): CallAdapter<*, *>? {
        val rawType = getRawType(returnType)

        if (returnType !is ParameterizedType) {
            val type = parseReturnType(returnType)
            throw IllegalArgumentException("Return 타입은 $type<Foo> 또는 $type<out Foo>로 정의되어야 합니다.")
        }

        return when (rawType) {
            Call::class.java -> getApiResultCallAdapter(returnType)
            else -> null
        }
    }

    private fun getApiResultCallAdapter(wrapperType: ParameterizedType): CallAdapter<Type, out Call<out Any>>? {
        val bodyWrapperType = getParameterUpperBound(0, wrapperType)
        return when (getRawType(bodyWrapperType)) {
            ApiResult::class.java -> {
                val bodyType = parseBodyType(bodyWrapperType, wrapperType)
                ApiResultCallAdapter(bodyType)
            }

            else -> null
        }
    }

    private fun parseBodyType(
        wrapperType: Type,
        returnType: ParameterizedType,
    ): Type {
        if (wrapperType !is ParameterizedType) {
            val type = parseReturnType(returnType)
            throw IllegalArgumentException(
                "Return 타입은 $type<ResponseBody>로 정의되어야 합니다.",
            )
        }
        return getParameterUpperBound(0, wrapperType)
    }
}

private fun parseReturnType(type: Type) = type.toString().split('.').last()