package com.jslee.core.external

import android.content.Context

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/01
 */
interface ExternalLauncher {
    fun launchTrailer(context: Context, videoId: String, fallback: () -> Unit)
    fun launchSearch(context: Context, query: String, fallback: () -> Unit)
}