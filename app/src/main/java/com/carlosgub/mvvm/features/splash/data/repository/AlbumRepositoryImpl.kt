package com.carlosgub.mvvm.features.splash.data.repository

import com.carlosgub.mvvm.features.splash.data.datasource.rest.AlbumRestDataStore
import com.carlosgub.mvvm.features.splash.data.mapper.AlbumDataMapper
import com.carlosgub.mvvm.features.splash.domain.model.AlbumEntity
import com.carlosgub.mvvm.features.splash.domain.repository.AlbumRepository
import io.reactivex.Observable
import io.reactivex.Single
import java.lang.Exception

class AlbumRepositoryImpl(
    private val albumRestDataStore: AlbumRestDataStore
):AlbumRepository {

    private val albumDataMapper by lazy { AlbumDataMapper() }

    override fun getAlbum(): Single<List<AlbumEntity>> {
        return albumRestDataStore.getAlbum().map(albumDataMapper::map)
    }
}