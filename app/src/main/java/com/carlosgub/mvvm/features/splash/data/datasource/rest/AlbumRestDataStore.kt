package com.carlosgub.mvvm.features.splash.data.datasource.rest

import com.carlosgub.mvvm.features.splash.data.datasource.rest.response.AlbumResponse
import io.reactivex.Single

class AlbumRestDataStore  {

    fun getAlbum(): Single<List<AlbumResponse>> =
        AlbumApiClient.getApiClient().getAlbums()
}