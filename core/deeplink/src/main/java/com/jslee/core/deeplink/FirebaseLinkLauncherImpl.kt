package com.jslee.core.deeplink

import android.content.Intent
import android.net.Uri
import com.google.firebase.dynamiclinks.DynamicLink
import com.google.firebase.dynamiclinks.ShortDynamicLink
import com.google.firebase.dynamiclinks.ktx.dynamicLinks
import com.google.firebase.ktx.Firebase
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/22
 */
internal class FirebaseLinkLauncherImpl @Inject constructor() : DeepLinkLauncher {

    private val deepLinkDelegate by lazy { Firebase.dynamicLinks }

    override fun extractMovieIdFromFirebaseLink(
        intent: Intent?,
        onSuccess: (String?) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {
        deepLinkDelegate.getDynamicLink(intent).addOnSuccessListener { pendingLinkData ->
            val deepLink = pendingLinkData?.link

            if (deepLink?.lastPathSegment == MOVIE_DETAIL_PATH) {
                val movieId = deepLink.getQueryParameter(MOVIE_ID)
                onSuccess(movieId)
            } else {
                onSuccess(null)
            }
        }.addOnFailureListener {
            onFailure(it)
        }
    }

    override fun createDetailFirebaseLink(
        movieId: String,
        metaTagImageUrl: String,
        metaTagTitle: String,
        metaTagDescription: String,
        onSuccess: (Uri) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {
        val firebaseLink = deepLinkDelegate.createDynamicLink()
            .setLink(Uri.parse("$MOOBESIDE_DEEP_LINK_URI$MOVIE_DETAIL_PATH?$MOVIE_ID=$movieId"))
            .setDomainUriPrefix(MOOBESIDE_DOMAIN_URI_PREFIX)
            .setAndroidParameters(
                DynamicLink.AndroidParameters.Builder(MOOBESIDE_ANDROID_PACKAGE)
                    .setMinimumVersion(1)
                    .setFallbackUrl(Uri.parse(PLAY_STORE_URL))
                    .build()
            )
            .setSocialMetaTagParameters(
                DynamicLink.SocialMetaTagParameters.Builder()
                    .setImageUrl(Uri.parse(metaTagImageUrl))
                    .setTitle(metaTagTitle)
                    .setDescription(metaTagDescription)
                    .build()
            )
            .buildShortDynamicLink(ShortDynamicLink.Suffix.SHORT)

        firebaseLink.addOnSuccessListener {
            it.shortLink?.let { uri -> onSuccess(uri) }
        }.addOnFailureListener {
            onFailure(it)
        }
    }
}