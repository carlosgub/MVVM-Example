package com.carlosgub.mvvm.di

import com.carlosgub.mvvm.core.scheduler.Schedulers
import com.carlosgub.mvvm.core.scheduler.SchedulersImpl
import org.koin.dsl.module

internal val appModule = module {
    single<Schedulers> {
        SchedulersImpl()
    }

}