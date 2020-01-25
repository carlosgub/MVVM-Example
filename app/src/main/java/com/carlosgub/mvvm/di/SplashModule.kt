package com.carlosgub.mvvm.di

import com.carlosgub.mvvm.features.splash.data.datasource.rest.AlbumRestDataStore
import com.carlosgub.mvvm.features.splash.data.repository.AlbumRepositoryImpl
import com.carlosgub.mvvm.features.splash.domain.interactor.GetAlbumInteractor
import com.carlosgub.mvvm.features.splash.domain.repository.AlbumRepository
import com.carlosgub.mvvm.features.splash.presentation.viewmodel.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {

    //region ViewModel
    viewModel { SplashViewModel(get()) }
    //endregion

    //region Interactor
    single { GetAlbumInteractor(get()) }
    //endregion

    //region Repository
    single<AlbumRepository> { AlbumRepositoryImpl(get()) }
    //endregion

    //region source
    single{AlbumRestDataStore()}
    //endregion
}