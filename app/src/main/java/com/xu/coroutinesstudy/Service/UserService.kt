package com.xu.coroutinesstudy.Service

import com.xu.coroutines.User
import retrofit2.Call
import retrofit2.http.GET

interface UserService {

    @GET("queryUserList")
    fun getAllUser() : Call<List<User>>
}