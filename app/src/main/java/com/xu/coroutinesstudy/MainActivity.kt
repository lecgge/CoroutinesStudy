package com.xu.coroutinesstudy


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModelProvider
import com.xu.coroutines.User
import com.xu.coroutinesstudy.Service.ServiceCreator
import com.xu.coroutinesstudy.Service.UserService
import com.xu.coroutinesstudy.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.Serializable
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var viewModel : MainViewModel
    lateinit var list: List<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel =
            ViewModelProvider(this, defaultViewModelProviderFactory).get(MainViewModel::class.java)

        var myApplication = application as MyApplication
        binding.button.setOnClickListener {

            var list = viewModel.userList.value

            Log.d("TAG", "onCreate: ${list?.size}")
            for (user in list!!) {
                Log.d("TAG", "onCreate: ${user.toString()}")
            }

            startActivity(intent)

        }

    }
}