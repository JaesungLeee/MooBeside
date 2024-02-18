package com.jslee.core.external

import android.content.Context
import com.jslee.core.external.youtube.Youtube
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/01
 */

internal class ExternalLauncherImpl @Inject constructor() : ExternalLauncher {

    override fun launchTrailer(context: Context, videoId: String, fallback: () -> Unit) {
        Youtube.Trailer.launchYoutubeTrailer(context, videoId, fallback)
    }

    override fun launchSearch(context: Context, query: String, fallback: () -> Unit) {
        Youtube.Search.launchYoutubeSearch(context, query, fallback)
    }
}