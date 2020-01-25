package com.carlosgub.mvvm.features.splash.presentation.model.mapper

import com.carlosgub.mvvm.core.mapper.Mapper
import com.carlosgub.mvvm.features.splash.data.datasource.rest.response.AlbumResponse
import com.carlosgub.mvvm.features.splash.domain.model.AlbumEntity
import com.carlosgub.mvvm.features.splash.presentation.model.AlbumVM

class AlbumVMMapper:Mapper<AlbumEntity, AlbumVM>{
    override fun map(origin: AlbumEntity): AlbumVM {
        return AlbumVM(
            userId = origin.userId,
            id = origin.id,
            title = origin.title
        )
    }
}