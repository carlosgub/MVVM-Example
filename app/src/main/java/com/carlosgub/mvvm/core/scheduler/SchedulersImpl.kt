package com.carlosgub.mvvm.core.scheduler

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class SchedulersImpl : com.carlosgub.mvvm.core.scheduler.Schedulers {
    override fun computation() = Schedulers.computation()

    override fun io() = Schedulers.io()

    override fun ui(): Scheduler = AndroidSchedulers.mainThread()
}