package com.example.george.kotlinlearn.ui

import android.app.Application
import com.example.george.kotlinlearn.extensions.DelegatesExt

class App : Application() {
    // 静态修饰
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}