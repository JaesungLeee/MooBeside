package com.jslee.core.ui.extension

import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/06
 */
internal const val THROTTLE_PERIOD = 1500L

internal fun View.onClickStream(): Flow<Unit> = callbackFlow {
    setOnClickListener {
        trySend(Unit)
    }
    awaitClose { setOnClickListener(null) }
}

fun View.setOnSingleClickListener(
    scope: CoroutineScope,
    onClickEvent: () -> Unit,
) {
    onClickStream()
        .throttleFirst(THROTTLE_PERIOD)
        .onEach { onClickEvent.invoke() }
        .launchIn(scope)
}