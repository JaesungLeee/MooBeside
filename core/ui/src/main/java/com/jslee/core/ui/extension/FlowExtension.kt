package com.jslee.core.ui.extension

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/06
 */

internal fun <T> Flow<T>.throttleFirst(periodMillis: Long): Flow<T> = flow {
    require(periodMillis > 0) { "period should be positive" }
    var lastEventEmissionTime = 0L
    collect {
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastEventEmissionTime > periodMillis) {
            lastEventEmissionTime = currentTime
            emit(it)
        }
    }
}
