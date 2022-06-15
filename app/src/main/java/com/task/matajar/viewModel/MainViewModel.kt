package com.task.matajar.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.task.matajar.model.Data
import com.task.matajar.model.post.MetaPost
import com.task.matajar.repository.Repository
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {

    val respose: MutableLiveData<Response<Data>> = MutableLiveData()

    suspend fun getResponsePost(post: MetaPost) {
        val metaResponse = repository.getPost(post)
        Log.d("Res","mainviewmodel")
        respose.value = metaResponse
    }
}