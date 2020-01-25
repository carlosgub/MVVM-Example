package com.carlosgub.mvvm.core.network

import android.content.Context
import com.carlosgub.mvvm.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

open class BaseApiClient<T>(private val classT: Class<T>) : KoinComponent {
    private val context: Context by inject()

    open fun getApiClient(
        serverUrl: String? = null,
        connectionTimeout: Long = 60L,
        readTimeout: Long = 60L,
        writeTimeout: Long = 60L
    ): T {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient().newBuilder().apply {
            connectTimeout(connectionTimeout, TimeUnit.SECONDS)
            connectTimeout(connectionTimeout, TimeUnit.SECONDS)
            readTimeout(readTimeout, TimeUnit.SECONDS)
            writeTimeout(writeTimeout, TimeUnit.SECONDS)
            addInterceptor(httpLoggingInterceptor)
        }.build()

        val retrofitBuilder = Retrofit.Builder().apply {
            baseUrl(serverUrl ?: BuildConfig.BASE_URL)
            client(okHttpClient)
            addConverterFactory( MoshiConverterFactory.create())
            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        }

        val retrofit = retrofitBuilder.build()
        return retrofit.create(classT)
    }
}