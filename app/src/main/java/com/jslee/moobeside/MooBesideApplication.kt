package com.jslee.moobeside

import android.app.Application
import com.jslee.moobeside.util.LifecycleLogger
import com.kakao.sdk.common.KakaoSdk
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/07
 */
@HiltAndroidApp
class MooBesideApplication : Application() {

    @Inject
    lateinit var lifecycleLogger: LifecycleLogger

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        lifecycleLogger.initialize(this)

        KakaoSdk.init(applicationContext, applicationContext.getString(R.string.kakao_native_key))
    }
}