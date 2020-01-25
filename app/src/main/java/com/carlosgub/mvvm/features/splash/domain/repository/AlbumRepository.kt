package com.carlosgub.mvvm.features.splash.domain.repository

import com.carlosgub.mvvm.features.splash.domain.model.AlbumEntity
import io.reactivex.Observable
import io.reactivex.Single

interface AlbumRepository {
    fun getAlbum(): Single<List<AlbumEntity>>
}