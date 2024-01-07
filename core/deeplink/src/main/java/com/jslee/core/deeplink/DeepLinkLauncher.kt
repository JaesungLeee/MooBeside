package com.jslee.core.deeplink

import android.content.Context
import android.content.Intent
import android.net.Uri

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/22
 */
abstract class DeepLinkLauncher {

    open fun extractMovieIdFromFirebaseLink(
        intent: Intent?,
        onSuccess: (String?) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {}

    open fun createDetailFirebaseLink(
        movieId: String,
        metaTagImageUrl: String,
        metaTagTitle: String,
        metaTagDescription: String,
        onSuccess: (Uri) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {}

    open fun extractMovieIdFromKakaoLink() {}

    open fun shareDetailKakaoLink(
        context: Context,
        movieId: String,
        movieTitle: String,
        movieImageUrl: String,
        movieDescription: String,
        onSuccess: (Intent) -> Unit,
        onFailure: (String?) -> Unit,
    ) {}
}