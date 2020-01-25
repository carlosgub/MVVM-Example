package com.carlosgub.mvvm.core.scheduler

import io.reactivex.Scheduler

interface Schedulers {
    fun computation(): Scheduler

    fun io(): Scheduler

    fun ui(): Scheduler
}