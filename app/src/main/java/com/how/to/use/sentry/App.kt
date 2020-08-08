package com.how.to.use.sentry

import android.app.Application
import io.sentry.android.core.SentryAndroid
import io.sentry.android.core.SentryAndroidOptions

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        SentryAndroid.init(this) { options: SentryAndroidOptions ->
            options.release = BuildConfig.VERSION_NAME
        }
    }
}