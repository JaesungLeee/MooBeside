package com.jslee.core.deeplink

import android.content.Intent
import android.net.Uri

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/22
 */
interface DeepLinkLauncher {

    fun extractMovieIdFromFirebaseLink(
        intent: Intent?,
        onSuccess: (String?) -> Unit,
        fallback: (Throwable) -> Unit,
    )

    fun createDetailFirebaseLink(
        movieId: String,
        metaTagImageUrl: String,
        metaTagTitle: String,
        metaTagDescription: String,
        onSuccess: (Uri) -> Unit,
        fallback: (Throwable) -> Unit,
    )
}