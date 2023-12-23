package com.jslee.moobeside

import android.app.Application
import com.jslee.moobeside.util.CustomTimberDebugTree
import com.jslee.moobeside.util.LifecycleLogger
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
    }
}