package com.how.to.use.sentry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.sentry.core.Sentry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            try {
                throw Exception("This is a test.")
            } catch (e: Exception) {
                Sentry.captureException(e)
            }
        }

    }
}