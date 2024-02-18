package com.jslee.core.external.youtube

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/01
 */

/**
 * 1. AppIntent로 시도
 * 2. WebIntent로 시도
 */
internal const val PACKAGE_NAME_SPACE = "com.google.android.youtube"
internal const val WEB_WATCH_URL = "https://www.youtube.com/watch?v="
internal const val WEB_SEARCH_URL = "https://www.youtube.com/results?search_query="

internal object Youtube {
    object Trailer {
        private fun createAppIntent(videoId: String): Intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("vnd.youtube:$videoId")
        ).apply {
            flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        }

        private fun createWebIntent(videoId: String): Intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("$WEB_WATCH_URL$videoId")
        )

        /**
         * Android 11부터 필요한 package visibility 처리
         * 
         * https://tech.buzzvil.com/blog/tech-blog-package-visibility-in-android-11/
         */
        fun launchYoutubeTrailer(
            context: Context,
            videoId: String,
            fallback: () -> Unit,
        ) {
            runCatching {
                context.startActivity(createAppIntent(videoId))
            }.onFailure { exception ->
                when (exception) {
                    is ActivityNotFoundException -> {
                        context.startActivity(createWebIntent(videoId))
                    }

                    else -> fallback()
                }
            }
        }
    }

    object Search {
        private fun createAppIntent(query: String): Intent = Intent(Intent.ACTION_SEARCH)
            .apply {
                `package` = PACKAGE_NAME_SPACE
                putExtra("query", query)
                flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            }

        private fun createWebIntent(query: String): Intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("$WEB_SEARCH_URL$query")
        )

        fun launchYoutubeSearch(
            context: Context,
            searchQuery: String,
            fallback: () -> Unit,
        ) {
            val query = "$searchQuery 예고편"
            
            runCatching {
                context.startActivity(createAppIntent(query))
            }.onFailure { exception ->
                when (exception) {
                    is ActivityNotFoundException -> {
                        context.startActivity(createWebIntent(query))
                    }

                    else -> fallback()
                }
            }
        }
    }
}
