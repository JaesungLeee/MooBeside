package com.jslee.core.designsystem.util

private const val DEBOUNCE_MILLIS = 500L

internal interface MultipleEventsCutter {
    fun processEvent(event: () -> Unit)

    companion object
}

internal fun MultipleEventsCutter.Companion.create(): MultipleEventsCutter = MultipleEventsCutterImpl()

private class MultipleEventsCutterImpl : MultipleEventsCutter {
    private val now: Long
        get() = System.currentTimeMillis()

    private var lastEventMs: Long = 0

    override fun processEvent(event: () -> Unit) {
        if (now - lastEventMs >= DEBOUNCE_MILLIS) {
            event.invoke()
        }
        lastEventMs = now
    }
}
