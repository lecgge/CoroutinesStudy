package com.xu.coroutinesstudy.Service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

object ServiceCreator {
    private const val BASE_URL = "https://54qog4k2.dnat.tech/"

    private val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>) : T = retrofit.create(serviceClass)
    inline fun <reified T> create() : T = create(T::class.java)
}