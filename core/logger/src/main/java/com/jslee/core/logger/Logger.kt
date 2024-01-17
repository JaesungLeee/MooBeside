package com.jslee.core.logger

import timber.log.Timber

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/17
 */
object Logger {

    interface Tree {
        fun writeLog(priority: Int, tag: String?, message: String, throwable: Throwable?)
    }

    fun initialize(tree: Timber.Tree) {
        Timber.plant(tree)
    }

    fun d(throwable: Throwable?) {
        Timber.d(throwable)
    }

    fun d(throwable: Throwable?, message: String?, vararg args: Any?) {
        Timber.d(throwable, message, args)
    }

    fun d(message: String?, vararg args: Any?) {
        Timber.d(message, args)
    }

    fun e(message: String?, vararg args: Any?) {
        Timber.e(message, args)
    }

    fun e(throwable: Throwable?, message: String?, vararg args: Any?) {
        Timber.e(message, args)
    }

    fun e(throwable: Throwable?) {
        Timber.e(throwable)
    }

    fun w(message: String?, vararg args: Any?) {
        Timber.w(message, args)
    }

    fun w(throwable: Throwable?, message: String?, vararg args: Any?) {
        Timber.w(throwable, message, args)
    }

    fun w(throwable: Throwable?) {
        Timber.w(throwable)
    }

    fun Tree.asTimberTree(): Timber.Tree {
        return object : Timber.Tree() {
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                this@asTimberTree.writeLog(priority, tag, message, t)
            }
        }
    }
}