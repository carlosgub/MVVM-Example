package com.carlosgub.mvvm.features.splash.data.datasource.rest

import com.carlosgub.mvvm.core.network.BaseApiClient
import com.carlosgub.mvvm.features.splash.data.datasource.rest.interfaces.IAlbumApiClient

object AlbumApiClient : BaseApiClient<IAlbumApiClient>(IAlbumApiClient::class.java)