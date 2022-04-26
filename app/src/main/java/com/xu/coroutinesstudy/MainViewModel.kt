package com.xu.coroutinesstudy

import androidx.lifecycle.*
import com.xu.coroutines.User
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val userList : LiveData<List<User>> get() = searchLiveDate
    private val searchLiveDate = MutableLiveData<List<User>>()

    init {
        viewModelScope.launch {
            searchLiveDate.value = Repository.getAllUser()
        }
    }

}