package com.carlosgub.mvvm.features.splash.presentation.viewmodel.states

import com.carlosgub.mvvm.features.splash.presentation.model.AlbumVM

sealed class SplashVS {
    class Loading(val show:Boolean):SplashVS()
    class AddAlbum(val listAlbum: List<AlbumVM>):SplashVS()
    class Error(val message:String?):SplashVS()
    object OnAlbumComplete:SplashVS()
}