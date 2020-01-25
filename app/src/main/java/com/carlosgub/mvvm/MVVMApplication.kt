package com.carlosgub.mvvm

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import com.carlosgub.mvvm.di.modules

class MVVMApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MVVMApplication)
            androidLogger()
            modules(modules)
        }
    }
}