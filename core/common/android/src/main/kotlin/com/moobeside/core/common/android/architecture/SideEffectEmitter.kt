package com.moobeside.core.common.android.architecture

import com.moobeside.core.common.android.architecture.contract.SideEffect
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow

internal class SideEffectEmitter<SE : SideEffect> {
    private val _sideEffect: MutableSharedFlow<SE> = MutableSharedFlow(onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val sideEffect: SharedFlow<SE> = _sideEffect.asSharedFlow()

    suspend fun emit(sideEffect: SE) {
        _sideEffect.emit(sideEffect)
    }
}