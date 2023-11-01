package com.jslee.core.external

import android.content.Context
import com.jslee.core.external.youtube.Youtube
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/01
 */

class ExternalLauncherImpl @Inject constructor() : ExternalLauncher {

    override fun launchTrailer(context: Context, id: String, fallback: () -> Unit) {
        Youtube.Trailer.launchYoutubeTrailer(context, id, fallback)
    }

    override fun launchSearch(context: Context, query: String, fallback: () -> Unit) {
        Youtube.Search.launchYoutubeSearch(context, query, fallback)
    }
}