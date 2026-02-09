package com.moobeside.core.common.android.extension

import android.os.Build
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

// Force the 3-button navigation bar to be transparent
// See: https://developer.android.com/develop/ui/views/layout/edge-to-edge#create-transparent
fun ComponentActivity.enableEdgeToEdgeConfig() {
    enableEdgeToEdge()
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        window.isNavigationBarContrastEnforced = false
    }
}