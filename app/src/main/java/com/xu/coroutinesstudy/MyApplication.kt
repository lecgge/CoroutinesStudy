package com.xu.coroutinesstudy

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.xu.coroutines.User

class MyApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}