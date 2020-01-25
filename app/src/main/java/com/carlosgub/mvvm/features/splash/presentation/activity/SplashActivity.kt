package com.carlosgub.mvvm.features.splash.presentation.activity

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.carlosgub.mvvm.R
import com.carlosgub.mvvm.core.platform.BaseActivity
import com.carlosgub.mvvm.features.splash.presentation.viewmodel.SplashViewModel
import com.carlosgub.mvvm.features.splash.presentation.viewmodel.states.SplashVS
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity : BaseActivity() {

    private val viewModel:SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        viewModelComplete()
        viewModel.getAlbums()
    }

    override fun layout(): Int = R.layout.splash_activity

    override fun viewModelComplete() {
        viewModel.state.observe(this, Observer {
            when(it){
                is SplashVS.OnAlbumComplete ->{

                }
                is SplashVS.Error ->{

                }
                is SplashVS.AddAlbum ->{
                    Log.d("PINGA",it.listAlbum.joinToString("\n"){"${it.userId}---${it.id}"})
                    Log.d("TAMAÑO DE LA PINGA",it.listAlbum.size.toString())
                    Log.d("EDU ES CABRITO",true.toString())
                }
                is SplashVS.Loading ->{

                }
            }
        })
    }
}
