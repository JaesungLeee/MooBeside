package com.jslee.moobeside.crashlytics

import android.util.Log
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.jslee.core.logger.Logger

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/17
 */
class CrashlyticsLoggerTree : Logger.Tree {

    private val crashlytics = FirebaseCrashlytics.getInstance()

    override fun writeLog(priority: Int, tag: String?, message: String, throwable: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO) {
            return
        }

        when {
            throwable != null ->
                crashlytics.recordException(CrashlyticsReportException(message))

            else -> crashlytics.log(message)
        }
    }

    class CrashlyticsReportException(message: String) : Exception(message)
}