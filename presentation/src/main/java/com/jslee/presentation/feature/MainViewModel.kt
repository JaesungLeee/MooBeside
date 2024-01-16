package com.jslee.presentation.feature

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.jslee.core.deeplink.DeepLinkLauncher
import com.jslee.core.deeplink.di.Firebase
import com.jslee.core.deeplink.di.Kakao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/23
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    @Firebase private val firebaseLauncher: DeepLinkLauncher,
    @Kakao private val kakaoLauncher: DeepLinkLauncher,
) : ViewModel() {

    fun extractMovieIdFromDeepLink(
        intent: Intent,
        onSuccess: (String) -> Unit,
        onFailure: (Throwable?) -> Unit,
    ) {
        firebaseLauncher.extractMovieIdFromFirebaseLink(
            intent = intent,
            onSuccess = { movieId ->
                if (movieId != null) {
                    onSuccess(movieId)
                } else {
                    extractMovieIdFromKakaoLink(intent, onSuccess, onFailure)
                }
            },
            onFailure = onFailure
        )
    }

    private fun extractMovieIdFromKakaoLink(
        intent: Intent,
        onSuccess: (String) -> Unit,
        onFailure: (Throwable?) -> Unit,
    ) {
        kakaoLauncher.extractMovieIdFromKakaoLink(
            intent = intent,
            onSuccess = {
                it?.let(onSuccess)
            },
            onFailure = onFailure
        )
    }
}