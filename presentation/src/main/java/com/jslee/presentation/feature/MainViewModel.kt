package com.jslee.presentation.feature

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModel
import com.jslee.core.deeplink.DeepLinkLauncher
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/23
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val deepLinkLauncher: DeepLinkLauncher,
) : ViewModel() {

    fun extractMovieIdFromDeepLink(
        intent: Intent,
        onSuccess: (String?) -> Unit,
    ) {
        deepLinkLauncher.extractMovieIdFromFirebaseLink(
            intent = intent,
            onSuccess = onSuccess
        ) {
            Timber.e(it)
        }
    }
}