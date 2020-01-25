package com.carlosgub.mvvm.features.splash.data.datasource.rest.interfaces

import com.carlosgub.mvvm.features.splash.data.datasource.rest.response.AlbumResponse
import io.reactivex.Single
import retrofit2.http.GET

interface IAlbumApiClient {

    @GET("/albums")
    fun getAlbums(
    ): Single<List<AlbumResponse>>
}