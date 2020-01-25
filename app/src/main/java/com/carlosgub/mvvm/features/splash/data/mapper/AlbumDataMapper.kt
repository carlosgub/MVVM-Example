package com.carlosgub.mvvm.features.splash.data.mapper

import com.carlosgub.mvvm.core.mapper.Mapper
import com.carlosgub.mvvm.features.splash.data.datasource.rest.response.AlbumResponse
import com.carlosgub.mvvm.features.splash.domain.model.AlbumEntity

class AlbumDataMapper:Mapper<AlbumResponse,AlbumEntity>{
    override fun map(origin: AlbumResponse): AlbumEntity {
        return AlbumEntity(
            userId = origin.userId,
            id = origin.id,
            title = origin.title
        )
    }
}