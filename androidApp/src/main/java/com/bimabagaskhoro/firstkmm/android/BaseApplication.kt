package com.bimabagaskhoro.firstkmm.android

import android.app.Application
import com.bimabagaskhoro.firstkmm.android.di.appModule
import com.bimabagaskhoro.firstkmm.di.getSharedModules
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}