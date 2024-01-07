package com.jslee.core.deeplink.kakao

import android.content.Context
import android.content.Intent
import android.util.Log
import com.jslee.core.deeplink.DeepLinkLauncher
import com.jslee.core.deeplink.MOVIE_ID
import com.kakao.sdk.share.ShareClient
import com.kakao.sdk.template.model.Button
import com.kakao.sdk.template.model.Content
import com.kakao.sdk.template.model.FeedTemplate
import com.kakao.sdk.template.model.Link
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/23
 */
internal class KakaoLinkLauncherImpl @Inject constructor() : DeepLinkLauncher() {

    override fun extractMovieIdFromKakaoLink() {

    }

    override fun shareDetailKakaoLink(
        context: Context,
        movieId: String,
        movieTitle: String,
        movieImageUrl: String,
        movieDescription: String,
        onSuccess: (Intent) -> Unit,
        onFailure: (String?) -> Unit,
    ) {
        val defaultFeed = FeedTemplate(
            content = Content(
                title = movieTitle,
                description = movieDescription,
                imageUrl = movieImageUrl,
                link = Link(
                    androidExecutionParams = mapOf(MOVIE_ID to movieId),
                ),
            ),
            buttons = listOf(
                Button(
                    title = "[무비사이드] 앱으로 보기",
                    link = Link(
                        androidExecutionParams = mapOf(MOVIE_ID to movieId),
                    ),
                )
            )
        )

        if (ShareClient.instance.isKakaoTalkSharingAvailable(context)) {
            ShareClient.instance.shareDefault(context, defaultFeed) { sharingResult, error ->
                if (error != null) {
                    onFailure(error.message)
                } else if (sharingResult != null) {
                    onSuccess(sharingResult.intent)
                }
            }
        } else {
            onFailure(null)
        }
    }
}