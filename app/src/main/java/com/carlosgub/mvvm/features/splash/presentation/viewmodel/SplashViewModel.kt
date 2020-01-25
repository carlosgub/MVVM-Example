package com.carlosgub.mvvm.features.splash.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.carlosgub.mvvm.core.interactor.Interactor
import com.carlosgub.mvvm.core.platform.BaseViewModel
import com.carlosgub.mvvm.features.splash.domain.interactor.GetAlbumInteractor
import com.carlosgub.mvvm.features.splash.presentation.model.mapper.AlbumVMMapper
import com.carlosgub.mvvm.features.splash.presentation.viewmodel.states.SplashVS

class SplashViewModel(
    private val getAlbumInteractor: GetAlbumInteractor
) :BaseViewModel(){

    private val albumVMMapper by lazy { AlbumVMMapper() }

    val state = MutableLiveData<SplashVS>()

    fun getAlbums(){
        disposables.add(
            getAlbumInteractor.execute(Interactor.None)
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .doOnSubscribe { state.value = SplashVS.Loading(true) }
                .subscribe({
                    state.value = SplashVS.AddAlbum(albumVMMapper.map(it))
                },{
                    state.value = SplashVS.Loading(false)
                    state.value = SplashVS.Error(it.message)
                })
        )
    }
}