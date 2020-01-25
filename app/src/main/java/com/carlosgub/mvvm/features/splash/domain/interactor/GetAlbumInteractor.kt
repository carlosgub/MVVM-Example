package com.carlosgub.mvvm.features.splash.domain.interactor

import com.carlosgub.mvvm.core.interactor.Interactor
import com.carlosgub.mvvm.features.splash.domain.model.AlbumEntity
import com.carlosgub.mvvm.features.splash.domain.repository.AlbumRepository
import io.reactivex.Single

class GetAlbumInteractor(
    private val albumRepository: AlbumRepository
) :Interactor<Interactor.None, Single<List<AlbumEntity>>> {

    override fun execute(params: Interactor.None): Single<List<AlbumEntity>> {
        return albumRepository.getAlbum()
    }

}