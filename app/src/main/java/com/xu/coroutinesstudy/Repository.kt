package com.xu.coroutinesstudy

import android.util.Log
import androidx.lifecycle.liveData
import com.xu.coroutines.User
import com.xu.coroutinesstudy.Network.UserNetwork
import com.xu.coroutinesstudy.Service.ServiceCreator
import com.xu.coroutinesstudy.Service.UserService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception
import java.lang.RuntimeException
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object Repository {

    suspend fun getAllUser(): List<User> {
        return withContext(Dispatchers.IO) {
            UserNetwork.getAllUser()
        }
    }



}