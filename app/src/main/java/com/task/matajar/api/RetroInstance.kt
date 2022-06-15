package com.task.matajar.api

import com.task.matajar.utils.Utils.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {
    val retrofitInstance: MetajarApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MetajarApi::class.java)
    }
}