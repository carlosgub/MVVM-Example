package com.carlosgub.mvvm.features.splash.data.datasource.rest.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AlbumResponse(
    val userId: Int,
    val id: Int,
    val title: String
)